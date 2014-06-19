
/**
 * WarehouseSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package uoc.imse.winepro.www.warehouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
    /**
     *  WarehouseSkeleton java skeleton for the axisService
     */
    public class WarehouseSkeleton{
        
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
                                     * @param reserverContentRequestElement 
             * @return reserveContentResponseElement 
         * @throws SQLException 
         */
        
                 public ReserveContentResponseElement reserveContent
                  (
                  ReserverContentRequestElement reserverContentRequestElement
                  ) throws SQLException
            {
                 	createConnection();
                 	conn.setAutoCommit(false);
                 	
                	 String grapes_variety = reserverContentRequestElement.getReserverContentRequestElement().getGrapes_Variety();
                	 double quantity = reserverContentRequestElement.getReserverContentRequestElement().getQuantity();
                	 Boolean confirmation=false;
                	 
                	 
                     try
                     {
                         stmt = conn.createStatement();
                         stmt.executeUpdate("UPDATE grapes_inventory set Quantity_reserved= Quantity_reserved + " +quantity+ ", Quantity_available= Quantity_available - " +quantity+
                        		 " WHERE grapes_variety = '"   +grapes_variety+ "'" );

                         stmt.close();
                         confirmation=true;
                      
                     }
                     catch (Exception e)
                     {
                         e.printStackTrace();
                     }
                     shutdown();
                     
                     ReserveContentResponseElement response = new ReserveContentResponseElement();
                     ReserveContentResponse r = new ReserveContentResponse();
                     r.setConfirmation(confirmation);
                     
                     response.setReserveContentResponseElement(r);
                     return response;
                     

                	 
                //TODO : fill this with the necessary business logic
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
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#checkAvailability");
        }
     
    }
    