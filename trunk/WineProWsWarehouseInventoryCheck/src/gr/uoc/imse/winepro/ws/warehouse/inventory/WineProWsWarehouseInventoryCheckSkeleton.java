/**
 * WineProWsWarehouseInventoryCheckSkeleton.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr
 * 17, 2012 (05:33:49 IST)
 */
package gr.uoc.imse.winepro.ws.warehouse.inventory;

import gr.uoc.imse.winepro.db.dao.dto.WarehouseInventoryCheckResultDto;
import gr.uoc.imse.winepro.dto.InventoryDto;
import gr.uoc.imse.winepro.dto.WarehouseDto;
import gr.uoc.imse.winepro.dto.WineDto;
import gr.uoc.imse.winepro.service.InventoryService;
import gr.uoc.imse.winepro.service.WarehouseService;
import gr.uoc.imse.wineprowswarehouseinventorycheck.WarehouseInventoryCheckResponse;
import gr.uoc.imse.wineprowswarehouseinventorycheck.WineQuantityPairTypeSequence;
import java.util.ArrayList;
import java.util.List;
import com.alaz.service.exception.ServiceException;

/**
 * WineProWsWarehouseInventoryCheckSkeleton java skeleton for the axisService
 */
public class WineProWsWarehouseInventoryCheckSkeleton
{

	private WarehouseService warehouseService;

	private InventoryService inventoryService;

	public WineProWsWarehouseInventoryCheckSkeleton ()
	{
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
	 * @param warehouseInventoryCheck
	 * @return warehouseInventoryCheckResponse
	 */

	public gr.uoc.imse.wineprowswarehouseinventorycheck.WarehouseInventoryCheckResponse warehouseInventoryCheck (
			gr.uoc.imse.wineprowswarehouseinventorycheck.WarehouseInventoryCheck warehouseInventoryCheck )
	{
		System.out.println( "This is warehouseInventoryCheck!!!" );

		WineQuantityPairTypeSequence [] wineQuantityPairArray =
				warehouseInventoryCheck.getWineQuantityPairs().getWineQuantityPairTypeSequence();

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
}
