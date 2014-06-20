package gr.uoc.imse.retailer.mvc.controller;

import gr.uoc.imse.util.WebServiceCalls;
import gr.uoc.imse.winepro.ws.client.WineProWsStub.WineTypeSequence;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ( "/" )
public class HomeController
{
	private static final int PRODUCTS_PER_PAGE = 20;

	public HomeController ()
	{
	}

	@RequestMapping ( value = { "/", "/home" }, method = RequestMethod.GET )
	public String showHomePage ( Map < String, Object > model )
	{
		WineTypeSequence [] wineTypeSequenceArray = WebServiceCalls.getListOfWinesFromWS();
		model.put( "pageSize", PRODUCTS_PER_PAGE );
		model.put( "wineList", wineTypeSequenceArray );

		return "home";
	}
}
