
/**
 * GrapesProducerSouthMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package uoc.imse.winepro.www.grapesproducersouth;

        /**
        *  GrapesProducerSouthMessageReceiverInOut message receiver
        */

        public class GrapesProducerSouthMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GrapesProducerSouthSkeleton skel = (GrapesProducerSouthSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("cancelOrder".equals(methodName)){
                
                uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement cancelOrderResponseElement1 = null;
	                        uoc.imse.winepro.www.grapesproducer.CancelOrderRequestElement wrappedParam =
                                                             (uoc.imse.winepro.www.grapesproducer.CancelOrderRequestElement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    uoc.imse.winepro.www.grapesproducer.CancelOrderRequestElement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancelOrderResponseElement1 =
                                                   
                                                   
                                                         skel.cancelOrder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancelOrderResponseElement1, false, new javax.xml.namespace.QName("http://www.winepro.imse.uoc/GrapesProducerSouth/",
                                                    "cancelOrder"));
                                    } else 

            if("listGrapes".equals(methodName)){
                
                uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement listGrapesResponseElement3 = null;
	                        uoc.imse.winepro.www.grapesproducer.ListGrapesRequestElement wrappedParam =
                                                             (uoc.imse.winepro.www.grapesproducer.ListGrapesRequestElement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    uoc.imse.winepro.www.grapesproducer.ListGrapesRequestElement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listGrapesResponseElement3 =
                                                   
                                                   
                                                         skel.listGrapes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listGrapesResponseElement3, false, new javax.xml.namespace.QName("http://www.winepro.imse.uoc/GrapesProducerSouth/",
                                                    "listGrapes"));
                                    } else 

            if("checkAvailability".equals(methodName)){
                
                uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement checkAvailabilityResponseElement5 = null;
	                        uoc.imse.winepro.www.grapesproducer.CheckAvailabilityRequestElement wrappedParam =
                                                             (uoc.imse.winepro.www.grapesproducer.CheckAvailabilityRequestElement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    uoc.imse.winepro.www.grapesproducer.CheckAvailabilityRequestElement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               checkAvailabilityResponseElement5 =
                                                   
                                                   
                                                         skel.checkAvailability(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkAvailabilityResponseElement5, false, new javax.xml.namespace.QName("http://www.winepro.imse.uoc/GrapesProducerSouth/",
                                                    "checkAvailability"));
                                    } else 

            if("placeOrder".equals(methodName)){
                
                uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement placeOrderResponseElement7 = null;
	                        uoc.imse.winepro.www.grapesproducer.PlaceOrderRequestElement wrappedParam =
                                                             (uoc.imse.winepro.www.grapesproducer.PlaceOrderRequestElement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    uoc.imse.winepro.www.grapesproducer.PlaceOrderRequestElement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               placeOrderResponseElement7 =
                                                   
                                                   
                                                         skel.placeOrder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), placeOrderResponseElement7, false, new javax.xml.namespace.QName("http://www.winepro.imse.uoc/GrapesProducerSouth/",
                                                    "placeOrder"));
                                    } else 

            if("getOrderStatus".equals(methodName)){
                
                uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement getOrderStatusResponseElement9 = null;
	                        uoc.imse.winepro.www.grapesproducer.GetOrderStatusRequestElement wrappedParam =
                                                             (uoc.imse.winepro.www.grapesproducer.GetOrderStatusRequestElement)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    uoc.imse.winepro.www.grapesproducer.GetOrderStatusRequestElement.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOrderStatusResponseElement9 =
                                                   
                                                   
                                                         skel.getOrderStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOrderStatusResponseElement9, false, new javax.xml.namespace.QName("http://www.winepro.imse.uoc/GrapesProducerSouth/",
                                                    "getOrderStatus"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.CancelOrderRequestElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.CancelOrderRequestElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.ListGrapesRequestElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.ListGrapesRequestElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.CheckAvailabilityRequestElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.CheckAvailabilityRequestElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.PlaceOrderRequestElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.PlaceOrderRequestElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.GetOrderStatusRequestElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.GetOrderStatusRequestElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement wrapcancelOrder(){
                                uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement wrappedElement = new uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement wraplistGrapes(){
                                uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement wrappedElement = new uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement wrapcheckAvailability(){
                                uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement wrappedElement = new uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement wrapplaceOrder(){
                                uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement wrappedElement = new uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement wrapgetOrderStatus(){
                                uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement wrappedElement = new uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement();
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
        
                if (uoc.imse.winepro.www.grapesproducer.CancelOrderRequestElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.CancelOrderRequestElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.CancelOrderResponseElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.ListGrapesRequestElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.ListGrapesRequestElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.ListGrapesResponseElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.CheckAvailabilityRequestElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.CheckAvailabilityRequestElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.CheckAvailabilityResponseElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.PlaceOrderRequestElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.PlaceOrderRequestElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.PlaceOrderResponseElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.GetOrderStatusRequestElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.GetOrderStatusRequestElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement.class.equals(type)){
                
                           return uoc.imse.winepro.www.grapesproducer.GetOrderStatusResponseElement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    