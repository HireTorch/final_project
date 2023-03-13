package com.project.htproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.htproject.dto.CompanyDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Company;
import com.project.htproject.repository.CompanyRepository;
import com.project.htproject.repository.CompanyRepositoryByLong;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.response.LoginMessage;

@Service
public class CompanyService implements ICompanyService {

	@Autowired
	public CompanyRepository companyRepository;
    
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Autowired
	private CompanyRepositoryByLong companyRepositoryByLong;
	

	public List<Company> getAllCompanies() {
		List<Company> allCompanies = companyRepository.findAll();
		return allCompanies;
	}

	public LoginMessage loginCompany(LoginDto loginDto) {

		String msg = "";
		Company company = companyRepository.findByEmail(loginDto.getEmail());
		System.out.println(company);
		if (company != null) {
			String password = loginDto.getPassword();
			String encodedPassword = company.getCompanyPassword();
			Boolean isPasswordCorrect = passwordEncoder.matches(password, encodedPassword);
			if (isPasswordCorrect) {
				Optional<Company> companyOpt = companyRepository.findOneByEmailAndPassword(loginDto.getEmail(),
						encodedPassword);
				if (companyOpt.isPresent()) {
					// return new LoginMessage("Login successful ", true);
					return new LoginMessage("Login successfull", true, company.getCompanyId());
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

	public String save(CompanyDto companyDto) {
		Company company = new Company(companyDto.getCompanyName(), companyDto.getCompanyEmail(),
				companyDto.getCompanyUserName(), this.passwordEncoder.encode(companyDto.getCompanyPassword()));
		companyRepository.save(company);
		return company.getCompanyName();
	}
 

	public Company getOneCompany(Long companyId) {
		System.out.println(companyId);
		Optional<Company> companyOpt = companyRepositoryByLong.findById(companyId);
		Company company = companyOpt.get();
		System.out.println(company);
		return company;
	}

	public DeleteResponse delete(Long companyId) {
		Long id = getOneCompany(companyId).getCompanyId();
		companyRepositoryByLong.deleteById(companyId);
		return new DeleteResponse("Deleted Sucessfully", true , id);
	}

	
	
	
}
