/**
 */
package video;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Streams</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link video.EventStreams#getName <em>Name</em>}</li>
 *   <li>{@link video.EventStreams#getEventAssociated <em>Event Associated</em>}</li>
 * </ul>
 *
 * @see video.VideoPackage#getEventStreams()
 * @model
 * @generated
 */
public interface EventStreams extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see video.VideoPackage#getEventStreams_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link video.EventStreams#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Event Associated</b></em>' containment reference list.
	 * The list contents are of type {@link video.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Associated</em>' containment reference list.
	 * @see video.VideoPackage#getEventStreams_EventAssociated()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEventAssociated();

} // EventStreams
