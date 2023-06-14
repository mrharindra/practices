package com.vistara;

import java.util.ArrayList;
import java.util.List;

import com.airindia.TataLuggege;

import comon.intf.Airlines;
import comon.intf.Flight;

public class VistaraAirlines extends TataLuggege implements Airlines
{
	public List<Flight> getFligtList() 
	{ 
		List<Flight> list = new ArrayList<Flight>();
		
		Flight f1 = new Flight("VI6E504");
		Flight f2 = new Flight("VI6E505");
		
		list.add(f1);
		list.add(f2);
		
		return list;
	}

	public int getPrice(int flightId)
	{
		return 0;
	}

	public Integer getAvailableSeat(int flightId) 
	{
		return 100;
		
	}

	@Override
	public int getLimitCabin() {
		return 7;
	}

	@Override
	public void doSomthing() {
		
	}

	@Override
	public Flight getFligt(int flightId) 
	{
		return null;
	}

}
