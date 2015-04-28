/**
 */
package resourcePetriNet.resourcePetriNet;

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
 *   <li>{@link resourcePetriNet.resourcePetriNet.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link resourcePetriNet.resourcePetriNet.PetriNet#getContainsGenericPlaces <em>Contains Generic Places</em>}</li>
 *   <li>{@link resourcePetriNet.resourcePetriNet.PetriNet#getContainsTransitions <em>Contains Transitions</em>}</li>
 *   <li>{@link resourcePetriNet.resourcePetriNet.PetriNet#getContainsInputArcs <em>Contains Input Arcs</em>}</li>
 *   <li>{@link resourcePetriNet.resourcePetriNet.PetriNet#getContainsOutputArcs <em>Contains Output Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#getPetriNet()
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
	 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#getPetriNet_Name()
	 * @model derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resourcePetriNet.resourcePetriNet.PetriNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Generic Places</b></em>' containment reference list.
	 * The list contents are of type {@link resourcePetriNet.resourcePetriNet.GenericPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Generic Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Generic Places</em>' containment reference list.
	 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#getPetriNet_ContainsGenericPlaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericPlace> getContainsGenericPlaces();

	/**
	 * Returns the value of the '<em><b>Contains Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link resourcePetriNet.resourcePetriNet.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Transitions</em>' containment reference list.
	 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#getPetriNet_ContainsTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getContainsTransitions();

	/**
	 * Returns the value of the '<em><b>Contains Input Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link resourcePetriNet.resourcePetriNet.InputArc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Input Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Input Arcs</em>' containment reference list.
	 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#getPetriNet_ContainsInputArcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputArc> getContainsInputArcs();

	/**
	 * Returns the value of the '<em><b>Contains Output Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link resourcePetriNet.resourcePetriNet.OutputArc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Output Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Output Arcs</em>' containment reference list.
	 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#getPetriNet_ContainsOutputArcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputArc> getContainsOutputArcs();

} // PetriNet
