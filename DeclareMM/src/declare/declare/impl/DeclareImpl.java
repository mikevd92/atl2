/**
 */
package declare.declare.impl;

import declare.declare.Activity;
import declare.declare.Constraint;
import declare.declare.Declare;
import declare.declare.InputRelation;
import declare.declare.OutputRelation;
import declare.declare.SpecialConstraint;
import declare.declare.declarePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link declare.declare.impl.DeclareImpl#getContainsActivities <em>Contains Activities</em>}</li>
 *   <li>{@link declare.declare.impl.DeclareImpl#getContainsConstraints <em>Contains Constraints</em>}</li>
 *   <li>{@link declare.declare.impl.DeclareImpl#getContainsInputRelations <em>Contains Input Relations</em>}</li>
 *   <li>{@link declare.declare.impl.DeclareImpl#getContainsOutputRelations <em>Contains Output Relations</em>}</li>
 *   <li>{@link declare.declare.impl.DeclareImpl#getContainsSpecialConstraints <em>Contains Special Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclareImpl extends MinimalEObjectImpl.Container implements Declare {
	/**
	 * The cached value of the '{@link #getContainsActivities() <em>Contains Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> containsActivities;

	/**
	 * The cached value of the '{@link #getContainsConstraints() <em>Contains Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> containsConstraints;

	/**
	 * The cached value of the '{@link #getContainsInputRelations() <em>Contains Input Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsInputRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<InputRelation> containsInputRelations;

	/**
	 * The cached value of the '{@link #getContainsOutputRelations() <em>Contains Output Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsOutputRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputRelation> containsOutputRelations;

	/**
	 * The cached value of the '{@link #getContainsSpecialConstraints() <em>Contains Special Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSpecialConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecialConstraint> containsSpecialConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return declarePackage.Literals.DECLARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getContainsActivities() {
		if (containsActivities == null) {
			containsActivities = new EObjectContainmentEList<Activity>(Activity.class, this, declarePackage.DECLARE__CONTAINS_ACTIVITIES);
		}
		return containsActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getContainsConstraints() {
		if (containsConstraints == null) {
			containsConstraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, declarePackage.DECLARE__CONTAINS_CONSTRAINTS);
		}
		return containsConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputRelation> getContainsInputRelations() {
		if (containsInputRelations == null) {
			containsInputRelations = new EObjectContainmentEList<InputRelation>(InputRelation.class, this, declarePackage.DECLARE__CONTAINS_INPUT_RELATIONS);
		}
		return containsInputRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputRelation> getContainsOutputRelations() {
		if (containsOutputRelations == null) {
			containsOutputRelations = new EObjectContainmentEList<OutputRelation>(OutputRelation.class, this, declarePackage.DECLARE__CONTAINS_OUTPUT_RELATIONS);
		}
		return containsOutputRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialConstraint> getContainsSpecialConstraints() {
		if (containsSpecialConstraints == null) {
			containsSpecialConstraints = new EObjectContainmentEList<SpecialConstraint>(SpecialConstraint.class, this, declarePackage.DECLARE__CONTAINS_SPECIAL_CONSTRAINTS);
		}
		return containsSpecialConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case declarePackage.DECLARE__CONTAINS_ACTIVITIES:
				return ((InternalEList<?>)getContainsActivities()).basicRemove(otherEnd, msgs);
			case declarePackage.DECLARE__CONTAINS_CONSTRAINTS:
				return ((InternalEList<?>)getContainsConstraints()).basicRemove(otherEnd, msgs);
			case declarePackage.DECLARE__CONTAINS_INPUT_RELATIONS:
				return ((InternalEList<?>)getContainsInputRelations()).basicRemove(otherEnd, msgs);
			case declarePackage.DECLARE__CONTAINS_OUTPUT_RELATIONS:
				return ((InternalEList<?>)getContainsOutputRelations()).basicRemove(otherEnd, msgs);
			case declarePackage.DECLARE__CONTAINS_SPECIAL_CONSTRAINTS:
				return ((InternalEList<?>)getContainsSpecialConstraints()).basicRemove(otherEnd, msgs);
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
			case declarePackage.DECLARE__CONTAINS_ACTIVITIES:
				return getContainsActivities();
			case declarePackage.DECLARE__CONTAINS_CONSTRAINTS:
				return getContainsConstraints();
			case declarePackage.DECLARE__CONTAINS_INPUT_RELATIONS:
				return getContainsInputRelations();
			case declarePackage.DECLARE__CONTAINS_OUTPUT_RELATIONS:
				return getContainsOutputRelations();
			case declarePackage.DECLARE__CONTAINS_SPECIAL_CONSTRAINTS:
				return getContainsSpecialConstraints();
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
			case declarePackage.DECLARE__CONTAINS_ACTIVITIES:
				getContainsActivities().clear();
				getContainsActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case declarePackage.DECLARE__CONTAINS_CONSTRAINTS:
				getContainsConstraints().clear();
				getContainsConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case declarePackage.DECLARE__CONTAINS_INPUT_RELATIONS:
				getContainsInputRelations().clear();
				getContainsInputRelations().addAll((Collection<? extends InputRelation>)newValue);
				return;
			case declarePackage.DECLARE__CONTAINS_OUTPUT_RELATIONS:
				getContainsOutputRelations().clear();
				getContainsOutputRelations().addAll((Collection<? extends OutputRelation>)newValue);
				return;
			case declarePackage.DECLARE__CONTAINS_SPECIAL_CONSTRAINTS:
				getContainsSpecialConstraints().clear();
				getContainsSpecialConstraints().addAll((Collection<? extends SpecialConstraint>)newValue);
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
			case declarePackage.DECLARE__CONTAINS_ACTIVITIES:
				getContainsActivities().clear();
				return;
			case declarePackage.DECLARE__CONTAINS_CONSTRAINTS:
				getContainsConstraints().clear();
				return;
			case declarePackage.DECLARE__CONTAINS_INPUT_RELATIONS:
				getContainsInputRelations().clear();
				return;
			case declarePackage.DECLARE__CONTAINS_OUTPUT_RELATIONS:
				getContainsOutputRelations().clear();
				return;
			case declarePackage.DECLARE__CONTAINS_SPECIAL_CONSTRAINTS:
				getContainsSpecialConstraints().clear();
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
			case declarePackage.DECLARE__CONTAINS_ACTIVITIES:
				return containsActivities != null && !containsActivities.isEmpty();
			case declarePackage.DECLARE__CONTAINS_CONSTRAINTS:
				return containsConstraints != null && !containsConstraints.isEmpty();
			case declarePackage.DECLARE__CONTAINS_INPUT_RELATIONS:
				return containsInputRelations != null && !containsInputRelations.isEmpty();
			case declarePackage.DECLARE__CONTAINS_OUTPUT_RELATIONS:
				return containsOutputRelations != null && !containsOutputRelations.isEmpty();
			case declarePackage.DECLARE__CONTAINS_SPECIAL_CONSTRAINTS:
				return containsSpecialConstraints != null && !containsSpecialConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeclareImpl
