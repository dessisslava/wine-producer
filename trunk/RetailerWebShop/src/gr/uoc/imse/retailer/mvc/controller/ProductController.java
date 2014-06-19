package gr.uoc.imse.retailer.mvc.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String showShoppingCart ( @RequestParam ( value = "selectedProductIdList" ) String idList, HttpServletRequest request,
			HttpServletResponse response, Map < String, Object > model )
	{
		// session.setAttribute("selectedProductList", productList);
		// session.setAttribute("totalPrice", totalPrice);// ?????????????????????????

		// model.put( "selectedProductIdList", idList );
		// model.put( "selectedProductList", wineList );
		// model.put( "totalPrice", totalPrice );
		// model.put( "shipmentCost", shipmentCost );
		return "review_cart";
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

		return "payment_result";
	}

}
