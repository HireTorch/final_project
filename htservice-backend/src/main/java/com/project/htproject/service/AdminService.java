package com.project.htproject.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.htproject.dto.AdminDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Admin;
import com.project.htproject.repository.AdminRepository;
import com.project.htproject.repository.AdminRepositoryForInt;
import com.project.htproject.response.LoginMessage;


@Service
public class AdminService implements IAdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private AdminRepositoryForInt adminRepositoryForLong;

	public List<Admin> getAllAdmins() {
		List<Admin> allAdmins = adminRepository.findAll();
		return allAdmins;
	}

	public Admin getOneAdmin(Integer adminId) {
		Optional<Admin> adminOpt = adminRepositoryForLong.findById(adminId);
		Admin admin = adminOpt.get();
 		return admin;
	}

	public String addAdmin(AdminDto adminDto) {
		Admin admin = new Admin(adminDto.getAdminName(), adminDto.getAdminEmail(), adminDto.getAdminUserName(),
				passwordEncoder.encode(adminDto.getAdminPassword()));
		adminRepository.save(admin);
		return admin.getAdminName();
	}

	public LoginMessage loginAdmin(LoginDto loginDto) {
		String msg = "";
		Admin admin = adminRepository.findByEmail(loginDto.getEmail());
		if (admin != null) {
			String password = loginDto.getPassword();
			String encodedPassword = admin.getAdminPassword();
			Boolean isPasswordCorrect = passwordEncoder.matches(password, encodedPassword);
			if (isPasswordCorrect) {
				Optional<Admin> adminOpt = adminRepository.findOneByEmailAndPassword(loginDto.getEmail(),
						encodedPassword);
				if (adminOpt.isPresent()) {
					// return new LoginMessage("Login successful ", true);
					return new LoginMessage("Login successfull", true, admin.getAdminId());
				} else {
					return new LoginMessage("Login Failed", false);
				}
			} else {
				return new LoginMessage("Password Not Matched ", false);
			}
		} else {
			return new LoginMessage("Email not Exist", false);
		}
	}

}