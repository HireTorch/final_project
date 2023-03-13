package com.project.htproject.entity;
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
import jakarta.persistence.Table;

@Entity
@Table(name = "Candidate_Hsc_Ssc_Academics")
public class CandidateHscSscAcademics {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "academics_Id")
	private Long academicsId;
	@Column(name = "school_Name")
	private String schoolName;
	@Column(name = "obtained_Marks")
	private int obtainedMarks;
	@Column(name = "total_Marks")
	private int totalMarks;

	@OneToOne(fetch = FetchType.EAGER/*, cascade = CascadeType.ALL*/)
	@JoinColumn(name = "board_id")
	//@JsonIgnore
	private BoardsMaster board;

	@OneToOne(fetch = FetchType.EAGER /*, cascade = CascadeType.ALL*/)
	@JoinColumn(name = "sh_Level_Id")
	//@JsonIgnore
	private SscHscQualificationLevel level;

	@OneToOne(fetch = FetchType.EAGER /*cascade = CascadeType.ALL*/)
	@JoinColumn(name = "stream_Id")
	//@JsonIgnore
	private StreamsMaster streams;

	@ManyToOne/*(cascade = CascadeType.ALL)*/
	@JoinColumn(name="candidate_id")
	@JsonIgnore
	private Candidate candidate; 


	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public CandidateHscSscAcademics(Long academicsId, String schoolName, int obtainedMarks, int totalMarks,
			BoardsMaster board, SscHscQualificationLevel level, StreamsMaster streams) {
		super();
		this.academicsId = academicsId;
		this.schoolName = schoolName;
		this.obtainedMarks = obtainedMarks;
		this.totalMarks = totalMarks;
		this.board = board;
		this.level = level;
		this.streams = streams;
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

	public CandidateHscSscAcademics() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CandidateHscSscAcademics [academicsId=" + academicsId + ", schoolName=" + schoolName
				+ ", obtainedMarks=" + obtainedMarks + ", totalMarks=" + totalMarks + ", board=" + board + ", level="
				+ level + ", streams=" + streams + "]";
	}




}