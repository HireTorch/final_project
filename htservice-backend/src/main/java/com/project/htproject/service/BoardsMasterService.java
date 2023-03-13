package com.project.htproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.entity.BoardsMaster;
import com.project.htproject.repository.BoardsMasterRepo;

@Service
public class BoardsMasterService {
	
	@Autowired
	private BoardsMasterRepo boardsMasterRepo; 

	public List<BoardsMaster> getAll() {
		return boardsMasterRepo.findAll();
	}

	

}
