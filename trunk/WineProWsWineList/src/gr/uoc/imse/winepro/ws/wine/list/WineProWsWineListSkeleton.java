/**
 * WineProWsWineListSkeleton.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012
 * (05:33:49 IST)
 */
package gr.uoc.imse.winepro.ws.wine.list;

import gr.uoc.imse.winelistrequestor.WineType;
import gr.uoc.imse.winelistrequestor.WineTypeSequence;
import gr.uoc.imse.winepro.dto.WineDto;
import gr.uoc.imse.winepro.service.WineService;
import gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse;
import gr.uoc.imse.wineprowswinelist.ListAllWinesResponse;
import java.util.Iterator;
import java.util.List;
import com.alaz.service.exception.ServiceException;

/**
 * WineProWsWineListSkeleton java skeleton for the axisService
 */
public class WineProWsWineListSkeleton
{

	private WineService wineService;

	public WineProWsWineListSkeleton ()
	{
	}

	public void setWineService ( WineService wineService )
	{
		this.wineService = wineService;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param listAllWines
	 * @return listAllWinesResponse
	 */

	public gr.uoc.imse.wineprowswinelist.ListAllWinesResponse listAllWines ( gr.uoc.imse.wineprowswinelist.ListAllWines listAllWines )
	{
		System.out.println( "This is listAllWines!!!" );
		List < WineDto > wineList = null;
		ListAllWinesResponse response = new ListAllWinesResponse();
		try
		{
			wineList = this.wineService.findAll();
		}
		catch ( ServiceException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if ( wineList == null || wineList.size() == 0 )
		{
			return response;
		}

		WineType wineType = new WineType();

		WineTypeSequence [] wineTypeSequenceArray = new WineTypeSequence [ wineList.size() ];
		int i = 0;
		for ( Iterator it = wineList.iterator(); it.hasNext(); )
		{
			WineDto wineDto = (WineDto) it.next();
			WineTypeSequence wineTypeSequence = new WineTypeSequence();
			wineTypeSequence.setId( wineDto.getId() );
			wineTypeSequence.setImageUrl( wineDto.getImageUrl() );
			wineTypeSequence.setName( wineDto.getName() );
			wineTypeSequence.setPrice( wineDto.getPrice() );
			wineTypeSequence.setProductionDate( wineDto.getProductionDate() );
			wineTypeSequence.setType( wineDto.getType() );
			wineTypeSequence.setWeight( wineDto.getWeight() );
			wineTypeSequenceArray [ i ] = wineTypeSequence;
			i++;
		}

		wineType.setWineTypeSequence( wineTypeSequenceArray );
		response.setWineArray( wineType );

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param listAllWinesInBetween
	 * @return listAllWinesInBetweenResponse
	 */

	public gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse listAllWinesInBetween (
			gr.uoc.imse.wineprowswinelist.ListAllWinesInBetween listAllWinesInBetween )
	{
		System.out.println( "This is listAllWinesInBetween!!!" );
		List < WineDto > wineList = null;
		ListAllWinesInBetweenResponse response = new ListAllWinesInBetweenResponse();
		try
		{
			wineList = this.wineService.findAll( listAllWinesInBetween.getFirstResult(), listAllWinesInBetween.getMaxResults() );
		}
		catch ( ServiceException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if ( wineList == null || wineList.size() == 0 )
		{
			return response;
		}

		WineType wineType = new WineType();

		WineTypeSequence [] wineTypeSequenceArray = new WineTypeSequence [ wineList.size() ];
		int i = 0;
		for ( Iterator it = wineList.iterator(); it.hasNext(); )
		{
			WineDto wineDto = (WineDto) it.next();
			WineTypeSequence wineTypeSequence = new WineTypeSequence();
			wineTypeSequence.setId( wineDto.getId() );
			wineTypeSequence.setImageUrl( wineDto.getImageUrl() );
			wineTypeSequence.setName( wineDto.getName() );
			wineTypeSequence.setPrice( wineDto.getPrice() );
			wineTypeSequence.setProductionDate( wineDto.getProductionDate() );
			wineTypeSequence.setType( wineDto.getType() );
			wineTypeSequence.setWeight( wineDto.getWeight() );
			wineTypeSequenceArray [ i ] = wineTypeSequence;
			i++;
		}

		wineType.setWineTypeSequence( wineTypeSequenceArray );
		response.setWineArray( wineType );

		return response;
	}
}
