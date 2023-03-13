package com.project.htproject.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.dto.ProjectDto;
import com.project.htproject.entity.Candidate;
import com.project.htproject.entity.ProjectEntity;
import com.project.htproject.repository.CandidateRepositoryForLong;
import com.project.htproject.repository.ProjectRepository;
import com.project.htproject.response.DeleteResponse;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository; 
	
	@Autowired
	private CandidateRepositoryForLong candidateRepositoryForLong;
	
	@Autowired
	private ModelMapper mapper;
	
	public List<ProjectEntity> getAll() {

		return projectRepository.findAll();
	}


	public ProjectEntity save(ProjectDto projectDto, Long candidateId) {
		Optional<Candidate> candidateOpt = candidateRepositoryForLong.findById(candidateId);
		Candidate candidate = candidateOpt.get();
		System.out.println(candidate);
		projectDto.setCandidate(candidate);
		ProjectEntity projectEntity = this.mapper.map(projectDto, ProjectEntity.class);
		System.out.println(projectEntity);
		projectRepository.save(projectEntity);
		return projectEntity;
	}
	
	public List<ProjectEntity> getAllByCandidateId(Long candidateId){
		return projectRepository.getAllByCandidateId(candidateId);
	}

	public DeleteResponse delete(Long projectId) {
		projectRepository.deleteById(projectId);
		return new DeleteResponse("Deleted Successfully", false, projectId);
	}
	
}
