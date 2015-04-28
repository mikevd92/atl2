/**
 */
package resourcePetriNet;

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
 * @see resourcePetriNet.ResourcePetriNetFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcePetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourcePetriNet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ResourcePetriNetsMM/model/ResourcePetriNets.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resorucePetriNet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcePetriNetPackage eINSTANCE = resourcePetriNet.impl.ResourcePetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link resourcePetriNet.impl.GenericPlaceImpl <em>Generic Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourcePetriNet.impl.GenericPlaceImpl
	 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getGenericPlace()
	 * @generated
	 */
	int GENERIC_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE__NUMBER_OF_TOKENS = 1;

	/**
	 * The number of structural features of the '<em>Generic Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generic Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourcePetriNet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourcePetriNet.impl.PlaceImpl
	 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = GENERIC_PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NUMBER_OF_TOKENS = GENERIC_PLACE__NUMBER_OF_TOKENS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__CAPACITY = GENERIC_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = GENERIC_PLACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = GENERIC_PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resourcePetriNet.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourcePetriNet.impl.PetriNetImpl
	 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains Generic Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__CONTAINS_GENERIC_PLACES = 1;

	/**
	 * The feature id for the '<em><b>Contains Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__CONTAINS_TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Contains Input Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__CONTAINS_INPUT_ARCS = 3;

	/**
	 * The feature id for the '<em><b>Contains Output Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__CONTAINS_OUTPUT_ARCS = 4;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourcePetriNet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourcePetriNet.impl.TransitionImpl
	 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourcePetriNet.impl.InputArcImpl <em>Input Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourcePetriNet.impl.InputArcImpl
	 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getInputArc()
	 * @generated
	 */
	int INPUT_ARC = 3;

	/**
	 * The feature id for the '<em><b>Input Arc From Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__INPUT_ARC_FROM_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Input Arc To Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__INPUT_ARC_TO_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Input Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourcePetriNet.impl.OutputArcImpl <em>Output Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourcePetriNet.impl.OutputArcImpl
	 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getOutputArc()
	 * @generated
	 */
	int OUTPUT_ARC = 4;

	/**
	 * The feature id for the '<em><b>Output Arc From Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Output Arc To Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__OUTPUT_ARC_TO_PLACE = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__WEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Output Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Output Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourcePetriNet.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourcePetriNet.impl.ResourceImpl
	 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = GENERIC_PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NUMBER_OF_TOKENS = GENERIC_PLACE__NUMBER_OF_TOKENS;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = GENERIC_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = GENERIC_PLACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link resourcePetriNet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see resourcePetriNet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link resourcePetriNet.Place#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see resourcePetriNet.Place#getCapacity()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Capacity();

	/**
	 * Returns the meta object for class '{@link resourcePetriNet.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see resourcePetriNet.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the attribute '{@link resourcePetriNet.PetriNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see resourcePetriNet.PetriNet#getName()
	 * @see #getPetriNet()
	 * @generated
	 */
	EAttribute getPetriNet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link resourcePetriNet.PetriNet#getContainsGenericPlaces <em>Contains Generic Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Generic Places</em>'.
	 * @see resourcePetriNet.PetriNet#getContainsGenericPlaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainsGenericPlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link resourcePetriNet.PetriNet#getContainsTransitions <em>Contains Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Transitions</em>'.
	 * @see resourcePetriNet.PetriNet#getContainsTransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainsTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link resourcePetriNet.PetriNet#getContainsInputArcs <em>Contains Input Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Input Arcs</em>'.
	 * @see resourcePetriNet.PetriNet#getContainsInputArcs()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainsInputArcs();

	/**
	 * Returns the meta object for the containment reference list '{@link resourcePetriNet.PetriNet#getContainsOutputArcs <em>Contains Output Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Output Arcs</em>'.
	 * @see resourcePetriNet.PetriNet#getContainsOutputArcs()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainsOutputArcs();

	/**
	 * Returns the meta object for class '{@link resourcePetriNet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see resourcePetriNet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link resourcePetriNet.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see resourcePetriNet.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link resourcePetriNet.InputArc <em>Input Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Arc</em>'.
	 * @see resourcePetriNet.InputArc
	 * @generated
	 */
	EClass getInputArc();

	/**
	 * Returns the meta object for the reference '{@link resourcePetriNet.InputArc#getInputArcFromPlace <em>Input Arc From Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Arc From Place</em>'.
	 * @see resourcePetriNet.InputArc#getInputArcFromPlace()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_InputArcFromPlace();

	/**
	 * Returns the meta object for the reference '{@link resourcePetriNet.InputArc#getInputArcToTransition <em>Input Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Arc To Transition</em>'.
	 * @see resourcePetriNet.InputArc#getInputArcToTransition()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_InputArcToTransition();

	/**
	 * Returns the meta object for the attribute list '{@link resourcePetriNet.InputArc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weight</em>'.
	 * @see resourcePetriNet.InputArc#getWeight()
	 * @see #getInputArc()
	 * @generated
	 */
	EAttribute getInputArc_Weight();

	/**
	 * Returns the meta object for class '{@link resourcePetriNet.OutputArc <em>Output Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Arc</em>'.
	 * @see resourcePetriNet.OutputArc
	 * @generated
	 */
	EClass getOutputArc();

	/**
	 * Returns the meta object for the reference '{@link resourcePetriNet.OutputArc#getOutputArcFromTransition <em>Output Arc From Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Arc From Transition</em>'.
	 * @see resourcePetriNet.OutputArc#getOutputArcFromTransition()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_OutputArcFromTransition();

	/**
	 * Returns the meta object for the reference '{@link resourcePetriNet.OutputArc#getOutputArcToPlace <em>Output Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Arc To Place</em>'.
	 * @see resourcePetriNet.OutputArc#getOutputArcToPlace()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_OutputArcToPlace();

	/**
	 * Returns the meta object for the attribute list '{@link resourcePetriNet.OutputArc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weight</em>'.
	 * @see resourcePetriNet.OutputArc#getWeight()
	 * @see #getOutputArc()
	 * @generated
	 */
	EAttribute getOutputArc_Weight();

	/**
	 * Returns the meta object for class '{@link resourcePetriNet.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see resourcePetriNet.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link resourcePetriNet.GenericPlace <em>Generic Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Place</em>'.
	 * @see resourcePetriNet.GenericPlace
	 * @generated
	 */
	EClass getGenericPlace();

	/**
	 * Returns the meta object for the attribute '{@link resourcePetriNet.GenericPlace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see resourcePetriNet.GenericPlace#getName()
	 * @see #getGenericPlace()
	 * @generated
	 */
	EAttribute getGenericPlace_Name();

	/**
	 * Returns the meta object for the attribute '{@link resourcePetriNet.GenericPlace#getNumberOfTokens <em>Number Of Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Tokens</em>'.
	 * @see resourcePetriNet.GenericPlace#getNumberOfTokens()
	 * @see #getGenericPlace()
	 * @generated
	 */
	EAttribute getGenericPlace_NumberOfTokens();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcePetriNetFactory getResourcePetriNetFactory();

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
		 * The meta object literal for the '{@link resourcePetriNet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourcePetriNet.impl.PlaceImpl
		 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__CAPACITY = eINSTANCE.getPlace_Capacity();

		/**
		 * The meta object literal for the '{@link resourcePetriNet.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourcePetriNet.impl.PetriNetImpl
		 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NET__NAME = eINSTANCE.getPetriNet_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Generic Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__CONTAINS_GENERIC_PLACES = eINSTANCE.getPetriNet_ContainsGenericPlaces();

		/**
		 * The meta object literal for the '<em><b>Contains Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__CONTAINS_TRANSITIONS = eINSTANCE.getPetriNet_ContainsTransitions();

		/**
		 * The meta object literal for the '<em><b>Contains Input Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__CONTAINS_INPUT_ARCS = eINSTANCE.getPetriNet_ContainsInputArcs();

		/**
		 * The meta object literal for the '<em><b>Contains Output Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__CONTAINS_OUTPUT_ARCS = eINSTANCE.getPetriNet_ContainsOutputArcs();

		/**
		 * The meta object literal for the '{@link resourcePetriNet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourcePetriNet.impl.TransitionImpl
		 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link resourcePetriNet.impl.InputArcImpl <em>Input Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourcePetriNet.impl.InputArcImpl
		 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getInputArc()
		 * @generated
		 */
		EClass INPUT_ARC = eINSTANCE.getInputArc();

		/**
		 * The meta object literal for the '<em><b>Input Arc From Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ARC__INPUT_ARC_FROM_PLACE = eINSTANCE.getInputArc_InputArcFromPlace();

		/**
		 * The meta object literal for the '<em><b>Input Arc To Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ARC__INPUT_ARC_TO_TRANSITION = eINSTANCE.getInputArc_InputArcToTransition();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ARC__WEIGHT = eINSTANCE.getInputArc_Weight();

		/**
		 * The meta object literal for the '{@link resourcePetriNet.impl.OutputArcImpl <em>Output Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourcePetriNet.impl.OutputArcImpl
		 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getOutputArc()
		 * @generated
		 */
		EClass OUTPUT_ARC = eINSTANCE.getOutputArc();

		/**
		 * The meta object literal for the '<em><b>Output Arc From Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION = eINSTANCE.getOutputArc_OutputArcFromTransition();

		/**
		 * The meta object literal for the '<em><b>Output Arc To Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ARC__OUTPUT_ARC_TO_PLACE = eINSTANCE.getOutputArc_OutputArcToPlace();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_ARC__WEIGHT = eINSTANCE.getOutputArc_Weight();

		/**
		 * The meta object literal for the '{@link resourcePetriNet.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourcePetriNet.impl.ResourceImpl
		 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link resourcePetriNet.impl.GenericPlaceImpl <em>Generic Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourcePetriNet.impl.GenericPlaceImpl
		 * @see resourcePetriNet.impl.ResourcePetriNetPackageImpl#getGenericPlace()
		 * @generated
		 */
		EClass GENERIC_PLACE = eINSTANCE.getGenericPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PLACE__NAME = eINSTANCE.getGenericPlace_Name();

		/**
		 * The meta object literal for the '<em><b>Number Of Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PLACE__NUMBER_OF_TOKENS = eINSTANCE.getGenericPlace_NumberOfTokens();

	}

} //ResourcePetriNetPackage
