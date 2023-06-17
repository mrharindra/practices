package com.example.demoboot.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demoboot.exception.ItemNotFound;
import com.example.demoboot.model.User;

@Service
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class UserService implements UserServiceInterface {

	@Autowired
	TestService testService;
	
	@Autowired
	@Lazy
	UserServiceInterface userServiceInterface;
	
	// 1, 3, 2
	public UserService()
	{
		System.out.println("1 User Service");
		//testService.doSomthing();
		System.out.println( this );
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("2 User service: postConstruct");
		testService.doSomthing();
		System.out.println( userServiceInterface );
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("User service: destroy");
	}
	
	
	@Override
	public User getUser() throws Exception 
	{
		throw new ItemNotFound("User not found", -142538);
		//throw new SQLException("some sql error");
	}
	
	@Override	
	public User updateUser() 
	{
		
		return null;
	}
	
}
