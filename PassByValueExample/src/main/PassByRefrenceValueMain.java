package main;


import domain.User;

public class PassByRefrenceValueMain {
	
	public static void main(String[] args) {
		
		User user  = new User("Kevin");
		
		process( user );
		
		// Here 'Kevin' will be printed
		System.out.println(user.name);
		
		
		//-----------------//
		process2( user );
		
		// Here 'John' will be printed
		System.out.println(user.name);
		
		
		// Note: Java is always pass by value, 
		// In case of object also, there is copy of reference is passed into method
		// ANy modification happen in the actual object only
		
	}
	
	// 'pUser' reference variable is copy of 'user' variable which is in caller method
	private static void process(User pUser)
	{
		// But,  Re-initializing the 'pUser' reference variable
		// Now 'pUser' pointing to new User instance
		// so reference variable in caller method will not have any impact
		pUser = new User("John");
		
		// 'John' will be printed here
		System.out.println(pUser.name);
	}
	
	
	// 'pUser' reference variable is copy of 'user' variable which is in caller method
	private static void process2(User pUser)
	{
		// Here the is NO new User instance is created, pUser is point to same user instance
		// Changing the name in same object
			
		pUser.setName("John");
		
		// 'John' will be printed here
		System.out.println(pUser.name);
	}
}
