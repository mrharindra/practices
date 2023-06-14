package domain;

public class User
{
	public String name;
	
	public User(String string) 
	{
		name = string;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
