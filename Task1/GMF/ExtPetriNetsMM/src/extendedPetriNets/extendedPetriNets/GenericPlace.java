/**
 */
package extendedPetriNets.extendedPetriNets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extendedPetriNets.extendedPetriNets.GenericPlace#getName <em>Name</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.GenericPlace#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link extendedPetriNets.extendedPetriNets.GenericPlace#getNumberOfTokens <em>Number Of Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getGenericPlace()
 * @model abstract="true"
 * @generated
 */
public interface GenericPlace extends EObject {
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
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getGenericPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link extendedPetriNets.extendedPetriNets.GenericPlace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getGenericPlace_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link extendedPetriNets.extendedPetriNets.GenericPlace#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Tokens</em>' attribute.
	 * @see #setNumberOfTokens(int)
	 * @see extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage#getGenericPlace_NumberOfTokens()
	 * @model
	 * @generated
	 */
	int getNumberOfTokens();

	/**
	 * Sets the value of the '{@link extendedPetriNets.extendedPetriNets.GenericPlace#getNumberOfTokens <em>Number Of Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Tokens</em>' attribute.
	 * @see #getNumberOfTokens()
	 * @generated
	 */
	void setNumberOfTokens(int value);

} // GenericPlace
