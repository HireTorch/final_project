package com.project.htproject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_details")
public class ProjectEntity {

	@Id
	@SequenceGenerator(name = "Project_seq" , initialValue = 5000)
	@GeneratedValue(generator = "Project_seq")
	@Column(name = "project_id")
	private Long projectId;
	@Column(name = "project_level")
	private String projectLevel;
	@Column(name = "project_title")
	private String projectTitle;
	@Column(name = "project_duration")
	private String projectDuration;
	@Column(name = "project_platform_used")
	private String projectPlatform;
	@Column(name = "project_description")
	private String projectDescription;
	
	//many to one relation
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	@JsonBackReference
    private Candidate candidate;

	public ProjectEntity(String projectLevel, String projectTitle, String projectDuration, String projectPlatform,
			String projectDescription, Candidate candidate) {
		super();
		this.projectLevel = projectLevel;
		this.projectTitle = projectTitle;
		this.projectDuration = projectDuration;
		this.projectPlatform = projectPlatform;
		this.projectDescription = projectDescription;
		this.candidate = candidate;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectLevel() {
		return projectLevel;
	}

	public void setProjectLevel(String projectLevel) {
		this.projectLevel = projectLevel;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}

	public String getProjectPlatform() {
		return projectPlatform;
	}

	public void setProjectPlatform(String projectPlatform) {
		this.projectPlatform = projectPlatform;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}


	public ProjectEntity() {
		super();
	}

	@Override
	public String toString() {
		return "ProjectEntity [projectId=" + projectId + ", projectLevel=" + projectLevel + ", projectTitle="
				+ projectTitle + ", projectDuration=" + projectDuration + ", projectPlatform=" + projectPlatform
				+ ", projectDescription=" + projectDescription + ", candidate=" + candidate + "]";
	}
	
}
