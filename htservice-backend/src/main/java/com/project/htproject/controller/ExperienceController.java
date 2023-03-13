package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.ExperienceDto;
import com.project.htproject.entity.ExperienceEntity;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.service.ExperienceService;

@RestController
@RequestMapping("/home/candidate/experience")
public class ExperienceController {

	@Autowired
	private ExperienceService experienceService;
	
	@PostMapping("save/{candidateId}")
	public ExperienceEntity save(@RequestBody ExperienceDto experienceDto, @PathVariable("candidateId") Long candidateId) {
		ExperienceEntity experienceEntity = experienceService.save(experienceDto, candidateId);
		return experienceEntity;
	}
	
	@GetMapping("all")
	public List<ExperienceEntity> getAll(){
		return experienceService.getAll();
	}
	
	@GetMapping("candidateId/{candidateId}")
	public List<ExperienceEntity> getByCandidateId(@PathVariable("candidateId") Long candidateId){
		
		return experienceService.getAllByCandidateId(candidateId);
	}
	
	@DeleteMapping("delete/{experience_id}")
	public DeleteResponse deleteExeperince(@PathVariable("experience_id") Long experienceId) {
		
		DeleteResponse response = experienceService.delete(experienceId);
		return response;
	}
	}
	

