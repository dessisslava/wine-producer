
/**
 * TransportationMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package uoc.imse.winepro.www.transportation;

        /**
        *  TransportationMessageReceiverInOut message receiver
        */

        public class TransportationMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TransportationSkeleton skel = (TransportationSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getDeliveryStatus".equals(methodName)){
                
                uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement getDeliveryStatusResponseElement1 = null;
	                        uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequestElement wrappedParam =
                                                             (uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequestElement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequestElement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDeliveryStatusResponseElement1 =
                                                   
                                                   
                                                         skel.getDeliveryStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDeliveryStatusResponseElement1, false, new javax.xml.namespace.QName("http://www.winepro.imse.uoc/Transportation/",
                                                    "getDeliveryStatus"));
                                    } else 

            if("getCost".equals(methodName)){
                
                uoc.imse.winepro.www.transportation_schema.GetCostResponseElement getCostResponseElement3 = null;
	                        uoc.imse.winepro.www.transportation_schema.GetCostRequestElement wrappedParam =
                                                             (uoc.imse.winepro.www.transportation_schema.GetCostRequestElement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    uoc.imse.winepro.www.transportation_schema.GetCostRequestElement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCostResponseElement3 =
                                                   
                                                   
                                                         skel.getCost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCostResponseElement3, false, new javax.xml.namespace.QName("http://www.winepro.imse.uoc/Transportation/",
                                                    "getCost"));
                                    } else 

            if("deliverGrapes".equals(methodName)){
                
                uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement deliverGrapesResponseElement5 = null;
	                        uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequestElement wrappedParam =
                                                             (uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequestElement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequestElement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deliverGrapesResponseElement5 =
                                                   
                                                   
                                                         skel.deliverGrapes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deliverGrapesResponseElement5, false, new javax.xml.namespace.QName("http://www.winepro.imse.uoc/Transportation/",
                                                    "deliverGrapes"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequestElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequestElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.transportation_schema.GetCostRequestElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.transportation_schema.GetCostRequestElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.transportation_schema.GetCostResponseElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.transportation_schema.GetCostResponseElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequestElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequestElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement wrapgetDeliveryStatus(){
                                uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement wrappedElement = new uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, uoc.imse.winepro.www.transportation_schema.GetCostResponseElement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(uoc.imse.winepro.www.transportation_schema.GetCostResponseElement.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private uoc.imse.winepro.www.transportation_schema.GetCostResponseElement wrapgetCost(){
                                uoc.imse.winepro.www.transportation_schema.GetCostResponseElement wrappedElement = new uoc.imse.winepro.www.transportation_schema.GetCostResponseElement();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement wrapdeliverGrapes(){
                                uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement wrappedElement = new uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequestElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusRequestElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.transportation_schema.GetDeliveryStatusResponseElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.transportation_schema.GetCostRequestElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.transportation_schema.GetCostRequestElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.transportation_schema.GetCostResponseElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.transportation_schema.GetCostResponseElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequestElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.transportation_schema.DeliverGrapesRequestElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.transportation_schema.DeliverGrapesResponseElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    