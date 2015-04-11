/**
 */
package resourcePetriNet.resourcePetriNet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import resourcePetriNet.resourcePetriNet.GenericPlace;
import resourcePetriNet.resourcePetriNet.InputArc;
import resourcePetriNet.resourcePetriNet.OutputArc;
import resourcePetriNet.resourcePetriNet.PetriNet;
import resourcePetriNet.resourcePetriNet.Place;
import resourcePetriNet.resourcePetriNet.Resource;
import resourcePetriNet.resourcePetriNet.Transition;
import resourcePetriNet.resourcePetriNet.resourcePetriNetFactory;
import resourcePetriNet.resourcePetriNet.resourcePetriNetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class resourcePetriNetPackageImpl extends EPackageImpl implements resourcePetriNetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericPlaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see resourcePetriNet.resourcePetriNet.resourcePetriNetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private resourcePetriNetPackageImpl() {
		super(eNS_URI, resourcePetriNetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link resourcePetriNetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static resourcePetriNetPackage init() {
		if (isInited) return (resourcePetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(resourcePetriNetPackage.eNS_URI);

		// Obtain or create and register package
		resourcePetriNetPackageImpl theresourcePetriNetPackage = (resourcePetriNetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof resourcePetriNetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new resourcePetriNetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theresourcePetriNetPackage.createPackageContents();

		// Initialize created meta-data
		theresourcePetriNetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theresourcePetriNetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(resourcePetriNetPackage.eNS_URI, theresourcePetriNetPackage);
		return theresourcePetriNetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Capacity() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNet() {
		return petriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriNet_Name() {
		return (EAttribute)petriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_ContainsGenericPlaces() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_ContainsTransitions() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_ContainsInputArcs() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_ContainsOutputArcs() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputArc() {
		return inputArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputArc_InputArcFromPlace() {
		return (EReference)inputArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputArc_InputArcToTransition() {
		return (EReference)inputArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputArc_Weight() {
		return (EAttribute)inputArcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputArc() {
		return outputArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputArc_OutputArcFromTransition() {
		return (EReference)outputArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputArc_OutputArcToPlace() {
		return (EReference)outputArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputArc_Weight() {
		return (EAttribute)outputArcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericPlace() {
		return genericPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericPlace_Name() {
		return (EAttribute)genericPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericPlace_NumberOfTokens() {
		return (EAttribute)genericPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resourcePetriNetFactory getresourcePetriNetFactory() {
		return (resourcePetriNetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__CAPACITY);

		petriNetEClass = createEClass(PETRI_NET);
		createEAttribute(petriNetEClass, PETRI_NET__NAME);
		createEReference(petriNetEClass, PETRI_NET__CONTAINS_GENERIC_PLACES);
		createEReference(petriNetEClass, PETRI_NET__CONTAINS_TRANSITIONS);
		createEReference(petriNetEClass, PETRI_NET__CONTAINS_INPUT_ARCS);
		createEReference(petriNetEClass, PETRI_NET__CONTAINS_OUTPUT_ARCS);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__NAME);

		inputArcEClass = createEClass(INPUT_ARC);
		createEReference(inputArcEClass, INPUT_ARC__INPUT_ARC_FROM_PLACE);
		createEReference(inputArcEClass, INPUT_ARC__INPUT_ARC_TO_TRANSITION);
		createEAttribute(inputArcEClass, INPUT_ARC__WEIGHT);

		outputArcEClass = createEClass(OUTPUT_ARC);
		createEReference(outputArcEClass, OUTPUT_ARC__OUTPUT_ARC_FROM_TRANSITION);
		createEReference(outputArcEClass, OUTPUT_ARC__OUTPUT_ARC_TO_PLACE);
		createEAttribute(outputArcEClass, OUTPUT_ARC__WEIGHT);

		resourceEClass = createEClass(RESOURCE);

		genericPlaceEClass = createEClass(GENERIC_PLACE);
		createEAttribute(genericPlaceEClass, GENERIC_PLACE__NAME);
		createEAttribute(genericPlaceEClass, GENERIC_PLACE__NUMBER_OF_TOKENS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(this.getGenericPlace());
		resourceEClass.getESuperTypes().add(this.getGenericPlace());

		// Initialize classes, features, and operations; add parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriNetEClass, PetriNet.class, "PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPetriNet_Name(), ecorePackage.getEString(), "name", null, 0, 1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_ContainsGenericPlaces(), this.getGenericPlace(), null, "containsGenericPlaces", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_ContainsTransitions(), this.getTransition(), null, "containsTransitions", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_ContainsInputArcs(), this.getInputArc(), null, "containsInputArcs", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_ContainsOutputArcs(), this.getOutputArc(), null, "containsOutputArcs", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputArcEClass, InputArc.class, "InputArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputArc_InputArcFromPlace(), this.getGenericPlace(), null, "InputArcFromPlace", null, 0, 1, InputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputArc_InputArcToTransition(), this.getTransition(), null, "InputArcToTransition", null, 0, 1, InputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputArc_Weight(), ecorePackage.getEInt(), "weight", null, 1, -1, InputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputArcEClass, OutputArc.class, "OutputArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputArc_OutputArcFromTransition(), this.getTransition(), null, "OutputArcFromTransition", null, 0, 1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputArc_OutputArcToPlace(), this.getGenericPlace(), null, "OutputArcToPlace", null, 0, 1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputArc_Weight(), ecorePackage.getEInt(), "weight", null, 1, -1, OutputArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericPlaceEClass, GenericPlace.class, "GenericPlace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericPlace_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericPlace_NumberOfTokens(), ecorePackage.getEInt(), "numberOfTokens", null, 0, 1, GenericPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //resourcePetriNetPackageImpl
