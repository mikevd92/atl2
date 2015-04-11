/**
 */
package resourcePetriNet.resourcePetriNet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import resourcePetriNet.resourcePetriNet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class resourcePetriNetFactoryImpl extends EFactoryImpl implements resourcePetriNetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static resourcePetriNetFactory init() {
		try {
			resourcePetriNetFactory theresourcePetriNetFactory = (resourcePetriNetFactory)EPackage.Registry.INSTANCE.getEFactory(resourcePetriNetPackage.eNS_URI);
			if (theresourcePetriNetFactory != null) {
				return theresourcePetriNetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new resourcePetriNetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resourcePetriNetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case resourcePetriNetPackage.PLACE: return createPlace();
			case resourcePetriNetPackage.PETRI_NET: return createPetriNet();
			case resourcePetriNetPackage.TRANSITION: return createTransition();
			case resourcePetriNetPackage.INPUT_ARC: return createInputArc();
			case resourcePetriNetPackage.OUTPUT_ARC: return createOutputArc();
			case resourcePetriNetPackage.RESOURCE: return createResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet createPetriNet() {
		PetriNetImpl petriNet = new PetriNetImpl();
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputArc createInputArc() {
		InputArcImpl inputArc = new InputArcImpl();
		return inputArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputArc createOutputArc() {
		OutputArcImpl outputArc = new OutputArcImpl();
		return outputArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resourcePetriNetPackage getresourcePetriNetPackage() {
		return (resourcePetriNetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static resourcePetriNetPackage getPackage() {
		return resourcePetriNetPackage.eINSTANCE;
	}

} //resourcePetriNetFactoryImpl
