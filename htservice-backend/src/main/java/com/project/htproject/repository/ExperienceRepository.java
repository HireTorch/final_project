package com.project.htproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.htproject.entity.ExperienceEntity;
import com.project.htproject.query.QueryConstant;

public interface ExperienceRepository extends JpaRepository<ExperienceEntity, Long> {

	//@Modifying
		@Query(QueryConstant.SELECT_EXPERIENCE_BY_CANDIDATEID)
		List<ExperienceEntity> getAllByCandidateId(Long candidateId);
}
