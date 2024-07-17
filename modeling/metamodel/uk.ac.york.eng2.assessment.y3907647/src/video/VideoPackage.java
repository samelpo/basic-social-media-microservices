/**
 */
package video;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see video.VideoFactory
 * @model kind="package"
 * @generated
 */
public interface VideoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "video";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "video";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideoPackage eINSTANCE = video.impl.VideoPackageImpl.init();

	/**
	 * The meta object id for the '{@link video.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see video.impl.ModelImpl
	 * @see video.impl.VideoPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MICROSERVICES = 1;

	/**
	 * The feature id for the '<em><b>Event Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EVENT_STREAMS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link video.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see video.impl.EventImpl
	 * @see video.impl.VideoPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link video.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see video.impl.FieldImpl
	 * @see video.impl.VideoPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELD_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link video.impl.EventStreamsImpl <em>Event Streams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see video.impl.EventStreamsImpl
	 * @see video.impl.VideoPackageImpl#getEventStreams()
	 * @generated
	 */
	int EVENT_STREAMS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAMS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Event Associated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAMS__EVENT_ASSOCIATED = 1;

	/**
	 * The number of structural features of the '<em>Event Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link video.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see video.impl.MicroserviceImpl
	 * @see video.impl.VideoPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subbed To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__SUBBED_TO = 1;

	/**
	 * The feature id for the '<em><b>Publishes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PUBLISHES_TO = 2;

	/**
	 * The feature id for the '<em><b>Api Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__API_RESOURCES = 3;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link video.impl.APIResourcesImpl <em>API Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see video.impl.APIResourcesImpl
	 * @see video.impl.VideoPackageImpl#getAPIResources()
	 * @generated
	 */
	int API_RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESOURCES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESOURCES__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESOURCES__PATH = 2;

	/**
	 * The feature id for the '<em><b>Request Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESOURCES__REQUEST_PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Response Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESOURCES__RESPONSE_PARAMETERS = 4;

	/**
	 * The number of structural features of the '<em>API Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESOURCES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>API Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link video.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see video.impl.ResponseImpl
	 * @see video.impl.VideoPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__BODY = 1;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link video.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see video.HttpMethod
	 * @see video.impl.VideoPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 7;


	/**
	 * Returns the meta object for class '{@link video.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see video.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link video.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see video.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link video.Model#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservices</em>'.
	 * @see video.Model#getMicroservices()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Microservices();

	/**
	 * Returns the meta object for the containment reference list '{@link video.Model#getEventStreams <em>Event Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Streams</em>'.
	 * @see video.Model#getEventStreams()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_EventStreams();

	/**
	 * Returns the meta object for class '{@link video.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see video.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link video.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see video.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link video.Event#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see video.Event#getFields()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Fields();

	/**
	 * Returns the meta object for class '{@link video.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see video.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link video.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see video.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link video.Field#getFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Type</em>'.
	 * @see video.Field#getFieldType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_FieldType();

	/**
	 * Returns the meta object for class '{@link video.EventStreams <em>Event Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Streams</em>'.
	 * @see video.EventStreams
	 * @generated
	 */
	EClass getEventStreams();

	/**
	 * Returns the meta object for the attribute '{@link video.EventStreams#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see video.EventStreams#getName()
	 * @see #getEventStreams()
	 * @generated
	 */
	EAttribute getEventStreams_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link video.EventStreams#getEventAssociated <em>Event Associated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Associated</em>'.
	 * @see video.EventStreams#getEventAssociated()
	 * @see #getEventStreams()
	 * @generated
	 */
	EReference getEventStreams_EventAssociated();

	/**
	 * Returns the meta object for class '{@link video.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see video.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link video.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see video.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for the reference list '{@link video.Microservice#getSubbedTo <em>Subbed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subbed To</em>'.
	 * @see video.Microservice#getSubbedTo()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_SubbedTo();

	/**
	 * Returns the meta object for the reference list '{@link video.Microservice#getPublishesTo <em>Publishes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publishes To</em>'.
	 * @see video.Microservice#getPublishesTo()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_PublishesTo();

	/**
	 * Returns the meta object for the containment reference list '{@link video.Microservice#getApiResources <em>Api Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Api Resources</em>'.
	 * @see video.Microservice#getApiResources()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_ApiResources();

	/**
	 * Returns the meta object for class '{@link video.APIResources <em>API Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Resources</em>'.
	 * @see video.APIResources
	 * @generated
	 */
	EClass getAPIResources();

	/**
	 * Returns the meta object for the attribute '{@link video.APIResources#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see video.APIResources#getName()
	 * @see #getAPIResources()
	 * @generated
	 */
	EAttribute getAPIResources_Name();

	/**
	 * Returns the meta object for the attribute '{@link video.APIResources#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see video.APIResources#getMethod()
	 * @see #getAPIResources()
	 * @generated
	 */
	EAttribute getAPIResources_Method();

	/**
	 * Returns the meta object for the attribute '{@link video.APIResources#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see video.APIResources#getPath()
	 * @see #getAPIResources()
	 * @generated
	 */
	EAttribute getAPIResources_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link video.APIResources#getRequestParameters <em>Request Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Parameters</em>'.
	 * @see video.APIResources#getRequestParameters()
	 * @see #getAPIResources()
	 * @generated
	 */
	EReference getAPIResources_RequestParameters();

	/**
	 * Returns the meta object for the containment reference '{@link video.APIResources#getResponseParameters <em>Response Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Parameters</em>'.
	 * @see video.APIResources#getResponseParameters()
	 * @see #getAPIResources()
	 * @generated
	 */
	EReference getAPIResources_ResponseParameters();

	/**
	 * Returns the meta object for class '{@link video.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see video.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link video.Response#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see video.Response#getResponse()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Response();

	/**
	 * Returns the meta object for the containment reference list '{@link video.Response#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see video.Response#getBody()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Body();

	/**
	 * Returns the meta object for enum '{@link video.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see video.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VideoFactory getVideoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link video.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see video.impl.ModelImpl
		 * @see video.impl.VideoPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MICROSERVICES = eINSTANCE.getModel_Microservices();

		/**
		 * The meta object literal for the '<em><b>Event Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__EVENT_STREAMS = eINSTANCE.getModel_EventStreams();

		/**
		 * The meta object literal for the '{@link video.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see video.impl.EventImpl
		 * @see video.impl.VideoPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__FIELDS = eINSTANCE.getEvent_Fields();

		/**
		 * The meta object literal for the '{@link video.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see video.impl.FieldImpl
		 * @see video.impl.VideoPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FIELD_TYPE = eINSTANCE.getField_FieldType();

		/**
		 * The meta object literal for the '{@link video.impl.EventStreamsImpl <em>Event Streams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see video.impl.EventStreamsImpl
		 * @see video.impl.VideoPackageImpl#getEventStreams()
		 * @generated
		 */
		EClass EVENT_STREAMS = eINSTANCE.getEventStreams();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_STREAMS__NAME = eINSTANCE.getEventStreams_Name();

		/**
		 * The meta object literal for the '<em><b>Event Associated</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_STREAMS__EVENT_ASSOCIATED = eINSTANCE.getEventStreams_EventAssociated();

		/**
		 * The meta object literal for the '{@link video.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see video.impl.MicroserviceImpl
		 * @see video.impl.VideoPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
		 * The meta object literal for the '<em><b>Subbed To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__SUBBED_TO = eINSTANCE.getMicroservice_SubbedTo();

		/**
		 * The meta object literal for the '<em><b>Publishes To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__PUBLISHES_TO = eINSTANCE.getMicroservice_PublishesTo();

		/**
		 * The meta object literal for the '<em><b>Api Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__API_RESOURCES = eINSTANCE.getMicroservice_ApiResources();

		/**
		 * The meta object literal for the '{@link video.impl.APIResourcesImpl <em>API Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see video.impl.APIResourcesImpl
		 * @see video.impl.VideoPackageImpl#getAPIResources()
		 * @generated
		 */
		EClass API_RESOURCES = eINSTANCE.getAPIResources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_RESOURCES__NAME = eINSTANCE.getAPIResources_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_RESOURCES__METHOD = eINSTANCE.getAPIResources_Method();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_RESOURCES__PATH = eINSTANCE.getAPIResources_Path();

		/**
		 * The meta object literal for the '<em><b>Request Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_RESOURCES__REQUEST_PARAMETERS = eINSTANCE.getAPIResources_RequestParameters();

		/**
		 * The meta object literal for the '<em><b>Response Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_RESOURCES__RESPONSE_PARAMETERS = eINSTANCE.getAPIResources_ResponseParameters();

		/**
		 * The meta object literal for the '{@link video.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see video.impl.ResponseImpl
		 * @see video.impl.VideoPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__RESPONSE = eINSTANCE.getResponse_Response();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__BODY = eINSTANCE.getResponse_Body();

		/**
		 * The meta object literal for the '{@link video.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see video.HttpMethod
		 * @see video.impl.VideoPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

	}

} //VideoPackage
