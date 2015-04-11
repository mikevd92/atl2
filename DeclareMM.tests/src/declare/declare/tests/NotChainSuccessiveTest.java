/**
 */
package declare.declare.tests;

import declare.declare.NotChainSuccessive;
import declare.declare.declareFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Chain Successive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotChainSuccessiveTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotChainSuccessiveTest.class);
	}

	/**
	 * Constructs a new Not Chain Successive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotChainSuccessiveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Chain Successive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotChainSuccessive getFixture() {
		return (NotChainSuccessive)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(declareFactory.eINSTANCE.createNotChainSuccessive());
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

} //NotChainSuccessiveTest
