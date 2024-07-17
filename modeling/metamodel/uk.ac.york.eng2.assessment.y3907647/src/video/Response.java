/**
 */
package video;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link video.Response#getResponse <em>Response</em>}</li>
 *   <li>{@link video.Response#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see video.VideoPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' attribute.
	 * @see #setResponse(String)
	 * @see video.VideoPackage#getResponse_Response()
	 * @model
	 * @generated
	 */
	String getResponse();

	/**
	 * Sets the value of the '{@link video.Response#getResponse <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' attribute.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link video.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see video.VideoPackage#getResponse_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getBody();

} // Response
