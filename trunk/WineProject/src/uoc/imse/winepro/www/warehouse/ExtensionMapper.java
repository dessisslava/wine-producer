
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package uoc.imse.winepro.www.warehouse;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.winepro.imse.uoc/Warehouse".equals(namespaceURI) &&
                  "checkAvailabilityResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.warehouse.CheckAvailabilityResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/Warehouse".equals(namespaceURI) &&
                  "checkAvailabilityRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.warehouse.CheckAvailabilityRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/Warehouse".equals(namespaceURI) &&
                  "reserveContentRequest".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.warehouse.ReserveContentRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.winepro.imse.uoc/Warehouse".equals(namespaceURI) &&
                  "reserveContentResponse".equals(typeName)){
                   
                            return  uoc.imse.winepro.www.warehouse.ReserveContentResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    