package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.AddressDto;
import com.project.htproject.dto.CandidateHscSscAcademicsDto;
import com.project.htproject.entity.Address;
import com.project.htproject.entity.BoardsMaster;
import com.project.htproject.entity.Candidate;
import com.project.htproject.entity.CandidateHscSscAcademics;
import com.project.htproject.entity.SscHscQualificationLevel;
import com.project.htproject.entity.StreamsMaster;
import com.project.htproject.exception.ServiceException;
import com.project.htproject.service.AcademicService;

@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("/home/candidate/academics/")
public class CandidateHscSscAcademicsController {

	@Autowired
	private AcademicService academicService;

	@GetMapping("all")
	public List<CandidateHscSscAcademics> getAllAcademics() {
		List<CandidateHscSscAcademics> allAcademics = academicService.getAll();
		return allAcademics;
	}

	@PostMapping("save/{board_id}/{level-id}/{streams_id}/{candidate_id}")
	public ResponseEntity<Object> save(@RequestBody CandidateHscSscAcademicsDto candidateHscSscAcademicsDto,
			@PathVariable("board_id") Integer boardId, @PathVariable("level-id") Integer levelId,
			@PathVariable("streams_id") Integer streamsId, @PathVariable("candidate_id") Long candidateId) {

		CandidateHscSscAcademics academicsDetails = null;
		try {
			academicsDetails = academicService.save(candidateHscSscAcademicsDto, boardId, levelId, streamsId,
					candidateId);
			return new ResponseEntity<>(academicsDetails, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}

	}

	@DeleteMapping("delete/{academics_Id}")
	public void delete(@PathVariable("academics_Id") Long academicsId) {
		academicService.delete(academicsId);
	}

	@GetMapping("{candidate_Id}")
	public ResponseEntity<Object> findByCandidateId(@PathVariable("candidate_Id") Long candidateId) {

		CandidateHscSscAcademics academicsDetails = null;
		try {
			academicsDetails = academicService.findByCandidateId(candidateId);
			System.out.println(academicsDetails);
			return new ResponseEntity<>(academicsDetails, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
		}

	}

}