/**
 * WineProWsWarehouseInventoryReserveSkeleton.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr
 * 17, 2012 (05:33:49 IST)
 */
package gr.uoc.imse.winepro.ws.warehouse.inventory;

import gr.uoc.imse.winepro.service.InventoryService;
import gr.uoc.imse.winepro.service.WarehouseService;

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
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException( "Please implement " + this.getClass().getName() + "#warehouseInventoryReserve" );
	}

}
