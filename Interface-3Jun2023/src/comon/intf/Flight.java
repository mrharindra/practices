package comon.intf;

import java.util.Date;

public class Flight {
	String no;
	Date deptTime;	
	Date arivalTime;

	String src;
	String dest;
	
	String price;
	
	public Flight()
	{
		
	}
	
	public Flight(String no) 
	{
		this.no = no;
	}


	@Override
	public String toString() 
	{
		return "Flight [no=" + no + ", deptTime=" + deptTime + ", arivalTime=" + arivalTime + ", src=" + src + ", dest="
				+ dest + ", price=" + price + "]";
	}

}
