package com.project.htproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.htproject.entity.JobDetails;
import com.project.htproject.query.QueryConstant;


@Repository
public interface JobDetailsRepository extends JpaRepository<JobDetails,Long>{
    
	//@Modifying
	@Query(QueryConstant.SELECT_JOBDETAILS_BY_COMAPANYID)
	List<JobDetails> getAllByComapanyId(Long companyId);

}
