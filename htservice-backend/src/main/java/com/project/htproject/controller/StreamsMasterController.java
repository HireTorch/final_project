package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.entity.StreamsMaster;
import com.project.htproject.service.StreamsMasterService;


@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("/home/candidate/academics/stream")
public class StreamsMasterController {
	
	
	@Autowired
	private StreamsMasterService streamsMasterService;
    
	@GetMapping("all")
	public List<StreamsMaster> getAll(){
	   return streamsMasterService.getAll();
	}
	
	

}
