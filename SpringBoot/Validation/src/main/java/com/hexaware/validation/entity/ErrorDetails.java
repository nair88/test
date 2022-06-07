package com.hexaware.validation.entity;

public class ErrorDetails {
	String status;
	String errors;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	public ErrorDetails(String status, String errors) {
		super();
		this.status = status;
		this.errors = errors;
	}
	
	}
	

