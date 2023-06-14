package main;


public class PassByValue 
{
	public static void main(String[] args) {
		
		int i = 10;
		
		process(i);
		
		// 10 will be printer
		System.out.println(i);
		

		
	}
	
	// 'i' variable in parameter is copy of 'i' variable which is in caller method
	private static void process(int i)
	{
		// But,  Re-initializing the 'i' variable
		// Now 'i' have different value
		// so variable in caller method will not have any impact
		i = 20;
		
		// 20 will be printer
		System.out.println(i);
	}
}
