package com.example.demoboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class TestService {
	
	@Autowired
	@Lazy
	UserServiceInterface userServiceInterface;
	
	public TestService()
	{
		System.out.println("3 Test Service");
	}

	public void doSomthing() {
		System.out.println("TestService doSomthing");
	}

}
