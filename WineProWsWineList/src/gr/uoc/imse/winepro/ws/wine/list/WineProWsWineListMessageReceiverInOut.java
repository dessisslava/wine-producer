/**
 * WineProWsWineListMessageReceiverInOut.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17,
 * 2012 (05:33:49 IST)
 */
package gr.uoc.imse.winepro.ws.wine.list;

/**
 * WineProWsWineListMessageReceiverInOut message receiver
 */

public class WineProWsWineListMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver
{

	public void invokeBusinessLogic ( org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext ) throws org.apache.axis2.AxisFault
	{

		try
		{

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject( msgContext );

			WineProWsWineListSkeleton skel = (WineProWsWineListSkeleton) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
			if ( op == null )
			{
				throw new org.apache.axis2.AxisFault(
					"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider" );
			}

			java.lang.String methodName;
			if ( ( op.getName() != null )
				&& ( ( methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier( op.getName().getLocalPart() ) ) != null ) )
			{

				if ( "listAllWines".equals( methodName ) )
				{

					gr.uoc.imse.wineprowswinelist.ListAllWinesResponse listAllWinesResponse1 = null;
					gr.uoc.imse.wineprowswinelist.ListAllWines wrappedParam =
							(gr.uoc.imse.wineprowswinelist.ListAllWines) fromOM( msgContext.getEnvelope().getBody().getFirstElement(),
								gr.uoc.imse.wineprowswinelist.ListAllWines.class, getEnvelopeNamespaces( msgContext.getEnvelope() ) );

					listAllWinesResponse1 =

					skel.listAllWines( wrappedParam );

					envelope =
							toEnvelope( getSOAPFactory( msgContext ), listAllWinesResponse1, false, new javax.xml.namespace.QName(
								"http://imse.uoc.gr/WineProWsWineList/", "listAllWines" ) );
				}
				else

				if ( "listAllWinesInBetween".equals( methodName ) )
				{

					gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse listAllWinesInBetweenResponse3 = null;
					gr.uoc.imse.wineprowswinelist.ListAllWinesInBetween wrappedParam =
							(gr.uoc.imse.wineprowswinelist.ListAllWinesInBetween) fromOM( msgContext.getEnvelope().getBody()
								.getFirstElement(), gr.uoc.imse.wineprowswinelist.ListAllWinesInBetween.class,
								getEnvelopeNamespaces( msgContext.getEnvelope() ) );

					listAllWinesInBetweenResponse3 =

					skel.listAllWinesInBetween( wrappedParam );

					envelope =
							toEnvelope( getSOAPFactory( msgContext ), listAllWinesInBetweenResponse3, false, new javax.xml.namespace.QName(
								"http://imse.uoc.gr/WineProWsWineList/", "listAllWinesInBetween" ) );

				}
				else
				{
					throw new java.lang.RuntimeException( "method not found" );
				}

				newMsgContext.setEnvelope( envelope );
			}
		}
		catch ( java.lang.Exception e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
	}

	//
	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprowswinelist.ListAllWines param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprowswinelist.ListAllWines.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprowswinelist.ListAllWinesResponse param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprowswinelist.ListAllWinesResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprowswinelist.ListAllWinesInBetween param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprowswinelist.ListAllWinesInBetween.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory,
			gr.uoc.imse.wineprowswinelist.ListAllWinesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName )
			throws org.apache.axis2.AxisFault
	{
		try
		{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild( param.getOMElement( gr.uoc.imse.wineprowswinelist.ListAllWinesResponse.MY_QNAME, factory ) );

			return emptyEnvelope;
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
	}

	private gr.uoc.imse.wineprowswinelist.ListAllWinesResponse wraplistAllWines ()
	{
		gr.uoc.imse.wineprowswinelist.ListAllWinesResponse wrappedElement = new gr.uoc.imse.wineprowswinelist.ListAllWinesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory,
			gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName ) throws org.apache.axis2.AxisFault
	{
		try
		{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
				param.getOMElement( gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse.MY_QNAME, factory ) );

			return emptyEnvelope;
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
	}

	private gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse wraplistAllWinesInBetween ()
	{
		gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse wrappedElement =
				new gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse();
		return wrappedElement;
	}

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory )
	{
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM ( org.apache.axiom.om.OMElement param, java.lang.Class type, java.util.Map extraNamespaces )
			throws org.apache.axis2.AxisFault
	{

		try
		{

			if ( gr.uoc.imse.wineprowswinelist.ListAllWines.class.equals( type ) )
			{

				return gr.uoc.imse.wineprowswinelist.ListAllWines.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprowswinelist.ListAllWinesResponse.class.equals( type ) )
			{

				return gr.uoc.imse.wineprowswinelist.ListAllWinesResponse.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprowswinelist.ListAllWinesInBetween.class.equals( type ) )
			{

				return gr.uoc.imse.wineprowswinelist.ListAllWinesInBetween.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse.class.equals( type ) )
			{

				return gr.uoc.imse.wineprowswinelist.ListAllWinesInBetweenResponse.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

		}
		catch ( java.lang.Exception e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
		return null;
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces ( org.apache.axiom.soap.SOAPEnvelope env )
	{
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while ( namespaceIterator.hasNext() )
		{
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put( ns.getPrefix(), ns.getNamespaceURI() );
		}
		return returnMap;
	}

	private org.apache.axis2.AxisFault createAxisFault ( java.lang.Exception e )
	{
		org.apache.axis2.AxisFault f;
		Throwable cause = e.getCause();
		if ( cause != null )
		{
			f = new org.apache.axis2.AxisFault( e.getMessage(), cause );
		}
		else
		{
			f = new org.apache.axis2.AxisFault( e.getMessage() );
		}

		return f;
	}

}// end of class
