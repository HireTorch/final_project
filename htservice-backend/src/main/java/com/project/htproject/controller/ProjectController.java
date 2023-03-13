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

import com.project.htproject.dto.ProjectDto;
import com.project.htproject.entity.ProjectEntity;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.service.ProjectService;

@RestController
@RequestMapping("/home/candidate/project/")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	
	@PostMapping("save/{candidateId}")
	public ProjectEntity save(@RequestBody ProjectDto projectDto, @PathVariable("candidateId") Long candidateId)
	{
		ProjectEntity projectEntity = projectService.save(projectDto, candidateId);
		
		return projectEntity;
	}
	@GetMapping("all")
	public List<ProjectEntity> getAll(){
		return projectService.getAll();
	}
	
	@GetMapping("candidateId/{candidateId}")
	public List<ProjectEntity> getByCandidateId(@PathVariable("candidateId") Long candidateId){
		
		return projectService.getAllByCandidateId(candidateId);
	}
	
	@DeleteMapping("delete/{project_id}")
	public DeleteResponse deleteProject(@PathVariable("project_id") Long projectId) {
		DeleteResponse response = projectService.delete(projectId);
		return response;
	}
	
}
