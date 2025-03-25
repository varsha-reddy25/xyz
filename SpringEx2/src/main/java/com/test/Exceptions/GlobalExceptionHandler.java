package com.test.Exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorMessage> productNotFoundException(ProductNotFoundException pnf,WebRequest request)
	{
		ErrorMessage msgData=new ErrorMessage();
		
		int statusCode=HttpStatus.NOT_FOUND.value();
		
		String desc = request.getDescription(false);
		
		msgData.setTimeStamp(new Date());
		
		msgData.setMessage(pnf.getMessage());
		
		msgData.setUrl(desc);
		
		msgData.setStatusCode(statusCode);
		
		return new ResponseEntity<ErrorMessage>(msgData,HttpStatus.NOT_FOUND);
	}
	
	public ResponseEntity<ErrorMessage> unknownExceptions(Exception e , WebRequest request)
	
	{
		ErrorMessage msgData = new ErrorMessage();
		
		int statusCode=HttpStatus.BAD_REQUEST.value();
		
		String desc =request.getDescription(false);
		
msgData.setTimeStamp(new Date());
		
		msgData.setMessage(e.getMessage());
		
		msgData.setUrl(desc);
		
		msgData.setStatusCode(statusCode);
		
		return new ResponseEntity<ErrorMessage>(msgData,HttpStatus.BAD_REQUEST);
		
	}
}
