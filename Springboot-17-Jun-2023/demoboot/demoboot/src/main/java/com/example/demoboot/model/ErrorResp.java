package com.example.demoboot.model;

public class ErrorResp 
{
	long code;
	
	String message;
	
	public ErrorResp() {
	}
	public ErrorResp(long code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public long getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
