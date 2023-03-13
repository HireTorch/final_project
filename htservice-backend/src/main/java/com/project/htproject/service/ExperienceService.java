package com.project.htproject.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.dto.ExperienceDto;
import com.project.htproject.entity.Candidate;
import com.project.htproject.entity.ExperienceEntity;
import com.project.htproject.repository.CandidateRepositoryForLong;
import com.project.htproject.repository.ExperienceRepository;
import com.project.htproject.response.DeleteResponse;

@Service
public class ExperienceService {

	@Autowired
	private ExperienceRepository experienceRepository;
	
	@Autowired
	private CandidateRepositoryForLong candidateRepositoryForLong;
	
	@Autowired
	private ModelMapper mapper;
	
	
	
	
	public ExperienceEntity save(ExperienceDto experienceDto, Long candidateId) {
		Optional<Candidate> candidateOpt = candidateRepositoryForLong.findById(candidateId);
		Candidate candidate = candidateOpt.get();
		System.out.println(candidate);
		experienceDto.setCandidate(candidate);
		ExperienceEntity experienceEntity = this.mapper.map(experienceDto, ExperienceEntity.class);
		System.out.println(experienceEntity);
		experienceRepository.save(experienceEntity);
		return experienceEntity;
	}

	public List<ExperienceEntity> getAll() {
		return experienceRepository.findAll();
	}

	public List<ExperienceEntity> getAllByCandidateId(Long candidateId) {
		return experienceRepository.getAllByCandidateId(candidateId);
	}

	public DeleteResponse delete(Long experienceId) {
		experienceRepository.deleteById(experienceId);
		return new DeleteResponse("Deleted Successfully", false, experienceId);
	}

}
