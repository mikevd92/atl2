/**
 */
package resourcePetriNet.resourcePetriNet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import resourcePetriNet.resourcePetriNet.OutputArc;
import resourcePetriNet.resourcePetriNet.resourcePetriNetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Arc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputArcTest extends TestCase {

	/**
	 * The fixture for this Output Arc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputArc fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputArcTest.class);
	}

	/**
	 * Constructs a new Output Arc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputArcTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Output Arc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OutputArc fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Output Arc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputArc getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(resourcePetriNetFactory.eINSTANCE.createOutputArc());
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

} //OutputArcTest
