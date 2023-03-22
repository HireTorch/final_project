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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.AddressDto;
import com.project.htproject.dto.CandidateDto;
import com.project.htproject.dto.LoginDto;
import com.project.htproject.entity.Candidate;
import com.project.htproject.exception.ServiceException;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.response.LoginMessage;
import com.project.htproject.response.UpdateResponse;
import com.project.htproject.service.CandidateService;

@RestController
@RequestMapping("/home/candidate/")
public class CandidateController {

	@Autowired
	public CandidateService candidateService;

	@GetMapping("all")
	@CrossOrigin(origins = "http://localhost:3002")
	public List<Candidate> getAllcandidate() {
		List<Candidate> allCandidates = candidateService.getAllCandidate();
		return allCandidates;
	}


	@GetMapping("{candidate_Id}")
	@CrossOrigin(origins = "http://localhost:3002")
	public Candidate getOneCandidate(@PathVariable("candidate_Id") Long candidateid)
	{  
		Candidate getCandidate = null;
		try {
			getCandidate = candidateService.getOneCandidate(candidateid);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getCandidate;
 	}
	//================================================================
	
	
	@PostMapping("save")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Object> saveCandidate (@RequestBody CandidateDto candidateDto)
	{  
		try {
			Candidate candidate = candidateService.addCandidate(candidateDto);
			return new ResponseEntity<>(candidate,HttpStatus.OK);	
		} catch (Exception e) {
			return new ResponseEntity<>(e,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	
	
	//===============================================================
	
	
	@DeleteMapping("delete/{candidate_Id}")
	@CrossOrigin(origins = "http://localhost:3002")
	public  DeleteResponse deleteOneCandidate (@PathVariable("candidate_Id") Long candidateId)
	{
		DeleteResponse response = candidateService.deleteOneCandidate(candidateId);
		return response;
	}


	@PostMapping("update/{candidate_Id}")
	@CrossOrigin(origins = "http://localhost:3002")
	public UpdateResponse updateOneCandidate(@RequestBody CandidateDto candidateDto ,
			                                                           @PathVariable("candidate_Id") Long candidateId)
	{
		UpdateResponse response = candidateService.updateOneCandidate(candidateDto,candidateId);
		return response;
	}

	//=============================================================================
	
	
	
	
	@PostMapping("login")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<?> loginCandidate(@RequestBody LoginDto loginDto)
	{
		LoginMessage loginMessage = candidateService.loginCandidate(loginDto);
		 return ResponseEntity.ok(loginMessage);
	}
	//=============================================================================
	
	
	
	//Pending due to cascading issue .....have to check after eliminating cascading.ALL 
	
//	@PostMapping("address/save")
//	public String saveCandidateAddressss (@RequestBody CandidateDto candidateDto , AddressDto address )
//	{
//		String id = candidateService.addCandidate(candidateDto,address);
//		return id;
//	}
	
	
	/*Many*/
	@PutMapping("{candidate_Id}/jobDetails/{job_detail}")
	@CrossOrigin(origins = "http://localhost:3002")
	public Candidate appliedJobs (
			@PathVariable("candidate_Id") Long cadidateId,
			@PathVariable ("job_detail") Long jobid
			) {
		return candidateService.appliedJobsOfCandidate(cadidateId,jobid);
	}
	
	
	
	
	
	
}