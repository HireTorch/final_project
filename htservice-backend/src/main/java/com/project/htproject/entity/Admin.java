package com.project.htproject.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin_master")
public class Admin {

	@Id
	@SequenceGenerator(name = "Admin_seq" , initialValue = 31000)
	@GeneratedValue(generator = "Admin_seq")
	@Column(name = "admin_Id")
	private Long adminId;
	@Column(name = "admin_Name")
	private String adminName;
	@Column(name = "admin_Email")
	private String adminEmail;
	@Column(name = "admin_UserName")
	private String adminUserName;
	@Column(name = "admin_Password")
	private String adminPassword;


	public Admin(String adminName, String adminEmail, String adminUserName, String adminPassword) {
		super();
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}


	public Admin() {
		super();
	}



	public Admin(Long adminId, String adminName, String adminEmail, String adminUserName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}


	public Long getAdminId() {
		return adminId;
	}


	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getAdminEmail() {
		return adminEmail;
	}


	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}


	public String getAdminUserName() {
		return adminUserName;
	}


	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminUserName=" + adminUserName + ", adminPassword=" + adminPassword + "]";
	}

}