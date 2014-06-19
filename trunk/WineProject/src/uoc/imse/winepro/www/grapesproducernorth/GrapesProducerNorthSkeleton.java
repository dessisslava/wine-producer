
/**
 * GrapesProducerNorthSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package uoc.imse.winepro.www.grapesproducernorth;

import java.sql.SQLException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import uoc.imse.winepro.www.database.MySQL_connection;
import uoc.imse.winepro.www.grapesproducer.*;
    /**
     *  GrapesProducerNorthSkeleton java skeleton for the axisService
     */
    public class GrapesProducerNorthSkeleton{
        
        private static Connection conn = null;
        private static Statement stmt = null;
        private static String dbURL = "jdbc:mysql://localhost:3306/grapesproducernorth?user=root&password=admin";

        
        
        public static void createConnection()
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                //Get a connection
                conn = DriverManager.getConnection(dbURL); 
            }
            catch (Exception except)
            {
                except.printStackTrace();
            }
        }
          
          public static void shutdown()
          {
              try
              {
                  if (stmt != null)
                  {
                      stmt.close();
                  }
                  if (conn != null)
                  {
                      DriverManager.getConnection(dbURL + "?shutdown=true");
                      conn.close();
                  }           
              }
              catch (SQLException sqlExcept)
              {
                  
              }

          }
          
        /**
         * Auto generated method signature
         * 
                                     * @param cancelOrderRequestElement 
             * @return cancelOrderResponseElement 
         */
        
                 public CancelOrderResponseElement cancelOrder
                  (
                  CancelOrderRequestElement cancelOrderRequestElement
                  )
            {
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#cancelOrder");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param placeOrderRequestElement 
             * @return placeOrderResponseElement 
         * @throws ParseException 
         */
        
                 public PlaceOrderResponseElement placeOrder
                  (
                  PlaceOrderRequestElement placeOrderRequestElement
                  ) throws ParseException
            {
                	 
                	createConnection();
                 	String Order_Id=null;
                	SecureRandom random = new SecureRandom();
                	double quantity_available=0;
                    Calendar cal = Calendar.getInstance(); // creates calendar
                    cal.setTime(new Date()); // sets calendar time/date


                	 
                	 //responses
                	 PlaceOrderResponseElement response= new PlaceOrderResponseElement();
                	 PlaceOrderResponse r = new PlaceOrderResponse();

                	 //request parameters
                	 String grapes_variety = placeOrderRequestElement.getPlaceOrderRequestElement().getGrapes_Variety();
                	 double quantity = placeOrderRequestElement.getPlaceOrderRequestElement().getQuantity();
                	 String delivery_address= placeOrderRequestElement.getPlaceOrderRequestElement().getDelivery_Address();
                	 
                	 quantity_available= Double.parseDouble(MySQL_connection.checkAvailability(grapes_variety, delivery_address)[0]);
                	 Integer delivery_time = Integer.parseInt(MySQL_connection.checkAvailability(grapes_variety, delivery_address)[2]);

                	 
           if (quantity_available!=0 && quantity_available>=quantity) 
              	 {
                     try
                     {
                    	 Order_Id = new BigInteger(50, random).toString(32);
                         stmt = conn.createStatement();
                         stmt.executeUpdate("INSERT INTO grapes_orders values('"+ Order_Id +"' , CURDATE(), '" + grapes_variety + "', "+ quantity +", 'Waiting', '" 
      		                    + delivery_address +"', null, null) ");

                         stmt.close();
                     }
                     catch (Exception e)
                     {
                         e.printStackTrace();
                     }
                     shutdown();
                     
                     cal.add(Calendar.HOUR_OF_DAY, delivery_time); // adds one hour

                     r.setIsConfirmed(true);
                     r.setOrder_Id(Order_Id);
                     r.setOrder_Date(new Date());
                	 r.setGrapes_Variety(grapes_variety);
                	 r.setQuantity(quantity);
                	 r.setExpected_Delivery_Date(cal.getTime()); //cal.getTime()
              	 }
           
           else 
        	   
           { r.setIsConfirmed(false);
               r.setOrder_Id("N/A");
               r.setOrder_Date(new SimpleDateFormat("dd-MM-yyyy").parse("1-1-1970"));
          	   r.setGrapes_Variety("N/A");
          	   r.setQuantity(0);
          	   r.setExpected_Delivery_Date( new SimpleDateFormat("dd-MM-yyyy").parse("1-1-1970") ) ;
		    }

                	 
          response.setPlaceOrderResponseElement(r);
          	   return response;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getOrderStatusRequestElement 
             * @return getOrderStatusResponseElement 
         * @throws ParseException 
         */
        
                 public GetOrderStatusResponseElement getOrderStatus
                  (
                  GetOrderStatusRequestElement getOrderStatusRequestElement
                  ) throws ParseException
            {
                 	createConnection();
                    Calendar cal = Calendar.getInstance(); // creates calendar
                    cal.setTime(new Date()); // sets calendar time/date
                    
               	 //responses
                    GetOrderStatusResponseElement response= new GetOrderStatusResponseElement();
                    GetOrderStatusResponse r = new GetOrderStatusResponse();

               	 //request parameters
               	 String Order_Id = getOrderStatusRequestElement.getGetOrderStatusRequestElement().getOrder_Id();
               	 //Date Order_Date = getOrderStatusRequestElement.getGetOrderStatusRequestElement().getOrder_Date();
               	 
               	Date Order_Date= new SimpleDateFormat("dd-MM-yyyy").parse("1-1-1970");
               	String Status = "NULL";
               	String Transportation_Company = "";
               	Date Expected_Delivery_Date=new SimpleDateFormat("dd-MM-yyyy").parse("1-1-1970");



               	try
                {
                    stmt = conn.createStatement();
                    ResultSet results= stmt.executeQuery(" SELECT order_date, order_status, transportation_company, expected_delivery_date FROM grapes_orders "
                    		+ " WHERE Order_id = '" + Order_Id +"'" );

                    while(results.next())
                    {
                    	Order_Date = results.getDate(1);
                        Status = results.getString(2);
                        Transportation_Company = results.getString(3);
                        Expected_Delivery_Date = results.getDate(4);
                    }
                    results.close();
                    stmt.close();
                    
                     {;}

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                shutdown();
                
              
                r.setOrder_Id(Order_Id);
                r.setOrder_Date(Order_Date);
                r.setOrder_Status(Status);
                r.setTransportation_Company(Transportation_Company);
                r.setExpected_Delivery_Date(Expected_Delivery_Date);
                	 
                response.setGetOrderStatusResponseElement(r);;
           	   return response;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param checkAvailabilityRequestElement 
             * @return checkAvailabilityResponseElement 
         */
        
                 public CheckAvailabilityResponseElement checkAvailability
                  (
                  CheckAvailabilityRequestElement checkAvailabilityRequestElement
                  )
            {
                     CheckAvailabilityResponseElement response = new CheckAvailabilityResponseElement();
                	 
                	 CheckAvailabilityResponse r = new CheckAvailabilityResponse();
                	 
                	 String grapes_variety = checkAvailabilityRequestElement.getCheckAvailabilityRequestElement().getGrapes_Variety();
                	 //double quantity = checkAvailabilityRequestElement.getCheckAvailabilityRequestElement().getQuantity();
                	 String delivery_address= checkAvailabilityRequestElement.getCheckAvailabilityRequestElement().getDelivery_Address();
                	 
                	 double quantity_available= Double.parseDouble(MySQL_connection.checkAvailability(grapes_variety, delivery_address)[0]);
                	 double price = Double.parseDouble(MySQL_connection.checkAvailability(grapes_variety, delivery_address)[1]);
                	 Integer delivery_time = Integer.parseInt(MySQL_connection.checkAvailability(grapes_variety, delivery_address)[2]);
                	 
                	 r.setIsAvailabe((quantity_available>0) ? true : false);
                	 r.setAvailable_Quantity(quantity_available);
                	 r.setDelivery_Time(delivery_time);
                	 r.setPrice(price);
                	 response.setCheckAvailabilityResponseElement(r);
                	 return response;
        }
     
         
        /**
         * Auto generated method signature
         * 
         * @param listGrapesRequestElement 
         * @return listGrapesResponseElement 
         */
        
                 public ListGrapesResponseElement listGrapes
                  (
                  ListGrapesRequestElement listGrapesRequestElement
                  )
            {
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#listGrapes");
        }
     
    }
    