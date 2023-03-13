package com.project.htproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="Qualification_Streams")
public class QualificationStreamsEntity {
     @Id
     @SequenceGenerator(name = "Qualification_Streams_seq" , initialValue = 51)
 	 @GeneratedValue(generator = "Qualification_Streams_seq")
     @Column(name = "stream_Id")
	 private Long streamId;
	 private String stream;
	
	@OneToOne(mappedBy = "qualificationStreamsEntity") 
	@JsonIgnore
	private CandidateQualificationEntity candidateQualificationEntity; 
	 
	 
	public QualificationStreamsEntity() {
		// TODO Auto-generated constructor stub
	}

	public Long getStreamId() {
		return streamId;
	}

	public void setStreamId(Long streamId) {
		this.streamId = streamId;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	
	

}
