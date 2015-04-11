/**
 */
package resourcePetriNet.impl;

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

import resourcePetriNet.GenericPlace;
import resourcePetriNet.InputArc;
import resourcePetriNet.OutputArc;
import resourcePetriNet.PetriNet;
import resourcePetriNet.ResourcePetriNetPackage;
import resourcePetriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link resourcePetriNet.impl.PetriNetImpl#getName <em>Name</em>}</li>
 *   <li>{@link resourcePetriNet.impl.PetriNetImpl#getContainsGenericPlaces <em>Contains Generic Places</em>}</li>
 *   <li>{@link resourcePetriNet.impl.PetriNetImpl#getContainsTransitions <em>Contains Transitions</em>}</li>
 *   <li>{@link resourcePetriNet.impl.PetriNetImpl#getContainsInputArcs <em>Contains Input Arcs</em>}</li>
 *   <li>{@link resourcePetriNet.impl.PetriNetImpl#getContainsOutputArcs <em>Contains Output Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetImpl extends MinimalEObjectImpl.Container implements PetriNet {
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
	 * The cached value of the '{@link #getContainsGenericPlaces() <em>Contains Generic Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsGenericPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericPlace> containsGenericPlaces;

	/**
	 * The cached value of the '{@link #getContainsTransitions() <em>Contains Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> containsTransitions;

	/**
	 * The cached value of the '{@link #getContainsInputArcs() <em>Contains Input Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsInputArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputArc> containsInputArcs;

	/**
	 * The cached value of the '{@link #getContainsOutputArcs() <em>Contains Output Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsOutputArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputArc> containsOutputArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePetriNetPackage.Literals.PETRI_NET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePetriNetPackage.PETRI_NET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericPlace> getContainsGenericPlaces() {
		if (containsGenericPlaces == null) {
			containsGenericPlaces = new EObjectContainmentEList<GenericPlace>(GenericPlace.class, this, ResourcePetriNetPackage.PETRI_NET__CONTAINS_GENERIC_PLACES);
		}
		return containsGenericPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getContainsTransitions() {
		if (containsTransitions == null) {
			containsTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, ResourcePetriNetPackage.PETRI_NET__CONTAINS_TRANSITIONS);
		}
		return containsTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputArc> getContainsInputArcs() {
		if (containsInputArcs == null) {
			containsInputArcs = new EObjectContainmentEList<InputArc>(InputArc.class, this, ResourcePetriNetPackage.PETRI_NET__CONTAINS_INPUT_ARCS);
		}
		return containsInputArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputArc> getContainsOutputArcs() {
		if (containsOutputArcs == null) {
			containsOutputArcs = new EObjectContainmentEList<OutputArc>(OutputArc.class, this, ResourcePetriNetPackage.PETRI_NET__CONTAINS_OUTPUT_ARCS);
		}
		return containsOutputArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_GENERIC_PLACES:
				return ((InternalEList<?>)getContainsGenericPlaces()).basicRemove(otherEnd, msgs);
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_TRANSITIONS:
				return ((InternalEList<?>)getContainsTransitions()).basicRemove(otherEnd, msgs);
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_INPUT_ARCS:
				return ((InternalEList<?>)getContainsInputArcs()).basicRemove(otherEnd, msgs);
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_OUTPUT_ARCS:
				return ((InternalEList<?>)getContainsOutputArcs()).basicRemove(otherEnd, msgs);
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
			case ResourcePetriNetPackage.PETRI_NET__NAME:
				return getName();
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_GENERIC_PLACES:
				return getContainsGenericPlaces();
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_TRANSITIONS:
				return getContainsTransitions();
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_INPUT_ARCS:
				return getContainsInputArcs();
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_OUTPUT_ARCS:
				return getContainsOutputArcs();
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
			case ResourcePetriNetPackage.PETRI_NET__NAME:
				setName((String)newValue);
				return;
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_GENERIC_PLACES:
				getContainsGenericPlaces().clear();
				getContainsGenericPlaces().addAll((Collection<? extends GenericPlace>)newValue);
				return;
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_TRANSITIONS:
				getContainsTransitions().clear();
				getContainsTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_INPUT_ARCS:
				getContainsInputArcs().clear();
				getContainsInputArcs().addAll((Collection<? extends InputArc>)newValue);
				return;
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_OUTPUT_ARCS:
				getContainsOutputArcs().clear();
				getContainsOutputArcs().addAll((Collection<? extends OutputArc>)newValue);
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
			case ResourcePetriNetPackage.PETRI_NET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_GENERIC_PLACES:
				getContainsGenericPlaces().clear();
				return;
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_TRANSITIONS:
				getContainsTransitions().clear();
				return;
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_INPUT_ARCS:
				getContainsInputArcs().clear();
				return;
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_OUTPUT_ARCS:
				getContainsOutputArcs().clear();
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
			case ResourcePetriNetPackage.PETRI_NET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_GENERIC_PLACES:
				return containsGenericPlaces != null && !containsGenericPlaces.isEmpty();
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_TRANSITIONS:
				return containsTransitions != null && !containsTransitions.isEmpty();
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_INPUT_ARCS:
				return containsInputArcs != null && !containsInputArcs.isEmpty();
			case ResourcePetriNetPackage.PETRI_NET__CONTAINS_OUTPUT_ARCS:
				return containsOutputArcs != null && !containsOutputArcs.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PetriNetImpl
