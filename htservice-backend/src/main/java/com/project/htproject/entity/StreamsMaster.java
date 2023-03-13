package com.project.htproject.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Streams_Master ")
public class StreamsMaster {

		@Id
		@Column(name = "stream_Id")
		private Integer streamId;
		@Column(name = "stream_Name")
		private String streamName;

		@OneToOne(mappedBy = "streams")
		@JsonIgnore
		private CandidateHscSscAcademics academics;
		
		

		public StreamsMaster() {
			// TODO Auto-generated constructor stub
		}

		public Integer getStreamId() {
			return streamId;
		}

		public void setStreamId(Integer streamId) {
			this.streamId = streamId;
		}

		public String getStreamName() {
			return streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}



		public CandidateHscSscAcademics getAcademics() {
			return academics;
		}

		public void setAcademics(CandidateHscSscAcademics academics) {
			this.academics = academics;
		}

		@Override
		public String toString() {
			return "StreamsMaster [streamId=" + streamId + ", streamName=" + streamName + "]";
		}


}