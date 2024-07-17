/**
 */
package video;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link video.Microservice#getName <em>Name</em>}</li>
 *   <li>{@link video.Microservice#getSubbedTo <em>Subbed To</em>}</li>
 *   <li>{@link video.Microservice#getPublishesTo <em>Publishes To</em>}</li>
 *   <li>{@link video.Microservice#getApiResources <em>Api Resources</em>}</li>
 * </ul>
 *
 * @see video.VideoPackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see video.VideoPackage#getMicroservice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link video.Microservice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subbed To</b></em>' reference list.
	 * The list contents are of type {@link video.EventStreams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subbed To</em>' reference list.
	 * @see video.VideoPackage#getMicroservice_SubbedTo()
	 * @model
	 * @generated
	 */
	EList<EventStreams> getSubbedTo();

	/**
	 * Returns the value of the '<em><b>Publishes To</b></em>' reference list.
	 * The list contents are of type {@link video.EventStreams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishes To</em>' reference list.
	 * @see video.VideoPackage#getMicroservice_PublishesTo()
	 * @model
	 * @generated
	 */
	EList<EventStreams> getPublishesTo();

	/**
	 * Returns the value of the '<em><b>Api Resources</b></em>' containment reference list.
	 * The list contents are of type {@link video.APIResources}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Resources</em>' containment reference list.
	 * @see video.VideoPackage#getMicroservice_ApiResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<APIResources> getApiResources();

} // Microservice
