package com.test.Exceptions;

import java.util.Date;

public class ErrorMessage {

	private Date timeStamp;
	
	private String url;
	
	private String message;
	
	private int statusCode;

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "ErrorMessage [timeStamp=" + timeStamp + ", url=" + url + ", message=" + message + ", statusCode="
				+ statusCode + "]";
	}
	
	
	
	
	
}
