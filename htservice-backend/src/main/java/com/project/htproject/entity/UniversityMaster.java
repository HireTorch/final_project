package com.project.htproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "university_master")
public class UniversityMaster {

	@Id
	@Column(name = "university_Id")
	private Integer universityId;
	@Column(name =  "unversity_Name")
	private String unversityName;


	public Integer getUniversityId() {
		return universityId;
	}


	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}


	public String getUnversityName() {
		return unversityName;
	}


	public void setUnversityName(String unversityName) {
		this.unversityName = unversityName;
	}


	public UniversityMaster() {}


	@Override
	public String toString() {
		return "UniversityMaster [universityId=" + universityId + ", unversityName=" + unversityName + "]";
	}

}