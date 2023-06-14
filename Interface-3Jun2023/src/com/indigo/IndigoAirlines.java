package com.indigo;

import java.util.ArrayList;
import java.util.List;

import comon.intf.Airlines;
import comon.intf.DomesticAirlines;
import comon.intf.Flight;
import comon.intf.Luggage;

public class IndigoAirlines implements Airlines, Luggage, DomesticAirlines
{
	public List<Flight> getFligtList() throws RuntimeException
	{
		List<Flight> list = new ArrayList<Flight>();
		
		Flight f1 = new Flight("6E504");
		Flight f2 = new Flight("6E505");
		
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
	public int getLimitCheckin() {
		return 15;
	}

	@Override
	public void doSomthing() {
				
	}

	@Override
	public IndigoFlight getFligt(int flightId) 
	{
		return null;
	}
}
