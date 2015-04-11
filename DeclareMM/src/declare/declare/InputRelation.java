/**
 */
package declare.declare;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link declare.declare.InputRelation#getInputRelationFromActivity <em>Input Relation From Activity</em>}</li>
 *   <li>{@link declare.declare.InputRelation#getInputRelationToConstraint <em>Input Relation To Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see declare.declare.declarePackage#getInputRelation()
 * @model
 * @generated
 */
public interface InputRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Relation From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Relation From Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Relation From Activity</em>' reference.
	 * @see #setInputRelationFromActivity(Activity)
	 * @see declare.declare.declarePackage#getInputRelation_InputRelationFromActivity()
	 * @model
	 * @generated
	 */
	Activity getInputRelationFromActivity();

	/**
	 * Sets the value of the '{@link declare.declare.InputRelation#getInputRelationFromActivity <em>Input Relation From Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Relation From Activity</em>' reference.
	 * @see #getInputRelationFromActivity()
	 * @generated
	 */
	void setInputRelationFromActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Input Relation To Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Relation To Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Relation To Constraint</em>' reference.
	 * @see #setInputRelationToConstraint(SpecialConstraint)
	 * @see declare.declare.declarePackage#getInputRelation_InputRelationToConstraint()
	 * @model
	 * @generated
	 */
	SpecialConstraint getInputRelationToConstraint();

	/**
	 * Sets the value of the '{@link declare.declare.InputRelation#getInputRelationToConstraint <em>Input Relation To Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Relation To Constraint</em>' reference.
	 * @see #getInputRelationToConstraint()
	 * @generated
	 */
	void setInputRelationToConstraint(SpecialConstraint value);

} // InputRelation
