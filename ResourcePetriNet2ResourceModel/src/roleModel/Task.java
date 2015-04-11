/**
 */
package roleModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roleModel.Task#getHasResource <em>Has Resource</em>}</li>
 *   <li>{@link roleModel.Task#getTaskToTask <em>Task To Task</em>}</li>
 *   <li>{@link roleModel.Task#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see roleModel.RoleModelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Resource</b></em>' reference list.
	 * The list contents are of type {@link roleModel.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource</em>' reference list.
	 * @see roleModel.RoleModelPackage#getTask_HasResource()
	 * @model
	 * @generated
	 */
	EList<Resource> getHasResource();

	/**
	 * Returns the value of the '<em><b>Task To Task</b></em>' reference list.
	 * The list contents are of type {@link roleModel.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task To Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task To Task</em>' reference list.
	 * @see roleModel.RoleModelPackage#getTask_TaskToTask()
	 * @model
	 * @generated
	 */
	EList<Task> getTaskToTask();

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
	 * @see roleModel.RoleModelPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link roleModel.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Task
