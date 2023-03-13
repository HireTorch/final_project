package com.project.htproject.response;

public class DeleteResponse {

	private String message;
	private boolean status;
	private Long id;
	
	public DeleteResponse() {
		
	}

	public DeleteResponse(String message, Long id) {
		super();
		this.message = message;
		this.id = id;
	}

	public DeleteResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}

	public DeleteResponse(String message, boolean status, Long id) {
		super();
		this.message = message;
		this.status = status;
		this.id = id;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DeleteResponse [message=" + message + ", status=" + status + ", id=" + id + "]";
	}
	
	
	
}
