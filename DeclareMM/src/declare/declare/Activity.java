/**
 */
package declare.declare;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link declare.declare.Activity#getName <em>Name</em>}</li>
 *   <li>{@link declare.declare.Activity#getExistenceLabel <em>Existence Label</em>}</li>
 *   <li>{@link declare.declare.Activity#isInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see declare.declare.declarePackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
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
	 * @see declare.declare.declarePackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link declare.declare.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Existence Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existence Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existence Label</em>' attribute.
	 * @see #setExistenceLabel(String)
	 * @see declare.declare.declarePackage#getActivity_ExistenceLabel()
	 * @model
	 * @generated
	 */
	String getExistenceLabel();

	/**
	 * Sets the value of the '{@link declare.declare.Activity#getExistenceLabel <em>Existence Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existence Label</em>' attribute.
	 * @see #getExistenceLabel()
	 * @generated
	 */
	void setExistenceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see declare.declare.declarePackage#getActivity_Init()
	 * @model
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link declare.declare.Activity#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

} // Activity
