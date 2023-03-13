package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.entity.BoardsMaster;
import com.project.htproject.service.BoardsMasterService;


@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("/home/candidate/academics/board/")
public class BoardsMasterController {
    
	@Autowired
	private BoardsMasterService boardsMasterService; 
	
	@GetMapping("all")
	public List<BoardsMaster> getAllBoard(){
		return boardsMasterService.getAll(); 
	}
	

}
