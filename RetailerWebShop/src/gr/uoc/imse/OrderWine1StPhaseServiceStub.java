/**
 * OrderWine1StPhaseServiceStub.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012
 * (05:33:49 IST)
 */
package gr.uoc.imse;

/*
 * OrderWine1StPhaseServiceStub java implementation
 */

public class OrderWine1StPhaseServiceStub extends org.apache.axis2.client.Stub
{
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix ()
	{
		// reset the counter if it is greater than 99999
		if ( counter > 99999 )
		{
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString( java.lang.System.currentTimeMillis() ) + "_" + counter;
	}

	private void populateAxisService () throws org.apache.axis2.AxisFault
	{

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService( "OrderWine1StPhaseService" + getUniqueSuffix() );
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation [ 1 ];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName( new javax.xml.namespace.QName( "http://imse.uoc.gr", "process" ) );
		_service.addOperation( __operation );

		_operations [ 0 ] = __operation;

	}

	// populates the faults
	private void populateFaults ()
	{

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public OrderWine1StPhaseServiceStub ( org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint ) throws org.apache.axis2.AxisFault
	{
		this( configurationContext, targetEndpoint, false );
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public OrderWine1StPhaseServiceStub ( org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener ) throws org.apache.axis2.AxisFault
	{
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient( configurationContext, _service );

		_serviceClient.getOptions().setTo( new org.apache.axis2.addressing.EndpointReference( targetEndpoint ) );
		_serviceClient.getOptions().setUseSeparateListener( useSeparateListener );

	}

	/**
	 * Default Constructor
	 */
	public OrderWine1StPhaseServiceStub ( org.apache.axis2.context.ConfigurationContext configurationContext )
			throws org.apache.axis2.AxisFault
	{

		this( configurationContext, "http://localhost:8080/ode/processes/OrderWine1stPhase" );

	}

	/**
	 * Default Constructor
	 */
	public OrderWine1StPhaseServiceStub () throws org.apache.axis2.AxisFault
	{

		this( "http://localhost:8080/ode/processes/OrderWine1stPhase" );

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public OrderWine1StPhaseServiceStub ( java.lang.String targetEndpoint ) throws org.apache.axis2.AxisFault
	{
		this( null, targetEndpoint );
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see gr.uoc.imse.OrderWine1StPhaseService#process
	 * @param orderWine1StPhaseRequest
	 */

	public gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseResponse process (

	gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseRequest orderWine1StPhaseRequest )

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try
		{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient( _operations [ 0 ].getName() );
			_operationClient.getOptions().setAction( "http://imse.uoc.gr/process" );
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault( true );

			addPropertyToOperationClient( _operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&" );

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env =
					toEnvelope( getFactory( _operationClient.getOptions().getSoapVersionURI() ), orderWine1StPhaseRequest,
						optimizeContent( new javax.xml.namespace.QName( "http://imse.uoc.gr", "process" ) ), new javax.xml.namespace.QName(
							"http://imse.uoc.gr", "process" ) );

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope( env );
			// set the message context with that soap envelope
			_messageContext.setEnvelope( env );

			// add the message contxt to the operation client
			_operationClient.addMessageContext( _messageContext );

			// execute the operation client
			_operationClient.execute( true );

			org.apache.axis2.context.MessageContext _returnMessageContext =
					_operationClient.getMessageContext( org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE );
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object =
					fromOM( _returnEnv.getBody().getFirstElement(),
						gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseResponse.class, getEnvelopeNamespaces( _returnEnv ) );

			return (gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseResponse) object;

		}
		catch ( org.apache.axis2.AxisFault f )
		{

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if ( faultElt != null )
			{
				if ( faultExceptionNameMap.containsKey( new org.apache.axis2.client.FaultMapKey( faultElt.getQName(), "process" ) ) )
				{
					// make the fault by reflection
					try
					{
						java.lang.String exceptionClassName =
								(java.lang.String) faultExceptionClassNameMap.get( new org.apache.axis2.client.FaultMapKey( faultElt
									.getQName(), "process" ) );
						java.lang.Class exceptionClass = java.lang.Class.forName( exceptionClassName );
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor( String.class );
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance( f.getMessage() );
						// message class
						java.lang.String messageClassName =
								(java.lang.String) faultMessageMap.get( new org.apache.axis2.client.FaultMapKey( faultElt.getQName(),
									"process" ) );
						java.lang.Class messageClass = java.lang.Class.forName( messageClassName );
						java.lang.Object messageObject = fromOM( faultElt, messageClass, null );
						java.lang.reflect.Method m = exceptionClass.getMethod( "setFaultMessage", new java.lang.Class [] { messageClass } );
						m.invoke( ex, new java.lang.Object [] { messageObject } );

						throw new java.rmi.RemoteException( ex.getMessage(), ex );
					}
					catch ( java.lang.ClassCastException e )
					{
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
					catch ( java.lang.ClassNotFoundException e )
					{
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
					catch ( java.lang.NoSuchMethodException e )
					{
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
					catch ( java.lang.reflect.InvocationTargetException e )
					{
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
					catch ( java.lang.IllegalAccessException e )
					{
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
					catch ( java.lang.InstantiationException e )
					{
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}
				else
				{
					throw f;
				}
			}
			else
			{
				throw f;
			}
		}
		finally
		{
			if ( _messageContext.getTransportOut() != null )
			{
				_messageContext.getTransportOut().getSender().cleanup( _messageContext );
			}
		}
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

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent ( javax.xml.namespace.QName opName )
	{

		if ( opNameArray == null )
		{
			return false;
		}
		for ( int i = 0; i < opNameArray.length; i++ )
		{
			if ( opName.equals( opNameArray [ i ] ) )
			{
				return true;
			}
		}
		return false;
	}

	// http://localhost:8080/ode/processes/OrderWine1stPhase
	public static class GetTransportationCostResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/TransportationB/",
			"getTransportationCostResponse", "ns3" );

		/**
		 * field for TransportationCost
		 */

		protected java.math.BigDecimal localTransportationCost;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTransportationCost ()
		{
			return localTransportationCost;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TransportationCost
		 */
		public void setTransportationCost ( java.math.BigDecimal param )
		{

			this.localTransportationCost = param;

		}

		/**
		 * field for ExpectedDateOfDelivery
		 */

		protected java.util.Date localExpectedDateOfDelivery;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.util.Date
		 */
		public java.util.Date getExpectedDateOfDelivery ()
		{
			return localExpectedDateOfDelivery;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        ExpectedDateOfDelivery
		 */
		public void setExpectedDateOfDelivery ( java.util.Date param )
		{

			this.localExpectedDateOfDelivery = param;

		}

		/**
		 * field for Token
		 */

		protected java.lang.String localToken;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getToken ()
		{
			return localToken;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Token
		 */
		public void setToken ( java.lang.String param )
		{

			this.localToken = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/TransportationB/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":getTransportationCostResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTransportationCostResponse", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "transportationCost", xmlWriter );

			if ( localTransportationCost == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "transportationCost cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTransportationCost ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "expectedDateOfDelivery", xmlWriter );

			if ( localExpectedDateOfDelivery == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "expectedDateOfDelivery cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localExpectedDateOfDelivery ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "token", xmlWriter );

			if ( localToken == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "token cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localToken );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/TransportationB/" ) )
			{
				return "ns3";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "transportationCost" ) );

			if ( localTransportationCost != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTransportationCost ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "transportationCost cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "expectedDateOfDelivery" ) );

			if ( localExpectedDateOfDelivery != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localExpectedDateOfDelivery ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "expectedDateOfDelivery cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "token" ) );

			if ( localToken != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localToken ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "token cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetTransportationCostResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				GetTransportationCostResponse object = new GetTransportationCostResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"getTransportationCostResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (GetTransportationCostResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "transportationCost" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "transportationCost"
								+ "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTransportationCost( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "expectedDateOfDelivery" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "expectedDateOfDelivery"
								+ "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setExpectedDateOfDelivery( org.apache.axis2.databinding.utils.ConverterUtil.convertToDate( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "token" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "token" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setToken( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetTotalWeightVolumeResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"getTotalWeightVolumeResponse", "ns6" );

		/**
		 * field for TotalVolume
		 */

		protected java.math.BigDecimal localTotalVolume;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTotalVolume ()
		{
			return localTotalVolume;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TotalVolume
		 */
		public void setTotalVolume ( java.math.BigDecimal param )
		{

			this.localTotalVolume = param;

		}

		/**
		 * field for TotalWeight
		 */

		protected java.math.BigDecimal localTotalWeight;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTotalWeight ()
		{
			return localTotalWeight;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TotalWeight
		 */
		public void setTotalWeight ( java.math.BigDecimal param )
		{

			this.localTotalWeight = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":getTotalWeightVolumeResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTotalWeightVolumeResponse", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "totalVolume", xmlWriter );

			if ( localTotalVolume == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "totalVolume cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalVolume ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "totalWeight", xmlWriter );

			if ( localTotalWeight == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "totalWeight cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalWeight ) );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "totalVolume" ) );

			if ( localTotalVolume != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalVolume ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "totalVolume cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "totalWeight" ) );

			if ( localTotalWeight != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalWeight ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "totalWeight cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetTotalWeightVolumeResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				GetTotalWeightVolumeResponse object = new GetTotalWeightVolumeResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"getTotalWeightVolumeResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (GetTotalWeightVolumeResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "totalVolume" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "totalVolume" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTotalVolume( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "totalWeight" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "totalWeight" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTotalWeight( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WineQuantityPairTypeSequence implements org.apache.axis2.databinding.ADBBean
	{
		/*
		 * This type was generated from the piece of schema that had name = WineQuantityPairTypeSequence Namespace URI =
		 * http://imse.uoc.gr/WineQuantityPairType Namespace Prefix = ns1
		 */

		/**
		 * field for WineId
		 */

		protected int localWineId;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getWineId ()
		{
			return localWineId;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineId
		 */
		public void setWineId ( int param )
		{

			this.localWineId = param;

		}

		/**
		 * field for Quantity
		 */

		protected int localQuantity;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getQuantity ()
		{
			return localQuantity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Quantity
		 */
		public void setQuantity ( int param )
		{

			this.localQuantity = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, parentQName );
			return factory.createOMElement( dataSource, parentQName );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineQuantityPairType" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":WineQuantityPairTypeSequence", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WineQuantityPairTypeSequence", xmlWriter );
				}

			}

			namespace = "http://imse.uoc.gr/WineQuantityPairType";
			writeStartElement( null, namespace, "wineId", xmlWriter );

			if ( localWineId == java.lang.Integer.MIN_VALUE )
			{

				throw new org.apache.axis2.databinding.ADBException( "wineId cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWineId ) );
			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr/WineQuantityPairType";
			writeStartElement( null, namespace, "quantity", xmlWriter );

			if ( localQuantity == java.lang.Integer.MIN_VALUE )
			{

				throw new org.apache.axis2.databinding.ADBException( "quantity cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localQuantity ) );
			}

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineQuantityPairType" ) )
			{
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineQuantityPairType", "wineId" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWineId ) );

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineQuantityPairType", "quantity" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localQuantity ) );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WineQuantityPairTypeSequence parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WineQuantityPairTypeSequence object = new WineQuantityPairTypeSequence();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineQuantityPairType", "wineId" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "wineId" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setWineId( org.apache.axis2.databinding.utils.ConverterUtil.convertToInt( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineQuantityPairType", "quantity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "quantity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setQuantity( org.apache.axis2.databinding.utils.ConverterUtil.convertToInt( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WarehouseInventoryCheck implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"warehouseInventoryCheck", "ns6" );

		/**
		 * field for WineQuantityPairArray
		 */

		protected WineQuantityPairType localWineQuantityPairArray;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineQuantityPairType
		 */
		public WineQuantityPairType getWineQuantityPairArray ()
		{
			return localWineQuantityPairArray;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineQuantityPairArray
		 */
		public void setWineQuantityPairArray ( WineQuantityPairType param )
		{

			this.localWineQuantityPairArray = param;

		}

		/**
		 * field for WarehouseCity
		 */

		protected java.lang.String localWarehouseCity;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getWarehouseCity ()
		{
			return localWarehouseCity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WarehouseCity
		 */
		public void setWarehouseCity ( java.lang.String param )
		{

			this.localWarehouseCity = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":warehouseInventoryCheck", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "warehouseInventoryCheck", xmlWriter );
				}

			}

			if ( localWineQuantityPairArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairArray cannot be null!!" );
			}
			localWineQuantityPairArray.serialize( new javax.xml.namespace.QName( "", "wineQuantityPairArray" ), xmlWriter );

			namespace = "";
			writeStartElement( null, namespace, "warehouseCity", xmlWriter );

			if ( localWarehouseCity == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localWarehouseCity );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "wineQuantityPairArray" ) );

			if ( localWineQuantityPairArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairArray cannot be null!!" );
			}
			elementList.add( localWineQuantityPairArray );

			elementList.add( new javax.xml.namespace.QName( "", "warehouseCity" ) );

			if ( localWarehouseCity != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWarehouseCity ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WarehouseInventoryCheck parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WarehouseInventoryCheck object = new WarehouseInventoryCheck();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"warehouseInventoryCheck".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (WarehouseInventoryCheck) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "wineQuantityPairArray" ).equals( reader.getName() ) )
					{

						object.setWineQuantityPairArray( WineQuantityPairType.Factory.parse( reader ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "warehouseCity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "warehouseCity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setWarehouseCity( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetTotalWeightVolume implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"getTotalWeightVolume", "ns6" );

		/**
		 * field for WineQuantityPairArray
		 */

		protected WineQuantityPairType localWineQuantityPairArray;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineQuantityPairType
		 */
		public WineQuantityPairType getWineQuantityPairArray ()
		{
			return localWineQuantityPairArray;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineQuantityPairArray
		 */
		public void setWineQuantityPairArray ( WineQuantityPairType param )
		{

			this.localWineQuantityPairArray = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":getTotalWeightVolume",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTotalWeightVolume", xmlWriter );
				}

			}

			if ( localWineQuantityPairArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairArray cannot be null!!" );
			}
			localWineQuantityPairArray.serialize( new javax.xml.namespace.QName( "", "wineQuantityPairArray" ), xmlWriter );

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "wineQuantityPairArray" ) );

			if ( localWineQuantityPairArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairArray cannot be null!!" );
			}
			elementList.add( localWineQuantityPairArray );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetTotalWeightVolume parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				GetTotalWeightVolume object = new GetTotalWeightVolume();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"getTotalWeightVolume".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (GetTotalWeightVolume) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "wineQuantityPairArray" ).equals( reader.getName() ) )
					{

						object.setWineQuantityPairArray( WineQuantityPairType.Factory.parse( reader ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class CheckStatusOfDeliveryResponseE implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/TransportationA/",
			"checkStatusOfDeliveryResponse", "ns4" );

		/**
		 * field for Status
		 */

		protected java.lang.String localStatus;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getStatus ()
		{
			return localStatus;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Status
		 */
		public void setStatus ( java.lang.String param )
		{

			this.localStatus = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/TransportationA/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":checkStatusOfDeliveryResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "checkStatusOfDeliveryResponse", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "status", xmlWriter );

			if ( localStatus == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "status cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localStatus );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/TransportationA/" ) )
			{
				return "ns4";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "status" ) );

			if ( localStatus != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localStatus ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "status cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static CheckStatusOfDeliveryResponseE parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				CheckStatusOfDeliveryResponseE object = new CheckStatusOfDeliveryResponseE();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"checkStatusOfDeliveryResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (CheckStatusOfDeliveryResponseE) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "status" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "status" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setStatus( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class CheckStatusOfDelivery implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/TransportationB/",
			"checkStatusOfDelivery", "ns3" );

		/**
		 * field for Token
		 */

		protected java.lang.String localToken;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getToken ()
		{
			return localToken;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Token
		 */
		public void setToken ( java.lang.String param )
		{

			this.localToken = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/TransportationB/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":checkStatusOfDelivery",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "checkStatusOfDelivery", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "token", xmlWriter );

			if ( localToken == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "token cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localToken );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/TransportationB/" ) )
			{
				return "ns3";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "token" ) );

			if ( localToken != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localToken ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "token cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static CheckStatusOfDelivery parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				CheckStatusOfDelivery object = new CheckStatusOfDelivery();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"checkStatusOfDelivery".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (CheckStatusOfDelivery) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "token" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "token" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setToken( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class CheckStatusOfDeliveryResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/TransportationB/",
			"checkStatusOfDeliveryResponse", "ns3" );

		/**
		 * field for Status
		 */

		protected java.lang.String localStatus;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getStatus ()
		{
			return localStatus;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Status
		 */
		public void setStatus ( java.lang.String param )
		{

			this.localStatus = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/TransportationB/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":checkStatusOfDeliveryResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "checkStatusOfDeliveryResponse", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "status", xmlWriter );

			if ( localStatus == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "status cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localStatus );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/TransportationB/" ) )
			{
				return "ns3";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "status" ) );

			if ( localStatus != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localStatus ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "status cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static CheckStatusOfDeliveryResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				CheckStatusOfDeliveryResponse object = new CheckStatusOfDeliveryResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"checkStatusOfDeliveryResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (CheckStatusOfDeliveryResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "status" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "status" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setStatus( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetTransportationCostResponseE implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/TransportationA/",
			"getTransportationCostResponse", "ns4" );

		/**
		 * field for TransportationCost
		 */

		protected java.math.BigDecimal localTransportationCost;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTransportationCost ()
		{
			return localTransportationCost;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TransportationCost
		 */
		public void setTransportationCost ( java.math.BigDecimal param )
		{

			this.localTransportationCost = param;

		}

		/**
		 * field for ExpectedDateOfDelivery
		 */

		protected java.util.Date localExpectedDateOfDelivery;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.util.Date
		 */
		public java.util.Date getExpectedDateOfDelivery ()
		{
			return localExpectedDateOfDelivery;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        ExpectedDateOfDelivery
		 */
		public void setExpectedDateOfDelivery ( java.util.Date param )
		{

			this.localExpectedDateOfDelivery = param;

		}

		/**
		 * field for Token
		 */

		protected java.lang.String localToken;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getToken ()
		{
			return localToken;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Token
		 */
		public void setToken ( java.lang.String param )
		{

			this.localToken = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/TransportationA/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":getTransportationCostResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTransportationCostResponse", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "transportationCost", xmlWriter );

			if ( localTransportationCost == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "transportationCost cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTransportationCost ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "expectedDateOfDelivery", xmlWriter );

			if ( localExpectedDateOfDelivery == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "expectedDateOfDelivery cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localExpectedDateOfDelivery ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "token", xmlWriter );

			if ( localToken == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "token cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localToken );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/TransportationA/" ) )
			{
				return "ns4";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "transportationCost" ) );

			if ( localTransportationCost != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTransportationCost ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "transportationCost cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "expectedDateOfDelivery" ) );

			if ( localExpectedDateOfDelivery != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localExpectedDateOfDelivery ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "expectedDateOfDelivery cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "token" ) );

			if ( localToken != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localToken ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "token cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetTransportationCostResponseE parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				GetTransportationCostResponseE object = new GetTransportationCostResponseE();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"getTransportationCostResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (GetTransportationCostResponseE) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "transportationCost" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "transportationCost"
								+ "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTransportationCost( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "expectedDateOfDelivery" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "expectedDateOfDelivery"
								+ "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setExpectedDateOfDelivery( org.apache.axis2.databinding.utils.ConverterUtil.convertToDate( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "token" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "token" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setToken( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetTransportationCostE implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/TransportationA/",
			"getTransportationCost", "ns4" );

		/**
		 * field for WarehouseCity
		 */

		protected java.lang.String localWarehouseCity;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getWarehouseCity ()
		{
			return localWarehouseCity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WarehouseCity
		 */
		public void setWarehouseCity ( java.lang.String param )
		{

			this.localWarehouseCity = param;

		}

		/**
		 * field for DestinationCity
		 */

		protected java.lang.String localDestinationCity;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getDestinationCity ()
		{
			return localDestinationCity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        DestinationCity
		 */
		public void setDestinationCity ( java.lang.String param )
		{

			this.localDestinationCity = param;

		}

		/**
		 * field for TotalVolume
		 */

		protected java.math.BigDecimal localTotalVolume;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTotalVolume ()
		{
			return localTotalVolume;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TotalVolume
		 */
		public void setTotalVolume ( java.math.BigDecimal param )
		{

			this.localTotalVolume = param;

		}

		/**
		 * field for TotalWeight
		 */

		protected java.math.BigDecimal localTotalWeight;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTotalWeight ()
		{
			return localTotalWeight;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TotalWeight
		 */
		public void setTotalWeight ( java.math.BigDecimal param )
		{

			this.localTotalWeight = param;

		}

		/**
		 * field for UrgentDelivery
		 */

		protected boolean localUrgentDelivery;

		/**
		 * Auto generated getter method
		 * 
		 * @return boolean
		 */
		public boolean getUrgentDelivery ()
		{
			return localUrgentDelivery;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        UrgentDelivery
		 */
		public void setUrgentDelivery ( boolean param )
		{

			this.localUrgentDelivery = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/TransportationA/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":getTransportationCost",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTransportationCost", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "warehouseCity", xmlWriter );

			if ( localWarehouseCity == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localWarehouseCity );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "destinationCity", xmlWriter );

			if ( localDestinationCity == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "destinationCity cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localDestinationCity );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "totalVolume", xmlWriter );

			if ( localTotalVolume == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "totalVolume cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalVolume ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "totalWeight", xmlWriter );

			if ( localTotalWeight == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "totalWeight cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalWeight ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "urgentDelivery", xmlWriter );

			if ( false )
			{

				throw new org.apache.axis2.databinding.ADBException( "urgentDelivery cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localUrgentDelivery ) );
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/TransportationA/" ) )
			{
				return "ns4";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "warehouseCity" ) );

			if ( localWarehouseCity != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWarehouseCity ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "destinationCity" ) );

			if ( localDestinationCity != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localDestinationCity ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "destinationCity cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "totalVolume" ) );

			if ( localTotalVolume != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalVolume ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "totalVolume cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "totalWeight" ) );

			if ( localTotalWeight != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalWeight ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "totalWeight cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "urgentDelivery" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localUrgentDelivery ) );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetTransportationCostE parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				GetTransportationCostE object = new GetTransportationCostE();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"getTransportationCost".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (GetTransportationCostE) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "warehouseCity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "warehouseCity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setWarehouseCity( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "destinationCity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "destinationCity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setDestinationCity( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "totalVolume" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "totalVolume" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTotalVolume( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "totalWeight" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "totalWeight" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTotalWeight( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "urgentDelivery" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "urgentDelivery" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setUrgentDelivery( org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class OrderWine1StPhaseResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr",
			"OrderWine1stPhaseResponse", "ns2" );

		/**
		 * field for Price
		 */

		protected java.math.BigDecimal localPrice;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getPrice ()
		{
			return localPrice;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Price
		 */
		public void setPrice ( java.math.BigDecimal param )
		{

			this.localPrice = param;

		}

		/**
		 * field for TransportationCost
		 */

		protected java.math.BigDecimal localTransportationCost;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTransportationCost ()
		{
			return localTransportationCost;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TransportationCost
		 */
		public void setTransportationCost ( java.math.BigDecimal param )
		{

			this.localTransportationCost = param;

		}

		/**
		 * field for Message
		 */

		protected java.lang.String localMessage;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getMessage ()
		{
			return localMessage;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Message
		 */
		public void setMessage ( java.lang.String param )
		{

			this.localMessage = param;

		}

		/**
		 * field for Satisfiable
		 */

		protected boolean localSatisfiable;

		/**
		 * Auto generated getter method
		 * 
		 * @return boolean
		 */
		public boolean getSatisfiable ()
		{
			return localSatisfiable;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Satisfiable
		 */
		public void setSatisfiable ( boolean param )
		{

			this.localSatisfiable = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":OrderWine1stPhaseResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "OrderWine1stPhaseResponse", xmlWriter );
				}

			}

			namespace = "http://imse.uoc.gr";
			writeStartElement( null, namespace, "price", xmlWriter );

			if ( localPrice == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "price cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localPrice ) );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr";
			writeStartElement( null, namespace, "transportationCost", xmlWriter );

			if ( localTransportationCost == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "transportationCost cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTransportationCost ) );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr";
			writeStartElement( null, namespace, "message", xmlWriter );

			if ( localMessage == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "message cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localMessage );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr";
			writeStartElement( null, namespace, "satisfiable", xmlWriter );

			if ( false )
			{

				throw new org.apache.axis2.databinding.ADBException( "satisfiable cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localSatisfiable ) );
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr" ) )
			{
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr", "price" ) );

			if ( localPrice != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localPrice ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "price cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr", "transportationCost" ) );

			if ( localTransportationCost != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTransportationCost ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "transportationCost cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr", "message" ) );

			if ( localMessage != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localMessage ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "message cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr", "satisfiable" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localSatisfiable ) );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static OrderWine1StPhaseResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				OrderWine1StPhaseResponse object = new OrderWine1StPhaseResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"OrderWine1stPhaseResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (OrderWine1StPhaseResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr", "price" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "price" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setPrice( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr", "transportationCost" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "transportationCost"
								+ "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTransportationCost( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr", "message" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "message" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setMessage( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr", "satisfiable" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "satisfiable" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setSatisfiable( org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class ExtensionMapper
	{

		public static java.lang.Object getTypeObject ( java.lang.String namespaceURI, java.lang.String typeName,
				javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
		{

			if ( "http://imse.uoc.gr/WineArrayType".equals( namespaceURI ) && "WineType".equals( typeName ) )
			{

				return WineType.Factory.parse( reader );

			}

			if ( "http://imse.uoc.gr/WineQuantityPairType".equals( namespaceURI ) && "WineQuantityPairType".equals( typeName ) )
			{

				return WineQuantityPairType.Factory.parse( reader );

			}

			throw new org.apache.axis2.databinding.ADBException( "Unsupported type " + namespaceURI + " " + typeName );
		}

	}

	public static class WineTypeSequence implements org.apache.axis2.databinding.ADBBean
	{
		/*
		 * This type was generated from the piece of schema that had name = WineTypeSequence Namespace URI =
		 * http://imse.uoc.gr/WineArrayType Namespace Prefix = ns5
		 */

		/**
		 * field for Id
		 */

		protected int localId;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getId ()
		{
			return localId;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Id
		 */
		public void setId ( int param )
		{

			this.localId = param;

		}

		/**
		 * field for Name
		 */

		protected java.lang.String localName;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getName ()
		{
			return localName;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Name
		 */
		public void setName ( java.lang.String param )
		{

			this.localName = param;

		}

		/**
		 * field for ProductionDate
		 */

		protected java.util.Date localProductionDate;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.util.Date
		 */
		public java.util.Date getProductionDate ()
		{
			return localProductionDate;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        ProductionDate
		 */
		public void setProductionDate ( java.util.Date param )
		{

			this.localProductionDate = param;

		}

		/**
		 * field for Type
		 */

		protected java.lang.String localType;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getType ()
		{
			return localType;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Type
		 */
		public void setType ( java.lang.String param )
		{

			this.localType = param;

		}

		/**
		 * field for Price
		 */

		protected java.math.BigDecimal localPrice;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getPrice ()
		{
			return localPrice;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Price
		 */
		public void setPrice ( java.math.BigDecimal param )
		{

			this.localPrice = param;

		}

		/**
		 * field for Weight
		 */

		protected float localWeight;

		/**
		 * Auto generated getter method
		 * 
		 * @return float
		 */
		public float getWeight ()
		{
			return localWeight;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Weight
		 */
		public void setWeight ( float param )
		{

			this.localWeight = param;

		}

		/**
		 * field for ImageUrl
		 */

		protected java.lang.String localImageUrl;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getImageUrl ()
		{
			return localImageUrl;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        ImageUrl
		 */
		public void setImageUrl ( java.lang.String param )
		{

			this.localImageUrl = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, parentQName );
			return factory.createOMElement( dataSource, parentQName );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineArrayType" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":WineTypeSequence",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WineTypeSequence", xmlWriter );
				}

			}

			namespace = "http://imse.uoc.gr/WineArrayType";
			writeStartElement( null, namespace, "id", xmlWriter );

			if ( localId == java.lang.Integer.MIN_VALUE )
			{

				throw new org.apache.axis2.databinding.ADBException( "id cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localId ) );
			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr/WineArrayType";
			writeStartElement( null, namespace, "name", xmlWriter );

			if ( localName == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "name cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localName );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr/WineArrayType";
			writeStartElement( null, namespace, "productionDate", xmlWriter );

			if ( localProductionDate == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "productionDate cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localProductionDate ) );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr/WineArrayType";
			writeStartElement( null, namespace, "type", xmlWriter );

			if ( localType == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "type cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localType );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr/WineArrayType";
			writeStartElement( null, namespace, "price", xmlWriter );

			if ( localPrice == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "price cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localPrice ) );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr/WineArrayType";
			writeStartElement( null, namespace, "weight", xmlWriter );

			if ( java.lang.Float.isNaN( localWeight ) )
			{

				throw new org.apache.axis2.databinding.ADBException( "weight cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWeight ) );
			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr/WineArrayType";
			writeStartElement( null, namespace, "imageUrl", xmlWriter );

			if ( localImageUrl == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "imageUrl cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localImageUrl );

			}

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineArrayType" ) )
			{
				return "ns5";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "id" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localId ) );

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "name" ) );

			if ( localName != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localName ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "name cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "productionDate" ) );

			if ( localProductionDate != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localProductionDate ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "productionDate cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "type" ) );

			if ( localType != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localType ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "type cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "price" ) );

			if ( localPrice != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localPrice ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "price cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "weight" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWeight ) );

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "imageUrl" ) );

			if ( localImageUrl != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localImageUrl ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "imageUrl cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WineTypeSequence parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WineTypeSequence object = new WineTypeSequence();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "id" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "id" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setId( org.apache.axis2.databinding.utils.ConverterUtil.convertToInt( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "name" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "name" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setName( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "productionDate" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "productionDate" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setProductionDate( org.apache.axis2.databinding.utils.ConverterUtil.convertToDate( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "type" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "type" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setType( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "price" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "price" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setPrice( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "weight" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "weight" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setWeight( org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "imageUrl" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "imageUrl" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setImageUrl( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class ListAllWinesInBetweenResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"listAllWinesInBetweenResponse", "ns6" );

		/**
		 * field for WineArray
		 */

		protected WineType localWineArray;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineType
		 */
		public WineType getWineArray ()
		{
			return localWineArray;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineArray
		 */
		public void setWineArray ( WineType param )
		{

			this.localWineArray = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":listAllWinesInBetweenResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "listAllWinesInBetweenResponse", xmlWriter );
				}

			}

			if ( localWineArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineArray cannot be null!!" );
			}
			localWineArray.serialize( new javax.xml.namespace.QName( "", "wineArray" ), xmlWriter );

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "wineArray" ) );

			if ( localWineArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineArray cannot be null!!" );
			}
			elementList.add( localWineArray );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static ListAllWinesInBetweenResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				ListAllWinesInBetweenResponse object = new ListAllWinesInBetweenResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"listAllWinesInBetweenResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (ListAllWinesInBetweenResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "wineArray" ).equals( reader.getName() ) )
					{

						object.setWineArray( WineType.Factory.parse( reader ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WineQuantityPairType implements org.apache.axis2.databinding.ADBBean
	{
		/*
		 * This type was generated from the piece of schema that had name = WineQuantityPairType Namespace URI =
		 * http://imse.uoc.gr/WineQuantityPairType Namespace Prefix = ns1
		 */

		/**
		 * field for WineQuantityPairTypeSequence This was an Array!
		 */

		protected WineQuantityPairTypeSequence [] localWineQuantityPairTypeSequence;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to
		 * determine whether to include this field in the serialized XML
		 */
		protected boolean localWineQuantityPairTypeSequenceTracker = false;

		public boolean isWineQuantityPairTypeSequenceSpecified ()
		{
			return localWineQuantityPairTypeSequenceTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return WineQuantityPairTypeSequence[]
		 */
		public WineQuantityPairTypeSequence [] getWineQuantityPairTypeSequence ()
		{
			return localWineQuantityPairTypeSequence;
		}

		/**
		 * validate the array for WineQuantityPairTypeSequence
		 */
		protected void validateWineQuantityPairTypeSequence ( WineQuantityPairTypeSequence [] param )
		{

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineQuantityPairTypeSequence
		 */
		public void setWineQuantityPairTypeSequence ( WineQuantityPairTypeSequence [] param )
		{

			validateWineQuantityPairTypeSequence( param );

			localWineQuantityPairTypeSequenceTracker = param != null;

			this.localWineQuantityPairTypeSequence = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param
		 *        WineQuantityPairTypeSequence
		 */
		public void addWineQuantityPairTypeSequence ( WineQuantityPairTypeSequence param )
		{
			if ( localWineQuantityPairTypeSequence == null )
			{
				localWineQuantityPairTypeSequence = new WineQuantityPairTypeSequence [] {};
			}

			// update the setting tracker
			localWineQuantityPairTypeSequenceTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList( localWineQuantityPairTypeSequence );
			list.add( param );
			this.localWineQuantityPairTypeSequence =
					(WineQuantityPairTypeSequence []) list.toArray( new WineQuantityPairTypeSequence [ list.size() ] );

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, parentQName );
			return factory.createOMElement( dataSource, parentQName );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineQuantityPairType" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":WineQuantityPairType",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WineQuantityPairType", xmlWriter );
				}

			}
			if ( localWineQuantityPairTypeSequenceTracker )
			{

				if ( localWineQuantityPairTypeSequence != null )
				{
					for ( int i = 0; i < localWineQuantityPairTypeSequence.length; i++ )
					{
						if ( localWineQuantityPairTypeSequence [ i ] != null )
						{
							localWineQuantityPairTypeSequence [ i ].serialize( null, xmlWriter );
						}
						else
						{

							// we don't have to do any thing since minOccures is zero

						}

					}
				}
				else
				{
					throw new org.apache.axis2.databinding.ADBException( "WineQuantityPairTypeSequence cannot be null!!" );
				}
			}
			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineQuantityPairType" ) )
			{
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if ( localWineQuantityPairTypeSequenceTracker )
			{
				if ( localWineQuantityPairTypeSequence != null )
				{
					for ( int i = 0; i < localWineQuantityPairTypeSequence.length; i++ )
					{

						if ( localWineQuantityPairTypeSequence [ i ] != null )
						{
							elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineQuantityPairType",
								"WineQuantityPairTypeSequence" ) );
							elementList.add( localWineQuantityPairTypeSequence [ i ] );
						}
						else
						{

							// nothing to do

						}

					}
				}
				else
				{

					throw new org.apache.axis2.databinding.ADBException( "WineQuantityPairTypeSequence cannot be null!!" );

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WineQuantityPairType parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WineQuantityPairType object = new WineQuantityPairType();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"WineQuantityPairType".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (WineQuantityPairType) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					try
					{

						if ( reader.isStartElement() )
						{

							// Process the array and step past its final element's end.
							list1.add( WineQuantityPairTypeSequence.Factory.parse( reader ) );
							// loop until we find a start element that is not part of this array
							boolean loopDone1 = false;
							while ( !loopDone1 )
							{

								// Step to next element event.
								while ( !reader.isStartElement() && !reader.isEndElement() )
									reader.next();
								if ( reader.isEndElement() )
								{
									// two continuous end elements means we are exiting the xml structure
									loopDone1 = true;
								}
								else
								{
									list1.add( WineQuantityPairTypeSequence.Factory.parse( reader ) );
								}
							}
							// call the converter utility to convert and set the array
							object
								.setWineQuantityPairTypeSequence( (WineQuantityPairTypeSequence []) org.apache.axis2.databinding.utils.ConverterUtil
									.convertToArray( WineQuantityPairTypeSequence.class, list1 ) );

						} // End of if for expected property start element

						else
						{

						}

					}
					catch ( java.lang.Exception e )
					{}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetTransportationCost implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/TransportationB/",
			"getTransportationCost", "ns3" );

		/**
		 * field for WarehouseCity
		 */

		protected java.lang.String localWarehouseCity;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getWarehouseCity ()
		{
			return localWarehouseCity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WarehouseCity
		 */
		public void setWarehouseCity ( java.lang.String param )
		{

			this.localWarehouseCity = param;

		}

		/**
		 * field for DestinationCity
		 */

		protected java.lang.String localDestinationCity;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getDestinationCity ()
		{
			return localDestinationCity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        DestinationCity
		 */
		public void setDestinationCity ( java.lang.String param )
		{

			this.localDestinationCity = param;

		}

		/**
		 * field for TotalVolume
		 */

		protected java.math.BigDecimal localTotalVolume;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTotalVolume ()
		{
			return localTotalVolume;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TotalVolume
		 */
		public void setTotalVolume ( java.math.BigDecimal param )
		{

			this.localTotalVolume = param;

		}

		/**
		 * field for TotalWeight
		 */

		protected java.math.BigDecimal localTotalWeight;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTotalWeight ()
		{
			return localTotalWeight;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TotalWeight
		 */
		public void setTotalWeight ( java.math.BigDecimal param )
		{

			this.localTotalWeight = param;

		}

		/**
		 * field for UrgentDelivery
		 */

		protected boolean localUrgentDelivery;

		/**
		 * Auto generated getter method
		 * 
		 * @return boolean
		 */
		public boolean getUrgentDelivery ()
		{
			return localUrgentDelivery;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        UrgentDelivery
		 */
		public void setUrgentDelivery ( boolean param )
		{

			this.localUrgentDelivery = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/TransportationB/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":getTransportationCost",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTransportationCost", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "warehouseCity", xmlWriter );

			if ( localWarehouseCity == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localWarehouseCity );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "destinationCity", xmlWriter );

			if ( localDestinationCity == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "destinationCity cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localDestinationCity );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "totalVolume", xmlWriter );

			if ( localTotalVolume == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "totalVolume cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalVolume ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "totalWeight", xmlWriter );

			if ( localTotalWeight == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "totalWeight cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalWeight ) );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "urgentDelivery", xmlWriter );

			if ( false )
			{

				throw new org.apache.axis2.databinding.ADBException( "urgentDelivery cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localUrgentDelivery ) );
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/TransportationB/" ) )
			{
				return "ns3";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "warehouseCity" ) );

			if ( localWarehouseCity != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWarehouseCity ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "destinationCity" ) );

			if ( localDestinationCity != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localDestinationCity ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "destinationCity cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "totalVolume" ) );

			if ( localTotalVolume != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalVolume ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "totalVolume cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "totalWeight" ) );

			if ( localTotalWeight != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalWeight ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "totalWeight cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "urgentDelivery" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localUrgentDelivery ) );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetTransportationCost parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				GetTransportationCost object = new GetTransportationCost();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"getTransportationCost".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (GetTransportationCost) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "warehouseCity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "warehouseCity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setWarehouseCity( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "destinationCity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "destinationCity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setDestinationCity( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "totalVolume" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "totalVolume" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTotalVolume( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "totalWeight" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "totalWeight" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTotalWeight( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "urgentDelivery" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "urgentDelivery" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setUrgentDelivery( org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetTotalPriceOfGoods implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"getTotalPriceOfGoods", "ns6" );

		/**
		 * field for WineQuantityPairArray
		 */

		protected WineQuantityPairType localWineQuantityPairArray;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineQuantityPairType
		 */
		public WineQuantityPairType getWineQuantityPairArray ()
		{
			return localWineQuantityPairArray;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineQuantityPairArray
		 */
		public void setWineQuantityPairArray ( WineQuantityPairType param )
		{

			this.localWineQuantityPairArray = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":getTotalPriceOfGoods",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTotalPriceOfGoods", xmlWriter );
				}

			}

			if ( localWineQuantityPairArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairArray cannot be null!!" );
			}
			localWineQuantityPairArray.serialize( new javax.xml.namespace.QName( "", "wineQuantityPairArray" ), xmlWriter );

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "wineQuantityPairArray" ) );

			if ( localWineQuantityPairArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairArray cannot be null!!" );
			}
			elementList.add( localWineQuantityPairArray );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetTotalPriceOfGoods parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				GetTotalPriceOfGoods object = new GetTotalPriceOfGoods();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"getTotalPriceOfGoods".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (GetTotalPriceOfGoods) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "wineQuantityPairArray" ).equals( reader.getName() ) )
					{

						object.setWineQuantityPairArray( WineQuantityPairType.Factory.parse( reader ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class OrderWine1StPhaseRequest implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr",
			"OrderWine1stPhaseRequest", "ns2" );

		/**
		 * field for WineQuantityPairs
		 */

		protected WineQuantityPairType localWineQuantityPairs;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineQuantityPairType
		 */
		public WineQuantityPairType getWineQuantityPairs ()
		{
			return localWineQuantityPairs;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineQuantityPairs
		 */
		public void setWineQuantityPairs ( WineQuantityPairType param )
		{

			this.localWineQuantityPairs = param;

		}

		/**
		 * field for WarehouseCity
		 */

		protected java.lang.String localWarehouseCity;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getWarehouseCity ()
		{
			return localWarehouseCity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WarehouseCity
		 */
		public void setWarehouseCity ( java.lang.String param )
		{

			this.localWarehouseCity = param;

		}

		/**
		 * field for DestinationCity
		 */

		protected java.lang.String localDestinationCity;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getDestinationCity ()
		{
			return localDestinationCity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        DestinationCity
		 */
		public void setDestinationCity ( java.lang.String param )
		{

			this.localDestinationCity = param;

		}

		/**
		 * field for UrgentDelivery
		 */

		protected boolean localUrgentDelivery;

		/**
		 * Auto generated getter method
		 * 
		 * @return boolean
		 */
		public boolean getUrgentDelivery ()
		{
			return localUrgentDelivery;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        UrgentDelivery
		 */
		public void setUrgentDelivery ( boolean param )
		{

			this.localUrgentDelivery = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":OrderWine1stPhaseRequest", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "OrderWine1stPhaseRequest", xmlWriter );
				}

			}

			if ( localWineQuantityPairs == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairs cannot be null!!" );
			}
			localWineQuantityPairs.serialize( new javax.xml.namespace.QName( "http://imse.uoc.gr", "wineQuantityPairs" ), xmlWriter );

			namespace = "http://imse.uoc.gr";
			writeStartElement( null, namespace, "warehouseCity", xmlWriter );

			if ( localWarehouseCity == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localWarehouseCity );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr";
			writeStartElement( null, namespace, "destinationCity", xmlWriter );

			if ( localDestinationCity == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "destinationCity cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localDestinationCity );

			}

			xmlWriter.writeEndElement();

			namespace = "http://imse.uoc.gr";
			writeStartElement( null, namespace, "urgentDelivery", xmlWriter );

			if ( false )
			{

				throw new org.apache.axis2.databinding.ADBException( "urgentDelivery cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localUrgentDelivery ) );
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr" ) )
			{
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr", "wineQuantityPairs" ) );

			if ( localWineQuantityPairs == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairs cannot be null!!" );
			}
			elementList.add( localWineQuantityPairs );

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr", "warehouseCity" ) );

			if ( localWarehouseCity != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWarehouseCity ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr", "destinationCity" ) );

			if ( localDestinationCity != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localDestinationCity ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "destinationCity cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr", "urgentDelivery" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localUrgentDelivery ) );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static OrderWine1StPhaseRequest parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				OrderWine1StPhaseRequest object = new OrderWine1StPhaseRequest();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"OrderWine1stPhaseRequest".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (OrderWine1StPhaseRequest) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr", "wineQuantityPairs" ).equals( reader.getName() ) )
					{

						object.setWineQuantityPairs( WineQuantityPairType.Factory.parse( reader ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr", "warehouseCity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "warehouseCity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setWarehouseCity( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr", "destinationCity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "destinationCity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setDestinationCity( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement()
						&& new javax.xml.namespace.QName( "http://imse.uoc.gr", "urgentDelivery" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "urgentDelivery" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setUrgentDelivery( org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WarehouseInventoryCheckResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"warehouseInventoryCheckResponse", "ns6" );

		/**
		 * field for Message
		 */

		protected java.lang.String localMessage;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getMessage ()
		{
			return localMessage;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Message
		 */
		public void setMessage ( java.lang.String param )
		{

			this.localMessage = param;

		}

		/**
		 * field for Satisfiable
		 */

		protected boolean localSatisfiable;

		/**
		 * Auto generated getter method
		 * 
		 * @return boolean
		 */
		public boolean getSatisfiable ()
		{
			return localSatisfiable;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Satisfiable
		 */
		public void setSatisfiable ( boolean param )
		{

			this.localSatisfiable = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":warehouseInventoryCheckResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "warehouseInventoryCheckResponse",
						xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "message", xmlWriter );

			if ( localMessage == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "message cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localMessage );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "satisfiable", xmlWriter );

			if ( false )
			{

				throw new org.apache.axis2.databinding.ADBException( "satisfiable cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localSatisfiable ) );
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "message" ) );

			if ( localMessage != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localMessage ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "message cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "satisfiable" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localSatisfiable ) );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WarehouseInventoryCheckResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WarehouseInventoryCheckResponse object = new WarehouseInventoryCheckResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"warehouseInventoryCheckResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (WarehouseInventoryCheckResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "message" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "message" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setMessage( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "satisfiable" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "satisfiable" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setSatisfiable( org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WineArray implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType",
			"wineArray", "ns5" );

		/**
		 * field for WineArray
		 */

		protected WineType localWineArray;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineType
		 */
		public WineType getWineArray ()
		{
			return localWineArray;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineArray
		 */
		public void setWineArray ( WineType param )
		{

			this.localWineArray = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			// We can safely assume an element has only one type associated with it

			if ( localWineArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineArray cannot be null!" );
			}
			localWineArray.serialize( MY_QNAME, xmlWriter );

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineArrayType" ) )
			{
				return "ns5";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			// We can safely assume an element has only one type associated with it
			return localWineArray.getPullParser( MY_QNAME );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WineArray parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WineArray object = new WineArray();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while ( !reader.isEndElement() )
					{
						if ( reader.isStartElement() )
						{

							if ( reader.isStartElement()
								&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "wineArray" ).equals( reader
									.getName() ) )
							{

								object.setWineArray( WineType.Factory.parse( reader ) );

							} // End of if for expected property start element

							else
							{
								// A start element we are not expecting indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
							}

						}
						else
						{
							reader.next();
						}
					} // end of while loop

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetTotalPriceOfGoodsResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"getTotalPriceOfGoodsResponse", "ns6" );

		/**
		 * field for TotalPriceOfGoods
		 */

		protected java.math.BigDecimal localTotalPriceOfGoods;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getTotalPriceOfGoods ()
		{
			return localTotalPriceOfGoods;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        TotalPriceOfGoods
		 */
		public void setTotalPriceOfGoods ( java.math.BigDecimal param )
		{

			this.localTotalPriceOfGoods = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":getTotalPriceOfGoodsResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getTotalPriceOfGoodsResponse", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "totalPriceOfGoods", xmlWriter );

			if ( localTotalPriceOfGoods == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "totalPriceOfGoods cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalPriceOfGoods ) );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "totalPriceOfGoods" ) );

			if ( localTotalPriceOfGoods != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localTotalPriceOfGoods ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "totalPriceOfGoods cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetTotalPriceOfGoodsResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				GetTotalPriceOfGoodsResponse object = new GetTotalPriceOfGoodsResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"getTotalPriceOfGoodsResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (GetTotalPriceOfGoodsResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "totalPriceOfGoods" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "totalPriceOfGoods" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setTotalPriceOfGoods( org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WineType implements org.apache.axis2.databinding.ADBBean
	{
		/*
		 * This type was generated from the piece of schema that had name = WineType Namespace URI = http://imse.uoc.gr/WineArrayType
		 * Namespace Prefix = ns5
		 */

		/**
		 * field for WineTypeSequence This was an Array!
		 */

		protected WineTypeSequence [] localWineTypeSequence;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to
		 * determine whether to include this field in the serialized XML
		 */
		protected boolean localWineTypeSequenceTracker = false;

		public boolean isWineTypeSequenceSpecified ()
		{
			return localWineTypeSequenceTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return WineTypeSequence[]
		 */
		public WineTypeSequence [] getWineTypeSequence ()
		{
			return localWineTypeSequence;
		}

		/**
		 * validate the array for WineTypeSequence
		 */
		protected void validateWineTypeSequence ( WineTypeSequence [] param )
		{

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineTypeSequence
		 */
		public void setWineTypeSequence ( WineTypeSequence [] param )
		{

			validateWineTypeSequence( param );

			localWineTypeSequenceTracker = param != null;

			this.localWineTypeSequence = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param
		 *        WineTypeSequence
		 */
		public void addWineTypeSequence ( WineTypeSequence param )
		{
			if ( localWineTypeSequence == null )
			{
				localWineTypeSequence = new WineTypeSequence [] {};
			}

			// update the setting tracker
			localWineTypeSequenceTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList( localWineTypeSequence );
			list.add( param );
			this.localWineTypeSequence = (WineTypeSequence []) list.toArray( new WineTypeSequence [ list.size() ] );

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, parentQName );
			return factory.createOMElement( dataSource, parentQName );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineArrayType" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":WineType", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WineType", xmlWriter );
				}

			}
			if ( localWineTypeSequenceTracker )
			{

				if ( localWineTypeSequence != null )
				{
					for ( int i = 0; i < localWineTypeSequence.length; i++ )
					{
						if ( localWineTypeSequence [ i ] != null )
						{
							localWineTypeSequence [ i ].serialize( null, xmlWriter );
						}
						else
						{

							// we don't have to do any thing since minOccures is zero

						}

					}
				}
				else
				{
					throw new org.apache.axis2.databinding.ADBException( "WineTypeSequence cannot be null!!" );
				}
			}
			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineArrayType" ) )
			{
				return "ns5";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if ( localWineTypeSequenceTracker )
			{
				if ( localWineTypeSequence != null )
				{
					for ( int i = 0; i < localWineTypeSequence.length; i++ )
					{

						if ( localWineTypeSequence [ i ] != null )
						{
							elementList.add( new javax.xml.namespace.QName( "http://imse.uoc.gr/WineArrayType", "WineTypeSequence" ) );
							elementList.add( localWineTypeSequence [ i ] );
						}
						else
						{

							// nothing to do

						}

					}
				}
				else
				{

					throw new org.apache.axis2.databinding.ADBException( "WineTypeSequence cannot be null!!" );

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WineType parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WineType object = new WineType();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"WineType".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (WineType) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					try
					{

						if ( reader.isStartElement() )
						{

							// Process the array and step past its final element's end.
							list1.add( WineTypeSequence.Factory.parse( reader ) );
							// loop until we find a start element that is not part of this array
							boolean loopDone1 = false;
							while ( !loopDone1 )
							{

								// Step to next element event.
								while ( !reader.isStartElement() && !reader.isEndElement() )
									reader.next();
								if ( reader.isEndElement() )
								{
									// two continuous end elements means we are exiting the xml structure
									loopDone1 = true;
								}
								else
								{
									list1.add( WineTypeSequence.Factory.parse( reader ) );
								}
							}
							// call the converter utility to convert and set the array
							object.setWineTypeSequence( (WineTypeSequence []) org.apache.axis2.databinding.utils.ConverterUtil
								.convertToArray( WineTypeSequence.class, list1 ) );

						} // End of if for expected property start element

						else
						{

						}

					}
					catch ( java.lang.Exception e )
					{}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class ListAllWinesInBetween implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"listAllWinesInBetween", "ns6" );

		/**
		 * field for FirstResult
		 */

		protected int localFirstResult;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getFirstResult ()
		{
			return localFirstResult;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        FirstResult
		 */
		public void setFirstResult ( int param )
		{

			this.localFirstResult = param;

		}

		/**
		 * field for MaxResults
		 */

		protected int localMaxResults;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getMaxResults ()
		{
			return localMaxResults;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        MaxResults
		 */
		public void setMaxResults ( int param )
		{

			this.localMaxResults = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":listAllWinesInBetween",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "listAllWinesInBetween", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "firstResult", xmlWriter );

			if ( localFirstResult == java.lang.Integer.MIN_VALUE )
			{

				throw new org.apache.axis2.databinding.ADBException( "firstResult cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localFirstResult ) );
			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "maxResults", xmlWriter );

			if ( localMaxResults == java.lang.Integer.MIN_VALUE )
			{

				throw new org.apache.axis2.databinding.ADBException( "maxResults cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localMaxResults ) );
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "firstResult" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localFirstResult ) );

			elementList.add( new javax.xml.namespace.QName( "", "maxResults" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localMaxResults ) );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static ListAllWinesInBetween parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				ListAllWinesInBetween object = new ListAllWinesInBetween();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"listAllWinesInBetween".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (ListAllWinesInBetween) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "firstResult" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "firstResult" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setFirstResult( org.apache.axis2.databinding.utils.ConverterUtil.convertToInt( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "maxResults" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "maxResults" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setMaxResults( org.apache.axis2.databinding.utils.ConverterUtil.convertToInt( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class CheckStatusOfDeliveryE implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/TransportationA/",
			"checkStatusOfDelivery", "ns4" );

		/**
		 * field for Token
		 */

		protected java.lang.String localToken;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getToken ()
		{
			return localToken;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Token
		 */
		public void setToken ( java.lang.String param )
		{

			this.localToken = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/TransportationA/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":checkStatusOfDelivery",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "checkStatusOfDelivery", xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "token", xmlWriter );

			if ( localToken == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "token cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localToken );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/TransportationA/" ) )
			{
				return "ns4";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "token" ) );

			if ( localToken != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localToken ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "token cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static CheckStatusOfDeliveryE parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				CheckStatusOfDeliveryE object = new CheckStatusOfDeliveryE();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"checkStatusOfDelivery".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (CheckStatusOfDeliveryE) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "token" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "token" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setToken( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class ListAllWines implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"listAllWines", "ns6" );

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":listAllWines",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "listAllWines", xmlWriter );
				}

			}

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static ListAllWines parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				ListAllWines object = new ListAllWines();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"listAllWines".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (ListAllWines) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WarehouseInventoryReserve implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"warehouseInventoryReserve", "ns6" );

		/**
		 * field for WineQuantityPairArray
		 */

		protected WineQuantityPairType localWineQuantityPairArray;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineQuantityPairType
		 */
		public WineQuantityPairType getWineQuantityPairArray ()
		{
			return localWineQuantityPairArray;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineQuantityPairArray
		 */
		public void setWineQuantityPairArray ( WineQuantityPairType param )
		{

			this.localWineQuantityPairArray = param;

		}

		/**
		 * field for WarehouseCity
		 */

		protected java.lang.String localWarehouseCity;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getWarehouseCity ()
		{
			return localWarehouseCity;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WarehouseCity
		 */
		public void setWarehouseCity ( java.lang.String param )
		{

			this.localWarehouseCity = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":warehouseInventoryReserve", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "warehouseInventoryReserve", xmlWriter );
				}

			}

			if ( localWineQuantityPairArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairArray cannot be null!!" );
			}
			localWineQuantityPairArray.serialize( new javax.xml.namespace.QName( "", "wineQuantityPairArray" ), xmlWriter );

			namespace = "";
			writeStartElement( null, namespace, "warehouseCity", xmlWriter );

			if ( localWarehouseCity == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localWarehouseCity );

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "wineQuantityPairArray" ) );

			if ( localWineQuantityPairArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairArray cannot be null!!" );
			}
			elementList.add( localWineQuantityPairArray );

			elementList.add( new javax.xml.namespace.QName( "", "warehouseCity" ) );

			if ( localWarehouseCity != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localWarehouseCity ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "warehouseCity cannot be null!!" );
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WarehouseInventoryReserve parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WarehouseInventoryReserve object = new WarehouseInventoryReserve();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"warehouseInventoryReserve".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (WarehouseInventoryReserve) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "wineQuantityPairArray" ).equals( reader.getName() ) )
					{

						object.setWineQuantityPairArray( WineQuantityPairType.Factory.parse( reader ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "warehouseCity" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "warehouseCity" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setWarehouseCity( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WarehouseInventoryReserveResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"warehouseInventoryReserveResponse", "ns6" );

		/**
		 * field for Message
		 */

		protected java.lang.String localMessage;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getMessage ()
		{
			return localMessage;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Message
		 */
		public void setMessage ( java.lang.String param )
		{

			this.localMessage = param;

		}

		/**
		 * field for Successful
		 */

		protected boolean localSuccessful;

		/**
		 * Auto generated getter method
		 * 
		 * @return boolean
		 */
		public boolean getSuccessful ()
		{
			return localSuccessful;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        Successful
		 */
		public void setSuccessful ( boolean param )
		{

			this.localSuccessful = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix
						+ ":warehouseInventoryReserveResponse", xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "warehouseInventoryReserveResponse",
						xmlWriter );
				}

			}

			namespace = "";
			writeStartElement( null, namespace, "message", xmlWriter );

			if ( localMessage == null )
			{
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException( "message cannot be null!!" );

			}
			else
			{

				xmlWriter.writeCharacters( localMessage );

			}

			xmlWriter.writeEndElement();

			namespace = "";
			writeStartElement( null, namespace, "successful", xmlWriter );

			if ( false )
			{

				throw new org.apache.axis2.databinding.ADBException( "successful cannot be null!!" );

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localSuccessful ) );
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "message" ) );

			if ( localMessage != null )
			{
				elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localMessage ) );
			}
			else
			{
				throw new org.apache.axis2.databinding.ADBException( "message cannot be null!!" );
			}

			elementList.add( new javax.xml.namespace.QName( "", "successful" ) );

			elementList.add( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( localSuccessful ) );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WarehouseInventoryReserveResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WarehouseInventoryReserveResponse object = new WarehouseInventoryReserveResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"warehouseInventoryReserveResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (WarehouseInventoryReserveResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "message" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "message" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setMessage( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "successful" ).equals( reader.getName() ) )
					{

						nillableValue = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "nil" );
						if ( "true".equals( nillableValue ) || "1".equals( nillableValue ) )
						{
							throw new org.apache.axis2.databinding.ADBException( "The element: " + "successful" + "  cannot be null" );
						}

						java.lang.String content = reader.getElementText();

						object.setSuccessful( org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean( content ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class ListAllWinesResponse implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineProWs/",
			"listAllWinesResponse", "ns6" );

		/**
		 * field for WineArray
		 */

		protected WineType localWineArray;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineType
		 */
		public WineType getWineArray ()
		{
			return localWineArray;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineArray
		 */
		public void setWineArray ( WineType param )
		{

			this.localWineArray = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement( prefix, namespace, parentQName.getLocalPart(), xmlWriter );

			if ( serializeType )
			{

				java.lang.String namespacePrefix = registerPrefix( xmlWriter, "http://imse.uoc.gr/WineProWs/" );
				if ( ( namespacePrefix != null ) && ( namespacePrefix.trim().length() > 0 ) )
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":listAllWinesResponse",
						xmlWriter );
				}
				else
				{
					writeAttribute( "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "listAllWinesResponse", xmlWriter );
				}

			}

			if ( localWineArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineArray cannot be null!!" );
			}
			localWineArray.serialize( new javax.xml.namespace.QName( "", "wineArray" ), xmlWriter );

			xmlWriter.writeEndElement();

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineProWs/" ) )
			{
				return "ns6";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add( new javax.xml.namespace.QName( "", "wineArray" ) );

			if ( localWineArray == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineArray cannot be null!!" );
			}
			elementList.add( localWineArray );

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl( qName, elementList.toArray(), attribList.toArray() );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static ListAllWinesResponse parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				ListAllWinesResponse object = new ListAllWinesResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" ) != null )
					{
						java.lang.String fullTypeName = reader.getAttributeValue( "http://www.w3.org/2001/XMLSchema-instance", "type" );
						if ( fullTypeName != null )
						{
							java.lang.String nsPrefix = null;
							if ( fullTypeName.indexOf( ":" ) > -1 )
							{
								nsPrefix = fullTypeName.substring( 0, fullTypeName.indexOf( ":" ) );
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName.substring( fullTypeName.indexOf( ":" ) + 1 );

							if ( !"listAllWinesResponse".equals( type ) )
							{
								// find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI( nsPrefix );
								return (ListAllWinesResponse) ExtensionMapper.getTypeObject( nsUri, type, reader );
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() && new javax.xml.namespace.QName( "", "wineArray" ).equals( reader.getName() ) )
					{

						object.setWineArray( WineType.Factory.parse( reader ) );

						reader.next();

					} // End of if for expected property start element

					else
					{
						// A start element we are not expecting indicates an invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
					}

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					if ( reader.isStartElement() )
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	public static class WineQuantityPairs implements org.apache.axis2.databinding.ADBBean
	{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName( "http://imse.uoc.gr/WineQuantityPairType",
			"wineQuantityPairs", "ns1" );

		/**
		 * field for WineQuantityPairs
		 */

		protected WineQuantityPairType localWineQuantityPairs;

		/**
		 * Auto generated getter method
		 * 
		 * @return WineQuantityPairType
		 */
		public WineQuantityPairType getWineQuantityPairs ()
		{
			return localWineQuantityPairs;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *        WineQuantityPairs
		 */
		public void setWineQuantityPairs ( WineQuantityPairType param )
		{

			this.localWineQuantityPairs = param;

		}

		/**
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement ( final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory ) throws org.apache.axis2.databinding.ADBException
		{

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource( this, MY_QNAME );
			return factory.createOMElement( dataSource, MY_QNAME );

		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{
			serialize( parentQName, xmlWriter, false );
		}

		public void serialize ( final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType ) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException
		{

			// We can safely assume an element has only one type associated with it

			if ( localWineQuantityPairs == null )
			{
				throw new org.apache.axis2.databinding.ADBException( "wineQuantityPairs cannot be null!" );
			}
			localWineQuantityPairs.serialize( MY_QNAME, xmlWriter );

		}

		private static java.lang.String generatePrefix ( java.lang.String namespace )
		{
			if ( namespace.equals( "http://imse.uoc.gr/WineQuantityPairType" ) )
			{
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement ( java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			java.lang.String writerPrefix = xmlWriter.getPrefix( namespace );
			if ( writerPrefix != null )
			{
				xmlWriter.writeStartElement( namespace, localPart );
			}
			else
			{
				if ( namespace.length() == 0 )
				{
					prefix = "";
				}
				else if ( prefix == null )
				{
					prefix = generatePrefix( namespace );
				}

				xmlWriter.writeStartElement( prefix, localPart, namespace );
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute ( java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( xmlWriter.getPrefix( namespace ) == null )
			{
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			xmlWriter.writeAttribute( namespace, attName, attValue );
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute ( java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{
			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attValue );
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute ( java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter ) throws javax.xml.stream.XMLStreamException
		{

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix( attributeNamespace );
			if ( attributePrefix == null )
			{
				attributePrefix = registerPrefix( xmlWriter, attributeNamespace );
			}
			java.lang.String attributeValue;
			if ( attributePrefix.trim().length() > 0 )
			{
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			}
			else
			{
				attributeValue = qname.getLocalPart();
			}

			if ( namespace.equals( "" ) )
			{
				xmlWriter.writeAttribute( attName, attributeValue );
			}
			else
			{
				registerPrefix( xmlWriter, namespace );
				xmlWriter.writeAttribute( namespace, attName, attributeValue );
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName ( javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if ( namespaceURI != null )
			{
				java.lang.String prefix = xmlWriter.getPrefix( namespaceURI );
				if ( prefix == null )
				{
					prefix = generatePrefix( namespaceURI );
					xmlWriter.writeNamespace( prefix, namespaceURI );
					xmlWriter.setPrefix( prefix, namespaceURI );
				}

				if ( prefix.trim().length() > 0 )
				{
					xmlWriter.writeCharacters( prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}
				else
				{
					// i.e this is the default namespace
					xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
				}

			}
			else
			{
				xmlWriter.writeCharacters( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qname ) );
			}
		}

		private void writeQNames ( javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter )
				throws javax.xml.stream.XMLStreamException
		{

			if ( qnames != null )
			{
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for ( int i = 0; i < qnames.length; i++ )
				{
					if ( i > 0 )
					{
						stringToWrite.append( " " );
					}
					namespaceURI = qnames [ i ].getNamespaceURI();
					if ( namespaceURI != null )
					{
						prefix = xmlWriter.getPrefix( namespaceURI );
						if ( ( prefix == null ) || ( prefix.length() == 0 ) )
						{
							prefix = generatePrefix( namespaceURI );
							xmlWriter.writeNamespace( prefix, namespaceURI );
							xmlWriter.setPrefix( prefix, namespaceURI );
						}

						if ( prefix.trim().length() > 0 )
						{
							stringToWrite.append( prefix ).append( ":" )
								.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
						else
						{
							stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
						}
					}
					else
					{
						stringToWrite.append( org.apache.axis2.databinding.utils.ConverterUtil.convertToString( qnames [ i ] ) );
					}
				}
				xmlWriter.writeCharacters( stringToWrite.toString() );
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix ( javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace )
				throws javax.xml.stream.XMLStreamException
		{
			java.lang.String prefix = xmlWriter.getPrefix( namespace );
			if ( prefix == null )
			{
				prefix = generatePrefix( namespace );
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while ( true )
				{
					java.lang.String uri = nsContext.getNamespaceURI( prefix );
					if ( uri == null || uri.length() == 0 )
					{
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace( prefix, namespace );
				xmlWriter.setPrefix( prefix, namespace );
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 */
		public javax.xml.stream.XMLStreamReader getPullParser ( javax.xml.namespace.QName qName )
				throws org.apache.axis2.databinding.ADBException
		{

			// We can safely assume an element has only one type associated with it
			return localWineQuantityPairs.getPullParser( MY_QNAME );

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
		{

			/**
			 * static method to create the object Precondition: If this object is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader
			 * is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at
			 * its end element If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static WineQuantityPairs parse ( javax.xml.stream.XMLStreamReader reader ) throws java.lang.Exception
			{
				WineQuantityPairs object = new WineQuantityPairs();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try
				{

					while ( !reader.isStartElement() && !reader.isEndElement() )
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while ( !reader.isEndElement() )
					{
						if ( reader.isStartElement() )
						{

							if ( reader.isStartElement()
								&& new javax.xml.namespace.QName( "http://imse.uoc.gr/WineQuantityPairType", "wineQuantityPairs" )
									.equals( reader.getName() ) )
							{

								object.setWineQuantityPairs( WineQuantityPairType.Factory.parse( reader ) );

							} // End of if for expected property start element

							else
							{
								// A start element we are not expecting indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException( "Unexpected subelement " + reader.getName() );
							}

						}
						else
						{
							reader.next();
						}
					} // end of while loop

				}
				catch ( javax.xml.stream.XMLStreamException e )
				{
					throw new java.lang.Exception( e );
				}

				return object;
			}

		}// end of factory class

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseRequest param,
			boolean optimizeContent ) throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseRequest.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.om.OMElement toOM ( gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseResponse param,
			boolean optimizeContent ) throws org.apache.axis2.AxisFault
	{

		try
		{
			return param.getOMElement( gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseResponse.MY_QNAME,
				org.apache.axiom.om.OMAbstractFactory.getOMFactory() );
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope ( org.apache.axiom.soap.SOAPFactory factory,
			gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseRequest param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName ) throws org.apache.axis2.AxisFault
	{

		try
		{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
				param.getOMElement( gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseRequest.MY_QNAME, factory ) );
			return emptyEnvelope;
		}
		catch ( org.apache.axis2.databinding.ADBException e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}

	}

	/* methods to provide back word compatibility */

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

			if ( gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseRequest.class.equals( type ) )
			{

				return gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseRequest.Factory.parse( param
					.getXMLStreamReaderWithoutCaching() );

			}

			if ( gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseResponse.class.equals( type ) )
			{

				return gr.uoc.imse.OrderWine1StPhaseServiceStub.OrderWine1StPhaseResponse.Factory.parse( param
					.getXMLStreamReaderWithoutCaching() );

			}

		}
		catch ( java.lang.Exception e )
		{
			throw org.apache.axis2.AxisFault.makeFault( e );
		}
		return null;
	}

}
