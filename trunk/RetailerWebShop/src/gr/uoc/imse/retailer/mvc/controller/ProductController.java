package gr.uoc.imse.retailer.mvc.controller;

import gr.uoc.imse.winepro.dto.OrderDto;
import gr.uoc.imse.winepro.dto.PaymentInfoDto;
import gr.uoc.imse.winepro.dto.WineDto;
import gr.uoc.imse.winepro.dto.WineOrderDto;
import gr.uoc.imse.winepro.service.OrderService;
import gr.uoc.imse.winepro.service.WineOrderService;
import gr.uoc.imse.winepro.service.WineService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alaz.service.exception.ServiceException;

@Controller
@RequestMapping ( "/checkout" )
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

	// @RequestMapping(method = RequestMethod.GET)
	// public String showShoppingCart()
	// {
	// return "review_cart";
	// }

	@RequestMapping ( method = RequestMethod.POST )
	public String showShoppingCart ( @RequestParam ( value = "selectedProductIdList" ) String idList, HttpServletRequest request,
			HttpServletResponse response, Map < String, Object > model )
	{
		BigDecimal totalPrice = new BigDecimal( 0 );
		WineDto wine = null;
		List < WineDto > wineList = new ArrayList < WineDto >();
		List < String > idStrList = Arrays.asList( idList.split( "," ) );
		for ( Iterator it = idStrList.iterator(); it.hasNext(); )
		{
			String s = (String) it.next();
			try
			{
				wine = this.wineService.findById( Integer.parseInt( s ) );
				totalPrice.add( wine.getPrice() );
				wineList.add( wine );
			}
			catch ( NumberFormatException e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch ( ServiceException e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		float shipmentCost = 0;
		try
		{
			shipmentCost = this.callShipmentService();
			totalPrice.add( new BigDecimal( shipmentCost ) );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
			// TODO: handle exception
		}

		// session.setAttribute("selectedProductList", productList);
		// session.setAttribute("totalPrice", totalPrice);// ?????????????????????????

		model.put( "selectedProductIdList", idList );
		model.put( "selectedProductList", wineList );
		model.put( "totalPrice", totalPrice );
		model.put( "shipmentCost", shipmentCost );
		return "review_cart";
	}

	private float callShipmentService ()
	{
		// TODO Auto-generated method stub
		return 1;
	}

	@RequestMapping ( value = "/shipment", method = RequestMethod.POST )
	public @ResponseBody
	String shipmentCalculate ( HttpServletRequest request, HttpServletResponse response )
	{
		return "{15}";
	}

	@RequestMapping ( value = "/pay", method = RequestMethod.POST )
	public String doPay ( @RequestParam ( value = "nameOnCard" ) String nameOnCard,
			@RequestParam ( value = "numberOnCard" ) long numberOnCard, @RequestParam ( value = "cvcNumberOnCard" ) int cvcNumberOnCard,
			@RequestParam ( value = "creditCardType" ) int creditCardType, HttpServletRequest request, HttpServletResponse response,
			Map < String, Object > model )
	{
		// List<ProductDto> selectedProductList = (List<ProductDto>) session.getAttribute("selectedProductList"); //
		// ???????????????????????????????????????
		OrderDto order = new OrderDto();
		order.setStatus( new Short( (short) 9 ) ); // 9 can be IN_PROCESS status
		List < WineDto > selectedWineList = null;// FIXME
		try
		{
			// TODO add products to the order :D
			this.orderService.save( order );

			List < WineOrderDto > orderedProducts = new ArrayList < WineOrderDto >( selectedWineList.size() );
			WineOrderDto orderProductDto;
			for ( Iterator it = selectedWineList.iterator(); it.hasNext(); )
			{
				WineDto productDto = (WineDto) it.next();
				orderProductDto = new WineOrderDto();
				orderProductDto.setOrder( order );
				orderProductDto.setAmount( 1 ); // TODO
				orderProductDto.setWine( productDto );
				orderedProducts.add( orderProductDto );
			}

			this.wineOrderService.saveList( orderedProducts );

			PaymentInfoDto paymentInfoDto = new PaymentInfoDto();
			// paymentInfoDto.setAmountOfPayment((float) session.getAttribute("totalPrice")); // FIXME
			// ???????????????????????????????????????
			paymentInfoDto.setCreditCardType( (short) creditCardType );
			paymentInfoDto.setSecurityCode( "" + cvcNumberOnCard );
			paymentInfoDto.setNameSurname( nameOnCard );
			paymentInfoDto.setNumber( "" + numberOnCard );

			order.setPaymentInfo( paymentInfoDto );
			// this.callBPEL(order);
		}
		catch ( ServiceException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch ( Exception e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( order.getId() );
		return "payment_result";
	}

	// private void callBPEL(OrderDto order) throws Exception
	// {
	// Invoke_all invokeAll = this.getBPELEngineService();
	//
	// Bpel_complex_input bb = new Bpel_complex_input();
	// bb.setInput_Amount(1); // FIXME
	// bb.setInput_ID(order.getOrderedProducts().get(0).getProduct().getId()); // TODO
	//
	// Input_CCType cc = new Input_CCType();
	// PaymentInfoDto paymentInfo = order.getPaymentInfo();
	// cc.setAmountOfPayment(paymentInfo.getAmountOfPayment());
	// cc.setCreditCardCVCNumber(paymentInfo.getCvcNumber());
	// cc.setCreditCardNumber(paymentInfo.getNumber());
	// cc.setCreditCardType(paymentInfo.getCreditCardType());
	// cc.setNameSurname(paymentInfo.getName());
	// cc.setOrderId(paymentInfo.getCorrelationId());
	//
	// invokeAll.process(bb, cc);
	// }

	// private Invoke_all getBPELEngineService() throws Exception
	// {
	// // @WebService( serviceName = "InventoryService", endpointInterface = "vymiyai.ws.IInventory" )
	// URL url = new URL("http://localhost:8080/ode/processes/invoke_all?wsdl");
	//
	// // 1st argument service URI, refer to wsdl document above
	// // 2nd argument is service name, refer to wsdl document above
	// QName qname = new QName("http://acme.sorenna.lv", "Invoke_all");
	//
	// Service service = Service.create(url, qname);
	// return service.getPort(Invoke_all.class);
	// }
}
