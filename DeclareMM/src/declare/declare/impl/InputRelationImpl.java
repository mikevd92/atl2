/**
 */
package declare.declare.impl;

import declare.declare.Activity;
import declare.declare.InputRelation;
import declare.declare.SpecialConstraint;
import declare.declare.declarePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link declare.declare.impl.InputRelationImpl#getInputRelationFromActivity <em>Input Relation From Activity</em>}</li>
 *   <li>{@link declare.declare.impl.InputRelationImpl#getInputRelationToConstraint <em>Input Relation To Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputRelationImpl extends MinimalEObjectImpl.Container implements InputRelation {
	/**
	 * The cached value of the '{@link #getInputRelationFromActivity() <em>Input Relation From Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRelationFromActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity inputRelationFromActivity;

	/**
	 * The cached value of the '{@link #getInputRelationToConstraint() <em>Input Relation To Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRelationToConstraint()
	 * @generated
	 * @ordered
	 */
	protected SpecialConstraint inputRelationToConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return declarePackage.Literals.INPUT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInputRelationFromActivity() {
		if (inputRelationFromActivity != null && inputRelationFromActivity.eIsProxy()) {
			InternalEObject oldInputRelationFromActivity = (InternalEObject)inputRelationFromActivity;
			inputRelationFromActivity = (Activity)eResolveProxy(oldInputRelationFromActivity);
			if (inputRelationFromActivity != oldInputRelationFromActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, declarePackage.INPUT_RELATION__INPUT_RELATION_FROM_ACTIVITY, oldInputRelationFromActivity, inputRelationFromActivity));
			}
		}
		return inputRelationFromActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetInputRelationFromActivity() {
		return inputRelationFromActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputRelationFromActivity(Activity newInputRelationFromActivity) {
		Activity oldInputRelationFromActivity = inputRelationFromActivity;
		inputRelationFromActivity = newInputRelationFromActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, declarePackage.INPUT_RELATION__INPUT_RELATION_FROM_ACTIVITY, oldInputRelationFromActivity, inputRelationFromActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialConstraint getInputRelationToConstraint() {
		if (inputRelationToConstraint != null && inputRelationToConstraint.eIsProxy()) {
			InternalEObject oldInputRelationToConstraint = (InternalEObject)inputRelationToConstraint;
			inputRelationToConstraint = (SpecialConstraint)eResolveProxy(oldInputRelationToConstraint);
			if (inputRelationToConstraint != oldInputRelationToConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, declarePackage.INPUT_RELATION__INPUT_RELATION_TO_CONSTRAINT, oldInputRelationToConstraint, inputRelationToConstraint));
			}
		}
		return inputRelationToConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialConstraint basicGetInputRelationToConstraint() {
		return inputRelationToConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputRelationToConstraint(SpecialConstraint newInputRelationToConstraint) {
		SpecialConstraint oldInputRelationToConstraint = inputRelationToConstraint;
		inputRelationToConstraint = newInputRelationToConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, declarePackage.INPUT_RELATION__INPUT_RELATION_TO_CONSTRAINT, oldInputRelationToConstraint, inputRelationToConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case declarePackage.INPUT_RELATION__INPUT_RELATION_FROM_ACTIVITY:
				if (resolve) return getInputRelationFromActivity();
				return basicGetInputRelationFromActivity();
			case declarePackage.INPUT_RELATION__INPUT_RELATION_TO_CONSTRAINT:
				if (resolve) return getInputRelationToConstraint();
				return basicGetInputRelationToConstraint();
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
			case declarePackage.INPUT_RELATION__INPUT_RELATION_FROM_ACTIVITY:
				setInputRelationFromActivity((Activity)newValue);
				return;
			case declarePackage.INPUT_RELATION__INPUT_RELATION_TO_CONSTRAINT:
				setInputRelationToConstraint((SpecialConstraint)newValue);
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
			case declarePackage.INPUT_RELATION__INPUT_RELATION_FROM_ACTIVITY:
				setInputRelationFromActivity((Activity)null);
				return;
			case declarePackage.INPUT_RELATION__INPUT_RELATION_TO_CONSTRAINT:
				setInputRelationToConstraint((SpecialConstraint)null);
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
			case declarePackage.INPUT_RELATION__INPUT_RELATION_FROM_ACTIVITY:
				return inputRelationFromActivity != null;
			case declarePackage.INPUT_RELATION__INPUT_RELATION_TO_CONSTRAINT:
				return inputRelationToConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //InputRelationImpl
