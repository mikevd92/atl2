/**
 */
package declare.declare.impl;

import declare.declare.Activity;
import declare.declare.OutputRelation;
import declare.declare.SpecialConstraint;
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
 * An implementation of the model object '<em><b>Output Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link declare.declare.impl.OutputRelationImpl#getOutputRelationToActivity <em>Output Relation To Activity</em>}</li>
 *   <li>{@link declare.declare.impl.OutputRelationImpl#getOutputRelationFromConstraint <em>Output Relation From Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputRelationImpl extends MinimalEObjectImpl.Container implements OutputRelation {
	/**
	 * The cached value of the '{@link #getOutputRelationToActivity() <em>Output Relation To Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRelationToActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> outputRelationToActivity;

	/**
	 * The cached value of the '{@link #getOutputRelationFromConstraint() <em>Output Relation From Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRelationFromConstraint()
	 * @generated
	 * @ordered
	 */
	protected SpecialConstraint outputRelationFromConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return declarePackage.Literals.OUTPUT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getOutputRelationToActivity() {
		if (outputRelationToActivity == null) {
			outputRelationToActivity = new EObjectResolvingEList<Activity>(Activity.class, this, declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_TO_ACTIVITY);
		}
		return outputRelationToActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialConstraint getOutputRelationFromConstraint() {
		if (outputRelationFromConstraint != null && outputRelationFromConstraint.eIsProxy()) {
			InternalEObject oldOutputRelationFromConstraint = (InternalEObject)outputRelationFromConstraint;
			outputRelationFromConstraint = (SpecialConstraint)eResolveProxy(oldOutputRelationFromConstraint);
			if (outputRelationFromConstraint != oldOutputRelationFromConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_FROM_CONSTRAINT, oldOutputRelationFromConstraint, outputRelationFromConstraint));
			}
		}
		return outputRelationFromConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialConstraint basicGetOutputRelationFromConstraint() {
		return outputRelationFromConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputRelationFromConstraint(SpecialConstraint newOutputRelationFromConstraint) {
		SpecialConstraint oldOutputRelationFromConstraint = outputRelationFromConstraint;
		outputRelationFromConstraint = newOutputRelationFromConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_FROM_CONSTRAINT, oldOutputRelationFromConstraint, outputRelationFromConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_TO_ACTIVITY:
				return getOutputRelationToActivity();
			case declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_FROM_CONSTRAINT:
				if (resolve) return getOutputRelationFromConstraint();
				return basicGetOutputRelationFromConstraint();
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
			case declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_TO_ACTIVITY:
				getOutputRelationToActivity().clear();
				getOutputRelationToActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_FROM_CONSTRAINT:
				setOutputRelationFromConstraint((SpecialConstraint)newValue);
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
			case declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_TO_ACTIVITY:
				getOutputRelationToActivity().clear();
				return;
			case declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_FROM_CONSTRAINT:
				setOutputRelationFromConstraint((SpecialConstraint)null);
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
			case declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_TO_ACTIVITY:
				return outputRelationToActivity != null && !outputRelationToActivity.isEmpty();
			case declarePackage.OUTPUT_RELATION__OUTPUT_RELATION_FROM_CONSTRAINT:
				return outputRelationFromConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputRelationImpl
