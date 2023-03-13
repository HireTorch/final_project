package com.project.htproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.entity.DiplomaDegreeQulificationLevel;
import com.project.htproject.repository.DiplomaDegreeQulificationLevelRepository;

@Service
public class DiplomaDegreeQulificationLevelService {
	
	@Autowired
	private DiplomaDegreeQulificationLevelRepository diplomaDegreeQulificationLevelRepository; 

	public List<DiplomaDegreeQulificationLevel> getAll() {
		return diplomaDegreeQulificationLevelRepository.findAll() ;
	}

	

}
