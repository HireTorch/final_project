package com.project.htproject.response;


public class LoginMessage {
  
	private String message;
	private boolean status;
	private Long Id;
	
	public LoginMessage(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LoginMessage(String message, boolean status, Long id) {
		super();
		this.message = message;
		this.status = status;
		Id = id;
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
	
	
}
