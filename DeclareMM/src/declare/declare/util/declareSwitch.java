/**
 */
package declare.declare.util;

import declare.declare.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see declare.declare.declarePackage
 * @generated
 */
public class declareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static declarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public declareSwitch() {
		if (modelPackage == null) {
			modelPackage = declarePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case declarePackage.DECLARE: {
				Declare declare = (Declare)theEObject;
				T result = caseDeclare(declare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.RESPONDED_EXISTENCE: {
				RespondedExistence respondedExistence = (RespondedExistence)theEObject;
				T result = caseRespondedExistence(respondedExistence);
				if (result == null) result = caseConstraint(respondedExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.CO_EXISTENCE: {
				CoExistence coExistence = (CoExistence)theEObject;
				T result = caseCoExistence(coExistence);
				if (result == null) result = caseConstraint(coExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = caseConstraint(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.PRECEDENCE: {
				Precedence precedence = (Precedence)theEObject;
				T result = casePrecedence(precedence);
				if (result == null) result = caseConstraint(precedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.SUCCESSION: {
				Succession succession = (Succession)theEObject;
				T result = caseSuccession(succession);
				if (result == null) result = caseConstraint(succession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.ALTERNATE_RESPONSE: {
				AlternateResponse alternateResponse = (AlternateResponse)theEObject;
				T result = caseAlternateResponse(alternateResponse);
				if (result == null) result = caseConstraint(alternateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.ALTERNATE_PRECEDENCE: {
				AlternatePrecedence alternatePrecedence = (AlternatePrecedence)theEObject;
				T result = caseAlternatePrecedence(alternatePrecedence);
				if (result == null) result = caseConstraint(alternatePrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.CHAIN_RESPONSE: {
				ChainResponse chainResponse = (ChainResponse)theEObject;
				T result = caseChainResponse(chainResponse);
				if (result == null) result = caseConstraint(chainResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.CHAIN_SUCCESSION: {
				ChainSuccession chainSuccession = (ChainSuccession)theEObject;
				T result = caseChainSuccession(chainSuccession);
				if (result == null) result = caseConstraint(chainSuccession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.CHAIN_PRECEDENCE: {
				ChainPrecedence chainPrecedence = (ChainPrecedence)theEObject;
				T result = caseChainPrecedence(chainPrecedence);
				if (result == null) result = caseConstraint(chainPrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.NOT_CO_EXISTENCE: {
				NotCoExistence notCoExistence = (NotCoExistence)theEObject;
				T result = caseNotCoExistence(notCoExistence);
				if (result == null) result = caseConstraint(notCoExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.NOT_RESPONDED_EXISTENCE: {
				NotRespondedExistence notRespondedExistence = (NotRespondedExistence)theEObject;
				T result = caseNotRespondedExistence(notRespondedExistence);
				if (result == null) result = caseConstraint(notRespondedExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.NOT_RESPONSE: {
				NotResponse notResponse = (NotResponse)theEObject;
				T result = caseNotResponse(notResponse);
				if (result == null) result = caseConstraint(notResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.NOT_PRECEDENCE: {
				NotPrecedence notPrecedence = (NotPrecedence)theEObject;
				T result = caseNotPrecedence(notPrecedence);
				if (result == null) result = caseConstraint(notPrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.NOT_SUCCESSION: {
				NotSuccession notSuccession = (NotSuccession)theEObject;
				T result = caseNotSuccession(notSuccession);
				if (result == null) result = caseConstraint(notSuccession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.NOT_CHAIN_REPSONSE: {
				NotChainRepsonse notChainRepsonse = (NotChainRepsonse)theEObject;
				T result = caseNotChainRepsonse(notChainRepsonse);
				if (result == null) result = caseConstraint(notChainRepsonse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.NOT_CHAIN_SUCCESSIVE: {
				NotChainSuccessive notChainSuccessive = (NotChainSuccessive)theEObject;
				T result = caseNotChainSuccessive(notChainSuccessive);
				if (result == null) result = caseConstraint(notChainSuccessive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.NOT_CHAIN_PRECEDENCE: {
				NotChainPrecedence notChainPrecedence = (NotChainPrecedence)theEObject;
				T result = caseNotChainPrecedence(notChainPrecedence);
				if (result == null) result = caseConstraint(notChainPrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseSpecialConstraint(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.EXCLUSIVE_CHOICE: {
				ExclusiveChoice exclusiveChoice = (ExclusiveChoice)theEObject;
				T result = caseExclusiveChoice(exclusiveChoice);
				if (result == null) result = caseConstraint(exclusiveChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.INPUT_RELATION: {
				InputRelation inputRelation = (InputRelation)theEObject;
				T result = caseInputRelation(inputRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.OUTPUT_RELATION: {
				OutputRelation outputRelation = (OutputRelation)theEObject;
				T result = caseOutputRelation(outputRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case declarePackage.SPECIAL_CONSTRAINT: {
				SpecialConstraint specialConstraint = (SpecialConstraint)theEObject;
				T result = caseSpecialConstraint(specialConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclare(Declare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responded Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responded Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespondedExistence(RespondedExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Co Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Co Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoExistence(CoExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedence(Precedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Succession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Succession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccession(Succession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternateResponse(AlternateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternatePrecedence(AlternatePrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainResponse(ChainResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Succession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Succession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainSuccession(ChainSuccession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainPrecedence(ChainPrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Co Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Co Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotCoExistence(NotCoExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Responded Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Responded Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotRespondedExistence(NotRespondedExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotResponse(NotResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotPrecedence(NotPrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Succession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Succession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotSuccession(NotSuccession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Chain Repsonse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Chain Repsonse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotChainRepsonse(NotChainRepsonse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Chain Successive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Chain Successive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotChainSuccessive(NotChainSuccessive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Chain Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Chain Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotChainPrecedence(NotChainPrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveChoice(ExclusiveChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRelation(InputRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputRelation(OutputRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialConstraint(SpecialConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //declareSwitch
