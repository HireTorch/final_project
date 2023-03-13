package com.project.htproject.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.AdminDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Admin;
import com.project.htproject.response.LoginMessage;
import com.project.htproject.service.AdminService;



@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("/home/admin")
public class AdminController {

	@Autowired
	public AdminService adminService;

	@GetMapping("/admin-All")
	public List<Admin> getAllAdmin() {
		List<Admin> allAdmins = adminService.getAllAdmins();
		return allAdmins;
	}

	@GetMapping("/admin/{admin_Id}")
	public Admin getOneAdmin(@PathVariable("admin_Id")Integer adminId) {
		Admin admin = adminService.getOneAdmin(adminId);
		return  admin;
	}
	//=================================================================================================================

	@PostMapping("/save")
	public String saveAdmin (@RequestBody AdminDto adminDto)
	{
		String adminName = adminService.addAdmin(adminDto);
		return adminName;
	}

	@PostMapping("/login")
	 @CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<?> loginAdmin(@RequestBody LoginDto loginDto)
	{
		LoginMessage loginMessage = adminService.loginAdmin(loginDto);
		 return ResponseEntity.ok(loginMessage);
	}

}