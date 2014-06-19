/**
 * WinePriceWSDLFileSkeleton.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012
 * (05:33:49 IST)
 */
package gr.uoc.imse.winepro.ws.wine.price;

import gr.uoc.imse.winepricewsdlfile.GetTotalPriceOfGoodsResponse;
import gr.uoc.imse.winepro.dto.WineDto;
import gr.uoc.imse.winepro.service.WineService;
import gr.uoc.imse.wineprowswarehouseinventoryreserve.WineQuantityPairTypeSequence;
import java.math.BigDecimal;
import com.alaz.service.exception.ServiceException;

/**
 * WinePriceWSDLFileSkeleton java skeleton for the axisService
 */
public class WinePriceWSDLFileSkeleton
{

	private WineService wineService;

	public WinePriceWSDLFileSkeleton ()
	{
		// TODO Auto-generated constructor stub
	}

	public void setWineService ( WineService wineService )
	{
		this.wineService = wineService;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getTotalPriceOfGoods
	 * @return getTotalPriceOfGoodsResponse
	 */
	public gr.uoc.imse.winepricewsdlfile.GetTotalPriceOfGoodsResponse getTotalPriceOfGoods (
			gr.uoc.imse.winepricewsdlfile.GetTotalPriceOfGoods getTotalPriceOfGoods )
	{
		System.out.println( "This is getTotalPriceOfGoods!!!" );

		GetTotalPriceOfGoodsResponse response = new GetTotalPriceOfGoodsResponse();

		WineQuantityPairTypeSequence [] wineQuantityPairArray = getTotalPriceOfGoods.getWineQuantiyPair().getWineQuantityPairTypeSequence();
		BigDecimal totalPriceOfGoods = new BigDecimal( 0 );
		try
		{
			for ( int i = 0; i < wineQuantityPairArray.length; i++ )
			{
				WineDto wine = this.wineService.findById( wineQuantityPairArray [ i ].getWineId() );
				BigDecimal priceOfWine = wine.getPrice();
				int quantity = wineQuantityPairArray [ i ].getQuantity();
				BigDecimal priceOfWineQuantity = priceOfWine.multiply( new BigDecimal( quantity ) );
				totalPriceOfGoods = totalPriceOfGoods.add( priceOfWineQuantity );
			}
			response.setTotalPriceOfGoods( totalPriceOfGoods );
		}
		catch ( ServiceException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
	}

}
