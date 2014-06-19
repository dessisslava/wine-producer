package gr.uoc.imse.winepro.mvc.controller;

import gr.uoc.imse.winepro.dto.WineDto;
import gr.uoc.imse.winepro.service.WineService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.alaz.service.exception.ServiceException;

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
		List < WineDto > wineList = null;

		try
		{
			wineList = this.wineService.findAll( 0, PRODUCTS_PER_PAGE );
			model.put( "pageSize", PRODUCTS_PER_PAGE );
			model.put( "wineList", wineList );
		}
		catch ( ServiceException s )
		{
			// TODO Auto-generated catch block
			s.printStackTrace();
		}

		return "home";
	}

}
