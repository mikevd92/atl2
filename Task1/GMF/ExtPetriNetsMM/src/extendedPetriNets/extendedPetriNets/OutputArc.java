/**
 */
package extendedPetriNets.extendedPetriNets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedPetriNets.extendedPetriNets.OutputArc#getOutputArcFromTransition <em>Output Arc From Transition</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.OutputArc#getWeight <em>Weight</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.OutputArc#getOutputArcToPlace <em>Output Arc To Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getOutputArc()
 * @model
 * @generated
 */
public interface OutputArc extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Arc From Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Arc From Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Arc From Transition</em>' reference.
	 * @see #setOutputArcFromTransition(Transition)
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getOutputArc_OutputArcFromTransition()
	 * @model
	 * @generated
	 */
	Transition getOutputArcFromTransition();

	/**
	 * Sets the value of the '{@link extendedPetriNets.extendedPetriNets.OutputArc#getOutputArcFromTransition <em>Output Arc From Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Arc From Transition</em>' reference.
	 * @see #getOutputArcFromTransition()
	 * @generated
	 */
	void setOutputArcFromTransition(Transition value);

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
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getOutputArc_Weight()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getWeight();

	/**
	 * Returns the value of the '<em><b>Output Arc To Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Arc To Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Arc To Place</em>' reference.
	 * @see #setOutputArcToPlace(GenericPlace)
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getOutputArc_OutputArcToPlace()
	 * @model
	 * @generated
	 */
	GenericPlace getOutputArcToPlace();

	/**
	 * Sets the value of the '{@link extendedPetriNets.extendedPetriNets.OutputArc#getOutputArcToPlace <em>Output Arc To Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Arc To Place</em>' reference.
	 * @see #getOutputArcToPlace()
	 * @generated
	 */
	void setOutputArcToPlace(GenericPlace value);

} // OutputArc
