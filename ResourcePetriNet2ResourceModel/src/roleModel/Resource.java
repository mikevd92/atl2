/**
 */
package roleModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roleModel.Resource#getHasTask <em>Has Task</em>}</li>
 *   <li>{@link roleModel.Resource#getName <em>Name</em>}</li>
 *   <li>{@link roleModel.Resource#getNrOfResources <em>Nr Of Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see roleModel.RoleModelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Task</b></em>' reference list.
	 * The list contents are of type {@link roleModel.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Task</em>' reference list.
	 * @see roleModel.RoleModelPackage#getResource_HasTask()
	 * @model
	 * @generated
	 */
	EList<Task> getHasTask();

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
	 * @see roleModel.RoleModelPackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link roleModel.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nr Of Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr Of Resources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Resources</em>' attribute.
	 * @see #setNrOfResources(int)
	 * @see roleModel.RoleModelPackage#getResource_NrOfResources()
	 * @model
	 * @generated
	 */
	int getNrOfResources();

	/**
	 * Sets the value of the '{@link roleModel.Resource#getNrOfResources <em>Nr Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Resources</em>' attribute.
	 * @see #getNrOfResources()
	 * @generated
	 */
	void setNrOfResources(int value);

} // Resource
