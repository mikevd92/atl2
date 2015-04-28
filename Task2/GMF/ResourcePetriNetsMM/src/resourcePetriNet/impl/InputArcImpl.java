/**
 */
package resourcePetriNet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import resourcePetriNet.GenericPlace;
import resourcePetriNet.InputArc;
import resourcePetriNet.ResourcePetriNetPackage;
import resourcePetriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link resourcePetriNet.impl.InputArcImpl#getInputArcFromPlace <em>Input Arc From Place</em>}</li>
 *   <li>{@link resourcePetriNet.impl.InputArcImpl#getInputArcToTransition <em>Input Arc To Transition</em>}</li>
 *   <li>{@link resourcePetriNet.impl.InputArcImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputArcImpl extends MinimalEObjectImpl.Container implements InputArc {
	/**
	 * The cached value of the '{@link #getInputArcFromPlace() <em>Input Arc From Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputArcFromPlace()
	 * @generated
	 * @ordered
	 */
	protected GenericPlace inputArcFromPlace;

	/**
	 * The cached value of the '{@link #getInputArcToTransition() <em>Input Arc To Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputArcToTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition inputArcToTransition;

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
	protected InputArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePetriNetPackage.Literals.INPUT_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPlace getInputArcFromPlace() {
		if (inputArcFromPlace != null && inputArcFromPlace.eIsProxy()) {
			InternalEObject oldInputArcFromPlace = (InternalEObject)inputArcFromPlace;
			inputArcFromPlace = (GenericPlace)eResolveProxy(oldInputArcFromPlace);
			if (inputArcFromPlace != oldInputArcFromPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_FROM_PLACE, oldInputArcFromPlace, inputArcFromPlace));
			}
		}
		return inputArcFromPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPlace basicGetInputArcFromPlace() {
		return inputArcFromPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputArcFromPlace(GenericPlace newInputArcFromPlace) {
		GenericPlace oldInputArcFromPlace = inputArcFromPlace;
		inputArcFromPlace = newInputArcFromPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_FROM_PLACE, oldInputArcFromPlace, inputArcFromPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getInputArcToTransition() {
		if (inputArcToTransition != null && inputArcToTransition.eIsProxy()) {
			InternalEObject oldInputArcToTransition = (InternalEObject)inputArcToTransition;
			inputArcToTransition = (Transition)eResolveProxy(oldInputArcToTransition);
			if (inputArcToTransition != oldInputArcToTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_TO_TRANSITION, oldInputArcToTransition, inputArcToTransition));
			}
		}
		return inputArcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetInputArcToTransition() {
		return inputArcToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputArcToTransition(Transition newInputArcToTransition) {
		Transition oldInputArcToTransition = inputArcToTransition;
		inputArcToTransition = newInputArcToTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_TO_TRANSITION, oldInputArcToTransition, inputArcToTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getWeight() {
		if (weight == null) {
			weight = new EDataTypeUniqueEList<Integer>(Integer.class, this, ResourcePetriNetPackage.INPUT_ARC__WEIGHT);
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
			case ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_FROM_PLACE:
				if (resolve) return getInputArcFromPlace();
				return basicGetInputArcFromPlace();
			case ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_TO_TRANSITION:
				if (resolve) return getInputArcToTransition();
				return basicGetInputArcToTransition();
			case ResourcePetriNetPackage.INPUT_ARC__WEIGHT:
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
			case ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_FROM_PLACE:
				setInputArcFromPlace((GenericPlace)newValue);
				return;
			case ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_TO_TRANSITION:
				setInputArcToTransition((Transition)newValue);
				return;
			case ResourcePetriNetPackage.INPUT_ARC__WEIGHT:
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
			case ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_FROM_PLACE:
				setInputArcFromPlace((GenericPlace)null);
				return;
			case ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_TO_TRANSITION:
				setInputArcToTransition((Transition)null);
				return;
			case ResourcePetriNetPackage.INPUT_ARC__WEIGHT:
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
			case ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_FROM_PLACE:
				return inputArcFromPlace != null;
			case ResourcePetriNetPackage.INPUT_ARC__INPUT_ARC_TO_TRANSITION:
				return inputArcToTransition != null;
			case ResourcePetriNetPackage.INPUT_ARC__WEIGHT:
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

} //InputArcImpl
