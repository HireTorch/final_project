package com.project.htproject.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "company_master")
public class Company implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1852583184533593271L;
	@Id
	@SequenceGenerator(name = "Com_seq" , initialValue = 31000)
	@GeneratedValue(generator = "Com_seq")
	@Column(name="company_id")
	private Long companyId;
	@Column(name="company_name")
	private String companyName;
	@Column(name="company_email")
	private String companyEmail;
	@Column(name="company_user_name")
	private String companyUserName;
	@Column(name="company_password")
	private String companyPassword;
	
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<JobDetails> jobDetails = new ArrayList<JobDetails>(0);
	
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

    
	public Company(String companyName, String companyEmail, String companyUserName, String companyPassword) {
		super();
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyUserName = companyUserName;
		this.companyPassword = companyPassword;
	}



	public Long getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyEmail() {
		return companyEmail;
	}


	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}


	public String getCompanyUserName() {
		return companyUserName;
	}


	public void setCompanyUserName(String companyUserName) {
		this.companyUserName = companyUserName;
	}


	public String getCompanyPassword() {
		return companyPassword;
	}


	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}


	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyEmail=" + companyEmail
				+ ", companyUserName=" + companyUserName + ", companyPassword=" + companyPassword + "]";
	}
	


}
