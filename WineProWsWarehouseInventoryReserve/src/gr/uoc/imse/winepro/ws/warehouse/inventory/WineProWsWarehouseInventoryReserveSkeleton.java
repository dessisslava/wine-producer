/**
 * WineProWsWarehouseInventoryReserveSkeleton.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr
 * 17, 2012 (05:33:49 IST)
 */
package gr.uoc.imse.winepro.ws.warehouse.inventory;

import gr.uoc.imse.winepro.db.dao.dto.WarehouseInventoryReserveResultDto;
import gr.uoc.imse.winepro.dto.InventoryDto;
import gr.uoc.imse.winepro.dto.WarehouseDto;
import gr.uoc.imse.winepro.dto.WineDto;
import gr.uoc.imse.winepro.service.InventoryService;
import gr.uoc.imse.winepro.service.WarehouseService;
import gr.uoc.imse.wineprowswarehouseinventoryreserve.WarehouseInventoryReserveResponse;
import gr.uoc.imse.wineprowswarehouseinventoryreserve.WineQuantityPairTypeSequence;
import java.util.ArrayList;
import java.util.List;
import com.alaz.service.exception.ServiceException;

/**
 * WineProWsWarehouseInventoryReserveSkeleton java skeleton for the axisService
 */
public class WineProWsWarehouseInventoryReserveSkeleton
{
	private WarehouseService warehouseService;

	private InventoryService inventoryService;

	public WineProWsWarehouseInventoryReserveSkeleton ()
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
	 * @param warehouseInventoryReserve
	 * @return warehouseInventoryReserveResponse
	 */

	public gr.uoc.imse.wineprowswarehouseinventoryreserve.WarehouseInventoryReserveResponse warehouseInventoryReserve (
			gr.uoc.imse.wineprowswarehouseinventoryreserve.WarehouseInventoryReserve warehouseInventoryReserve )
	{
		System.out.println( "This is warehouseInventoryReserve!!!" );

		WineQuantityPairTypeSequence [] wineQuantityPairArray =
				warehouseInventoryReserve.getWineQuantityPairs().getWineQuantityPairTypeSequence();

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
			response.setSuccess( reserveResult.getSuccessful() );
		}
		else
		{
			response.setMessage( "Database ERROR! Service is not working properly!" );
			response.setSuccess( false );
		}

		return response;

	}

}
