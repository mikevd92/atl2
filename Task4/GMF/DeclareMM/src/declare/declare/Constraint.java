/**
 */
package declare.declare;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link declare.declare.Constraint#getLabel <em>Label</em>}</li>
 *   <li>{@link declare.declare.Constraint#getToActivity <em>To Activity</em>}</li>
 *   <li>{@link declare.declare.Constraint#getFromActivity <em>From Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see declare.declare.declarePackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see declare.declare.declarePackage#getConstraint_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link declare.declare.Constraint#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>To Activity</b></em>' reference list.
	 * The list contents are of type {@link declare.declare.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Activity</em>' reference list.
	 * @see declare.declare.declarePackage#getConstraint_ToActivity()
	 * @model
	 * @generated
	 */
	EList<Activity> getToActivity();

	/**
	 * Returns the value of the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Activity</em>' reference.
	 * @see #setFromActivity(Activity)
	 * @see declare.declare.declarePackage#getConstraint_FromActivity()
	 * @model
	 * @generated
	 */
	Activity getFromActivity();

	/**
	 * Sets the value of the '{@link declare.declare.Constraint#getFromActivity <em>From Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Activity</em>' reference.
	 * @see #getFromActivity()
	 * @generated
	 */
	void setFromActivity(Activity value);

} // Constraint
