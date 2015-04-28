/**
 */
package declare.declare;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link declare.declare.Declare#getContainsActivities <em>Contains Activities</em>}</li>
 *   <li>{@link declare.declare.Declare#getContainsConstraints <em>Contains Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see declare.declare.declarePackage#getDeclare()
 * @model
 * @generated
 */
public interface Declare extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Activities</b></em>' containment reference list.
	 * The list contents are of type {@link declare.declare.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Activities</em>' containment reference list.
	 * @see declare.declare.declarePackage#getDeclare_ContainsActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getContainsActivities();

	/**
	 * Returns the value of the '<em><b>Contains Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link declare.declare.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Constraints</em>' containment reference list.
	 * @see declare.declare.declarePackage#getDeclare_ContainsConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getContainsConstraints();

} // Declare
