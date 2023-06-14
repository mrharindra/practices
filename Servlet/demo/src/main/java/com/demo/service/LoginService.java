package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.domain.Login;
import com.demo.domain.User;

public class LoginService 
{
	static List<User> list = new ArrayList<>();
	
	{
		User u1 = new User("Kevin"," kevin@demo.com");
		u1.setUsername("kevin");
		u1.setPassword("Welcome@123");
		
		list.add(u1);
	}
	

	public User login(Login login) throws Exception
	{
		for (User user : list) 
		{
			if(!user.getUsername().equalsIgnoreCase(login.getUsername() ))
			{
				continue;	
			}
			
			if(user.getPassword().equalsIgnoreCase(login.getPassword() ))
			{
				return user;
			}
			
			throw new Exception("Credential Invalid");	
		}
		
		throw new Exception("User does not exist");
	}
	

}
