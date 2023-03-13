package com.project.htproject.dto;

import java.util.Date;

import com.project.htproject.entity.Company;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;



public class JobDetailsDto {
	

	private Long jobId ;
	private String jobTitle;
	private String JobDescription;
	private Double minPakchage;
	private Double maxPackage;
	private String location;
	private String skillSetRequirement;
	private Date postedDate;
	private boolean isActive;
	private Company company;
	
	

	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public JobDetailsDto(String jobTitle, String jobDescription, Double minPakchage, Double maxPackage, String location,
			String skillSetRequirement, Date postedDate, boolean isActive, Company company) {
		super();
		this.jobTitle = jobTitle;
		JobDescription = jobDescription;
		this.minPakchage = minPakchage;
		this.maxPackage = maxPackage;
		this.location = location;
		this.skillSetRequirement = skillSetRequirement;
		this.postedDate = postedDate;
		this.isActive = isActive;
		this.company = company;
	}


	public JobDetailsDto(Long jobId, String jobTitle, String jobDescription, Double minPakchage, Double maxPackage,
			String location, String skillSetRequirement, Date postedDate, Company company) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		JobDescription = jobDescription;
		this.minPakchage = minPakchage;
		this.maxPackage = maxPackage;
		this.location = location;
		this.skillSetRequirement = skillSetRequirement;
		this.postedDate = postedDate;
		this.company = company;
	}


	public JobDetailsDto() {
		super();
	}


	public Long getJobId() {
		return jobId;
	}


	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getJobDescription() {
		return JobDescription;
	}


	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}


	public Double getMinPakchage() {
		return minPakchage;
	}


	public void setMinPakchage(Double minPakchage) {
		this.minPakchage = minPakchage;
	}


	public Double getMaxPackage() {
		return maxPackage;
	}


	public void setMaxPackage(Double maxPackage) {
		this.maxPackage = maxPackage;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getSkillSetRequirement() {
		return skillSetRequirement;
	}


	public void setSkillSetRequirement(String skillSetRequirement) {
		this.skillSetRequirement = skillSetRequirement;
	}


	public Date getPostedDate() {
		return postedDate;
	}


	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "JobDetailsDto [jobId=" + jobId + ", jobTitle=" + jobTitle + ", JobDescription=" + JobDescription
				+ ", minPakchage=" + minPakchage + ", maxPackage=" + maxPackage + ", location=" + location
				+ ", skillSetRequirement=" + skillSetRequirement + ", postedDate=" + postedDate + ", isActive="
				+ isActive + ", company=" + company + "]";
	}


	
	
	


}
