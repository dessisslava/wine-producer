package gr.uoc.imse.retailer.mvc.controller;

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

		// URL url = new URL( "http://localhost:9999/wine_producer/ws/order?wsdl" );
		//
		// // 1st argument service URI, refer to wsdl document above
		// // 2nd argument is service name, refer to wsdl document above
		// QName qname = new QName( "http://ws.mkyong.com/", "HelloWorldImplService" );
		//
		// Service service = Service.create( url, qname );
		//
		// HelloWorld hello = service.getPort( HelloWorld.class );
		//
		// System.out.println( hello.getHelloWorldAsString( "mkyong" ) );

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

		// this.callInventoryServiceAvailableItems( wineList );

		return "home";
	}

	private void callInventoryServiceAvailableItems ( List < WineDto > productList ) throws Exception
	{
		int size = productList.size();
		int [] idArr = new int [ size ];
		for ( int i = 0; i < size; i++ )
		{
			idArr [ i ] = productList.get( i ).getId();
		}
		// IInventory inventoryService = this.getInventoryService();
		// QueryResult qr = inventoryService.getItemsAvailabilities( idArr );
		//
		// SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd" );
		// Item[] itemsArr = qr.getItems();
		// for (int i = 0; i < itemsArr.length; i++)
		// {
		// Item item = itemsArr[i];
		// int id = item.getProduct().getId();
		// for (Iterator it = productList.iterator(); it.hasNext();)
		// {
		// ProductDto productDto = (ProductDto) it.next();
		// if (productDto.getId().equals( id ))
		// {
		// AvailabilityDto availabilityDto = new AvailabilityDto();
		// availabilityDto.setAmount( item.getAvailability().getAmountInStock() );
		// try
		// {
		// Date formattedDate = formatter.parse( item.getAvailability().getExpectedAvailableDate() );
		// productDto.setExpectedAvailabilityDate( formattedDate );
		// }
		// catch (Exception e)
		// {
		//
		// }
		//
		// productDto.setAvailability( availabilityDto );
		// }
		//
		// }
		// }
	}

	// private IInventory getInventoryService() throws Exception
	// {
	// // @WebService( serviceName = "InventoryService", endpointInterface = "vymiyai.ws.IInventory" )
	// URL url = new URL( "http://localhost:8080/Inventory/services/inventory?wsdl" );
	//
	// // 1st argument service URI, refer to wsdl document above
	// // 2nd argument is service name, refer to wsdl document above
	// QName qname = new QName( "vymiyai.ws.IInventory", "InventoryService" );
	//
	// Service service = Service.create( url, qname );
	// return service.getPort( IInventory.class );
	// }

}
