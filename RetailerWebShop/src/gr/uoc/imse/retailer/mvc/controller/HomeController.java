package gr.uoc.imse.retailer.mvc.controller;

import gr.uoc.imse.winepro.service.WineService;
import gr.uoc.imse.winepro.ws.client.wine.list.WineProWsWineListStub;
import gr.uoc.imse.winepro.ws.client.wine.list.WineProWsWineListStub.ListAllWines;
import gr.uoc.imse.winepro.ws.client.wine.list.WineProWsWineListStub.ListAllWinesResponse;
import gr.uoc.imse.winepro.ws.client.wine.list.WineProWsWineListStub.WineTypeSequence;
import java.rmi.RemoteException;
import java.util.Map;
import org.apache.axis2.AxisFault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ( "/" )
public class HomeController
{
	private static final int PRODUCTS_PER_PAGE = 20;

	@Autowired
	private WineService wineService;

	public HomeController ()
	{
	}

	public void setWineService ( WineService wineService )
	{
		this.wineService = wineService;
	}

	@RequestMapping ( value = { "/", "/home" }, method = RequestMethod.GET )
	public String showHomePage ( Map < String, Object > model )
	{
		WineProWsWineListStub stub = null;
		ListAllWinesResponse listAllWinesResponse = null;
		try
		{
			stub = new WineProWsWineListStub();
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
		model.put( "pageSize", PRODUCTS_PER_PAGE );
		model.put( "wineList", wineTypeSequenceArray );

		return "home";
	}
}
