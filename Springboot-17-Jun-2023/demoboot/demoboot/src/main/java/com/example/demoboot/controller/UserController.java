package com.example.demoboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoboot.model.User;
import com.example.demoboot.service.TestService;
import com.example.demoboot.service.UserServiceInterface;

@RestController
public class UserController 
{
	Logger logger= LogManager.getLogger();
	
	@Autowired
	TestService testService;
	
	@Autowired
	UserServiceInterface userServiceInterface;

	@PostMapping(path="/reg")
	public void reguser(User user) throws Exception
	{
		throw new Exception("Some error");
	}
	
	@GetMapping(path="/user")	
	public ResponseEntity<?> user(@RequestHeader("ClientName") String clientName, 
			@RequestHeader HttpHeaders heaedrs) throws Exception
	{

		System.out.println("Header client name: "+ clientName);
		
		
		System.out.println("All Header: " + heaedrs);

		
		User u = new User("kevin", "kevin@example.com");
		
		//Write some header in HTTP Response
		HttpHeaders respHeader = new HttpHeaders();
		respHeader.set("ServerName", "Boot Example");
		
		ResponseEntity<?> re = new ResponseEntity<>(u, respHeader, HttpStatus.CREATED);
		return re;	
	}
}
