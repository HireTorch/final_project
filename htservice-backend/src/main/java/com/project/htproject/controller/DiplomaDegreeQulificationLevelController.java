package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.entity.DiplomaDegreeQulificationLevel;
import com.project.htproject.service.DiplomaDegreeQulificationLevelService;

@RestController
@RequestMapping("/home/candidate/qualification/QulificationLevel")
public class DiplomaDegreeQulificationLevelController {
     
	@Autowired
	private DiplomaDegreeQulificationLevelService diplomaDegreeQulificationLevelService; 
	
	@GetMapping("all")
	public List<DiplomaDegreeQulificationLevel> getAll(){
		return diplomaDegreeQulificationLevelService.getAll();
	}
	

}
