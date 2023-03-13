package com.project.htproject.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class CandidateQualificationEntity {
    
	@Id
	@SequenceGenerator(name = "Candidate_Qualification_seq" , initialValue = 5000)
	@GeneratedValue(generator = "Candidate_Qualification_seq")
	@Column(name = "candidate_qualification_Id")
	private Long candidateQualificationId;
	
	@Column(name = "college_name")
	private String collegeName;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "obtained_marks")
	private int obtainedMarks;
	
	@Column(name = "total_marks")
	private int totalMarks;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "number_of_attempts")
	private String numberOfAttempts;
	
	@Column(name = "number_of_backlogs")
	private String numberOfBacklogs;
	
	
	@ManyToOne(fetch = FetchType.EAGER/*cascade = CascadeType.ALL*/)
	@JoinColumn(name="candidate_id")
	//@JsonIgnore
	private Candidate candidate;
	
	@OneToOne(fetch = FetchType.EAGER/*cascade = CascadeType.ALL*/)
	@JoinColumn(name = "level_Id")
	//@JsonIgnore
    private DiplomaDegreeQulificationLevel diplomaDegreeQulificationLevel;
    
	@OneToOne(fetch = FetchType.EAGER/*cascade = CascadeType.ALL*/)
	@JoinColumn(name = "stream_Id")
    private QualificationStreamsEntity  qualificationStreamsEntity;



	public CandidateQualificationEntity() {
		super();
	}



	public CandidateQualificationEntity(String collegeName, String universityName, int obtainedMarks, int totalMarks,
			Date startDate, Date endDate, String numberOfAttempts, String numberOfBacklogs, Candidate candidate,
			DiplomaDegreeQulificationLevel diplomaDegreeQulificationLevel,
			QualificationStreamsEntity qualificationStreamsEntity) {
		super();
		this.collegeName = collegeName;
		this.universityName = universityName;
		this.obtainedMarks = obtainedMarks;
		this.totalMarks = totalMarks;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberOfAttempts = numberOfAttempts;
		this.numberOfBacklogs = numberOfBacklogs;
		this.candidate = candidate;
		this.diplomaDegreeQulificationLevel = diplomaDegreeQulificationLevel;
		this.qualificationStreamsEntity = qualificationStreamsEntity;
	}



	public Long getCandidateQualificationId() {
		return candidateQualificationId;
	}



	public void setCandidateQualificationId(Long candidateQualificationId) {
		this.candidateQualificationId = candidateQualificationId;
	}



	public String getCollegeName() {
		return collegeName;
	}



	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public String getUniversityName() {
		return universityName;
	}



	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}



	public int getObtainedMarks() {
		return obtainedMarks;
	}



	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}



	public int getTotalMarks() {
		return totalMarks;
	}



	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public String getNumberOfAttempts() {
		return numberOfAttempts;
	}



	public void setNumberOfAttempts(String numberOfAttempts) {
		this.numberOfAttempts = numberOfAttempts;
	}



	public String getNumberOfBacklogs() {
		return numberOfBacklogs;
	}



	public void setNumberOfBacklogs(String numberOfBacklogs) {
		this.numberOfBacklogs = numberOfBacklogs;
	}



	public Candidate getCandidate() {
		return candidate;
	}



	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}



	public DiplomaDegreeQulificationLevel getDiplomaDegreeQulificationLevel() {
		return diplomaDegreeQulificationLevel;
	}



	public void setDiplomaDegreeQulificationLevel(DiplomaDegreeQulificationLevel diplomaDegreeQulificationLevel) {
		this.diplomaDegreeQulificationLevel = diplomaDegreeQulificationLevel;
	}



	public QualificationStreamsEntity getQualificationStreamsEntity() {
		return qualificationStreamsEntity;
	}



	public void setQualificationStreamsEntity(QualificationStreamsEntity qualificationStreamsEntity) {
		this.qualificationStreamsEntity = qualificationStreamsEntity;
	}



	@Override
	public String toString() {
		return "CandidateQualificationEntity [candidateQualificationId=" + candidateQualificationId + ", collegeName="
				+ collegeName + ", universityName=" + universityName + ", obtainedMarks=" + obtainedMarks
				+ ", totalMarks=" + totalMarks + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", numberOfAttempts=" + numberOfAttempts + ", numberOfBacklogs=" + numberOfBacklogs + ", candidate="
				+ candidate + ", diplomaDegreeQulificationLevel=" + diplomaDegreeQulificationLevel
				+ ", qualificationStreamsEntity=" + qualificationStreamsEntity + "]";
	}
	
}
