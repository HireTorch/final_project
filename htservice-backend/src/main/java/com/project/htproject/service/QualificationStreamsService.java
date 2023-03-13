package com.project.htproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.entity.QualificationStreamsEntity;
import com.project.htproject.repository.QualificationStreamsRepository;

@Service
public class QualificationStreamsService {
	
	@Autowired
	private QualificationStreamsRepository qualificationStreamsRepository;

	public List<QualificationStreamsEntity> getAll() {
		return qualificationStreamsRepository.findAll();
	} 
   
}
