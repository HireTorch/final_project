package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.CompanyDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Company;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.response.LoginMessage;
import com.project.htproject.service.CompanyService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/home/company/")
public class ComapanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping("Company-All")
	public List<Company> getAllcandidate() {
		List<Company> allCompanies = companyService.getAllCompanies();
		return allCompanies;
	}

	// -------------------------------------------------------------------------------
	@PostMapping("save")
	public String saveCompany(@RequestBody CompanyDto companyDto) {
		String companyName = companyService.save(companyDto);
		return companyName;
	}

	@PostMapping("login")
	public ResponseEntity<?> loginCompany(@RequestBody LoginDto loginDto) {
		LoginMessage loginMessage = companyService.loginCompany(loginDto);
		return ResponseEntity.ok(loginMessage);
	}

	@DeleteMapping("{companyId}")
	    public DeleteResponse delete(@PathVariable("companyId" )Long companyId)
	    {  
	    	DeleteResponse response = companyService.delete(companyId);
			return response;
	    }
	
	@GetMapping("{companyId}")
	public Company getOneCompany(@PathVariable("companyId") Long companyId){
		Company company = companyService.getOneCompany(companyId);
		return company;
	}

}
