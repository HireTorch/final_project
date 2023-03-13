package com.project.htproject.service;
import java.util.List;

import com.project.htproject.dto.AdminDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Admin;
import com.project.htproject.response.LoginMessage;

public interface IAdminService {
	public List<Admin> getAllAdmins() ;
	public String addAdmin(AdminDto adminDto);
	public LoginMessage loginAdmin(LoginDto loginDto);

}