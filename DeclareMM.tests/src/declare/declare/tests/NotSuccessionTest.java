/**
 */
package declare.declare.tests;

import declare.declare.NotSuccession;
import declare.declare.declareFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Succession</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotSuccessionTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotSuccessionTest.class);
	}

	/**
	 * Constructs a new Not Succession test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotSuccessionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Succession test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotSuccession getFixture() {
		return (NotSuccession)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(declareFactory.eINSTANCE.createNotSuccession());
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

} //NotSuccessionTest
