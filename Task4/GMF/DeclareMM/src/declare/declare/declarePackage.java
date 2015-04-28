/**
 */
package declare.declare;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see declare.declare.declareFactory
 * @model kind="package"
 * @generated
 */
public interface declarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declare";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/DeclareMM/model/Declare.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declare";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	declarePackage eINSTANCE = declare.declare.impl.declarePackageImpl.init();

	/**
	 * The meta object id for the '{@link declare.declare.impl.DeclareImpl <em>Declare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.DeclareImpl
	 * @see declare.declare.impl.declarePackageImpl#getDeclare()
	 * @generated
	 */
	int DECLARE = 0;

	/**
	 * The feature id for the '<em><b>Contains Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE__CONTAINS_ACTIVITIES = 0;

	/**
	 * The feature id for the '<em><b>Contains Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE__CONTAINS_CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Declare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Declare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.ActivityImpl
	 * @see declare.declare.impl.declarePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Existence Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXISTENCE_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INIT = 2;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.ConstraintImpl
	 * @see declare.declare.impl.declarePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TO_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__FROM_ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.RespondedExistenceImpl <em>Responded Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.RespondedExistenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getRespondedExistence()
	 * @generated
	 */
	int RESPONDED_EXISTENCE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDED_EXISTENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDED_EXISTENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDED_EXISTENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Responded Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDED_EXISTENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responded Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDED_EXISTENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.CoExistenceImpl <em>Co Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.CoExistenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getCoExistence()
	 * @generated
	 */
	int CO_EXISTENCE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Co Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Co Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_EXISTENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.ResponseImpl
	 * @see declare.declare.impl.declarePackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.PrecedenceImpl <em>Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.PrecedenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getPrecedence()
	 * @generated
	 */
	int PRECEDENCE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.SuccessionImpl <em>Succession</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.SuccessionImpl
	 * @see declare.declare.impl.declarePackageImpl#getSuccession()
	 * @generated
	 */
	int SUCCESSION = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.AlternateResponseImpl <em>Alternate Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.AlternateResponseImpl
	 * @see declare.declare.impl.declarePackageImpl#getAlternateResponse()
	 * @generated
	 */
	int ALTERNATE_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_RESPONSE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_RESPONSE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_RESPONSE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Alternate Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_RESPONSE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternate Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_RESPONSE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.AlternatePrecedenceImpl <em>Alternate Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.AlternatePrecedenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getAlternatePrecedence()
	 * @generated
	 */
	int ALTERNATE_PRECEDENCE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_PRECEDENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_PRECEDENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_PRECEDENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Alternate Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_PRECEDENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternate Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_PRECEDENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.ChainResponseImpl <em>Chain Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.ChainResponseImpl
	 * @see declare.declare.impl.declarePackageImpl#getChainResponse()
	 * @generated
	 */
	int CHAIN_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RESPONSE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RESPONSE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RESPONSE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Chain Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RESPONSE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chain Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_RESPONSE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.ChainSuccessionImpl <em>Chain Succession</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.ChainSuccessionImpl
	 * @see declare.declare.impl.declarePackageImpl#getChainSuccession()
	 * @generated
	 */
	int CHAIN_SUCCESSION = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SUCCESSION__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SUCCESSION__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SUCCESSION__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Chain Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SUCCESSION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chain Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SUCCESSION_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.ChainPrecedenceImpl <em>Chain Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.ChainPrecedenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getChainPrecedence()
	 * @generated
	 */
	int CHAIN_PRECEDENCE = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_PRECEDENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_PRECEDENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_PRECEDENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Chain Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_PRECEDENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chain Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_PRECEDENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.NotCoExistenceImpl <em>Not Co Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.NotCoExistenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getNotCoExistence()
	 * @generated
	 */
	int NOT_CO_EXISTENCE = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CO_EXISTENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CO_EXISTENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CO_EXISTENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Not Co Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CO_EXISTENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Co Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CO_EXISTENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.NotRespondedExistenceImpl <em>Not Responded Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.NotRespondedExistenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getNotRespondedExistence()
	 * @generated
	 */
	int NOT_RESPONDED_EXISTENCE = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONDED_EXISTENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONDED_EXISTENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONDED_EXISTENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Not Responded Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONDED_EXISTENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Responded Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONDED_EXISTENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.NotResponseImpl <em>Not Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.NotResponseImpl
	 * @see declare.declare.impl.declarePackageImpl#getNotResponse()
	 * @generated
	 */
	int NOT_RESPONSE = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONSE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONSE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONSE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Not Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONSE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RESPONSE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.NotPrecedenceImpl <em>Not Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.NotPrecedenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getNotPrecedence()
	 * @generated
	 */
	int NOT_PRECEDENCE = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PRECEDENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PRECEDENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PRECEDENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Not Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PRECEDENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PRECEDENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.NotSuccessionImpl <em>Not Succession</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.NotSuccessionImpl
	 * @see declare.declare.impl.declarePackageImpl#getNotSuccession()
	 * @generated
	 */
	int NOT_SUCCESSION = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SUCCESSION__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SUCCESSION__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SUCCESSION__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Not Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SUCCESSION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SUCCESSION_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.NotChainRepsonseImpl <em>Not Chain Repsonse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.NotChainRepsonseImpl
	 * @see declare.declare.impl.declarePackageImpl#getNotChainRepsonse()
	 * @generated
	 */
	int NOT_CHAIN_REPSONSE = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_REPSONSE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_REPSONSE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_REPSONSE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Not Chain Repsonse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_REPSONSE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Chain Repsonse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_REPSONSE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.NotChainSuccessiveImpl <em>Not Chain Successive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.NotChainSuccessiveImpl
	 * @see declare.declare.impl.declarePackageImpl#getNotChainSuccessive()
	 * @generated
	 */
	int NOT_CHAIN_SUCCESSIVE = 19;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_SUCCESSIVE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_SUCCESSIVE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_SUCCESSIVE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Not Chain Successive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_SUCCESSIVE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Chain Successive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_SUCCESSIVE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.NotChainPrecedenceImpl <em>Not Chain Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.NotChainPrecedenceImpl
	 * @see declare.declare.impl.declarePackageImpl#getNotChainPrecedence()
	 * @generated
	 */
	int NOT_CHAIN_PRECEDENCE = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_PRECEDENCE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_PRECEDENCE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_PRECEDENCE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Not Chain Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_PRECEDENCE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Chain Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CHAIN_PRECEDENCE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.ChoiceImpl
	 * @see declare.declare.impl.declarePackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link declare.declare.impl.ExclusiveChoiceImpl <em>Exclusive Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see declare.declare.impl.ExclusiveChoiceImpl
	 * @see declare.declare.impl.declarePackageImpl#getExclusiveChoice()
	 * @generated
	 */
	int EXCLUSIVE_CHOICE = 22;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE__LABEL = CONSTRAINT__LABEL;

	/**
	 * The feature id for the '<em><b>To Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE__TO_ACTIVITY = CONSTRAINT__TO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>From Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE__FROM_ACTIVITY = CONSTRAINT__FROM_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Exclusive Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusive Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link declare.declare.Declare <em>Declare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare</em>'.
	 * @see declare.declare.Declare
	 * @generated
	 */
	EClass getDeclare();

	/**
	 * Returns the meta object for the containment reference list '{@link declare.declare.Declare#getContainsActivities <em>Contains Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Activities</em>'.
	 * @see declare.declare.Declare#getContainsActivities()
	 * @see #getDeclare()
	 * @generated
	 */
	EReference getDeclare_ContainsActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link declare.declare.Declare#getContainsConstraints <em>Contains Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Constraints</em>'.
	 * @see declare.declare.Declare#getContainsConstraints()
	 * @see #getDeclare()
	 * @generated
	 */
	EReference getDeclare_ContainsConstraints();

	/**
	 * Returns the meta object for class '{@link declare.declare.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see declare.declare.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link declare.declare.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see declare.declare.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link declare.declare.Activity#getExistenceLabel <em>Existence Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existence Label</em>'.
	 * @see declare.declare.Activity#getExistenceLabel()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ExistenceLabel();

	/**
	 * Returns the meta object for the attribute '{@link declare.declare.Activity#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see declare.declare.Activity#isInit()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Init();

	/**
	 * Returns the meta object for class '{@link declare.declare.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see declare.declare.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link declare.declare.Constraint#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see declare.declare.Constraint#getLabel()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Label();

	/**
	 * Returns the meta object for the reference list '{@link declare.declare.Constraint#getToActivity <em>To Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Activity</em>'.
	 * @see declare.declare.Constraint#getToActivity()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ToActivity();

	/**
	 * Returns the meta object for the reference '{@link declare.declare.Constraint#getFromActivity <em>From Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Activity</em>'.
	 * @see declare.declare.Constraint#getFromActivity()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_FromActivity();

	/**
	 * Returns the meta object for class '{@link declare.declare.RespondedExistence <em>Responded Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responded Existence</em>'.
	 * @see declare.declare.RespondedExistence
	 * @generated
	 */
	EClass getRespondedExistence();

	/**
	 * Returns the meta object for class '{@link declare.declare.CoExistence <em>Co Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Co Existence</em>'.
	 * @see declare.declare.CoExistence
	 * @generated
	 */
	EClass getCoExistence();

	/**
	 * Returns the meta object for class '{@link declare.declare.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see declare.declare.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for class '{@link declare.declare.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence</em>'.
	 * @see declare.declare.Precedence
	 * @generated
	 */
	EClass getPrecedence();

	/**
	 * Returns the meta object for class '{@link declare.declare.Succession <em>Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Succession</em>'.
	 * @see declare.declare.Succession
	 * @generated
	 */
	EClass getSuccession();

	/**
	 * Returns the meta object for class '{@link declare.declare.AlternateResponse <em>Alternate Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternate Response</em>'.
	 * @see declare.declare.AlternateResponse
	 * @generated
	 */
	EClass getAlternateResponse();

	/**
	 * Returns the meta object for class '{@link declare.declare.AlternatePrecedence <em>Alternate Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternate Precedence</em>'.
	 * @see declare.declare.AlternatePrecedence
	 * @generated
	 */
	EClass getAlternatePrecedence();

	/**
	 * Returns the meta object for class '{@link declare.declare.ChainResponse <em>Chain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Response</em>'.
	 * @see declare.declare.ChainResponse
	 * @generated
	 */
	EClass getChainResponse();

	/**
	 * Returns the meta object for class '{@link declare.declare.ChainSuccession <em>Chain Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Succession</em>'.
	 * @see declare.declare.ChainSuccession
	 * @generated
	 */
	EClass getChainSuccession();

	/**
	 * Returns the meta object for class '{@link declare.declare.ChainPrecedence <em>Chain Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Precedence</em>'.
	 * @see declare.declare.ChainPrecedence
	 * @generated
	 */
	EClass getChainPrecedence();

	/**
	 * Returns the meta object for class '{@link declare.declare.NotCoExistence <em>Not Co Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Co Existence</em>'.
	 * @see declare.declare.NotCoExistence
	 * @generated
	 */
	EClass getNotCoExistence();

	/**
	 * Returns the meta object for class '{@link declare.declare.NotRespondedExistence <em>Not Responded Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Responded Existence</em>'.
	 * @see declare.declare.NotRespondedExistence
	 * @generated
	 */
	EClass getNotRespondedExistence();

	/**
	 * Returns the meta object for class '{@link declare.declare.NotResponse <em>Not Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Response</em>'.
	 * @see declare.declare.NotResponse
	 * @generated
	 */
	EClass getNotResponse();

	/**
	 * Returns the meta object for class '{@link declare.declare.NotPrecedence <em>Not Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Precedence</em>'.
	 * @see declare.declare.NotPrecedence
	 * @generated
	 */
	EClass getNotPrecedence();

	/**
	 * Returns the meta object for class '{@link declare.declare.NotSuccession <em>Not Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Succession</em>'.
	 * @see declare.declare.NotSuccession
	 * @generated
	 */
	EClass getNotSuccession();

	/**
	 * Returns the meta object for class '{@link declare.declare.NotChainRepsonse <em>Not Chain Repsonse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Chain Repsonse</em>'.
	 * @see declare.declare.NotChainRepsonse
	 * @generated
	 */
	EClass getNotChainRepsonse();

	/**
	 * Returns the meta object for class '{@link declare.declare.NotChainSuccessive <em>Not Chain Successive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Chain Successive</em>'.
	 * @see declare.declare.NotChainSuccessive
	 * @generated
	 */
	EClass getNotChainSuccessive();

	/**
	 * Returns the meta object for class '{@link declare.declare.NotChainPrecedence <em>Not Chain Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Chain Precedence</em>'.
	 * @see declare.declare.NotChainPrecedence
	 * @generated
	 */
	EClass getNotChainPrecedence();

	/**
	 * Returns the meta object for class '{@link declare.declare.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see declare.declare.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link declare.declare.ExclusiveChoice <em>Exclusive Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Choice</em>'.
	 * @see declare.declare.ExclusiveChoice
	 * @generated
	 */
	EClass getExclusiveChoice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	declareFactory getdeclareFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link declare.declare.impl.DeclareImpl <em>Declare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.DeclareImpl
		 * @see declare.declare.impl.declarePackageImpl#getDeclare()
		 * @generated
		 */
		EClass DECLARE = eINSTANCE.getDeclare();

		/**
		 * The meta object literal for the '<em><b>Contains Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE__CONTAINS_ACTIVITIES = eINSTANCE.getDeclare_ContainsActivities();

		/**
		 * The meta object literal for the '<em><b>Contains Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARE__CONTAINS_CONSTRAINTS = eINSTANCE.getDeclare_ContainsConstraints();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.ActivityImpl
		 * @see declare.declare.impl.declarePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Existence Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__EXISTENCE_LABEL = eINSTANCE.getActivity_ExistenceLabel();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__INIT = eINSTANCE.getActivity_Init();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.ConstraintImpl
		 * @see declare.declare.impl.declarePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__LABEL = eINSTANCE.getConstraint_Label();

		/**
		 * The meta object literal for the '<em><b>To Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__TO_ACTIVITY = eINSTANCE.getConstraint_ToActivity();

		/**
		 * The meta object literal for the '<em><b>From Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__FROM_ACTIVITY = eINSTANCE.getConstraint_FromActivity();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.RespondedExistenceImpl <em>Responded Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.RespondedExistenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getRespondedExistence()
		 * @generated
		 */
		EClass RESPONDED_EXISTENCE = eINSTANCE.getRespondedExistence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.CoExistenceImpl <em>Co Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.CoExistenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getCoExistence()
		 * @generated
		 */
		EClass CO_EXISTENCE = eINSTANCE.getCoExistence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.ResponseImpl
		 * @see declare.declare.impl.declarePackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.PrecedenceImpl <em>Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.PrecedenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getPrecedence()
		 * @generated
		 */
		EClass PRECEDENCE = eINSTANCE.getPrecedence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.SuccessionImpl <em>Succession</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.SuccessionImpl
		 * @see declare.declare.impl.declarePackageImpl#getSuccession()
		 * @generated
		 */
		EClass SUCCESSION = eINSTANCE.getSuccession();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.AlternateResponseImpl <em>Alternate Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.AlternateResponseImpl
		 * @see declare.declare.impl.declarePackageImpl#getAlternateResponse()
		 * @generated
		 */
		EClass ALTERNATE_RESPONSE = eINSTANCE.getAlternateResponse();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.AlternatePrecedenceImpl <em>Alternate Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.AlternatePrecedenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getAlternatePrecedence()
		 * @generated
		 */
		EClass ALTERNATE_PRECEDENCE = eINSTANCE.getAlternatePrecedence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.ChainResponseImpl <em>Chain Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.ChainResponseImpl
		 * @see declare.declare.impl.declarePackageImpl#getChainResponse()
		 * @generated
		 */
		EClass CHAIN_RESPONSE = eINSTANCE.getChainResponse();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.ChainSuccessionImpl <em>Chain Succession</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.ChainSuccessionImpl
		 * @see declare.declare.impl.declarePackageImpl#getChainSuccession()
		 * @generated
		 */
		EClass CHAIN_SUCCESSION = eINSTANCE.getChainSuccession();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.ChainPrecedenceImpl <em>Chain Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.ChainPrecedenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getChainPrecedence()
		 * @generated
		 */
		EClass CHAIN_PRECEDENCE = eINSTANCE.getChainPrecedence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.NotCoExistenceImpl <em>Not Co Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.NotCoExistenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getNotCoExistence()
		 * @generated
		 */
		EClass NOT_CO_EXISTENCE = eINSTANCE.getNotCoExistence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.NotRespondedExistenceImpl <em>Not Responded Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.NotRespondedExistenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getNotRespondedExistence()
		 * @generated
		 */
		EClass NOT_RESPONDED_EXISTENCE = eINSTANCE.getNotRespondedExistence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.NotResponseImpl <em>Not Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.NotResponseImpl
		 * @see declare.declare.impl.declarePackageImpl#getNotResponse()
		 * @generated
		 */
		EClass NOT_RESPONSE = eINSTANCE.getNotResponse();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.NotPrecedenceImpl <em>Not Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.NotPrecedenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getNotPrecedence()
		 * @generated
		 */
		EClass NOT_PRECEDENCE = eINSTANCE.getNotPrecedence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.NotSuccessionImpl <em>Not Succession</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.NotSuccessionImpl
		 * @see declare.declare.impl.declarePackageImpl#getNotSuccession()
		 * @generated
		 */
		EClass NOT_SUCCESSION = eINSTANCE.getNotSuccession();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.NotChainRepsonseImpl <em>Not Chain Repsonse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.NotChainRepsonseImpl
		 * @see declare.declare.impl.declarePackageImpl#getNotChainRepsonse()
		 * @generated
		 */
		EClass NOT_CHAIN_REPSONSE = eINSTANCE.getNotChainRepsonse();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.NotChainSuccessiveImpl <em>Not Chain Successive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.NotChainSuccessiveImpl
		 * @see declare.declare.impl.declarePackageImpl#getNotChainSuccessive()
		 * @generated
		 */
		EClass NOT_CHAIN_SUCCESSIVE = eINSTANCE.getNotChainSuccessive();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.NotChainPrecedenceImpl <em>Not Chain Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.NotChainPrecedenceImpl
		 * @see declare.declare.impl.declarePackageImpl#getNotChainPrecedence()
		 * @generated
		 */
		EClass NOT_CHAIN_PRECEDENCE = eINSTANCE.getNotChainPrecedence();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.ChoiceImpl
		 * @see declare.declare.impl.declarePackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link declare.declare.impl.ExclusiveChoiceImpl <em>Exclusive Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see declare.declare.impl.ExclusiveChoiceImpl
		 * @see declare.declare.impl.declarePackageImpl#getExclusiveChoice()
		 * @generated
		 */
		EClass EXCLUSIVE_CHOICE = eINSTANCE.getExclusiveChoice();

	}

} //declarePackage
