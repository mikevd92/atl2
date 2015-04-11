/**
 */
package resourcePetriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link resourcePetriNet.GenericPlace#getName <em>Name</em>}</li>
 *   <li>{@link resourcePetriNet.GenericPlace#getNumberOfTokens <em>Number Of Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see resourcePetriNet.ResourcePetriNetPackage#getGenericPlace()
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
	 * @see resourcePetriNet.ResourcePetriNetPackage#getGenericPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resourcePetriNet.GenericPlace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see resourcePetriNet.ResourcePetriNetPackage#getGenericPlace_NumberOfTokens()
	 * @model
	 * @generated
	 */
	int getNumberOfTokens();

	/**
	 * Sets the value of the '{@link resourcePetriNet.GenericPlace#getNumberOfTokens <em>Number Of Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Tokens</em>' attribute.
	 * @see #getNumberOfTokens()
	 * @generated
	 */
	void setNumberOfTokens(int value);

} // GenericPlace
