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
public class OutputArcReorientCommand extends EditElementCommand {

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
	public OutputArcReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof extendedPetriNets.extendedPetriNets.OutputArc) {
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
		if (!(oldEnd instanceof extendedPetriNets.extendedPetriNets.Transition && newEnd instanceof extendedPetriNets.extendedPetriNets.Transition)) {
			return false;
		}
		extendedPetriNets.extendedPetriNets.GenericPlace target = getLink()
				.getOutputArcToPlace();
		if (!(getLink().eContainer() instanceof extendedPetriNets.extendedPetriNets.PetriNet)) {
			return false;
		}
		extendedPetriNets.extendedPetriNets.PetriNet container = (extendedPetriNets.extendedPetriNets.PetriNet) getLink()
				.eContainer();
		return extendedPetriNets.extendedPetriNets.diagram.edit.policies.ExtPetriNetsBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistOutputArc_4004(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof extendedPetriNets.extendedPetriNets.GenericPlace && newEnd instanceof extendedPetriNets.extendedPetriNets.GenericPlace)) {
			return false;
		}
		extendedPetriNets.extendedPetriNets.Transition source = getLink()
				.getOutputArcFromTransition();
		if (!(getLink().eContainer() instanceof extendedPetriNets.extendedPetriNets.PetriNet)) {
			return false;
		}
		extendedPetriNets.extendedPetriNets.PetriNet container = (extendedPetriNets.extendedPetriNets.PetriNet) getLink()
				.eContainer();
		return extendedPetriNets.extendedPetriNets.diagram.edit.policies.ExtPetriNetsBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistOutputArc_4004(container,
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
		getLink().setOutputArcFromTransition(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setOutputArcToPlace(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.OutputArc getLink() {
		return (extendedPetriNets.extendedPetriNets.OutputArc) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.Transition getOldSource() {
		return (extendedPetriNets.extendedPetriNets.Transition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.Transition getNewSource() {
		return (extendedPetriNets.extendedPetriNets.Transition) newEnd;
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.GenericPlace getOldTarget() {
		return (extendedPetriNets.extendedPetriNets.GenericPlace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.GenericPlace getNewTarget() {
		return (extendedPetriNets.extendedPetriNets.GenericPlace) newEnd;
	}
}
