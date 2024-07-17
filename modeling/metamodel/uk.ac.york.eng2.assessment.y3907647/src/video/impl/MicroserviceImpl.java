/**
 */
package video.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import video.APIResources;
import video.EventStreams;
import video.Microservice;
import video.VideoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link video.impl.MicroserviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link video.impl.MicroserviceImpl#getSubbedTo <em>Subbed To</em>}</li>
 *   <li>{@link video.impl.MicroserviceImpl#getPublishesTo <em>Publishes To</em>}</li>
 *   <li>{@link video.impl.MicroserviceImpl#getApiResources <em>Api Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubbedTo() <em>Subbed To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubbedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EventStreams> subbedTo;

	/**
	 * The cached value of the '{@link #getPublishesTo() <em>Publishes To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EventStreams> publishesTo;

	/**
	 * The cached value of the '{@link #getApiResources() <em>Api Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiResources()
	 * @generated
	 * @ordered
	 */
	protected EList<APIResources> apiResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoPackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoPackage.MICROSERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventStreams> getSubbedTo() {
		if (subbedTo == null) {
			subbedTo = new EObjectResolvingEList<EventStreams>(EventStreams.class, this, VideoPackage.MICROSERVICE__SUBBED_TO);
		}
		return subbedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventStreams> getPublishesTo() {
		if (publishesTo == null) {
			publishesTo = new EObjectResolvingEList<EventStreams>(EventStreams.class, this, VideoPackage.MICROSERVICE__PUBLISHES_TO);
		}
		return publishesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APIResources> getApiResources() {
		if (apiResources == null) {
			apiResources = new EObjectContainmentEList<APIResources>(APIResources.class, this, VideoPackage.MICROSERVICE__API_RESOURCES);
		}
		return apiResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoPackage.MICROSERVICE__API_RESOURCES:
				return ((InternalEList<?>)getApiResources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoPackage.MICROSERVICE__NAME:
				return getName();
			case VideoPackage.MICROSERVICE__SUBBED_TO:
				return getSubbedTo();
			case VideoPackage.MICROSERVICE__PUBLISHES_TO:
				return getPublishesTo();
			case VideoPackage.MICROSERVICE__API_RESOURCES:
				return getApiResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideoPackage.MICROSERVICE__NAME:
				setName((String)newValue);
				return;
			case VideoPackage.MICROSERVICE__SUBBED_TO:
				getSubbedTo().clear();
				getSubbedTo().addAll((Collection<? extends EventStreams>)newValue);
				return;
			case VideoPackage.MICROSERVICE__PUBLISHES_TO:
				getPublishesTo().clear();
				getPublishesTo().addAll((Collection<? extends EventStreams>)newValue);
				return;
			case VideoPackage.MICROSERVICE__API_RESOURCES:
				getApiResources().clear();
				getApiResources().addAll((Collection<? extends APIResources>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VideoPackage.MICROSERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VideoPackage.MICROSERVICE__SUBBED_TO:
				getSubbedTo().clear();
				return;
			case VideoPackage.MICROSERVICE__PUBLISHES_TO:
				getPublishesTo().clear();
				return;
			case VideoPackage.MICROSERVICE__API_RESOURCES:
				getApiResources().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VideoPackage.MICROSERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VideoPackage.MICROSERVICE__SUBBED_TO:
				return subbedTo != null && !subbedTo.isEmpty();
			case VideoPackage.MICROSERVICE__PUBLISHES_TO:
				return publishesTo != null && !publishesTo.isEmpty();
			case VideoPackage.MICROSERVICE__API_RESOURCES:
				return apiResources != null && !apiResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
