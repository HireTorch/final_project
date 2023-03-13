package com.project.htproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.entity.StreamsMaster;
import com.project.htproject.repository.StreamsMasterRepository;


@Service
public class StreamsMasterService {
	
	@Autowired
   private StreamsMasterRepository streamsMasterRepository;	

	public List<StreamsMaster> getAll() {
		return streamsMasterRepository.findAll();
	}

	

}
