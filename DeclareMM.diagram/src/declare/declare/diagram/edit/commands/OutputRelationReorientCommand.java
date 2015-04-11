package declare.declare.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import declare.declare.Activity;
import declare.declare.Declare;
import declare.declare.OutputRelation;
import declare.declare.SpecialConstraint;
import declare.declare.diagram.edit.policies.DeclareBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OutputRelationReorientCommand extends EditElementCommand {

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
	public OutputRelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof OutputRelation) {
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
		if (!(oldEnd instanceof SpecialConstraint && newEnd instanceof SpecialConstraint)) {
			return false;
		}
		if (getLink().getOutputRelationToActivity().size() != 1) {
			return false;
		}
		Activity target = (Activity) getLink().getOutputRelationToActivity()
				.get(0);
		if (!(getLink().eContainer() instanceof Declare)) {
			return false;
		}
		Declare container = (Declare) getLink().eContainer();
		return DeclareBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistOutputRelation_4003(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Activity && newEnd instanceof Activity)) {
			return false;
		}
		SpecialConstraint source = getLink().getOutputRelationFromConstraint();
		if (!(getLink().eContainer() instanceof Declare)) {
			return false;
		}
		Declare container = (Declare) getLink().eContainer();
		return DeclareBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistOutputRelation_4003(container, getLink(), source,
						getNewTarget());
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
		getLink().setOutputRelationFromConstraint(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getOutputRelationToActivity().remove(getOldTarget());
		getLink().getOutputRelationToActivity().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected OutputRelation getLink() {
		return (OutputRelation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected SpecialConstraint getOldSource() {
		return (SpecialConstraint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SpecialConstraint getNewSource() {
		return (SpecialConstraint) newEnd;
	}

	/**
	 * @generated
	 */
	protected Activity getOldTarget() {
		return (Activity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Activity getNewTarget() {
		return (Activity) newEnd;
	}
}
