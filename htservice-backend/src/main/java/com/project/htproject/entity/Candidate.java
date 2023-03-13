package com.project.htproject.entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Candidate_master")
public class Candidate {

	@Id
	@SequenceGenerator(name = "Candidate_seq" , initialValue = 200000)
	@GeneratedValue(generator = "Candidate_seq")
	@Column(name = "candidate_id")
	private Long candidateID;
	@Column(name = "candidate_fname")
	private String firstName;
	@Column(name = "candidate_mname")
	private String middleName;
	@Column(name = "candidate_lname")
	private String lastName;
	@Column(name = "candidate_dob")
	private LocalDate dob; 
	@Column(name = "candidate_gender")
	private String gender;
	@Column(name = "candidate_email")
	private  String candidateEmail;
	@Column(name = "candidate_aadhar")
	private String candidateAddhar;
	@Column(name = "candidate_User_Name")
	private String candidateUserName;
	@Column(name = "candidate_User_Password")
	private String candidatePassword;


	@OneToMany(mappedBy = "candidate" , fetch = FetchType.EAGER)
	//@JsonIgnore
	private List<Address> candidateAddress = new ArrayList<Address>(0);

	@OneToMany(mappedBy = "candidate",fetch = FetchType.EAGER)
	//@JsonIgnore
	 private List<CandidateHscSscAcademics> candidateAcademics = new ArrayList<CandidateHscSscAcademics>(0);
	
	@OneToMany(mappedBy = "candidate",fetch = FetchType.EAGER)
	//@JsonIgnore
	private List<ProjectEntity> projects = new ArrayList<ProjectEntity>(0);
	
	@OneToMany(mappedBy = "candidate",fetch = FetchType.EAGER)
	//@JsonIgnore
	private List<ExperienceEntity> experiance = new ArrayList<ExperienceEntity>(0);
	
	
	/*Many to many mapping*/
	@ManyToMany
	@JoinTable(name = "candidate_jobdeatils",joinColumns = @JoinColumn(name = "candidate_id"),
	   inverseJoinColumns = @JoinColumn(name = "job_id"))
	private Set<JobDetails> appliedJobDetails = new HashSet<>();

     
	public Candidate(String firstName, String middleName, String lastName, LocalDate dob, String gender,
			String candidateEmail, String candidateAddhar, String candidateUserName, String candidatePassword,
			List<Address> candidateAddress, List<CandidateHscSscAcademics> candidateAcademics,
			Set<JobDetails> appliedJobDetails) {
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
		this.candidateAddress = candidateAddress;
		this.candidateAcademics = candidateAcademics;
		this.appliedJobDetails = appliedJobDetails;
	}
	
	
	
	public Set<JobDetails> getAppliedJobDetails() {
		return appliedJobDetails;
	}
	
	
	public void setAppliedJobDetails(Set<JobDetails> appliedJobDetails) {
		this.appliedJobDetails = appliedJobDetails;
	}
	
	
	public Candidate() {
		super();
	}
	public Long getCandidateID() {
		return candidateID;
	}
	public void setCandidateID(Long candidateID) {
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


	public List<CandidateHscSscAcademics> getCandidateAcademics() {
		return candidateAcademics;
	}
	public void setCandidateAcademics(List<CandidateHscSscAcademics> candidateAcademics) {
		this.candidateAcademics = candidateAcademics;
	}


	
	public Candidate(Long candidateID, String firstName, String middleName, String lastName, LocalDate dob,
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

	public List<Address> getCandidateAddress() {
		return candidateAddress;
	}
	public void setCandidateAddress(List<Address> candidateAddress) {
		this.candidateAddress = candidateAddress;
	}
	public Candidate(String firstName, String middleName, String lastName, LocalDate dob, String gender,
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
	public Candidate(String firstName, String middleName, String lastName, LocalDate dob, String gender,
			String candidateEmail, String candidateAddhar, List<Address> candidateAddress) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.candidateEmail = candidateEmail;
		this.candidateAddhar = candidateAddhar;
		this.candidateAddress = candidateAddress;
	}
	public Candidate(String firstName, String middleName, String lastName, LocalDate dob, String gender,
			String candidateEmail, String candidateAddhar, List<Address> candidateAddress,
			List<CandidateHscSscAcademics> candidateAcademics) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.candidateEmail = candidateEmail;
		this.candidateAddhar = candidateAddhar;
		this.candidateAddress = candidateAddress;
		this.candidateAcademics = candidateAcademics;
	}
	@Override
	public String toString() {
		return "Candidate [candidateID=" + candidateID + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + ", candidateEmail="
				+ candidateEmail + ", candidateAddhar=" + candidateAddhar + ", candidateUserName=" + candidateUserName
				+ ", candidatePassword=" + candidatePassword + ", candidateAddress=" + candidateAddress
				+ ", candidateAcademics=" + candidateAcademics + "]";
	}





}