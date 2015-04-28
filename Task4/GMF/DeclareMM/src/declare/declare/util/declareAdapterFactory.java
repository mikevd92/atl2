/**
 */
package declare.declare.util;

import declare.declare.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see declare.declare.declarePackage
 * @generated
 */
public class declareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static declarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public declareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = declarePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected declareSwitch<Adapter> modelSwitch =
		new declareSwitch<Adapter>() {
			@Override
			public Adapter caseDeclare(Declare object) {
				return createDeclareAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseRespondedExistence(RespondedExistence object) {
				return createRespondedExistenceAdapter();
			}
			@Override
			public Adapter caseCoExistence(CoExistence object) {
				return createCoExistenceAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter casePrecedence(Precedence object) {
				return createPrecedenceAdapter();
			}
			@Override
			public Adapter caseSuccession(Succession object) {
				return createSuccessionAdapter();
			}
			@Override
			public Adapter caseAlternateResponse(AlternateResponse object) {
				return createAlternateResponseAdapter();
			}
			@Override
			public Adapter caseAlternatePrecedence(AlternatePrecedence object) {
				return createAlternatePrecedenceAdapter();
			}
			@Override
			public Adapter caseChainResponse(ChainResponse object) {
				return createChainResponseAdapter();
			}
			@Override
			public Adapter caseChainSuccession(ChainSuccession object) {
				return createChainSuccessionAdapter();
			}
			@Override
			public Adapter caseChainPrecedence(ChainPrecedence object) {
				return createChainPrecedenceAdapter();
			}
			@Override
			public Adapter caseNotCoExistence(NotCoExistence object) {
				return createNotCoExistenceAdapter();
			}
			@Override
			public Adapter caseNotRespondedExistence(NotRespondedExistence object) {
				return createNotRespondedExistenceAdapter();
			}
			@Override
			public Adapter caseNotResponse(NotResponse object) {
				return createNotResponseAdapter();
			}
			@Override
			public Adapter caseNotPrecedence(NotPrecedence object) {
				return createNotPrecedenceAdapter();
			}
			@Override
			public Adapter caseNotSuccession(NotSuccession object) {
				return createNotSuccessionAdapter();
			}
			@Override
			public Adapter caseNotChainRepsonse(NotChainRepsonse object) {
				return createNotChainRepsonseAdapter();
			}
			@Override
			public Adapter caseNotChainSuccessive(NotChainSuccessive object) {
				return createNotChainSuccessiveAdapter();
			}
			@Override
			public Adapter caseNotChainPrecedence(NotChainPrecedence object) {
				return createNotChainPrecedenceAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseExclusiveChoice(ExclusiveChoice object) {
				return createExclusiveChoiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.Declare <em>Declare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.Declare
	 * @generated
	 */
	public Adapter createDeclareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.RespondedExistence <em>Responded Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.RespondedExistence
	 * @generated
	 */
	public Adapter createRespondedExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.CoExistence <em>Co Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.CoExistence
	 * @generated
	 */
	public Adapter createCoExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.Precedence
	 * @generated
	 */
	public Adapter createPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.Succession <em>Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.Succession
	 * @generated
	 */
	public Adapter createSuccessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.AlternateResponse <em>Alternate Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.AlternateResponse
	 * @generated
	 */
	public Adapter createAlternateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.AlternatePrecedence <em>Alternate Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.AlternatePrecedence
	 * @generated
	 */
	public Adapter createAlternatePrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.ChainResponse <em>Chain Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.ChainResponse
	 * @generated
	 */
	public Adapter createChainResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.ChainSuccession <em>Chain Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.ChainSuccession
	 * @generated
	 */
	public Adapter createChainSuccessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.ChainPrecedence <em>Chain Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.ChainPrecedence
	 * @generated
	 */
	public Adapter createChainPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.NotCoExistence <em>Not Co Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.NotCoExistence
	 * @generated
	 */
	public Adapter createNotCoExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.NotRespondedExistence <em>Not Responded Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.NotRespondedExistence
	 * @generated
	 */
	public Adapter createNotRespondedExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.NotResponse <em>Not Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.NotResponse
	 * @generated
	 */
	public Adapter createNotResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.NotPrecedence <em>Not Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.NotPrecedence
	 * @generated
	 */
	public Adapter createNotPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.NotSuccession <em>Not Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.NotSuccession
	 * @generated
	 */
	public Adapter createNotSuccessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.NotChainRepsonse <em>Not Chain Repsonse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.NotChainRepsonse
	 * @generated
	 */
	public Adapter createNotChainRepsonseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.NotChainSuccessive <em>Not Chain Successive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.NotChainSuccessive
	 * @generated
	 */
	public Adapter createNotChainSuccessiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.NotChainPrecedence <em>Not Chain Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.NotChainPrecedence
	 * @generated
	 */
	public Adapter createNotChainPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link declare.declare.ExclusiveChoice <em>Exclusive Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see declare.declare.ExclusiveChoice
	 * @generated
	 */
	public Adapter createExclusiveChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //declareAdapterFactory
