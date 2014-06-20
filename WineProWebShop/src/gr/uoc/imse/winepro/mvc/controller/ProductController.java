package gr.uoc.imse.winepro.mvc.controller;

import gr.uoc.imse.winepro.service.OrderService;
import gr.uoc.imse.winepro.service.WineOrderService;
import gr.uoc.imse.winepro.service.WineService;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.axis2.AxisFault;
import org.eclipse.bpel.order_grapes.Order_GrapesServiceStub;
import org.eclipse.bpel.order_grapes.Order_GrapesServiceStub.Order_GrapesRequest;
import org.eclipse.bpel.order_grapes.Order_GrapesServiceStub.Order_GrapesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ( "/orderGrapes" )
public class ProductController
{
	@Autowired
	private WineService wineService;

	@Autowired
	private OrderService orderService;

	@Autowired
	private WineOrderService wineOrderService;

	public ProductController ()
	{
	}

	public void setWineService ( WineService wineService )
	{
		this.wineService = wineService;
	}

	public void setOrderService ( OrderService orderService )
	{
		this.orderService = orderService;
	}

	public void setWineOrderService ( WineOrderService wineOrderService )
	{
		this.wineOrderService = wineOrderService;
	}

	@RequestMapping ( method = RequestMethod.GET )
	public String displayOrderGrapesPage ()
	{
		return "review_cart";
	}

	// ,
	@RequestMapping ( method = RequestMethod.POST )
	public String showShoppingCart ( @RequestParam ( value = "grapeVariety" ) String grapeVariety,
			@RequestParam ( value = "quantity" ) String quantity, @RequestParam ( value = "deliveryAddress" ) String deliveryAddress,
			HttpServletRequest request, HttpServletResponse response, Map < String, Object > model )
	{
		try
		{
			this.playThatFunkyMusicWhiteBoy( model );
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

		return "results";
	}

	private void playThatFunkyMusicWhiteBoy ( Map < String, Object > model ) throws AxisFault, RemoteException
	{
		Order_GrapesServiceStub stub = new Order_GrapesServiceStub();
		Order_GrapesRequest request = new Order_GrapesRequest();

		String deliveryAddress = "HER"; // RET
		String graperVariety = "RED"; // WHITE
		double quantity = 10.2;
		request.setDelivery_Address( deliveryAddress );
		request.setGrapes_Variety( graperVariety );
		request.setQuantity( quantity );

		Order_GrapesResponse response = stub.process( request );

		String orderId = response.getOrder_Id();
		Date orderDate = response.getOrder_Date();
		String producer = response.getProducer();
		Date expectedDeliveryDate = response.getExpected_Delivery_Date();
		double price = response.getPrice();

		System.out.println( orderId );

		model.put( "orderId", orderId );
		model.put( "orderDate", orderDate );
		model.put( "producer", producer );
		model.put( "expectedDeliveryDate", expectedDeliveryDate );
		model.put( "price", price );
	}
}
