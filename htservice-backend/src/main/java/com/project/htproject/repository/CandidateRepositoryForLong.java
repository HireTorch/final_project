package com.project.htproject.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.project.htproject.entity.Candidate;
import com.project.htproject.query.QueryConstant;

public interface CandidateRepositoryForLong extends JpaRepository<Candidate, Long>{

	@Modifying //Mandatory in order to support any DML operation
	@Query(QueryConstant.UPDATE_CANDIDATE)
	void updateCandidate(Long getcandidateId, String firstName, String middleName, String lastName, LocalDate dob,
			String gender, String candidateEmail, String candidateAddhar, String candidateUserName,
			String candidatePassword);
	
	
}