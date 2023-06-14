package main;


import domain.Address;
import domain.User;

public class CloneExample {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add1 = new Address("Mumbai");
		User user1  = new User("John", add1);
		
		// Created new copy
		User user2  = user1.clone();
		
		// now changing in first object
		user1.name = "Kevin";		
		user1.getAddress().setCity("Pune");
		
		
		// Copy object have old values
		System.out.println(user2.getName());
		Address add2 = user2.getAddress();
		System.out.println(add2.getCity());
		
	}
	
}
