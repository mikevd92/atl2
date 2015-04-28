/**
 */
package resourcePetriNet.resourcePetriNet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import resourcePetriNet.resourcePetriNet.GenericPlace;
import resourcePetriNet.resourcePetriNet.resourcePetriNetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link resourcePetriNet.resourcePetriNet.impl.GenericPlaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link resourcePetriNet.resourcePetriNet.impl.GenericPlaceImpl#getNumberOfTokens <em>Number Of Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenericPlaceImpl extends MinimalEObjectImpl.Container implements GenericPlace {
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
	 * The default value of the '{@link #getNumberOfTokens() <em>Number Of Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTokens()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TOKENS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfTokens() <em>Number Of Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTokens()
	 * @generated
	 * @ordered
	 */
	protected int numberOfTokens = NUMBER_OF_TOKENS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return resourcePetriNetPackage.Literals.GENERIC_PLACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, resourcePetriNetPackage.GENERIC_PLACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfTokens() {
		return numberOfTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTokens(int newNumberOfTokens) {
		int oldNumberOfTokens = numberOfTokens;
		numberOfTokens = newNumberOfTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resourcePetriNetPackage.GENERIC_PLACE__NUMBER_OF_TOKENS, oldNumberOfTokens, numberOfTokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case resourcePetriNetPackage.GENERIC_PLACE__NAME:
				return getName();
			case resourcePetriNetPackage.GENERIC_PLACE__NUMBER_OF_TOKENS:
				return getNumberOfTokens();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case resourcePetriNetPackage.GENERIC_PLACE__NAME:
				setName((String)newValue);
				return;
			case resourcePetriNetPackage.GENERIC_PLACE__NUMBER_OF_TOKENS:
				setNumberOfTokens((Integer)newValue);
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
			case resourcePetriNetPackage.GENERIC_PLACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case resourcePetriNetPackage.GENERIC_PLACE__NUMBER_OF_TOKENS:
				setNumberOfTokens(NUMBER_OF_TOKENS_EDEFAULT);
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
			case resourcePetriNetPackage.GENERIC_PLACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case resourcePetriNetPackage.GENERIC_PLACE__NUMBER_OF_TOKENS:
				return numberOfTokens != NUMBER_OF_TOKENS_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", numberOfTokens: ");
		result.append(numberOfTokens);
		result.append(')');
		return result.toString();
	}

} //GenericPlaceImpl
