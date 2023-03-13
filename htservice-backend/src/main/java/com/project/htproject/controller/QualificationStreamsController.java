package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.entity.QualificationStreamsEntity;
import com.project.htproject.service.QualificationStreamsService;

@RestController
@RequestMapping("/home/candidate/qualification/QulificationStream")
public class QualificationStreamsController {
     
	@Autowired
   private QualificationStreamsService qualificationStreamsService; 
	@GetMapping("all")
	public List<QualificationStreamsEntity> getAll(){
		return qualificationStreamsService.getAll();
	}

}
