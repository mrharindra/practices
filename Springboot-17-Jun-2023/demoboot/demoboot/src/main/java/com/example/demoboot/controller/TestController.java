package com.example.demoboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoboot.service.TestService;
import com.example.demoboot.service.UserServiceInterface;

@RestController
public class TestController {
	
	Logger logger= LogManager.getLogger();
	
	@Autowired
	TestService testService;
	
	@Autowired
	UserServiceInterface userServiceInterface;

	// Setter injection - useful when want to do with dependent object before setting in member variable
//	@Autowired public void setUserServiceInterface(UserServiceInterface userServiceInterface) 
//	{
//		System.out.println("TestController.setUserService");
//		this.userServiceInterface = userServiceInterface; 
//	 }
	 
	
	@GetMapping(path="/hello")
	public String hello()
	{		
		return "Hello";
	}
	
	
}
