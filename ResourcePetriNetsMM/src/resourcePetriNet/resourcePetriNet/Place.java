/**
 */
package resourcePetriNet.resourcePetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link resourcePetriNet.resourcePetriNet.Place#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends GenericPlace {
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
	 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#getPlace_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link resourcePetriNet.resourcePetriNet.Place#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Place
