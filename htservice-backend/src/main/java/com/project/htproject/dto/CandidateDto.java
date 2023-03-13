package com.project.htproject.dto;

import java.time.LocalDate;

public class CandidateDto {

	private int candidateID;
	private String firstName;
	private String middleName;
	private String lastName;
	private LocalDate dob;
	private String gender;
	private String candidateEmail;
	private String candidateAddhar;
	private String candidateUserName;
	private String candidatePassword;
	public int getCandidateID() {
		return candidateID;
	}
	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCandidateEmail() {
		return candidateEmail;
	}
	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}
	public String getCandidateAddhar() {
		return candidateAddhar;
	}
	public void setCandidateAddhar(String candidateAddhar) {
		this.candidateAddhar = candidateAddhar;
	}
	public String getCandidateUserName() {
		return candidateUserName;
	}
	public void setCandidateUserName(String candidateUserName) {
		this.candidateUserName = candidateUserName;
	}
	public String getCandidatePassword() {
		return candidatePassword;
	}
	public void setCandidatePassword(String candidatePassword) {
		this.candidatePassword = candidatePassword;
	}
	public CandidateDto(int candidateID, String firstName, String middleName, String lastName, LocalDate dob,
			String gender, String candidateEmail, String candidateAddhar, String candidateUserName,
			String candidatePassword) {
		super();
		this.candidateID = candidateID;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.candidateEmail = candidateEmail;
		this.candidateAddhar = candidateAddhar;
		this.candidateUserName = candidateUserName;
		this.candidatePassword = candidatePassword;
	}
	public CandidateDto(String firstName, String middleName, String lastName, LocalDate dob, String gender,
			String candidateEmail, String candidateAddhar, String candidateUserName, String candidatePassword) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.candidateEmail = candidateEmail;
		this.candidateAddhar = candidateAddhar;
		this.candidateUserName = candidateUserName;
		this.candidatePassword = candidatePassword;
	}
	@Override
	public String toString() {
		return "CandidateDto [candidateID=" + candidateID + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + ", candidateEmail="
				+ candidateEmail + ", candidateAddhar=" + candidateAddhar + ", candidateUserName=" + candidateUserName
				+ ", candidatePassword=" + candidatePassword + "]";
	}
	public CandidateDto() {
		super();
	}


}