package com.project.htproject.service;

import java.util.Optional;

import javax.sql.rowset.serial.SerialException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.dto.CandidateHscSscAcademicsDto;
import com.project.htproject.dto.CandidateQualificationDto;
import com.project.htproject.dto.JobDetailsDto;
import com.project.htproject.entity.BoardsMaster;
import com.project.htproject.entity.Candidate;
import com.project.htproject.entity.CandidateHscSscAcademics;
import com.project.htproject.entity.CandidateQualificationEntity;
import com.project.htproject.entity.Company;
import com.project.htproject.entity.DiplomaDegreeQulificationLevel;
import com.project.htproject.entity.JobDetails;
import com.project.htproject.entity.QualificationStreamsEntity;
import com.project.htproject.entity.SscHscQualificationLevel;
import com.project.htproject.entity.StreamsMaster;
import com.project.htproject.repository.CandidateQualificationRepository;
import com.project.htproject.repository.CandidateRepository;
import com.project.htproject.repository.CandidateRepositoryForLong;
import com.project.htproject.repository.DiplomaDegreeQulificationLevelRepository;
import com.project.htproject.repository.QualificationStreamsRepository;
import com.project.htproject.response.DeleteResponse;

@Service
public class CandidateQualificationService {

	@Autowired
	private CandidateQualificationRepository candidateQualificationRepository;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private CandidateRepositoryForLong candidateRepositoryForLong;

	@Autowired
	private DiplomaDegreeQulificationLevelRepository diplomaDegreeQulificationLevelRepository;

	@Autowired
	private QualificationStreamsRepository qualificationStreamsRepository;
	
	

	public CandidateQualificationEntity save(CandidateQualificationDto candidateQualificationDto,
			Long qulificationLevelId, Long streamId, Long candidateId) throws SerialException {

		CandidateQualificationEntity candidateQualificationEntity = null;
		try {
			Optional<DiplomaDegreeQulificationLevel> levelOpt = diplomaDegreeQulificationLevelRepository
					.findById(qulificationLevelId);
			DiplomaDegreeQulificationLevel level = levelOpt.get();
			candidateQualificationDto.setQualifictionLevel(level);
			Optional<QualificationStreamsEntity> streamOpt = qualificationStreamsRepository.findById(streamId);
			QualificationStreamsEntity stream = streamOpt.get();
			candidateQualificationDto.setQualificationStreams(stream);
			Optional<Candidate> candidateOpt = candidateRepositoryForLong.findById(candidateId);
			Candidate candidate = candidateOpt.get();
			candidateQualificationDto.setCandidate(candidate);
			candidateQualificationEntity = this.mapper.map(candidateQualificationDto,
					CandidateQualificationEntity.class);
			candidateQualificationRepository.save(candidateQualificationEntity);
		} catch (Exception e) {
			throw new SerialException("Candidate Qualification Not saved");
		}
		return candidateQualificationEntity;
	}



	public CandidateQualificationEntity getByCandidateId(Long candidateId) throws SerialException {
		CandidateQualificationEntity candidateQualificationEntity = null;
		try {
			candidateQualificationEntity = candidateQualificationRepository.getByCandidateId(candidateId);
		} catch (Exception e) {
		throw new SerialException("No Data Found");
		}
		return candidateQualificationEntity;
	}



	public DeleteResponse delete(Long qualificationId) throws SerialException {
		try {
			candidateQualificationRepository.deleteById(qualificationId);
		} catch (Exception e) {
			throw new SerialException("error while deleting");
		}
		return new DeleteResponse("Data deleted Successfully",true);
	}

	
}
