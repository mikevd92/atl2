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
 *   <li>{@link declare.declare.Declare#getContainsInputRelations <em>Contains Input Relations</em>}</li>
 *   <li>{@link declare.declare.Declare#getContainsOutputRelations <em>Contains Output Relations</em>}</li>
 *   <li>{@link declare.declare.Declare#getContainsSpecialConstraints <em>Contains Special Constraints</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Contains Input Relations</b></em>' containment reference list.
	 * The list contents are of type {@link declare.declare.InputRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Input Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Input Relations</em>' containment reference list.
	 * @see declare.declare.declarePackage#getDeclare_ContainsInputRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputRelation> getContainsInputRelations();

	/**
	 * Returns the value of the '<em><b>Contains Output Relations</b></em>' containment reference list.
	 * The list contents are of type {@link declare.declare.OutputRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Output Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Output Relations</em>' containment reference list.
	 * @see declare.declare.declarePackage#getDeclare_ContainsOutputRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputRelation> getContainsOutputRelations();

	/**
	 * Returns the value of the '<em><b>Contains Special Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link declare.declare.SpecialConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Special Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Special Constraints</em>' containment reference list.
	 * @see declare.declare.declarePackage#getDeclare_ContainsSpecialConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecialConstraint> getContainsSpecialConstraints();

} // Declare
