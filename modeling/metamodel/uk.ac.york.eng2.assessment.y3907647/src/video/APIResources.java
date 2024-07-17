/**
 */
package video;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link video.APIResources#getName <em>Name</em>}</li>
 *   <li>{@link video.APIResources#getMethod <em>Method</em>}</li>
 *   <li>{@link video.APIResources#getPath <em>Path</em>}</li>
 *   <li>{@link video.APIResources#getRequestParameters <em>Request Parameters</em>}</li>
 *   <li>{@link video.APIResources#getResponseParameters <em>Response Parameters</em>}</li>
 * </ul>
 *
 * @see video.VideoPackage#getAPIResources()
 * @model
 * @generated
 */
public interface APIResources extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see video.VideoPackage#getAPIResources_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link video.APIResources#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link video.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see video.HttpMethod
	 * @see #setMethod(HttpMethod)
	 * @see video.VideoPackage#getAPIResources_Method()
	 * @model
	 * @generated
	 */
	HttpMethod getMethod();

	/**
	 * Sets the value of the '{@link video.APIResources#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see video.HttpMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see video.VideoPackage#getAPIResources_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link video.APIResources#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Request Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link video.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Parameters</em>' containment reference list.
	 * @see video.VideoPackage#getAPIResources_RequestParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getRequestParameters();

	/**
	 * Returns the value of the '<em><b>Response Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Parameters</em>' containment reference.
	 * @see #setResponseParameters(Response)
	 * @see video.VideoPackage#getAPIResources_ResponseParameters()
	 * @model containment="true"
	 * @generated
	 */
	Response getResponseParameters();

	/**
	 * Sets the value of the '{@link video.APIResources#getResponseParameters <em>Response Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Parameters</em>' containment reference.
	 * @see #getResponseParameters()
	 * @generated
	 */
	void setResponseParameters(Response value);

} // APIResources
