package com.project.htproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.htproject.dto.JobDetailsDto;
import com.project.htproject.entity.Company;
import com.project.htproject.entity.JobDetails;
import com.project.htproject.response.DeleteResponse;
import com.project.htproject.service.JobDetailsService;


@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("/home/company/jobDetails/")
public class JobDetailsController {

	 @Autowired
	private JobDetailsService jobDetailsService;

	@GetMapping("all")
	public List<JobDetails> getAll (){
		return jobDetailsService.getAll() ;
		
	}
	
	@PostMapping("save/{companyId}")
	public JobDetails save(@RequestBody JobDetailsDto jobdetailsDto, @PathVariable("companyId") Long companyId) {
		JobDetails jobDetail = jobDetailsService.save(jobdetailsDto,companyId);
		return jobDetail;
		
	}
	
	@GetMapping("companyId/{companyId}")
	public List<JobDetails> getByCompanyId(@PathVariable("companyId") Long companyId){
		return jobDetailsService.getAllByComapanyId(companyId);
	}
	
	@DeleteMapping("delete/{jobDetails_id}")
	public DeleteResponse deleteJobdetails(@PathVariable("jobDetails_id") Long jobDetailId)
	{
		DeleteResponse response = jobDetailsService.delete(jobDetailId);
		return response;
		
	}
	
//	@PutMapping("update/{jobDetails_id}")
//	public JobDetails update(@RequestBody JobDetailsDto jobdetailsDto, @PathVariable("jobDetails_id") Long jobDetails) {
//		JobDetails jobDetails = jobDetailsService.update(jobdetailsDto,companyId)
//		return jobDetails;
//	}
	
	@GetMapping("skill/{skill}")
	public List<JobDetails> getAllJobsBySkill(@PathVariable("skill")String skills){
		return jobDetailsService.getByJobDetailsSkillSet(skills);
	}
	
}
