package com.project.htproject.dto;

import java.util.Date;

import com.project.htproject.entity.Candidate;
import com.project.htproject.entity.DiplomaDegreeQulificationLevel;
import com.project.htproject.entity.QualificationStreamsEntity;

public class CandidateQualificationDto {
    
	private Long candidateQualificationId;
	private String collegeName;
	private String universityName;
	private DiplomaDegreeQulificationLevel qualifictionLevel;
	private QualificationStreamsEntity qualificationStreams; 
	private int obtainedMarks;
	private int totalMarks;
	private Date startDate;
	private Date endDate;
	private String numberOfAttempts;
	private String numberOfBacklogs;
	private Candidate candidate;
	
	

	public CandidateQualificationDto(String collegeName, String universityName,
			DiplomaDegreeQulificationLevel qualifictionLevel, QualificationStreamsEntity qualificationStreams,
			int obtainedMarks, int totalMarks, Date startDate, Date endDate, String numberOfAttempts,
			String numberOfBacklogs, Candidate candidate) {
		super();
		this.collegeName = collegeName;
		this.universityName = universityName;
		this.qualifictionLevel = qualifictionLevel;
		this.qualificationStreams = qualificationStreams;
		this.obtainedMarks = obtainedMarks;
		this.totalMarks = totalMarks;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberOfAttempts = numberOfAttempts;
		this.numberOfBacklogs = numberOfBacklogs;
		this.candidate = candidate;
	}
	
	

	public Candidate getCandidate() {
		return candidate;
	}



	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}



	public CandidateQualificationDto() {
		super();
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

	public DiplomaDegreeQulificationLevel getQualifictionLevel() {
		return qualifictionLevel;
	}

	public void setQualifictionLevel(DiplomaDegreeQulificationLevel qualifictionLevel) {
		this.qualifictionLevel = qualifictionLevel;
	}

	public QualificationStreamsEntity getQualificationStreams() {
		return qualificationStreams;
	}

	public void setQualificationStreams(QualificationStreamsEntity qualificationStreams) {
		this.qualificationStreams = qualificationStreams;
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

	@Override
	public String toString() {
		return "CandidateQualificationDto [candidateQualificationId=" + candidateQualificationId + ", collegeName="
				+ collegeName + ", universityName=" + universityName + ", qualifictionLevel=" + qualifictionLevel
				+ ", qualificationStreams=" + qualificationStreams + ", obtainedMarks=" + obtainedMarks
				+ ", totalMarks=" + totalMarks + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", numberOfAttempts=" + numberOfAttempts + ", numberOfBacklogs=" + numberOfBacklogs + ", candidate="
				+ candidate + "]";
	}

	

	
}
