package com.project.htproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.project.htproject.entity.CandidateQualificationEntity;
import com.project.htproject.query.QueryConstant;

public interface CandidateQualificationRepository extends JpaRepository<CandidateQualificationEntity, Long> {
    @Modifying
    @Query(QueryConstant.SELECT_QUALIFICATION_BY_CANDIDATEID)
	CandidateQualificationEntity getByCandidateId(Long candidateId);

}
