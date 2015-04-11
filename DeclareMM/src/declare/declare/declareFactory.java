/**
 */
package declare.declare;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see declare.declare.declarePackage
 * @generated
 */
public interface declareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	declareFactory eINSTANCE = declare.declare.impl.declareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Declare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare</em>'.
	 * @generated
	 */
	Declare createDeclare();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Responded Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responded Existence</em>'.
	 * @generated
	 */
	RespondedExistence createRespondedExistence();

	/**
	 * Returns a new object of class '<em>Co Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Co Existence</em>'.
	 * @generated
	 */
	CoExistence createCoExistence();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence</em>'.
	 * @generated
	 */
	Precedence createPrecedence();

	/**
	 * Returns a new object of class '<em>Succession</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Succession</em>'.
	 * @generated
	 */
	Succession createSuccession();

	/**
	 * Returns a new object of class '<em>Alternate Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternate Response</em>'.
	 * @generated
	 */
	AlternateResponse createAlternateResponse();

	/**
	 * Returns a new object of class '<em>Alternate Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternate Precedence</em>'.
	 * @generated
	 */
	AlternatePrecedence createAlternatePrecedence();

	/**
	 * Returns a new object of class '<em>Chain Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Response</em>'.
	 * @generated
	 */
	ChainResponse createChainResponse();

	/**
	 * Returns a new object of class '<em>Chain Succession</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Succession</em>'.
	 * @generated
	 */
	ChainSuccession createChainSuccession();

	/**
	 * Returns a new object of class '<em>Chain Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Precedence</em>'.
	 * @generated
	 */
	ChainPrecedence createChainPrecedence();

	/**
	 * Returns a new object of class '<em>Not Co Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Co Existence</em>'.
	 * @generated
	 */
	NotCoExistence createNotCoExistence();

	/**
	 * Returns a new object of class '<em>Not Responded Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Responded Existence</em>'.
	 * @generated
	 */
	NotRespondedExistence createNotRespondedExistence();

	/**
	 * Returns a new object of class '<em>Not Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Response</em>'.
	 * @generated
	 */
	NotResponse createNotResponse();

	/**
	 * Returns a new object of class '<em>Not Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Precedence</em>'.
	 * @generated
	 */
	NotPrecedence createNotPrecedence();

	/**
	 * Returns a new object of class '<em>Not Succession</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Succession</em>'.
	 * @generated
	 */
	NotSuccession createNotSuccession();

	/**
	 * Returns a new object of class '<em>Not Chain Repsonse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Chain Repsonse</em>'.
	 * @generated
	 */
	NotChainRepsonse createNotChainRepsonse();

	/**
	 * Returns a new object of class '<em>Not Chain Successive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Chain Successive</em>'.
	 * @generated
	 */
	NotChainSuccessive createNotChainSuccessive();

	/**
	 * Returns a new object of class '<em>Not Chain Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Chain Precedence</em>'.
	 * @generated
	 */
	NotChainPrecedence createNotChainPrecedence();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Exclusive Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Choice</em>'.
	 * @generated
	 */
	ExclusiveChoice createExclusiveChoice();

	/**
	 * Returns a new object of class '<em>Input Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Relation</em>'.
	 * @generated
	 */
	InputRelation createInputRelation();

	/**
	 * Returns a new object of class '<em>Output Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Relation</em>'.
	 * @generated
	 */
	OutputRelation createOutputRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	declarePackage getdeclarePackage();

} //declareFactory
