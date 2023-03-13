package com.project.htproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.project.htproject.entity.Candidate;


@EnableJpaRepositories
@Repository
public interface CandidateRepository extends  JpaRepository<Candidate, Integer> {

	//@Modifying //Mandatory in order to support any DML operation
		@Query("select c from Candidate c where c.candidateEmail =:email")
		Candidate findByEmail(String email);


		//@Modifying //Mandatory in order to support any DML operation
		@Query("select c from Candidate c where c.candidateEmail =:email and c.candidatePassword =:encodedPassword")
        Optional<Candidate> findOneByEmailAndPassword(String email, String encodedPassword);
		
}