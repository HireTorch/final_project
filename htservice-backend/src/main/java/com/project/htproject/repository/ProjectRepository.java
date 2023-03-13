package com.project.htproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.htproject.entity.ProjectEntity;
import com.project.htproject.query.QueryConstant;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

	//@Modifying
	@Query(QueryConstant.SELECT_PROJECT_BY_CANDIDATEID)
	List<ProjectEntity> getAllByCandidateId(Long candidateId);
	
}
