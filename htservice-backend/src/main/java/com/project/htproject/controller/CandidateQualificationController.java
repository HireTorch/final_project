package com.project.htproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.CandidateQualificationDto;
import com.project.htproject.entity.CandidateQualificationEntity;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.service.CandidateQualificationService;

@RestController
@RequestMapping("/home/candidate/qualification")
public class CandidateQualificationController {

	@Autowired
	private CandidateQualificationService candidateQualificationService;

	@PostMapping("save/{qulification_Level_id}/{stream_id}/{candidate_id}")
	public ResponseEntity<Object> save(@RequestBody CandidateQualificationDto candidateQualificationDto,
			@PathVariable("qulification_Level_id") Long qulificationLevelId, @PathVariable("stream_id") Long streamId,
			@PathVariable("candidate_id") Long candidateId) {
		CandidateQualificationEntity candidateQualificationEntity = null;
		
		try {
			candidateQualificationEntity = candidateQualificationService.save(candidateQualificationDto,qulificationLevelId,streamId,candidateId);
			return new ResponseEntity<>(candidateQualificationEntity,HttpStatus.OK);
					} catch (Exception e) {
			return new ResponseEntity<>(e,HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@GetMapping("{candidate_id}")
	public ResponseEntity<Object> getByCandidate(@PathVariable("candidate_id")Long candidateId){
		CandidateQualificationEntity candidateQualificationEntity = null;
		try {
			candidateQualificationEntity = candidateQualificationService.getByCandidateId(candidateId);
			return new ResponseEntity<>(candidateQualificationEntity,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(e,HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("{qualification_id}")
	public ResponseEntity<Object>delete(@PathVariable("qualification_id")Long qualificationId){
		try {
			DeleteResponse reponse = candidateQualificationService.delete(qualificationId);
			return new ResponseEntity<>(reponse,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e,HttpStatus.BAD_REQUEST);
		}
		
	}
}
