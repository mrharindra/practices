package com.airindia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.indigo.IndigoFlight;

import comon.intf.Airlines;
import comon.intf.Flight;

public class AirIndiaAirlines extends TataLuggege implements Airlines
{
	@Override
	public List<Flight> getFligtList()  
	{ 
		List<Flight> list = new ArrayList<Flight>();
		
		Flight f1 = new Flight("AIR504");
		Flight f2 = new Flight("AIR505");
		
		list.add(f1);
		list.add(f2);
		
		return list;
	}
	
	@Override
	public Flight getFligt(int flightId)
	{
		return null;
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
		return 10;
	}

	@Override
	public void doSomthing() 
	{
		
	}

	
}
