/**
 */
package resourcePetriNet.resourcePetriNet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import resourcePetriNet.resourcePetriNet.GenericPlace;
import resourcePetriNet.resourcePetriNet.OutputArc;
import resourcePetriNet.resourcePetriNet.Transition;
import resourcePetriNet.resourcePetriNet.resourcePetriNetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link resourcePetriNet.resourcePetriNet.impl.OutputArcImpl#getOutputArcFromTransition <em>Output Arc From Transition</em>}</li>
 *   <li>{@link resourcePetriNet.resourcePetriNet.impl.OutputArcImpl#getOutputArcToPlace <em>Output Arc To Place</em>}</li>
 *   <li>{@link resourcePetriNet.resourcePetriNet.impl.OutputArcImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputArcImpl extends MinimalEObjectImpl.Container implements OutputArc {
	/**
	 * The cached value of the '{@link #getOutputArcFromTransition() <em>Output Arc From Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputArcFromTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition outputArcFromTransition;

	/**
	 * The cached value of the '{@link #getOutputArcToPlace() <em>Output Arc To Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputArcToPlace()
	 * @generated
	 * @ordered
	 */
	protected GenericPlace outputArcToPlace;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> weight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return resourcePetriNetPackage.Literals.OUTPUT_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOutputArcFromTransition() {
		if (outputArcFromTransition != null && outputArcFromTransition.eIsProxy()) {
			InternalEObject oldOutputArcFromTransition = (InternalEObject)outputArcFromTransition;
			outputArcFromTransition = (Transition)eResolveProxy(oldOutputArcFromTransition);
			if (outputArcFromTransition != oldOutputArcFromTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION, oldOutputArcFromTransition, outputArcFromTransition));
			}
		}
		return outputArcFromTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetOutputArcFromTransition() {
		return outputArcFromTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputArcFromTransition(Transition newOutputArcFromTransition) {
		Transition oldOutputArcFromTransition = outputArcFromTransition;
		outputArcFromTransition = newOutputArcFromTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION, oldOutputArcFromTransition, outputArcFromTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPlace getOutputArcToPlace() {
		if (outputArcToPlace != null && outputArcToPlace.eIsProxy()) {
			InternalEObject oldOutputArcToPlace = (InternalEObject)outputArcToPlace;
			outputArcToPlace = (GenericPlace)eResolveProxy(oldOutputArcToPlace);
			if (outputArcToPlace != oldOutputArcToPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_TO_PLACE, oldOutputArcToPlace, outputArcToPlace));
			}
		}
		return outputArcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPlace basicGetOutputArcToPlace() {
		return outputArcToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputArcToPlace(GenericPlace newOutputArcToPlace) {
		GenericPlace oldOutputArcToPlace = outputArcToPlace;
		outputArcToPlace = newOutputArcToPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_TO_PLACE, oldOutputArcToPlace, outputArcToPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getWeight() {
		if (weight == null) {
			weight = new EDataTypeUniqueEList<Integer>(Integer.class, this, resourcePetriNetPackage.OUTPUT_ARC__WEIGHT);
		}
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION:
				if (resolve) return getOutputArcFromTransition();
				return basicGetOutputArcFromTransition();
			case resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_TO_PLACE:
				if (resolve) return getOutputArcToPlace();
				return basicGetOutputArcToPlace();
			case resourcePetriNetPackage.OUTPUT_ARC__WEIGHT:
				return getWeight();
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
			case resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION:
				setOutputArcFromTransition((Transition)newValue);
				return;
			case resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_TO_PLACE:
				setOutputArcToPlace((GenericPlace)newValue);
				return;
			case resourcePetriNetPackage.OUTPUT_ARC__WEIGHT:
				getWeight().clear();
				getWeight().addAll((Collection<? extends Integer>)newValue);
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
			case resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION:
				setOutputArcFromTransition((Transition)null);
				return;
			case resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_TO_PLACE:
				setOutputArcToPlace((GenericPlace)null);
				return;
			case resourcePetriNetPackage.OUTPUT_ARC__WEIGHT:
				getWeight().clear();
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
			case resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION:
				return outputArcFromTransition != null;
			case resourcePetriNetPackage.OUTPUT_ARC__OUTPUT_ARC_TO_PLACE:
				return outputArcToPlace != null;
			case resourcePetriNetPackage.OUTPUT_ARC__WEIGHT:
				return weight != null && !weight.isEmpty();
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //OutputArcImpl
