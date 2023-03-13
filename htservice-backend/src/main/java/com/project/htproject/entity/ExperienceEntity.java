package com.project.htproject.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "exp9erience_details")
public class ExperienceEntity {
	@Id
	@SequenceGenerator(name = "Experience_seq" , initialValue = 7000)
	@GeneratedValue(generator = "Experience_seq")
	@Column(name = "experience_id")
	private Long experienceId;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "organization")
	private String organization;
	
	@Column(name = "from_date")
	private Date fromDate;
	
	@Column(name="to_date")
	private Date toDate;
	
   @Column(name="total_experience_months")
   private String totalExperienceInMonths;
   
	@Column(name = "nature_of_work")
	private String natureOfWork;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
    @JsonBackReference
    private Candidate candidate;

	
	public ExperienceEntity() {
		super();
	}

	public ExperienceEntity(String designation, String organization, Date fromDate, Date toDate,
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
		return "ExperienceEntity [experienceId=" + experienceId + ", designation=" + designation + ", organization="
				+ organization + ", fromDate=" + fromDate + ", toDate=" + toDate + ", totalExperienceInMonths="
				+ totalExperienceInMonths + ", natureOfWork=" + natureOfWork + ", candidate=" + candidate + "]";
	}

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
	
	

}
