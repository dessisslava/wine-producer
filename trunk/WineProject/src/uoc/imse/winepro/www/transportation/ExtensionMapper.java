
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package uoc.imse.winepro.www.transportation;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.winepro.imse.uoc/Transportation_Schema".equals(namespaceURI) &&
                  "deliverGrapesRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/Transportation_Schema".equals(namespaceURI) &&
                  "getCostResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.transportation_schema.GetCostResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/Transportation_Schema".equals(namespaceURI) &&
                  "getCostRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.transportation_schema.GetCostRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/Transportation_Schema".equals(namespaceURI) &&
                  "getDeliveryStatusRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/Transportation_Schema".equals(namespaceURI) &&
                  "getDeliveryStatusResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/Transportation_Schema".equals(namespaceURI) &&
                  "deliverGrapesResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    