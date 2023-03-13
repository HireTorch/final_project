package com.project.htproject.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.htproject.dto.JobDetailsDto;
import com.project.htproject.entity.Company;
import com.project.htproject.entity.JobDetails;
import com.project.htproject.repository.CompanyRepositoryByLong;
import com.project.htproject.repository.JobDetailsRepository;
import com.project.htproject.repository.JobDetailsRepositoryByString;
import com.project.htproject.response.DeleteResponse;


@Service
public class JobDetailsService {
	
	
	
	@Autowired
	private JobDetailsRepository jobDetailsRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
    private CompanyRepositoryByLong  companyRepositoryByLong; 
	
	@Autowired
	private JobDetailsRepositoryByString  jobDetailsRepositoryByString;

	public List<JobDetails> getAll() {
	  return jobDetailsRepository.findAll();                                                                                                                                                                      
	}

	public JobDetails save(JobDetailsDto jobdetailsDto, Long companyId) {
		Optional<Company> companyOpt = companyRepositoryByLong.findById(companyId);
		Company company = companyOpt.get();
		System.out.println(company);
		jobdetailsDto.setCompany(company);
		JobDetails jobDetails = this.mapper.map(jobdetailsDto, JobDetails.class);
		System.out.println(jobDetails);
		jobDetailsRepository.save(jobDetails);
		return jobDetails;
		
	}

	public List<JobDetails> getAllByComapanyId(Long companyId) {
		return jobDetailsRepository. getAllByComapanyId(companyId);
	}

	public DeleteResponse delete(Long jobDetailId) {
		jobDetailsRepository.deleteById(jobDetailId);
		return new DeleteResponse("Deleted Successfully", false, jobDetailId);
	}

	public JobDetails update(JobDetailsDto jobdetailsDto, Long companyId) {
		
		return null;
	}

	public List<JobDetails> getByJobDetailsSkillSet(String skill) {
		return jobDetailsRepositoryByString.getJobDetailsBySkillSet(skill);
	}
   
}
