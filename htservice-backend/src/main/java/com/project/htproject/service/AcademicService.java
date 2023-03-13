package com.project.htproject.service;

import java.util.List;
import java.util.Optional;

import javax.sql.rowset.serial.SerialException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.dto.CandidateHscSscAcademicsDto;
import com.project.htproject.entity.BoardsMaster;
import com.project.htproject.entity.Candidate;
import com.project.htproject.entity.CandidateHscSscAcademics;
import com.project.htproject.entity.SscHscQualificationLevel;
import com.project.htproject.entity.StreamsMaster;
import com.project.htproject.repository.BoardsMasterRepo;
import com.project.htproject.repository.CandidateHscSscAcademicsRepository;
import com.project.htproject.repository.CandidateRepositoryForLong;
import com.project.htproject.repository.SscHscQualificationLevelRepository;
import com.project.htproject.repository.StreamsMasterRepository;

@Service
public class AcademicService implements IAcademicService {

	@Autowired
	private CandidateHscSscAcademicsRepository academicRepository;

	@Autowired
	private BoardsMasterRepo boardsMasterRepo;

	@Autowired
	private StreamsMasterRepository streamsMasterRepository;

	@Autowired
	private SscHscQualificationLevelRepository sscHscQualificationLevelRepository;

	@Autowired
	private CandidateRepositoryForLong candidateRepositoryForLong;

	@Autowired
	private ModelMapper mapper;

	public List<CandidateHscSscAcademics> getAll() {
		List<CandidateHscSscAcademics> allAcademics = academicRepository.findAll();
		return allAcademics;
	}

	public CandidateHscSscAcademics save(CandidateHscSscAcademicsDto candidateHscSscAcademicsDto, Integer boardId,
			Integer levelId, Integer streamsId, Long candidateId) throws SerialException {
		CandidateHscSscAcademics academicDetails = null;
		try {
			Optional<BoardsMaster> boardOpt = boardsMasterRepo.findById(boardId);
			BoardsMaster board = boardOpt.get();
			candidateHscSscAcademicsDto.setBoard(board);

			Optional<SscHscQualificationLevel> levelIdOpt = sscHscQualificationLevelRepository.findById(levelId);
			SscHscQualificationLevel level = levelIdOpt.get();
			candidateHscSscAcademicsDto.setLevel(level);

			Optional<StreamsMaster> streamOpt = streamsMasterRepository.findById(streamsId);
			StreamsMaster stream = streamOpt.get();
			candidateHscSscAcademicsDto.setStreams(stream);

			Optional<Candidate> candidateOpt = candidateRepositoryForLong.findById(candidateId);
			Candidate candidate = candidateOpt.get();
			candidateHscSscAcademicsDto.setCandidate(candidate);

			academicDetails = this.mapper.map(candidateHscSscAcademicsDto, CandidateHscSscAcademics.class);
			academicRepository.save(academicDetails);

		} catch (Exception e) {
			throw new SerialException("Candidate Academics not saved");
		}
		return academicDetails;
	}

	
	
	public void delete(Long academicsId) {
		academicRepository.deleteById(academicsId);
	}

	public CandidateHscSscAcademics findByCandidateId(Long candidateId) {
		   CandidateHscSscAcademics academicsDetails = academicRepository.getByCandidateId(candidateId);
		return academicsDetails;
	}

	}
   
	
