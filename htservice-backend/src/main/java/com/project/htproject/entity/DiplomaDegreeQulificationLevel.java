package com.project.htproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Diploma_Degree_Qulification_Level")
public class DiplomaDegreeQulificationLevel {
	@Id
	@Column(name = "level_Id")
	private Long levelId;
	private String name;
	
	@OneToOne(mappedBy = "diplomaDegreeQulificationLevel")
	@JsonIgnore
	private CandidateQualificationEntity candidateQualificationEntity; 
	
	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public DiplomaDegreeQulificationLevel() {
		// TODO Auto-generated constructor stub
	}

}
