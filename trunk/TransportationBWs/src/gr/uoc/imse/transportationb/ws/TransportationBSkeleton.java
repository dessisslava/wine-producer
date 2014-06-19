/**
 * TransportationBSkeleton.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012 (05:33:49
 * IST)
 */
package gr.uoc.imse.transportationb.ws;

import gr.uoc.imse.transportationb.GetTransportationCostResponse;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * TransportationBSkeleton java skeleton for the axisService
 */
public class TransportationBSkeleton
{

	/**
	 * Auto generated method signature
	 * 
	 * @param getTransportationCost
	 * @return getTransportationCostResponse
	 */

	public gr.uoc.imse.transportationb.GetTransportationCostResponse getTransportationCost (
			gr.uoc.imse.transportationb.GetTransportationCost getTransportationCost )
	{
		System.out.println( "Transportation_B getTransportationCost!!!" );

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
			BigDecimal randomInterestCharge = new BigDecimal( random.nextDouble() * 8 );
			transportationCost = transportationCost.add( randomInterestCharge );

			transportationCost = transportationCost.add( totalVolume.multiply( new BigDecimal( 10 ) ) );
			transportationCost = transportationCost.add( totalWeight.multiply( new BigDecimal( 5 ) ) );

			if ( warehouseCity.equalsIgnoreCase( destinationCity ) )
			{
				transportationCost = transportationCost.add( new BigDecimal( 3 ) );
			}
			else
			{
				if ( warehouseCity.equalsIgnoreCase( "Athens" ) )
				{
					transportationCost = transportationCost.add( new BigDecimal( 23 ) );
				}
				else
				{
					transportationCost = transportationCost.add( new BigDecimal( 8 ) );
				}
			}

			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis( today.getTime() );
			calendar.add( GregorianCalendar.DAY_OF_MONTH, 2 );
			response.setExpectedDateOfDelivery( new Date( calendar.getTimeInMillis() ) );
		}
		else
		{
			BigDecimal randomInterestCharge = new BigDecimal( random.nextDouble() * 4 );
			transportationCost = transportationCost.add( randomInterestCharge );

			transportationCost = transportationCost.add( totalVolume.multiply( new BigDecimal( 5 ) ) );
			transportationCost = transportationCost.add( totalWeight.multiply( new BigDecimal( 2.5 ) ) );

			if ( warehouseCity.equalsIgnoreCase( destinationCity ) )
			{
				transportationCost = transportationCost.add( new BigDecimal( 1.5 ) );
			}
			else
			{
				if ( !warehouseCity.equalsIgnoreCase( "Athens" ) )
				{
					transportationCost = transportationCost.add( new BigDecimal( 11.5 ) );
				}
				else
				{
					transportationCost = transportationCost.add( new BigDecimal( 4 ) );
				}
			}

			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis( today.getTime() );
			calendar.add( GregorianCalendar.DAY_OF_MONTH, 6 );
			response.setExpectedDateOfDelivery( new Date( calendar.getTimeInMillis() ) );
		}

		response.setToken( today.getTime() + "" );
		response.setTransportationCost( transportationCost );

		return response;
	}

}
