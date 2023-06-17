package com.example.demoboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demoboot.model.ErrorResp;

@RestControllerAdvice
public class GlobalExceptionHandler 
{

	@ExceptionHandler(ItemNotFound.class)
	public ResponseEntity<?> handleException2(ItemNotFound exp) 
	{
		System.out.println("Inside Exception Handler2");
		ErrorResp resp = new ErrorResp(exp.getMyErrorCode(), exp.getMessage());
		ResponseEntity<?> res = new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
		return res;
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exp) 
	{
		System.out.println("Inside Exception Handler");
		exp.printStackTrace();
		
		ErrorResp resp = new ErrorResp(500, exp.getMessage());
		ResponseEntity<?> res = new ResponseEntity<>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
		return res;
	}
	
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<?> handleException3(Throwable exp) 
	{
		System.out.println("Inside Exception Handler3");
		ErrorResp resp = new ErrorResp(500, exp.getMessage());
		ResponseEntity<?> res = new ResponseEntity<>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
		return res;
	}
	
}
