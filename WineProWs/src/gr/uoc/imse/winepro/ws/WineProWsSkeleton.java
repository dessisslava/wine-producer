/**
 * WineProWsSkeleton.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012 (05:33:49 IST)
 */
package gr.uoc.imse.winepro.ws;

import gr.uoc.imse.winearraytype.WineType;
import gr.uoc.imse.winearraytype.WineTypeSequence;
import gr.uoc.imse.winepro.db.dao.dto.WarehouseInventoryCheckResultDto;
import gr.uoc.imse.winepro.db.dao.dto.WarehouseInventoryReserveResultDto;
import gr.uoc.imse.winepro.dto.InventoryDto;
import gr.uoc.imse.winepro.dto.WarehouseDto;
import gr.uoc.imse.winepro.dto.WineDto;
import gr.uoc.imse.winepro.service.InventoryService;
import gr.uoc.imse.winepro.service.WarehouseService;
import gr.uoc.imse.winepro.service.WineService;
import gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse;
import gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse;
import gr.uoc.imse.wineprows.ListAllWinesResponse;
import gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse;
import gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse;
import gr.uoc.imse.winequantitypairtype.WineQuantityPairTypeSequence;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.alaz.service.exception.ServiceException;

/**
 * WineProWsSkeleton java skeleton for the axisService
 */
public class WineProWsSkeleton
{
	private WineService wineService;

	private WarehouseService warehouseService;

	private InventoryService inventoryService;

	public WineProWsSkeleton ()
	{
	}

	public void setWineService ( WineService wineService )
	{
		this.wineService = wineService;
	}

	public void setWarehouseService ( WarehouseService warehouseService )
	{
		this.warehouseService = warehouseService;
	}

	public void setInventoryService ( InventoryService inventoryService )
	{
		this.inventoryService = inventoryService;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param listAllWines
	 * @return listAllWinesResponse
	 */

	public gr.uoc.imse.wineprows.ListAllWinesResponse listAllWines ( gr.uoc.imse.wineprows.ListAllWines listAllWines )
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

	public gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse listAllWinesInBetween (
			gr.uoc.imse.wineprows.ListAllWinesInBetween listAllWinesInBetween )
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

	/**
	 * Auto generated method signature
	 * 
	 * @param warehouseInventoryCheck
	 * @return warehouseInventoryCheckResponse
	 */

	public gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse warehouseInventoryCheck (
			gr.uoc.imse.wineprows.WarehouseInventoryCheck warehouseInventoryCheck )
	{
		System.out.println( "This is warehouseInventoryCheck!!!" );

		WineQuantityPairTypeSequence [] wineQuantityPairArray =
				warehouseInventoryCheck.getWineQuantityPairArray().getWineQuantityPairTypeSequence();

		List < InventoryDto > inventoryList = new ArrayList < InventoryDto >();

		WarehouseInventoryCheckResultDto checkResult = null;
		try
		{
			WarehouseDto warehouse = this.warehouseService.findWarehouseByCity( warehouseInventoryCheck.getWarehouseCity() );

			for ( int i = 0; i < wineQuantityPairArray.length; i++ )
			{
				InventoryDto inventoryDto = new InventoryDto();
				WineDto wineDto = new WineDto();

				wineDto.setId( wineQuantityPairArray [ i ].getWineId() );

				inventoryDto.setWine( wineDto );
				inventoryDto.setAmount( wineQuantityPairArray [ i ].getQuantity() );
				inventoryDto.setWarehouse( warehouse );

				inventoryList.add( inventoryDto );
			}

			checkResult = this.inventoryService.warehouseInventoryCheck( inventoryList );
		}
		catch ( ServiceException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WarehouseInventoryCheckResponse response = new WarehouseInventoryCheckResponse();

		if ( checkResult != null )
		{
			response.setMessage( checkResult.getMessage() );
			response.setSatisfiable( checkResult.getSatifiable() );
		}
		else
		{
			response.setMessage( "Database ERROR! Service is not working properly!" );
			response.setSatisfiable( false );
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param warehouseInventoryReserve
	 * @return warehouseInventoryReserveResponse
	 */

	public gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse warehouseInventoryReserve (
			gr.uoc.imse.wineprows.WarehouseInventoryReserve warehouseInventoryReserve )
	{
		System.out.println( "This is warehouseInventoryReserve!!!" );

		WineQuantityPairTypeSequence [] wineQuantityPairArray =
				warehouseInventoryReserve.getWineQuantityPairArray().getWineQuantityPairTypeSequence();

		List < InventoryDto > inventoryList = new ArrayList < InventoryDto >();

		WarehouseInventoryReserveResultDto reserveResult = null;

		try
		{
			WarehouseDto warehouse = this.warehouseService.findWarehouseByCity( warehouseInventoryReserve.getWarehouseCity() );

			for ( int i = 0; i < wineQuantityPairArray.length; i++ )
			{
				InventoryDto inventoryDto = new InventoryDto();
				WineDto wineDto = new WineDto();

				wineDto.setId( wineQuantityPairArray [ i ].getWineId() );

				inventoryDto.setWine( wineDto );
				inventoryDto.setAmount( wineQuantityPairArray [ i ].getQuantity() );
				inventoryDto.setWarehouse( warehouse );

				inventoryList.add( inventoryDto );
			}

			reserveResult = this.inventoryService.warehouseInventoryReserve( inventoryList );
		}
		catch ( ServiceException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WarehouseInventoryReserveResponse response = new WarehouseInventoryReserveResponse();

		if ( reserveResult != null )
		{
			response.setMessage( reserveResult.getMessage() );
			response.setSuccessful( reserveResult.getSuccessful() );
		}
		else
		{
			response.setMessage( "Database ERROR! Service is not working properly!" );
			response.setSuccessful( false );
		}

		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getTotalPriceOfGoods
	 * @return getTotalPriceOfGoodsResponse
	 */

	public gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse getTotalPriceOfGoods (
			gr.uoc.imse.wineprows.GetTotalPriceOfGoods getTotalPriceOfGoods )
	{
		System.out.println( "This is getTotalPriceOfGoods!!!" );

		GetTotalPriceOfGoodsResponse response = new GetTotalPriceOfGoodsResponse();

		WineQuantityPairTypeSequence [] wineQuantityPairArray =
				getTotalPriceOfGoods.getWineQuantityPairArray().getWineQuantityPairTypeSequence();
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
