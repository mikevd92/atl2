/**
 */
package declare.declare.impl;

import declare.declare.*;

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
public class declareFactoryImpl extends EFactoryImpl implements declareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static declareFactory init() {
		try {
			declareFactory thedeclareFactory = (declareFactory)EPackage.Registry.INSTANCE.getEFactory(declarePackage.eNS_URI);
			if (thedeclareFactory != null) {
				return thedeclareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new declareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public declareFactoryImpl() {
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
			case declarePackage.DECLARE: return createDeclare();
			case declarePackage.ACTIVITY: return createActivity();
			case declarePackage.RESPONDED_EXISTENCE: return createRespondedExistence();
			case declarePackage.CO_EXISTENCE: return createCoExistence();
			case declarePackage.RESPONSE: return createResponse();
			case declarePackage.PRECEDENCE: return createPrecedence();
			case declarePackage.SUCCESSION: return createSuccession();
			case declarePackage.ALTERNATE_RESPONSE: return createAlternateResponse();
			case declarePackage.ALTERNATE_PRECEDENCE: return createAlternatePrecedence();
			case declarePackage.CHAIN_RESPONSE: return createChainResponse();
			case declarePackage.CHAIN_SUCCESSION: return createChainSuccession();
			case declarePackage.CHAIN_PRECEDENCE: return createChainPrecedence();
			case declarePackage.NOT_CO_EXISTENCE: return createNotCoExistence();
			case declarePackage.NOT_RESPONDED_EXISTENCE: return createNotRespondedExistence();
			case declarePackage.NOT_RESPONSE: return createNotResponse();
			case declarePackage.NOT_PRECEDENCE: return createNotPrecedence();
			case declarePackage.NOT_SUCCESSION: return createNotSuccession();
			case declarePackage.NOT_CHAIN_REPSONSE: return createNotChainRepsonse();
			case declarePackage.NOT_CHAIN_SUCCESSIVE: return createNotChainSuccessive();
			case declarePackage.NOT_CHAIN_PRECEDENCE: return createNotChainPrecedence();
			case declarePackage.CHOICE: return createChoice();
			case declarePackage.EXCLUSIVE_CHOICE: return createExclusiveChoice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declare createDeclare() {
		DeclareImpl declare = new DeclareImpl();
		return declare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondedExistence createRespondedExistence() {
		RespondedExistenceImpl respondedExistence = new RespondedExistenceImpl();
		return respondedExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoExistence createCoExistence() {
		CoExistenceImpl coExistence = new CoExistenceImpl();
		return coExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precedence createPrecedence() {
		PrecedenceImpl precedence = new PrecedenceImpl();
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Succession createSuccession() {
		SuccessionImpl succession = new SuccessionImpl();
		return succession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateResponse createAlternateResponse() {
		AlternateResponseImpl alternateResponse = new AlternateResponseImpl();
		return alternateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternatePrecedence createAlternatePrecedence() {
		AlternatePrecedenceImpl alternatePrecedence = new AlternatePrecedenceImpl();
		return alternatePrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainResponse createChainResponse() {
		ChainResponseImpl chainResponse = new ChainResponseImpl();
		return chainResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainSuccession createChainSuccession() {
		ChainSuccessionImpl chainSuccession = new ChainSuccessionImpl();
		return chainSuccession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainPrecedence createChainPrecedence() {
		ChainPrecedenceImpl chainPrecedence = new ChainPrecedenceImpl();
		return chainPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotCoExistence createNotCoExistence() {
		NotCoExistenceImpl notCoExistence = new NotCoExistenceImpl();
		return notCoExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotRespondedExistence createNotRespondedExistence() {
		NotRespondedExistenceImpl notRespondedExistence = new NotRespondedExistenceImpl();
		return notRespondedExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotResponse createNotResponse() {
		NotResponseImpl notResponse = new NotResponseImpl();
		return notResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotPrecedence createNotPrecedence() {
		NotPrecedenceImpl notPrecedence = new NotPrecedenceImpl();
		return notPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotSuccession createNotSuccession() {
		NotSuccessionImpl notSuccession = new NotSuccessionImpl();
		return notSuccession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotChainRepsonse createNotChainRepsonse() {
		NotChainRepsonseImpl notChainRepsonse = new NotChainRepsonseImpl();
		return notChainRepsonse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotChainSuccessive createNotChainSuccessive() {
		NotChainSuccessiveImpl notChainSuccessive = new NotChainSuccessiveImpl();
		return notChainSuccessive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotChainPrecedence createNotChainPrecedence() {
		NotChainPrecedenceImpl notChainPrecedence = new NotChainPrecedenceImpl();
		return notChainPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveChoice createExclusiveChoice() {
		ExclusiveChoiceImpl exclusiveChoice = new ExclusiveChoiceImpl();
		return exclusiveChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public declarePackage getdeclarePackage() {
		return (declarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static declarePackage getPackage() {
		return declarePackage.eINSTANCE;
	}

} //declareFactoryImpl
