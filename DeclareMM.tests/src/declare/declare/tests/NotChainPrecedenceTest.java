/**
 */
package declare.declare.tests;

import declare.declare.NotChainPrecedence;
import declare.declare.declareFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Chain Precedence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotChainPrecedenceTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotChainPrecedenceTest.class);
	}

	/**
	 * Constructs a new Not Chain Precedence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotChainPrecedenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Chain Precedence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotChainPrecedence getFixture() {
		return (NotChainPrecedence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(declareFactory.eINSTANCE.createNotChainPrecedence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NotChainPrecedenceTest
