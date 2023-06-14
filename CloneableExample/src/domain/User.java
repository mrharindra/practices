package domain;

public class User implements Cloneable
{
	public String name;
	private Address address;
	
	public User(String string, Address add1) 
	{
		name = string;		
		address = add1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address add) {
		this.address = add;
	}
	
	@Override
	public User clone() throws CloneNotSupportedException 
	{
		// create new object with old values for primitive data types, wrapper and S 
		User copyUser = (User) super.clone();
		
		// Deep cloning - creating copy of member objects of Outer class
		if( address != null) 
		{
						 
			if( address instanceof Cloneable)
			{
				Address copy = address.clone();
				copyUser.setAddress(copy);
			}
			else 
			{
				// Create new Address  instance and Copy value from old
				Address addNew = new Address();
				addNew.setCity( this.address.getCity() );
				
				copyUser.setAddress(addNew);
				
			}		
		}
				
		return copyUser;  
	}
	
}
