package resourcePetriNet.resourcePetriNet.diagram.edit.commands;

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
		if (false == getElementToEdit() instanceof resourcePetriNet.resourcePetriNet.InputArc) {
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
		if (!(oldEnd instanceof resourcePetriNet.resourcePetriNet.GenericPlace && newEnd instanceof resourcePetriNet.resourcePetriNet.GenericPlace)) {
			return false;
		}
		resourcePetriNet.resourcePetriNet.Transition target = getLink()
				.getInputArcToTransition();
		if (!(getLink().eContainer() instanceof resourcePetriNet.resourcePetriNet.PetriNet)) {
			return false;
		}
		resourcePetriNet.resourcePetriNet.PetriNet container = (resourcePetriNet.resourcePetriNet.PetriNet) getLink()
				.eContainer();
		return resourcePetriNet.resourcePetriNet.diagram.edit.policies.ResourcePetriNetsBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistInputArc_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof resourcePetriNet.resourcePetriNet.Transition && newEnd instanceof resourcePetriNet.resourcePetriNet.Transition)) {
			return false;
		}
		resourcePetriNet.resourcePetriNet.GenericPlace source = getLink()
				.getInputArcFromPlace();
		if (!(getLink().eContainer() instanceof resourcePetriNet.resourcePetriNet.PetriNet)) {
			return false;
		}
		resourcePetriNet.resourcePetriNet.PetriNet container = (resourcePetriNet.resourcePetriNet.PetriNet) getLink()
				.eContainer();
		return resourcePetriNet.resourcePetriNet.diagram.edit.policies.ResourcePetriNetsBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistInputArc_4001(container,
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
	protected resourcePetriNet.resourcePetriNet.InputArc getLink() {
		return (resourcePetriNet.resourcePetriNet.InputArc) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected resourcePetriNet.resourcePetriNet.GenericPlace getOldSource() {
		return (resourcePetriNet.resourcePetriNet.GenericPlace) oldEnd;
	}

	/**
	 * @generated
	 */
	protected resourcePetriNet.resourcePetriNet.GenericPlace getNewSource() {
		return (resourcePetriNet.resourcePetriNet.GenericPlace) newEnd;
	}

	/**
	 * @generated
	 */
	protected resourcePetriNet.resourcePetriNet.Transition getOldTarget() {
		return (resourcePetriNet.resourcePetriNet.Transition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected resourcePetriNet.resourcePetriNet.Transition getNewTarget() {
		return (resourcePetriNet.resourcePetriNet.Transition) newEnd;
	}
}
