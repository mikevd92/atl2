/**
 */
package resourcePetriNet.resourcePetriNet.tests;

import junit.textui.TestRunner;

import resourcePetriNet.resourcePetriNet.Resource;
import resourcePetriNet.resourcePetriNet.resourcePetriNetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceTest extends GenericPlaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceTest.class);
	}

	/**
	 * Constructs a new Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Resource getFixture() {
		return (Resource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(resourcePetriNetFactory.eINSTANCE.createResource());
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

} //ResourceTest
