/**
 */
package roleModel;

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
 * @see roleModel.RoleModelFactory
 * @model kind="package"
 * @generated
 */
public interface RoleModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roleModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ResourcePetriNet2ResourceModel/RoleModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roleM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoleModelPackage eINSTANCE = roleModel.impl.RoleModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link roleModel.impl.RoleModelImpl <em>Role Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roleModel.impl.RoleModelImpl
	 * @see roleModel.impl.RoleModelPackageImpl#getRoleModel()
	 * @generated
	 */
	int ROLE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Role Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roleModel.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roleModel.impl.ResourceImpl
	 * @see roleModel.impl.RoleModelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Has Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Nr Of Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NR_OF_RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roleModel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roleModel.impl.TaskImpl
	 * @see roleModel.impl.RoleModelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Has Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Task To Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_TO_TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link roleModel.RoleModel <em>Role Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Model</em>'.
	 * @see roleModel.RoleModel
	 * @generated
	 */
	EClass getRoleModel();

	/**
	 * Returns the meta object for the containment reference list '{@link roleModel.RoleModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see roleModel.RoleModel#getResources()
	 * @see #getRoleModel()
	 * @generated
	 */
	EReference getRoleModel_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link roleModel.RoleModel#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see roleModel.RoleModel#getTasks()
	 * @see #getRoleModel()
	 * @generated
	 */
	EReference getRoleModel_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link roleModel.RoleModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roleModel.RoleModel#getName()
	 * @see #getRoleModel()
	 * @generated
	 */
	EAttribute getRoleModel_Name();

	/**
	 * Returns the meta object for class '{@link roleModel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see roleModel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link roleModel.Resource#getHasTask <em>Has Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Task</em>'.
	 * @see roleModel.Resource#getHasTask()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasTask();

	/**
	 * Returns the meta object for the attribute '{@link roleModel.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roleModel.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link roleModel.Resource#getNrOfResources <em>Nr Of Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Resources</em>'.
	 * @see roleModel.Resource#getNrOfResources()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_NrOfResources();

	/**
	 * Returns the meta object for class '{@link roleModel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see roleModel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link roleModel.Task#getHasResource <em>Has Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Resource</em>'.
	 * @see roleModel.Task#getHasResource()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasResource();

	/**
	 * Returns the meta object for the reference list '{@link roleModel.Task#getTaskToTask <em>Task To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task To Task</em>'.
	 * @see roleModel.Task#getTaskToTask()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_TaskToTask();

	/**
	 * Returns the meta object for the attribute '{@link roleModel.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roleModel.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoleModelFactory getRoleModelFactory();

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
		 * The meta object literal for the '{@link roleModel.impl.RoleModelImpl <em>Role Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roleModel.impl.RoleModelImpl
		 * @see roleModel.impl.RoleModelPackageImpl#getRoleModel()
		 * @generated
		 */
		EClass ROLE_MODEL = eINSTANCE.getRoleModel();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODEL__RESOURCES = eINSTANCE.getRoleModel_Resources();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_MODEL__TASKS = eINSTANCE.getRoleModel_Tasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_MODEL__NAME = eINSTANCE.getRoleModel_Name();

		/**
		 * The meta object literal for the '{@link roleModel.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roleModel.impl.ResourceImpl
		 * @see roleModel.impl.RoleModelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Has Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_TASK = eINSTANCE.getResource_HasTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Nr Of Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NR_OF_RESOURCES = eINSTANCE.getResource_NrOfResources();

		/**
		 * The meta object literal for the '{@link roleModel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roleModel.impl.TaskImpl
		 * @see roleModel.impl.RoleModelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Has Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_RESOURCE = eINSTANCE.getTask_HasResource();

		/**
		 * The meta object literal for the '<em><b>Task To Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASK_TO_TASK = eINSTANCE.getTask_TaskToTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

	}

} //RoleModelPackage
