package uoc.imse.winepro.www.database;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.security.SecureRandom;


public class MySQL_connection {

    private static String dbURL = "jdbc:mysql://localhost:3306/grapesproducernorth?user=root&password=admin";
    private static Connection conn = null;
    private static Statement stmt = null;
    
    
    private static void createConnection()
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
    
    private static void shutdown()
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
    
    
    public static String[] checkAvailability(String grapes_variety, String delivery_address)
    {
                
       
    	double quantity_available=0;
    	double price=0;
    	Integer delivery_time=null;

    	createConnection();
                

        try
        {
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT grapes_variety, quantity_Available, price, delivery_time FROM grapes_inventory, delivery_estimation"
            		+ " WHERE grapes_variety = '"+grapes_variety+ "'"+" AND region='"+ delivery_address +"'" );

            while(results.next())
            {
            	quantity_available = results.getDouble(2);
                price = results.getDouble(3);
                delivery_time = results.getInt(4);

            }
            results.close();
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
        shutdown();
       
        
        String[] result={ Double.toString(quantity_available) , Double.toString(price), Integer.toString(delivery_time) } ;

        return result;
    }
    
    
    public static String placeOrder(String grapes_variety, double quantity, String delivery_address)
    
    {
    	String Order_Id=null;
    	SecureRandom random = new SecureRandom();
    	
    	try
         {
        	 Order_Id = new BigInteger(130, random).toString(32);
  
     		 stmt = conn.createStatement();
             stmt.executeUpdate("INSERT INTO grapes_orders values('"+ Order_Id +"' , CURDATE(), '" + grapes_variety + "', "+ quantity +", 'Waiting', '" 
     		                    + delivery_address +"', null, null   ) ");
             stmt.close();
         }
         catch (SQLException sqlExcept)
         {
             sqlExcept.printStackTrace();
         }
         shutdown();
         
         return Order_Id;
    }
    
    

    
    public static void main(String[] args)
  {
      String c=null;
      //c= placeOrder("RED", 100, "HER");
      System.out.println(c);
      
  }
      

	
}
