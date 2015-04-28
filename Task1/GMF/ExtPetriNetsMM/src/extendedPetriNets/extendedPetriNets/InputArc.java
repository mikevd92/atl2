/**
 */
package extendedPetriNets.extendedPetriNets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedPetriNets.extendedPetriNets.InputArc#getInputArcToTransition <em>Input Arc To Transition</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.InputArc#getWeight <em>Weight</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.InputArc#getInputArcFromPlace <em>Input Arc From Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getInputArc()
 * @model
 * @generated
 */
public interface InputArc extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Arc To Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Arc To Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Arc To Transition</em>' reference.
	 * @see #setInputArcToTransition(Transition)
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getInputArc_InputArcToTransition()
	 * @model
	 * @generated
	 */
	Transition getInputArcToTransition();

	/**
	 * Sets the value of the '{@link extendedPetriNets.extendedPetriNets.InputArc#getInputArcToTransition <em>Input Arc To Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Arc To Transition</em>' reference.
	 * @see #getInputArcToTransition()
	 * @generated
	 */
	void setInputArcToTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute list.
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getInputArc_Weight()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getWeight();

	/**
	 * Returns the value of the '<em><b>Input Arc From Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Arc From Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Arc From Place</em>' reference.
	 * @see #setInputArcFromPlace(GenericPlace)
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getInputArc_InputArcFromPlace()
	 * @model
	 * @generated
	 */
	GenericPlace getInputArcFromPlace();

	/**
	 * Sets the value of the '{@link extendedPetriNets.extendedPetriNets.InputArc#getInputArcFromPlace <em>Input Arc From Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Arc From Place</em>' reference.
	 * @see #getInputArcFromPlace()
	 * @generated
	 */
	void setInputArcFromPlace(GenericPlace value);

} // InputArc
