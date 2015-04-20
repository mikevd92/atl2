/**
 */
package simpleClass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleClass.Class#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link simpleClass.Class#getSuper <em>Super</em>}</li>
 *   <li>{@link simpleClass.Class#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleClass.SimpleClassPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see simpleClass.SimpleClassPackage#getClass_Persistent()
	 * @model
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link simpleClass.Class#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(Class)
	 * @see simpleClass.SimpleClassPackage#getClass_Super()
	 * @model
	 * @generated
	 */
	Class getSuper();

	/**
	 * Sets the value of the '{@link simpleClass.Class#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(Class value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link simpleClass.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see simpleClass.SimpleClassPackage#getClass_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Class
