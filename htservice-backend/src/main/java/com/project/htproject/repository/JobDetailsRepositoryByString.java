package com.project.htproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.htproject.entity.JobDetails;
import com.project.htproject.query.QueryConstant;

@Repository
public interface JobDetailsRepositoryByString extends JpaRepository<JobDetails,String> {
    
	
	@Modifying
	@Query(QueryConstant.SELECT_JOBS_BY_SKILLSET)
	List<JobDetails> getJobDetailsBySkillSet(String skill); 
	
}
