package com.demo.domain;
public class User 
{
	String name;
	String email;
	
	String username;
	String password;
	
	
	private Address add;
	
	public User()
	{
		
	}
	
	public User(String name, String email) 
	{
		this.name = name;		
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return add;
	}
	
	public void setAddress(Address add) {
		this.add = add;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
