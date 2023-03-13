package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.entity.UniversityMaster;
import com.project.htproject.service.UniversityMasterService;

@RestController
public class UniversityMasterController {

	@Autowired
	public UniversityMasterService unversityService;

	@GetMapping("/Universities")
	 @CrossOrigin(origins = "http://localhost:3002")
	public List<UniversityMaster> getAllUniversity(){
		List<UniversityMaster> universities = unversityService.getAllUniversities();
		return universities;
	}
	@GetMapping("/University/{university_Id}")
	@CrossOrigin(origins = "http://localhost:3002")
	public UniversityMaster getOneUniversity(@PathVariable("university_Id") Integer universityId) {
		UniversityMaster university = unversityService.getOneUniversity(universityId);
		return university;
	}
}