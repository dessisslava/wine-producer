/**
 * TransportationASkeleton.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012 (05:33:49
 * IST)
 */
package gr.uoc.imse.transportationa.ws;

import gr.uoc.imse.transportationa.GetTransportationCostResponse;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * TransportationASkeleton java skeleton for the axisService
 */
public class TransportationASkeleton
{

	/**
	 * Auto generated method signature
	 * 
	 * @param checkStatusOfDelivery
	 * @return checkStatusOfDeliveryResponse
	 */

	public gr.uoc.imse.transportationa.CheckStatusOfDeliveryResponse checkStatusOfDelivery (
			gr.uoc.imse.transportationa.CheckStatusOfDelivery checkStatusOfDelivery )
	{
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException( "Please implement " + this.getClass().getName() + "#checkStatusOfDelivery" );
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getTransportationCost
	 * @return getTransportationCostResponse
	 */

	public gr.uoc.imse.transportationa.GetTransportationCostResponse getTransportationCost (
			gr.uoc.imse.transportationa.GetTransportationCost getTransportationCost )
	{
		GetTransportationCostResponse response = new GetTransportationCostResponse();
		Date today = new Date();
		Random random = new Random();
		BigDecimal transportationCost = new BigDecimal( 0 );

		String destinationCity = getTransportationCost.getDestinationCity();
		String warehouseCity = getTransportationCost.getWarehouseCity();
		BigDecimal totalVolume = getTransportationCost.getTotalVolume();
		BigDecimal totalWeight = getTransportationCost.getTotalWeight();
		boolean urgent = getTransportationCost.getUrgentDelivery();

		if ( urgent )
		{
			BigDecimal randomInterestCharge = new BigDecimal( random.nextDouble() * 10 );
			transportationCost = transportationCost.add( randomInterestCharge );

			transportationCost = transportationCost.add( totalVolume.multiply( new BigDecimal( 12 ) ) );
			transportationCost = transportationCost.add( totalWeight.multiply( new BigDecimal( 7 ) ) );

			if ( warehouseCity.equalsIgnoreCase( destinationCity ) )
			{
				transportationCost = transportationCost.add( new BigDecimal( 5 ) );
			}
			else
			{
				if ( warehouseCity.equalsIgnoreCase( "Athens" ) )
				{
					transportationCost = transportationCost.add( new BigDecimal( 25 ) );
				}
				else
				{
					transportationCost = transportationCost.add( new BigDecimal( 10 ) );
				}
			}

			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis( today.getTime() );
			calendar.add( GregorianCalendar.DAY_OF_MONTH, 3 );
			response.setExpectedDateOfDelivery( new Date( calendar.getTimeInMillis() ) );
		}
		else
		{
			BigDecimal randomInterestCharge = new BigDecimal( random.nextDouble() * 5 );
			transportationCost = transportationCost.add( randomInterestCharge );

			transportationCost = transportationCost.add( totalVolume.multiply( new BigDecimal( 6 ) ) );
			transportationCost = transportationCost.add( totalWeight.multiply( new BigDecimal( 3.5 ) ) );

			if ( warehouseCity.equalsIgnoreCase( destinationCity ) )
			{
				transportationCost = transportationCost.add( new BigDecimal( 2.5 ) );
			}
			else
			{
				if ( warehouseCity.equalsIgnoreCase( "Athens" ) )
				{
					transportationCost = transportationCost.add( new BigDecimal( 12.5 ) );
				}
				else
				{
					transportationCost = transportationCost.add( new BigDecimal( 5 ) );
				}
			}

			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis( today.getTime() );
			calendar.add( GregorianCalendar.DAY_OF_MONTH, 7 );
			response.setExpectedDateOfDelivery( new Date( calendar.getTimeInMillis() ) );
		}

		response.setToken( today.getTime() + "" );
		response.setTransportationCost( transportationCost );

		return response;
	}

}
