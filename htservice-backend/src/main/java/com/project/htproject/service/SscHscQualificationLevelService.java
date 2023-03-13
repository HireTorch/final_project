package com.project.htproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.entity.SscHscQualificationLevel;
import com.project.htproject.repository.SscHscQualificationLevelRepository;

@Service
public class SscHscQualificationLevelService {
	
	
	@Autowired
	private SscHscQualificationLevelRepository sscHscQualificationLevelRepository;

	public List<SscHscQualificationLevel> getAll() {
		return sscHscQualificationLevelRepository.findAll();
	}

	

}
