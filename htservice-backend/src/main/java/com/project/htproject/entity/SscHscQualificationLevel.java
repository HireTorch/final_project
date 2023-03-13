package com.project.htproject.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ssc_Hsc_Qualification_Level")
public class SscHscQualificationLevel {

	@Id
	@Column(name = "sh_Level_Id")
	private Integer shLevelId;
	@Column(name = "sh_Level_Name")
	private String shLevelName;

	  @OneToOne(mappedBy = "level")
	  @JsonIgnore
	    private CandidateHscSscAcademics academics;

	public SscHscQualificationLevel() {
		// TODO Auto-generated constructor stub
	}

	public Integer getShLevelId() {
		return shLevelId;
	}

	public void setShLevelId(Integer shLevelId) {
		this.shLevelId = shLevelId;
	}

	public String getShLevelName() {
		return shLevelName;
	}

	public void setShLevelName(String shLevelName) {
		this.shLevelName = shLevelName;
	}



	public CandidateHscSscAcademics getAcademics() {
		return academics;
	}

	public void setAcademics(CandidateHscSscAcademics academics) {
		this.academics = academics;
	}

	@Override
	public String toString() {
		return "SscHscQualificationLevel [shLevelId=" + shLevelId + ", shLevelName=" + shLevelName + "]";
	}

}