/**
 */
package simpleClass.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simpleClass.ClassModel;
import simpleClass.SimpleClassFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassModelTest extends TestCase {

	/**
	 * The fixture for this Class Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassModelTest.class);
	}

	/**
	 * Constructs a new Class Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Class Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ClassModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Class Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassModel getFixture() {
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
		setFixture(SimpleClassFactory.eINSTANCE.createClassModel());
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

} //ClassModelTest
