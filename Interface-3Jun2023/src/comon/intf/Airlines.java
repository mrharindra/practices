package comon.intf;

import java.util.List;

public interface Airlines 
{
	public List<Flight> getFligtList();
	
	public int getPrice(int flightId);

	public Integer getAvailableSeat(int flightId);
	
	public void doSomthing();

	public Flight getFligt(int flightId);
}
