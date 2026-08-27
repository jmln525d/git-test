package com.jsp.springBootCRUD.dto;

public class ResponseStructure <T> {
	
	private Long statusCode;
	private String message;
	private T data;
	
	public int getStatusCode() {
		return Math.toIntExact(statusCode);
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = (long) statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
