/**
 * WineProWsMessageReceiverInOut.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012
 * (05:33:49 IST)
 */
package gr.uoc.imse.winepro.ws;

/**
 * WineProWsMessageReceiverInOut message receiver
 */

public class WineProWsMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver
{

	public void invokeBusinessLogic ( org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext ) throws org.apache.axis2.AxisFault
	{

		try
		{

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject( msgContext );

			WineProWsSkeleton skel = (WineProWsSkeleton) obj;
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

					gr.uoc.imse.wineprows.ListAllWinesResponse listAllWinesResponse1 = null;
					gr.uoc.imse.wineprows.ListAllWines wrappedParam =
							(gr.uoc.imse.wineprows.ListAllWines) fromOM( msgContext.getEnvelope().getBody().getFirstElement(),
								gr.uoc.imse.wineprows.ListAllWines.class, getEnvelopeNamespaces( msgContext.getEnvelope() ) );

					listAllWinesResponse1 =

					skel.listAllWines( wrappedParam );

					envelope =
							toEnvelope( getSOAPFactory( msgContext ), listAllWinesResponse1, false, new javax.xml.namespace.QName(
								"http://imse.uoc.gr/WineProWs/", "listAllWines" ) );
				}
				else

				if ( "listAllWinesInBetween".equals( methodName ) )
				{

					gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse listAllWinesInBetweenResponse3 = null;
					gr.uoc.imse.wineprows.ListAllWinesInBetween wrappedParam =
							(gr.uoc.imse.wineprows.ListAllWinesInBetween) fromOM( msgContext.getEnvelope().getBody().getFirstElement(),
								gr.uoc.imse.wineprows.ListAllWinesInBetween.class, getEnvelopeNamespaces( msgContext.getEnvelope() ) );

					listAllWinesInBetweenResponse3 =

					skel.listAllWinesInBetween( wrappedParam );

					envelope =
							toEnvelope( getSOAPFactory( msgContext ), listAllWinesInBetweenResponse3, false, new javax.xml.namespace.QName(
								"http://imse.uoc.gr/WineProWs/", "listAllWinesInBetween" ) );
				}
				else

				if ( "warehouseInventoryCheck".equals( methodName ) )
				{

					gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse warehouseInventoryCheckResponse5 = null;
					gr.uoc.imse.wineprows.WarehouseInventoryCheck wrappedParam =
							(gr.uoc.imse.wineprows.WarehouseInventoryCheck) fromOM( msgContext.getEnvelope().getBody().getFirstElement(),
								gr.uoc.imse.wineprows.WarehouseInventoryCheck.class, getEnvelopeNamespaces( msgContext.getEnvelope() ) );

					warehouseInventoryCheckResponse5 =

					skel.warehouseInventoryCheck( wrappedParam );

					envelope =
							toEnvelope( getSOAPFactory( msgContext ), warehouseInventoryCheckResponse5, false,
								new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/", "warehouseInventoryCheck" ) );
				}
				else

				if ( "warehouseInventoryReserve".equals( methodName ) )
				{

					gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse warehouseInventoryReserveResponse7 = null;
					gr.uoc.imse.wineprows.WarehouseInventoryReserve wrappedParam =
							(gr.uoc.imse.wineprows.WarehouseInventoryReserve) fromOM( msgContext.getEnvelope().getBody().getFirstElement(),
								gr.uoc.imse.wineprows.WarehouseInventoryReserve.class, getEnvelopeNamespaces( msgContext.getEnvelope() ) );

					warehouseInventoryReserveResponse7 =

					skel.warehouseInventoryReserve( wrappedParam );

					envelope =
							toEnvelope( getSOAPFactory( msgContext ), warehouseInventoryReserveResponse7, false,
								new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/", "warehouseInventoryReserve" ) );
				}
				else

				if ( "getTotalPriceOfGoods".equals( methodName ) )
				{

					gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse getTotalPriceOfGoodsResponse9 = null;
					gr.uoc.imse.wineprows.GetTotalPriceOfGoods wrappedParam =
							(gr.uoc.imse.wineprows.GetTotalPriceOfGoods) fromOM( msgContext.getEnvelope().getBody().getFirstElement(),
								gr.uoc.imse.wineprows.GetTotalPriceOfGoods.class, getEnvelopeNamespaces( msgContext.getEnvelope() ) );

					getTotalPriceOfGoodsResponse9 =

					skel.getTotalPriceOfGoods( wrappedParam );

					envelope =
							toEnvelope( getSOAPFactory( msgContext ), getTotalPriceOfGoodsResponse9, false, new javax.xml.namespace.QName(
								"http://imse.uoc.gr/WineProWs/", "getTotalPriceOfGoods" ) );

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
	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.ListAllWines param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.ListAllWines.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.ListAllWinesResponse param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.ListAllWinesResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.ListAllWinesInBetween param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.ListAllWinesInBetween.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.WarehouseInventoryCheck param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.WarehouseInventoryCheck.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.WarehouseInventoryReserve param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.WarehouseInventoryReserve.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.GetTotalPriceOfGoods param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.GetTotalPriceOfGoods.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse param, boolean optimizeContent )
			throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory,
			gr.uoc.imse.wineprows.ListAllWinesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName )
			throws org.apache.axis2.AxisFault
	{
		try
		{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild( param.getOMElement( gr.uoc.imse.wineprows.ListAllWinesResponse.MY_QNAME, factory ) );

			return emptyEnvelope;
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
	}

	private gr.uoc.imse.wineprows.ListAllWinesResponse wraplistAllWines ()
	{
		gr.uoc.imse.wineprows.ListAllWinesResponse wrappedElement = new gr.uoc.imse.wineprows.ListAllWinesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory,
			gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName )
			throws org.apache.axis2.AxisFault
	{
		try
		{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild( param.getOMElement( gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse.MY_QNAME, factory ) );

			return emptyEnvelope;
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
	}

	private gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse wraplistAllWinesInBetween ()
	{
		gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse wrappedElement = new gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory,
			gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName )
			throws org.apache.axis2.AxisFault
	{
		try
		{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody()
				.addChild( param.getOMElement( gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse.MY_QNAME, factory ) );

			return emptyEnvelope;
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
	}

	private gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse wrapwarehouseInventoryCheck ()
	{
		gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse wrappedElement = new gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory,
			gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName )
			throws org.apache.axis2.AxisFault
	{
		try
		{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
				param.getOMElement( gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse.MY_QNAME, factory ) );

			return emptyEnvelope;
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
	}

	private gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse wrapwarehouseInventoryReserve ()
	{
		gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse wrappedElement =
				new gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory,
			gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName )
			throws org.apache.axis2.AxisFault
	{
		try
		{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild( param.getOMElement( gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse.MY_QNAME, factory ) );

			return emptyEnvelope;
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
	}

	private gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse wrapgetTotalPriceOfGoods ()
	{
		gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse wrappedElement = new gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse();
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

			if ( gr.uoc.imse.wineprows.ListAllWines.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.ListAllWines.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.ListAllWinesResponse.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.ListAllWinesResponse.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.ListAllWinesInBetween.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.ListAllWinesInBetween.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.ListAllWinesInBetweenResponse.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.WarehouseInventoryCheck.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.WarehouseInventoryCheck.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.WarehouseInventoryCheckResponse.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.WarehouseInventoryReserve.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.WarehouseInventoryReserve.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.WarehouseInventoryReserveResponse.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.GetTotalPriceOfGoods.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.GetTotalPriceOfGoods.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse.class.equals( type ) )
			{

				return gr.uoc.imse.wineprows.GetTotalPriceOfGoodsResponse.Factory.parse( param.getXMLStreamReaderWithoutCaching() );

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
