/**
 * WineProWsCallbackHandler.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012 (05:33:49
 * IST)
 */

package gr.uoc.imse.winepro.ws.client;

/**
 * WineProWsCallbackHandler Callback class, Users can extend this class and implement their own receiveResult and receiveError methods.
 */
public abstract class WineProWsCallbackHandler
{

	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the NonBlocking Web service call is finished and appropriate method of
	 * this CallBack is called.
	 * 
	 * @param clientData
	 *        Object mechanism by which the user can pass in user data that will be avilable at the time this callback is called.
	 */
	public WineProWsCallbackHandler ( Object clientData )
	{
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public WineProWsCallbackHandler ()
	{
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData ()
	{
		return clientData;
	}

	/**
	 * auto generated Axis2 call back method for listAllWines method override this method for handling normal response from listAllWines
	 * operation
	 */
	public void receiveResultlistAllWines ( gr.uoc.imse.winepro.ws.client.WineProWsStub.ListAllWinesResponse result )
	{
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error response from listAllWines operation
	 */
	public void receiveErrorlistAllWines ( java.lang.Exception e )
	{
	}

	/**
	 * auto generated Axis2 call back method for listAllWinesInBetween method override this method for handling normal response from
	 * listAllWinesInBetween operation
	 */
	public void receiveResultlistAllWinesInBetween ( gr.uoc.imse.winepro.ws.client.WineProWsStub.ListAllWinesInBetweenResponse result )
	{
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error response from listAllWinesInBetween operation
	 */
	public void receiveErrorlistAllWinesInBetween ( java.lang.Exception e )
	{
	}

	/**
	 * auto generated Axis2 call back method for warehouseInventoryCheck method override this method for handling normal response from
	 * warehouseInventoryCheck operation
	 */
	public void receiveResultwarehouseInventoryCheck ( gr.uoc.imse.winepro.ws.client.WineProWsStub.WarehouseInventoryCheckResponse result )
	{
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error response from warehouseInventoryCheck operation
	 */
	public void receiveErrorwarehouseInventoryCheck ( java.lang.Exception e )
	{
	}

	/**
	 * auto generated Axis2 call back method for warehouseInventoryReserve method override this method for handling normal response from
	 * warehouseInventoryReserve operation
	 */
	public void receiveResultwarehouseInventoryReserve (
			gr.uoc.imse.winepro.ws.client.WineProWsStub.WarehouseInventoryReserveResponse result )
	{
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error response from warehouseInventoryReserve operation
	 */
	public void receiveErrorwarehouseInventoryReserve ( java.lang.Exception e )
	{
	}

	/**
	 * auto generated Axis2 call back method for getTotalPriceOfGoods method override this method for handling normal response from
	 * getTotalPriceOfGoods operation
	 */
	public void receiveResultgetTotalPriceOfGoods ( gr.uoc.imse.winepro.ws.client.WineProWsStub.GetTotalPriceOfGoodsResponse result )
	{
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling error response from getTotalPriceOfGoods operation
	 */
	public void receiveErrorgetTotalPriceOfGoods ( java.lang.Exception e )
	{
	}

}
