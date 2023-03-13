package com.project.htproject.dto;

import java.util.Date;

import com.project.htproject.entity.Candidate;

public class ExperienceDto {

	private Long experienceId;
	private String designation;
	private String organization;
	private Date fromDate;
	private Date toDate;
	private String totalExperienceInMonths;
	private String natureOfWork;
	private Candidate candidate;
	public Long getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(Long experienceId) {
		this.experienceId = experienceId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public String getTotalExperienceInMonths() {
		return totalExperienceInMonths;
	}
	public void setTotalExperienceInMonths(String totalExperienceInMonths) {
		this.totalExperienceInMonths = totalExperienceInMonths;
	}
	public String getNatureOfWork() {
		return natureOfWork;
	}
	public void setNatureOfWork(String natureOfWork) {
		this.natureOfWork = natureOfWork;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public ExperienceDto(Long experienceId, String designation, String organization, Date fromDate, Date toDate,
			String totalExperienceInMonths, String natureOfWork, Candidate candidate) {
		super();
		this.experienceId = experienceId;
		this.designation = designation;
		this.organization = organization;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.totalExperienceInMonths = totalExperienceInMonths;
		this.natureOfWork = natureOfWork;
		this.candidate = candidate;
	}
	public ExperienceDto(String designation, String organization, Date fromDate, Date toDate,
			String totalExperienceInMonths, String natureOfWork, Candidate candidate) {
		super();
		this.designation = designation;
		this.organization = organization;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.totalExperienceInMonths = totalExperienceInMonths;
		this.natureOfWork = natureOfWork;
		this.candidate = candidate;
	}
	@Override
	public String toString() {
		return "ExperienceDto [experienceId=" + experienceId + ", designation=" + designation + ", organization="
				+ organization + ", fromDate=" + fromDate + ", toDate=" + toDate + ", totalExperienceInMonths="
				+ totalExperienceInMonths + ", natureOfWork=" + natureOfWork + ", candidate=" + candidate + "]";
	}
	
	
}
