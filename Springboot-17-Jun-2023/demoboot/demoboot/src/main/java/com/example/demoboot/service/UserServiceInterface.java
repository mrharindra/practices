package com.example.demoboot.service;

import com.example.demoboot.model.User;

public interface UserServiceInterface 
{
	public User getUser() throws Exception;

	User updateUser();
}
