/**
 */
package extendedPetriNets.extendedPetriNets.impl;

import extendedPetriNets.extendedPetriNets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class extendedPetriNetsFactoryImpl extends EFactoryImpl implements extendedPetriNetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static extendedPetriNetsFactory init() {
		try {
			extendedPetriNetsFactory theextendedPetriNetsFactory = (extendedPetriNetsFactory)EPackage.Registry.INSTANCE.getEFactory(extendedPetriNetsPackage.eNS_URI);
			if (theextendedPetriNetsFactory != null) {
				return theextendedPetriNetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new extendedPetriNetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extendedPetriNetsFactoryImpl() {
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
			case extendedPetriNetsPackage.PETRI_NET: return createPetriNet();
			case extendedPetriNetsPackage.PLACE: return createPlace();
			case extendedPetriNetsPackage.TRANSITION: return createTransition();
			case extendedPetriNetsPackage.INPUT_ARC: return createInputArc();
			case extendedPetriNetsPackage.OUTPUT_ARC: return createOutputArc();
			case extendedPetriNetsPackage.OUTPUT_PORT: return createOutputPort();
			case extendedPetriNetsPackage.INPUT_PORT: return createInputPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
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
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extendedPetriNetsPackage getextendedPetriNetsPackage() {
		return (extendedPetriNetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static extendedPetriNetsPackage getPackage() {
		return extendedPetriNetsPackage.eINSTANCE;
	}

} //extendedPetriNetsFactoryImpl
