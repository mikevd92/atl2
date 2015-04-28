/**
 */
package declare.declare.impl;

import declare.declare.Activity;
import declare.declare.declarePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link declare.declare.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link declare.declare.impl.ActivityImpl#getExistenceLabel <em>Existence Label</em>}</li>
 *   <li>{@link declare.declare.impl.ActivityImpl#isInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The default value of the '{@link #getExistenceLabel() <em>Existence Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTENCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistenceLabel() <em>Existence Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceLabel()
	 * @generated
	 * @ordered
	 */
	protected String existenceLabel = EXISTENCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return declarePackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, declarePackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExistenceLabel() {
		return existenceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistenceLabel(String newExistenceLabel) {
		String oldExistenceLabel = existenceLabel;
		existenceLabel = newExistenceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, declarePackage.ACTIVITY__EXISTENCE_LABEL, oldExistenceLabel, existenceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, declarePackage.ACTIVITY__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case declarePackage.ACTIVITY__NAME:
				return getName();
			case declarePackage.ACTIVITY__EXISTENCE_LABEL:
				return getExistenceLabel();
			case declarePackage.ACTIVITY__INIT:
				return isInit();
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
			case declarePackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case declarePackage.ACTIVITY__EXISTENCE_LABEL:
				setExistenceLabel((String)newValue);
				return;
			case declarePackage.ACTIVITY__INIT:
				setInit((Boolean)newValue);
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
			case declarePackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case declarePackage.ACTIVITY__EXISTENCE_LABEL:
				setExistenceLabel(EXISTENCE_LABEL_EDEFAULT);
				return;
			case declarePackage.ACTIVITY__INIT:
				setInit(INIT_EDEFAULT);
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
			case declarePackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case declarePackage.ACTIVITY__EXISTENCE_LABEL:
				return EXISTENCE_LABEL_EDEFAULT == null ? existenceLabel != null : !EXISTENCE_LABEL_EDEFAULT.equals(existenceLabel);
			case declarePackage.ACTIVITY__INIT:
				return init != INIT_EDEFAULT;
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
		result.append(", existenceLabel: ");
		result.append(existenceLabel);
		result.append(", init: ");
		result.append(init);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
