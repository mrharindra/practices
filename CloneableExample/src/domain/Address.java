package domain;

public class Address implements Cloneable
{
	String city;

	public Address() 
	{
		
	}
	
	public Address(String string) {
		city = string;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}