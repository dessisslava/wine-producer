package gr.uoc.imse.retailer.mvc.controller;

import gr.uoc.imse.OrderWine1StPhaseServiceStub;
import gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseRequest;
import gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseResponse;
import gr.uoc.imse.OrderWine2NdPhaseServiceStub;
import gr.uoc.imse.OrderWine2NdPhaseServiceStub.OrderWine2NdPhaseRequest;
import gr.uoc.imse.OrderWine2NdPhaseServiceStub.OrderWine2NdPhaseResponse;
import gr.uoc.imse.util.WineIdQuantityPair;
import gr.uoc.imse.winepro.dto.WineDto;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
@RequestMapping ( "/checkout" )
public class ProductController
{

	public ProductController ()
	{
	}

	// @RequestMapping(method = RequestMethod.GET)
	// public String showShoppingCart()
	// {
	// return "review_cart";
	// }

	@RequestMapping ( method = RequestMethod.POST )
	public String showShoppingCart ( @RequestParam ( value = "productIdList" ) String productIdList,
			@RequestParam ( value = "selectedProductIdList" ) String idList, HttpServletRequest request, HttpServletResponse response,
			Map < String, Object > model )
	{
		Gson gson = new GsonBuilder().setDateFormat( "dd-MM-yyyy" ).create();

		WineDto [] allWineListArray = gson.fromJson( productIdList, WineDto [].class );

		BigDecimal totalPrice = new BigDecimal( 0 );
		WineDto wine = null;
		List < WineDto > wineList = new ArrayList < WineDto >();
		List < String > idStrList = Arrays.asList( idList.split( "," ) );
		for ( Iterator it = idStrList.iterator(); it.hasNext(); )
		{
			String s = (String) it.next();
			Integer selectedId = Integer.parseInt( s );

			for ( int i = 0; i < allWineListArray.length; i++ )
			{
				if ( allWineListArray [ i ].getId().equals( selectedId ) )
				{
					wineList.add( allWineListArray [ i ] );
					totalPrice.add( allWineListArray [ i ].getPrice() );
					break;
				}
			}
		}

		model.put( "selectedProductIdList", idList );
		model.put( "selectedProductList", wineList );
		model.put( "totalPrice", totalPrice );
		return "review_cart";
	}

	@RequestMapping ( value = "/placeOrder", method = RequestMethod.POST )
	public String placeOrder ( @RequestParam ( value = "shipmentUrgent" ) Boolean shipmentUrgent,
			@RequestParam ( value = "destinationCity" ) String destinationCity,
			@RequestParam ( value = "warehouseCity" ) String warehouseCity,
			@RequestParam ( value = "wineQuanitiyPairs" ) String wineQuanitiyPairs,
			@RequestParam ( value = "selectedProductIdList" ) String idList, HttpServletRequest request, HttpServletResponse response,
			Map < String, Object > model )
	{
		try
		{
			Gson gson = new Gson();
			WineIdQuantityPair [] wineIdQuantityPairArr = gson.fromJson( wineQuanitiyPairs, WineIdQuantityPair [].class );

			OrderWine1StPhaseServiceStub firstPhaseStub = new OrderWine1StPhaseServiceStub();
			OrderWine1StPhaseRequest firstPhaseRequest = new OrderWine1StPhaseRequest();

			firstPhaseRequest.setDestinationCity( destinationCity );
			firstPhaseRequest.setUrgentDelivery( shipmentUrgent );
			firstPhaseRequest.setWarehouseCity( warehouseCity );

			gr.uoc.imse.OrderWine1StPhaseServiceStub.WineQuantityPairType wineQuantityPairType =
					new gr.uoc.imse.OrderWine1StPhaseServiceStub.WineQuantityPairType();

			gr.uoc.imse.OrderWine1StPhaseServiceStub.WineQuantityPairTypeSequence sequenceArr[] =
					new gr.uoc.imse.OrderWine1StPhaseServiceStub.WineQuantityPairTypeSequence [ wineIdQuantityPairArr.length ];

			for ( int i = 0; i < wineIdQuantityPairArr.length; i++ )
			{
				sequenceArr [ i ] = new gr.uoc.imse.OrderWine1StPhaseServiceStub.WineQuantityPairTypeSequence();
				sequenceArr [ i ].setQuantity( wineIdQuantityPairArr [ i ].getQuantity() );
				sequenceArr [ i ].setWineId( wineIdQuantityPairArr [ i ].getWineId() );
			}

			wineQuantityPairType.setWineQuantityPairTypeSequence( sequenceArr );
			firstPhaseRequest.setWineQuantityPairs( wineQuantityPairType );

			OrderWine1StPhaseResponse firstPhaseResponse = firstPhaseStub.process( firstPhaseRequest );

			model.put( "message", firstPhaseResponse.getMessage() );
			model.put( "price", firstPhaseResponse.getPrice() );
			model.put( "satisfiable", firstPhaseResponse.getSatisfiable() );
			model.put( "transportationCost", firstPhaseResponse.getTransportationCost().setScale( 2, RoundingMode.FLOOR ) );

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

		// session.setAttribute("selectedProductList", productList);
		// session.setAttribute("totalPrice", totalPrice);// ?????????????????????????
		// model.put( "selectedProductIdList", idList );

		return "review_cart";
	}

	@RequestMapping ( value = "/pay", method = RequestMethod.POST )
	public String doPay ( @RequestParam ( value = "nameOnCard" ) String nameOnCard,
			@RequestParam ( value = "numberOnCard" ) long numberOnCard, @RequestParam ( value = "cvcNumberOnCard" ) int cvcNumberOnCard,
			@RequestParam ( value = "creditCardType" ) int creditCardType, HttpServletRequest request, HttpServletResponse response,
			Map < String, Object > model )
	{

		OrderWine2NdPhaseRequest secondPhaseRequest = new OrderWine2NdPhaseRequest();

		// secondPhaseRequest.setAmountOfMoney( param );
		// secondPhaseRequest.setCardNumber1( param );
		// secondPhaseRequest.setCardNumber2( param );
		// secondPhaseRequest.setExpirationDate1( param );
		// secondPhaseRequest.setExpirationDate2( param );
		// secondPhaseRequest.setNameSurname1( param );
		// secondPhaseRequest.setNameSurname2( param );
		// secondPhaseRequest.setSecurityNumber1( param );
		// secondPhaseRequest.setSecurityNumber2( param );
		// secondPhaseRequest.setWarehouseCity( param );
		// secondPhaseRequest.setWineQuantityPairs( param );

		try
		{
			OrderWine2NdPhaseServiceStub secondPhaseStub = new OrderWine2NdPhaseServiceStub();
			OrderWine2NdPhaseResponse secondPhaseResponse = secondPhaseStub.process( secondPhaseRequest );

			secondPhaseResponse.getMessage();
			secondPhaseResponse.getSatisfiable();

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

		return "payment_result";
	}

}
