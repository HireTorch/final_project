package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.entity.SscHscQualificationLevel;
import com.project.htproject.service.SscHscQualificationLevelService;


@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("/home/candidate/academics/level/")
public class SscHscQualificationLevelController {
	
	
   @Autowired 
	private SscHscQualificationLevelService sscHscQualificationLevelService; 
    @GetMapping("all")
    public List<SscHscQualificationLevel> getAll(){
    	return sscHscQualificationLevelService.getAll();
    }   


}
