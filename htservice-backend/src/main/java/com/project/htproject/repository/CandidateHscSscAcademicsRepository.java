package com.project.htproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.htproject.entity.CandidateHscSscAcademics;
import com.project.htproject.query.QueryConstant;

public interface CandidateHscSscAcademicsRepository extends JpaRepository<CandidateHscSscAcademics, Long> {
    @Query(QueryConstant.SELECT_ACADEMICS_BY_CANDIDATEID)
	CandidateHscSscAcademics getByCandidateId(Long candidateId);

}