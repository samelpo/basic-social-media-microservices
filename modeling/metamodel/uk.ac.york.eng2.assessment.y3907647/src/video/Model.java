/**
 */
package video;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link video.Model#getName <em>Name</em>}</li>
 *   <li>{@link video.Model#getMicroservices <em>Microservices</em>}</li>
 *   <li>{@link video.Model#getEventStreams <em>Event Streams</em>}</li>
 * </ul>
 *
 * @see video.VideoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see video.VideoPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link video.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' containment reference list.
	 * The list contents are of type {@link video.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' containment reference list.
	 * @see video.VideoPackage#getModel_Microservices()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

	/**
	 * Returns the value of the '<em><b>Event Streams</b></em>' containment reference list.
	 * The list contents are of type {@link video.EventStreams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Streams</em>' containment reference list.
	 * @see video.VideoPackage#getModel_EventStreams()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventStreams> getEventStreams();

} // Model
