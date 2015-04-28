package extendedPetriNets.extendedPetriNets.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class InputArcReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public InputArcReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof extendedPetriNets.extendedPetriNets.InputArc) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof extendedPetriNets.extendedPetriNets.GenericPlace && newEnd instanceof extendedPetriNets.extendedPetriNets.GenericPlace)) {
			return false;
		}
		extendedPetriNets.extendedPetriNets.Transition target = getLink()
				.getInputArcToTransition();
		if (!(getLink().eContainer() instanceof extendedPetriNets.extendedPetriNets.PetriNet)) {
			return false;
		}
		extendedPetriNets.extendedPetriNets.PetriNet container = (extendedPetriNets.extendedPetriNets.PetriNet) getLink()
				.eContainer();
		return extendedPetriNets.extendedPetriNets.diagram.edit.policies.ExtPetriNetsBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistInputArc_4003(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof extendedPetriNets.extendedPetriNets.Transition && newEnd instanceof extendedPetriNets.extendedPetriNets.Transition)) {
			return false;
		}
		extendedPetriNets.extendedPetriNets.GenericPlace source = getLink()
				.getInputArcFromPlace();
		if (!(getLink().eContainer() instanceof extendedPetriNets.extendedPetriNets.PetriNet)) {
			return false;
		}
		extendedPetriNets.extendedPetriNets.PetriNet container = (extendedPetriNets.extendedPetriNets.PetriNet) getLink()
				.eContainer();
		return extendedPetriNets.extendedPetriNets.diagram.edit.policies.ExtPetriNetsBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistInputArc_4003(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setInputArcFromPlace(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setInputArcToTransition(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.InputArc getLink() {
		return (extendedPetriNets.extendedPetriNets.InputArc) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.GenericPlace getOldSource() {
		return (extendedPetriNets.extendedPetriNets.GenericPlace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.GenericPlace getNewSource() {
		return (extendedPetriNets.extendedPetriNets.GenericPlace) newEnd;
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.Transition getOldTarget() {
		return (extendedPetriNets.extendedPetriNets.Transition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.Transition getNewTarget() {
		return (extendedPetriNets.extendedPetriNets.Transition) newEnd;
	}
}
