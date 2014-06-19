
/**
 * TransportationSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package uoc.imse.winepro.www.transportation;

import java.util.Calendar;
import java.util.Date;

import uoc.imse.winepro.www.transportation_schema.*;
    /**
     *  TransportationSkeleton java skeleton for the axisService
     */
    public class TransportationSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param getDeliveryStatusRequestElement 
             * @return getDeliveryStatusResponseElement 
         */
        
                 public uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement getDeliveryStatus
                  (
                  uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequestElement getDeliveryStatusRequestElement
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getDeliveryStatus");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getCostRequestElement 
             * @return getCostResponseElement 
         */
        
                 public uoc.imse.winepro.www.transportation_schema.GetCostResponseElement getCost
                  (
                  uoc.imse.winepro.www.transportation_schema.GetCostRequestElement getCostRequestElement
                  )
            {
                
               double quantity= getCostRequestElement.getGetCostRequestElement().getQuantity();
               String delivery_mode = getCostRequestElement.getGetCostRequestElement().getDelivery_mode();
               
               double price;
               Integer delivery_time;
               
               if (delivery_mode.equals("FAST")) { price = quantity*10 ; delivery_time=48;} 
               else {price = quantity*6.5; delivery_time=72;}
               
               GetCostResponseElement response= new GetCostResponseElement();
               GetCostResponse r = new GetCostResponse();
               
               r.setDelivery_price(price);
               r.setDelivery_time(delivery_time);
               
               response.setGetCostResponseElement(r);
               return response;
                	 
                	 //TODO : fill this with the necessary business logic
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param deliverGrapesRequestElement 
             * @return deliverGrapesResponseElement 
         */
        
                 public uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement deliverGrapes
                  (
                  uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequestElement deliverGrapesRequestElement
                  )
            {
                
                     Calendar cal = Calendar.getInstance(); // creates calendar
                     cal.setTime(new Date()); // sets calendar time/date

               String Order_Id = deliverGrapesRequestElement.getDeliverGrapesRequestElement().getOrder_Id();
               String delivery_mode = deliverGrapesRequestElement.getDeliverGrapesRequestElement().getDelivery_Mode();
               
               Boolean confirmation= true;
               Date delivery_date = new Date();
                // adds one hour

               if (delivery_mode.equals("FAST")) 
               { cal.add(Calendar.HOUR_OF_DAY, 48);
               delivery_date = cal.getTime();} 
               
               else {
            	   
            	   cal.add(Calendar.HOUR_OF_DAY, 24*365);
                   delivery_date = cal.getTime();
               }
               
               DeliverGrapesResponseElement response = new DeliverGrapesResponseElement();
               DeliverGrapesResponse r = new DeliverGrapesResponse();
               
               r.setConfirmation(confirmation);
               r.setDelivery_Date(delivery_date);
               r.setOrder_Id(Order_Id);
               
               response.setDeliverGrapesResponseElement(r);
               return response;
               
               
        }
     
    }
    