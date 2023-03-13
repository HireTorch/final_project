package com.project.htproject.dto;


import com.project.htproject.entity.BoardsMaster;
import com.project.htproject.entity.Candidate;
import com.project.htproject.entity.SscHscQualificationLevel;
import com.project.htproject.entity.StreamsMaster;


public class CandidateHscSscAcademicsDto {

	
	private Long academicsId;
	private String schoolName;
	private int obtainedMarks;
	private int totalMarks;
	private BoardsMaster board;
	private SscHscQualificationLevel level;
	private StreamsMaster streams;
	private Candidate candidate; 
	
	
	public CandidateHscSscAcademicsDto(String schoolName, int obtainedMarks, int totalMarks, BoardsMaster board,
			SscHscQualificationLevel level, StreamsMaster streams, Candidate candidate) {
		super();
		this.schoolName = schoolName;
		this.obtainedMarks = obtainedMarks;
		this.totalMarks = totalMarks;
		this.board = board;
		this.level = level;
		this.streams = streams;
		this.candidate = candidate;
	}


	public CandidateHscSscAcademicsDto() {
		// TODO Auto-generated constructor stub
	}


	public Long getAcademicsId() {
		return academicsId;
	}


	public void setAcademicsId(Long academicsId) {
		this.academicsId = academicsId;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
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


	public BoardsMaster getBoard() {
		return board;
	}


	public void setBoard(BoardsMaster board) {
		this.board = board;
	}


	public SscHscQualificationLevel getLevel() {
		return level;
	}


	public void setLevel(SscHscQualificationLevel level) {
		this.level = level;
	}


	public StreamsMaster getStreams() {
		return streams;
	}


	public void setStreams(StreamsMaster streams) {
		this.streams = streams;
	}


	public Candidate getCandidate() {
		return candidate;
	}


	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}


	@Override
	public String toString() {
		return "CandidateHscSscAcademicsDto [academicsId=" + academicsId + ", schoolName=" + schoolName
				+ ", obtainedMarks=" + obtainedMarks + ", totalMarks=" + totalMarks + ", board=" + board + ", level="
				+ level + ", streams=" + streams + ", candidate=" + candidate + "]";
	}
    
}
