/**
 */
package extendedPetriNets;

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
 * @see extendedPetriNets.ExtendedPetriNetsFactory
 * @model kind="package"
 * @generated
 */
public interface ExtendedPetriNetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extendedPetriNets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ExtPetriNetsMM/model/ExtPetriNets.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extendedPetriNets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedPetriNetsPackage eINSTANCE = extendedPetriNets.impl.ExtendedPetriNetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link extendedPetriNets.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedPetriNets.impl.PetriNetImpl
	 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 0;

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
	 * The meta object id for the '{@link extendedPetriNets.impl.GenericPlaceImpl <em>Generic Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedPetriNets.impl.GenericPlaceImpl
	 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getGenericPlace()
	 * @generated
	 */
	int GENERIC_PLACE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE__NUMBER_OF_TOKENS = 2;

	/**
	 * The number of structural features of the '<em>Generic Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Generic Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extendedPetriNets.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedPetriNets.impl.PlaceImpl
	 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = GENERIC_PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__CAPACITY = GENERIC_PLACE__CAPACITY;

	/**
	 * The feature id for the '<em><b>Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NUMBER_OF_TOKENS = GENERIC_PLACE__NUMBER_OF_TOKENS;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = GENERIC_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = GENERIC_PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedPetriNets.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedPetriNets.impl.TransitionImpl
	 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getTransition()
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
	 * The meta object id for the '{@link extendedPetriNets.impl.InputArcImpl <em>Input Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedPetriNets.impl.InputArcImpl
	 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getInputArc()
	 * @generated
	 */
	int INPUT_ARC = 3;

	/**
	 * The feature id for the '<em><b>Input Arc To Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__INPUT_ARC_TO_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Input Arc From Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARC__INPUT_ARC_FROM_PLACE = 2;

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
	 * The meta object id for the '{@link extendedPetriNets.impl.OutputArcImpl <em>Output Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedPetriNets.impl.OutputArcImpl
	 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getOutputArc()
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
	 * The feature id for the '<em><b>Weight</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Output Arc To Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ARC__OUTPUT_ARC_TO_PLACE = 2;

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
	 * The meta object id for the '{@link extendedPetriNets.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedPetriNets.impl.OutputPortImpl
	 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = GENERIC_PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CAPACITY = GENERIC_PLACE__CAPACITY;

	/**
	 * The feature id for the '<em><b>Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NUMBER_OF_TOKENS = GENERIC_PLACE__NUMBER_OF_TOKENS;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = GENERIC_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = GENERIC_PLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extendedPetriNets.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extendedPetriNets.impl.InputPortImpl
	 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = GENERIC_PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CAPACITY = GENERIC_PLACE__CAPACITY;

	/**
	 * The feature id for the '<em><b>Number Of Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NUMBER_OF_TOKENS = GENERIC_PLACE__NUMBER_OF_TOKENS;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = GENERIC_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = GENERIC_PLACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link extendedPetriNets.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see extendedPetriNets.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the attribute '{@link extendedPetriNets.PetriNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see extendedPetriNets.PetriNet#getName()
	 * @see #getPetriNet()
	 * @generated
	 */
	EAttribute getPetriNet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link extendedPetriNets.PetriNet#getContainsGenericPlaces <em>Contains Generic Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Generic Places</em>'.
	 * @see extendedPetriNets.PetriNet#getContainsGenericPlaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainsGenericPlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link extendedPetriNets.PetriNet#getContainsTransitions <em>Contains Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Transitions</em>'.
	 * @see extendedPetriNets.PetriNet#getContainsTransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainsTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link extendedPetriNets.PetriNet#getContainsInputArcs <em>Contains Input Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Input Arcs</em>'.
	 * @see extendedPetriNets.PetriNet#getContainsInputArcs()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainsInputArcs();

	/**
	 * Returns the meta object for the containment reference list '{@link extendedPetriNets.PetriNet#getContainsOutputArcs <em>Contains Output Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Output Arcs</em>'.
	 * @see extendedPetriNets.PetriNet#getContainsOutputArcs()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ContainsOutputArcs();

	/**
	 * Returns the meta object for class '{@link extendedPetriNets.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see extendedPetriNets.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for class '{@link extendedPetriNets.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see extendedPetriNets.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link extendedPetriNets.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see extendedPetriNets.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link extendedPetriNets.InputArc <em>Input Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Arc</em>'.
	 * @see extendedPetriNets.InputArc
	 * @generated
	 */
	EClass getInputArc();

	/**
	 * Returns the meta object for the reference '{@link extendedPetriNets.InputArc#getInputArcToTransition <em>Input Arc To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Arc To Transition</em>'.
	 * @see extendedPetriNets.InputArc#getInputArcToTransition()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_InputArcToTransition();

	/**
	 * Returns the meta object for the attribute list '{@link extendedPetriNets.InputArc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weight</em>'.
	 * @see extendedPetriNets.InputArc#getWeight()
	 * @see #getInputArc()
	 * @generated
	 */
	EAttribute getInputArc_Weight();

	/**
	 * Returns the meta object for the reference '{@link extendedPetriNets.InputArc#getInputArcFromPlace <em>Input Arc From Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Arc From Place</em>'.
	 * @see extendedPetriNets.InputArc#getInputArcFromPlace()
	 * @see #getInputArc()
	 * @generated
	 */
	EReference getInputArc_InputArcFromPlace();

	/**
	 * Returns the meta object for class '{@link extendedPetriNets.OutputArc <em>Output Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Arc</em>'.
	 * @see extendedPetriNets.OutputArc
	 * @generated
	 */
	EClass getOutputArc();

	/**
	 * Returns the meta object for the reference '{@link extendedPetriNets.OutputArc#getOutputArcFromTransition <em>Output Arc From Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Arc From Transition</em>'.
	 * @see extendedPetriNets.OutputArc#getOutputArcFromTransition()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_OutputArcFromTransition();

	/**
	 * Returns the meta object for the attribute list '{@link extendedPetriNets.OutputArc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weight</em>'.
	 * @see extendedPetriNets.OutputArc#getWeight()
	 * @see #getOutputArc()
	 * @generated
	 */
	EAttribute getOutputArc_Weight();

	/**
	 * Returns the meta object for the reference '{@link extendedPetriNets.OutputArc#getOutputArcToPlace <em>Output Arc To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Arc To Place</em>'.
	 * @see extendedPetriNets.OutputArc#getOutputArcToPlace()
	 * @see #getOutputArc()
	 * @generated
	 */
	EReference getOutputArc_OutputArcToPlace();

	/**
	 * Returns the meta object for class '{@link extendedPetriNets.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see extendedPetriNets.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for class '{@link extendedPetriNets.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see extendedPetriNets.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for class '{@link extendedPetriNets.GenericPlace <em>Generic Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Place</em>'.
	 * @see extendedPetriNets.GenericPlace
	 * @generated
	 */
	EClass getGenericPlace();

	/**
	 * Returns the meta object for the attribute '{@link extendedPetriNets.GenericPlace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see extendedPetriNets.GenericPlace#getName()
	 * @see #getGenericPlace()
	 * @generated
	 */
	EAttribute getGenericPlace_Name();

	/**
	 * Returns the meta object for the attribute '{@link extendedPetriNets.GenericPlace#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see extendedPetriNets.GenericPlace#getCapacity()
	 * @see #getGenericPlace()
	 * @generated
	 */
	EAttribute getGenericPlace_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link extendedPetriNets.GenericPlace#getNumberOfTokens <em>Number Of Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Tokens</em>'.
	 * @see extendedPetriNets.GenericPlace#getNumberOfTokens()
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
	ExtendedPetriNetsFactory getExtendedPetriNetsFactory();

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
		 * The meta object literal for the '{@link extendedPetriNets.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedPetriNets.impl.PetriNetImpl
		 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getPetriNet()
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
		 * The meta object literal for the '{@link extendedPetriNets.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedPetriNets.impl.PlaceImpl
		 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '{@link extendedPetriNets.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedPetriNets.impl.TransitionImpl
		 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getTransition()
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
		 * The meta object literal for the '{@link extendedPetriNets.impl.InputArcImpl <em>Input Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedPetriNets.impl.InputArcImpl
		 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getInputArc()
		 * @generated
		 */
		EClass INPUT_ARC = eINSTANCE.getInputArc();

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
		 * The meta object literal for the '<em><b>Input Arc From Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ARC__INPUT_ARC_FROM_PLACE = eINSTANCE.getInputArc_InputArcFromPlace();

		/**
		 * The meta object literal for the '{@link extendedPetriNets.impl.OutputArcImpl <em>Output Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedPetriNets.impl.OutputArcImpl
		 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getOutputArc()
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
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_ARC__WEIGHT = eINSTANCE.getOutputArc_Weight();

		/**
		 * The meta object literal for the '<em><b>Output Arc To Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_ARC__OUTPUT_ARC_TO_PLACE = eINSTANCE.getOutputArc_OutputArcToPlace();

		/**
		 * The meta object literal for the '{@link extendedPetriNets.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedPetriNets.impl.OutputPortImpl
		 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '{@link extendedPetriNets.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedPetriNets.impl.InputPortImpl
		 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '{@link extendedPetriNets.impl.GenericPlaceImpl <em>Generic Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extendedPetriNets.impl.GenericPlaceImpl
		 * @see extendedPetriNets.impl.ExtendedPetriNetsPackageImpl#getGenericPlace()
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
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PLACE__CAPACITY = eINSTANCE.getGenericPlace_Capacity();

		/**
		 * The meta object literal for the '<em><b>Number Of Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PLACE__NUMBER_OF_TOKENS = eINSTANCE.getGenericPlace_NumberOfTokens();

	}

} //ExtendedPetriNetsPackage
