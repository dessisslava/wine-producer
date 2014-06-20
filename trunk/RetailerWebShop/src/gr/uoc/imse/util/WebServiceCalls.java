package gr.uoc.imse.util;

import gr.uoc.imse.winepro.ws.client.WineProWsStub;
import gr.uoc.imse.winepro.ws.client.WineProWsStub.ListAllWines;
import gr.uoc.imse.winepro.ws.client.WineProWsStub.ListAllWinesResponse;
import gr.uoc.imse.winepro.ws.client.WineProWsStub.WineTypeSequence;
import java.rmi.RemoteException;
import org.apache.axis2.AxisFault;

public class WebServiceCalls
{

	public static WineTypeSequence [] getListOfWinesFromWS ()
	{

		WineProWsStub stub = null;
		ListAllWinesResponse listAllWinesResponse = null;
		try
		{
			stub = new WineProWsStub();
			ListAllWines listAllWines = new ListAllWines();
			listAllWinesResponse = stub.listAllWines( listAllWines );
		}
		catch ( AxisFault e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch ( RemoteException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WineTypeSequence [] wineTypeSequenceArray = listAllWinesResponse.getWineArray().getWineTypeSequence();

		return wineTypeSequenceArray;
	}

}
