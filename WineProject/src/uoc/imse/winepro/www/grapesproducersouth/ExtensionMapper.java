
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package uoc.imse.winepro.www.grapesproducersouth;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "getOrderStatusResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "listGrapesResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.ListGrapesResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "listGrapesRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.ListGrapesRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "changeOrderRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.ChangeOrderRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "changeOrderResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.ChangeOrderResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "cancelOrderResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.CancelOrderResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "cancelOrderRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.CancelOrderRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "placeOrderResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.PlaceOrderResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "getOrderStatusRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.GetOrderStatusRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "checkAvailabilityRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.CheckAvailabilityRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "checkAvailabilityResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/GrapesProducer".equals(namespaceURI) &&
                  "placeOrderRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.grapesproducer.PlaceOrderRequest.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    