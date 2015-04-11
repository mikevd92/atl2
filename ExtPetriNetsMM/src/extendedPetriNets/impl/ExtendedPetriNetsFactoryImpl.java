/**
 */
package extendedPetriNets.impl;

import extendedPetriNets.*;

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
public class ExtendedPetriNetsFactoryImpl extends EFactoryImpl implements ExtendedPetriNetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtendedPetriNetsFactory init() {
		try {
			ExtendedPetriNetsFactory theExtendedPetriNetsFactory = (ExtendedPetriNetsFactory)EPackage.Registry.INSTANCE.getEFactory(ExtendedPetriNetsPackage.eNS_URI);
			if (theExtendedPetriNetsFactory != null) {
				return theExtendedPetriNetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtendedPetriNetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPetriNetsFactoryImpl() {
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
			case ExtendedPetriNetsPackage.PETRI_NET: return createPetriNet();
			case ExtendedPetriNetsPackage.PLACE: return createPlace();
			case ExtendedPetriNetsPackage.TRANSITION: return createTransition();
			case ExtendedPetriNetsPackage.INPUT_ARC: return createInputArc();
			case ExtendedPetriNetsPackage.OUTPUT_ARC: return createOutputArc();
			case ExtendedPetriNetsPackage.OUTPUT_PORT: return createOutputPort();
			case ExtendedPetriNetsPackage.INPUT_PORT: return createInputPort();
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
	public ExtendedPetriNetsPackage getExtendedPetriNetsPackage() {
		return (ExtendedPetriNetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtendedPetriNetsPackage getPackage() {
		return ExtendedPetriNetsPackage.eINSTANCE;
	}

} //ExtendedPetriNetsFactoryImpl
