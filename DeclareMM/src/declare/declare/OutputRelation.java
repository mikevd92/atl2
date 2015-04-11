/**
 */
package declare.declare;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link declare.declare.OutputRelation#getOutputRelationToActivity <em>Output Relation To Activity</em>}</li>
 *   <li>{@link declare.declare.OutputRelation#getOutputRelationFromConstraint <em>Output Relation From Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see declare.declare.declarePackage#getOutputRelation()
 * @model
 * @generated
 */
public interface OutputRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Relation To Activity</b></em>' reference list.
	 * The list contents are of type {@link declare.declare.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Relation To Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Relation To Activity</em>' reference list.
	 * @see declare.declare.declarePackage#getOutputRelation_OutputRelationToActivity()
	 * @model
	 * @generated
	 */
	EList<Activity> getOutputRelationToActivity();

	/**
	 * Returns the value of the '<em><b>Output Relation From Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Relation From Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Relation From Constraint</em>' reference.
	 * @see #setOutputRelationFromConstraint(SpecialConstraint)
	 * @see declare.declare.declarePackage#getOutputRelation_OutputRelationFromConstraint()
	 * @model
	 * @generated
	 */
	SpecialConstraint getOutputRelationFromConstraint();

	/**
	 * Sets the value of the '{@link declare.declare.OutputRelation#getOutputRelationFromConstraint <em>Output Relation From Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Relation From Constraint</em>' reference.
	 * @see #getOutputRelationFromConstraint()
	 * @generated
	 */
	void setOutputRelationFromConstraint(SpecialConstraint value);

} // OutputRelation
