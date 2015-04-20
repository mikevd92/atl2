/**
 */
package simpleClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleClass.ClassModel#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link simpleClass.ClassModel#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleClass.SimpleClassPackage#getClassModel()
 * @model
 * @generated
 */
public interface ClassModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link simpleClass.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see simpleClass.SimpleClassPackage#getClassModel_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getClassifiers();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link simpleClass.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see simpleClass.SimpleClassPackage#getClassModel_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

} // ClassModel
