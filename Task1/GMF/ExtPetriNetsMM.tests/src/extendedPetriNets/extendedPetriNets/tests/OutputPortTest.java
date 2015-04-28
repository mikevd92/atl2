/**
 */
package extendedPetriNets.extendedPetriNets.tests;

import extendedPetriNets.extendedPetriNets.OutputPort;
import extendedPetriNets.extendedPetriNets.extendedPetriNetsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputPortTest extends GenericPlaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputPortTest.class);
	}

	/**
	 * Constructs a new Output Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Output Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutputPort getFixture() {
		return (OutputPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(extendedPetriNetsFactory.eINSTANCE.createOutputPort());
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

} //OutputPortTest
