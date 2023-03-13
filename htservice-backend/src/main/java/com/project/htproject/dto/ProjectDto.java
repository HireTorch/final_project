package com.project.htproject.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.htproject.entity.Candidate;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ProjectDto {

	private Long projectId;
	private String projectLevel;
	private String projectTitle;
	private String projectDuration;
	private String projectPlatform;
	private String projectDescription;
	private Candidate candidate;
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
	public ProjectDto(String projectLevel, String projectTitle, String projectDuration, String projectPlatform,
			String projectDescription, Candidate candidate) {
		super();
		this.projectLevel = projectLevel;
		this.projectTitle = projectTitle;
		this.projectDuration = projectDuration;
		this.projectPlatform = projectPlatform;
		this.projectDescription = projectDescription;
		this.candidate = candidate;
	}
	public ProjectDto(Long projectId, String projectLevel, String projectTitle, String projectDuration,
			String projectPlatform, String projectDescription, Candidate candidate) {
		super();
		this.projectId = projectId;
		this.projectLevel = projectLevel;
		this.projectTitle = projectTitle;
		this.projectDuration = projectDuration;
		this.projectPlatform = projectPlatform;
		this.projectDescription = projectDescription;
		this.candidate = candidate;
	}
	@Override
	public String toString() {
		return "ProjectDto [projectId=" + projectId + ", projectLevel=" + projectLevel + ", projectTitle="
				+ projectTitle + ", projectDuration=" + projectDuration + ", projectPlatform=" + projectPlatform
				+ ", projectDescription=" + projectDescription + ", candidate=" + candidate + "]";
	}
	public ProjectDto() { }
}
