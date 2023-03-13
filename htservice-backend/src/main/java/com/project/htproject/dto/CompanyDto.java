package com.project.htproject.dto;


public class CompanyDto {
  
	private Long companyId;
	private String companyName;
	private String companyEmail;
	private String companyUserName;
	private String companyPassword;
	
	public CompanyDto() {
		super();
	}
	
	
	
	public CompanyDto(Long companyId, String companyName, String companyEmail, String companyUserName,
			String companyPassword) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyUserName = companyUserName;
		this.companyPassword = companyPassword;
	}



	public CompanyDto(String companyName, String companyEmail, String companyUserName, String companyPassword) {
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
	
	
	
	
}
