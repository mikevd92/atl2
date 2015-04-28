/**
 */
package extendedPetriNets.extendedPetriNets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedPetriNets.extendedPetriNets.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.PetriNet#getContainsGenericPlaces <em>Contains Generic Places</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.PetriNet#getContainsTransitions <em>Contains Transitions</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.PetriNet#getContainsInputArcs <em>Contains Input Arcs</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.PetriNet#getContainsOutputArcs <em>Contains Output Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getPetriNet_Name()
	 * @model derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link extendedPetriNets.extendedPetriNets.PetriNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Generic Places</b></em>' containment reference list.
	 * The list contents are of type {@link extendedPetriNets.extendedPetriNets.GenericPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Generic Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Generic Places</em>' containment reference list.
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getPetriNet_ContainsGenericPlaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericPlace> getContainsGenericPlaces();

	/**
	 * Returns the value of the '<em><b>Contains Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link extendedPetriNets.extendedPetriNets.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Transitions</em>' containment reference list.
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getPetriNet_ContainsTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getContainsTransitions();

	/**
	 * Returns the value of the '<em><b>Contains Input Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link extendedPetriNets.extendedPetriNets.InputArc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Input Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Input Arcs</em>' containment reference list.
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getPetriNet_ContainsInputArcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputArc> getContainsInputArcs();

	/**
	 * Returns the value of the '<em><b>Contains Output Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link extendedPetriNets.extendedPetriNets.OutputArc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Output Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Output Arcs</em>' containment reference list.
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getPetriNet_ContainsOutputArcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputArc> getContainsOutputArcs();

} // PetriNet
