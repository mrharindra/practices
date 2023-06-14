package mybookingaap.main;

import java.util.ArrayList;
import java.util.List;

import com.airindia.AirIndiaAirlines;
import com.indigo.IndigoAirlines;
import com.vistara.VistaraAirlines;

import comon.intf.Airlines;

public class AirLinesFactory {
	
	public static List<Airlines> gteAllAirLines()
	{
		
		//ArrayList<Airlines> lines = new ArrayList<Airlines>();
		
		List<Airlines>  lines = new ArrayList<Airlines>();
		
		lines.add( new IndigoAirlines() );
		lines.add( new AirIndiaAirlines() );
		lines.add( new VistaraAirlines() );
		
		return lines;
	}
	

	

}
