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
import org.eclipse.emf.ecore.util.InternalEList;

import video.APIResources;
import video.Field;
import video.HttpMethod;
import video.Response;
import video.VideoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link video.impl.APIResourcesImpl#getName <em>Name</em>}</li>
 *   <li>{@link video.impl.APIResourcesImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link video.impl.APIResourcesImpl#getPath <em>Path</em>}</li>
 *   <li>{@link video.impl.APIResourcesImpl#getRequestParameters <em>Request Parameters</em>}</li>
 *   <li>{@link video.impl.APIResourcesImpl#getResponseParameters <em>Response Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIResourcesImpl extends MinimalEObjectImpl.Container implements APIResources {
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
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod METHOD_EDEFAULT = HttpMethod.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestParameters() <em>Request Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> requestParameters;

	/**
	 * The cached value of the '{@link #getResponseParameters() <em>Response Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseParameters()
	 * @generated
	 * @ordered
	 */
	protected Response responseParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoPackage.Literals.API_RESOURCES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoPackage.API_RESOURCES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(HttpMethod newMethod) {
		HttpMethod oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoPackage.API_RESOURCES__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoPackage.API_RESOURCES__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRequestParameters() {
		if (requestParameters == null) {
			requestParameters = new EObjectContainmentEList<Field>(Field.class, this, VideoPackage.API_RESOURCES__REQUEST_PARAMETERS);
		}
		return requestParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response getResponseParameters() {
		return responseParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseParameters(Response newResponseParameters, NotificationChain msgs) {
		Response oldResponseParameters = responseParameters;
		responseParameters = newResponseParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS, oldResponseParameters, newResponseParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseParameters(Response newResponseParameters) {
		if (newResponseParameters != responseParameters) {
			NotificationChain msgs = null;
			if (responseParameters != null)
				msgs = ((InternalEObject)responseParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS, null, msgs);
			if (newResponseParameters != null)
				msgs = ((InternalEObject)newResponseParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS, null, msgs);
			msgs = basicSetResponseParameters(newResponseParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS, newResponseParameters, newResponseParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoPackage.API_RESOURCES__REQUEST_PARAMETERS:
				return ((InternalEList<?>)getRequestParameters()).basicRemove(otherEnd, msgs);
			case VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS:
				return basicSetResponseParameters(null, msgs);
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
			case VideoPackage.API_RESOURCES__NAME:
				return getName();
			case VideoPackage.API_RESOURCES__METHOD:
				return getMethod();
			case VideoPackage.API_RESOURCES__PATH:
				return getPath();
			case VideoPackage.API_RESOURCES__REQUEST_PARAMETERS:
				return getRequestParameters();
			case VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS:
				return getResponseParameters();
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
			case VideoPackage.API_RESOURCES__NAME:
				setName((String)newValue);
				return;
			case VideoPackage.API_RESOURCES__METHOD:
				setMethod((HttpMethod)newValue);
				return;
			case VideoPackage.API_RESOURCES__PATH:
				setPath((String)newValue);
				return;
			case VideoPackage.API_RESOURCES__REQUEST_PARAMETERS:
				getRequestParameters().clear();
				getRequestParameters().addAll((Collection<? extends Field>)newValue);
				return;
			case VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS:
				setResponseParameters((Response)newValue);
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
			case VideoPackage.API_RESOURCES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VideoPackage.API_RESOURCES__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case VideoPackage.API_RESOURCES__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case VideoPackage.API_RESOURCES__REQUEST_PARAMETERS:
				getRequestParameters().clear();
				return;
			case VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS:
				setResponseParameters((Response)null);
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
			case VideoPackage.API_RESOURCES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VideoPackage.API_RESOURCES__METHOD:
				return method != METHOD_EDEFAULT;
			case VideoPackage.API_RESOURCES__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case VideoPackage.API_RESOURCES__REQUEST_PARAMETERS:
				return requestParameters != null && !requestParameters.isEmpty();
			case VideoPackage.API_RESOURCES__RESPONSE_PARAMETERS:
				return responseParameters != null;
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
		result.append(", method: ");
		result.append(method);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //APIResourcesImpl
