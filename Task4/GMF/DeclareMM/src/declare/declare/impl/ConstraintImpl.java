/**
 */
package declare.declare.impl;

import declare.declare.Activity;
import declare.declare.Constraint;
import declare.declare.declarePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link declare.declare.impl.ConstraintImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link declare.declare.impl.ConstraintImpl#getToActivity <em>To Activity</em>}</li>
 *   <li>{@link declare.declare.impl.ConstraintImpl#getFromActivity <em>From Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToActivity() <em>To Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> toActivity;

	/**
	 * The cached value of the '{@link #getFromActivity() <em>From Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity fromActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return declarePackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, declarePackage.CONSTRAINT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getToActivity() {
		if (toActivity == null) {
			toActivity = new EObjectResolvingEList<Activity>(Activity.class, this, declarePackage.CONSTRAINT__TO_ACTIVITY);
		}
		return toActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getFromActivity() {
		if (fromActivity != null && fromActivity.eIsProxy()) {
			InternalEObject oldFromActivity = (InternalEObject)fromActivity;
			fromActivity = (Activity)eResolveProxy(oldFromActivity);
			if (fromActivity != oldFromActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, declarePackage.CONSTRAINT__FROM_ACTIVITY, oldFromActivity, fromActivity));
			}
		}
		return fromActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetFromActivity() {
		return fromActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromActivity(Activity newFromActivity) {
		Activity oldFromActivity = fromActivity;
		fromActivity = newFromActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, declarePackage.CONSTRAINT__FROM_ACTIVITY, oldFromActivity, fromActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case declarePackage.CONSTRAINT__LABEL:
				return getLabel();
			case declarePackage.CONSTRAINT__TO_ACTIVITY:
				return getToActivity();
			case declarePackage.CONSTRAINT__FROM_ACTIVITY:
				if (resolve) return getFromActivity();
				return basicGetFromActivity();
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
			case declarePackage.CONSTRAINT__LABEL:
				setLabel((String)newValue);
				return;
			case declarePackage.CONSTRAINT__TO_ACTIVITY:
				getToActivity().clear();
				getToActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case declarePackage.CONSTRAINT__FROM_ACTIVITY:
				setFromActivity((Activity)newValue);
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
			case declarePackage.CONSTRAINT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case declarePackage.CONSTRAINT__TO_ACTIVITY:
				getToActivity().clear();
				return;
			case declarePackage.CONSTRAINT__FROM_ACTIVITY:
				setFromActivity((Activity)null);
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
			case declarePackage.CONSTRAINT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case declarePackage.CONSTRAINT__TO_ACTIVITY:
				return toActivity != null && !toActivity.isEmpty();
			case declarePackage.CONSTRAINT__FROM_ACTIVITY:
				return fromActivity != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
