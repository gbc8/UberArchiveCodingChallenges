package com.gbc8.emailservice.core.exceptions;

public class EmailServiceException extends RuntimeException{
	
	public EmailServiceException(String msg) {
		super(msg);
	}
	
	public EmailServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
