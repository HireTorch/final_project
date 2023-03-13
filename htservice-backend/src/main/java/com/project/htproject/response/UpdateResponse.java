package com.project.htproject.response;
public class UpdateResponse {

	private String message;
	private String name;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UpdateResponse(String message, String name) {
		super();
		this.message = message;
		this.name = name;
	}
	@Override
	public String toString() {
		return "UpdateResponse [message=" + message + ", name=" + name + "]";
	}


}