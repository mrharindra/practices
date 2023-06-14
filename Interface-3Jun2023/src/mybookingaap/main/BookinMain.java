package mybookingaap.main;

import java.util.List;

import comon.intf.Airlines;
import comon.intf.DomesticAirlines;
import comon.intf.Flight;

public class BookinMain {

	public static void main(String[] args) 
	{
		List<Airlines> airlines = AirLinesFactory.gteAllAirLines();
		
		for (Airlines airline : airlines) 
		{
			if( airline instanceof DomesticAirlines )
			{
				// do something
			}
			
			List<Flight> flights = airline.getFligtList();
			
			for (Flight flight : flights) 
			{
				System.out.println( flight );
			}
		}
		
	}	
	
}
