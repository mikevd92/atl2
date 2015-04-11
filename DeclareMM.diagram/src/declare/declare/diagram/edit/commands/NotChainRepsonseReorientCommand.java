package declare.declare.diagram.edit.commands;

/**
 * @generated
 */
public class NotChainRepsonseReorientCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {

	/**
 * @generated
 */
	private final int reorientDirection;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject oldEnd;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject newEnd;

	/**
 * @generated
 */
	public NotChainRepsonseReorientCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}
	
	/**
 * @generated
 */
	public boolean canExecute() {
			if (false == getElementToEdit() instanceof declare.declare.NotChainRepsonse) {
		return false;
	}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
 * @generated
 */
	protected boolean canReorientSource() {
			if (!(oldEnd instanceof declare.declare.Activity && newEnd instanceof declare.declare.Activity)) {
		return false;
	}
				
			if (!(getLink().eContainer() instanceof declare.declare.Declare)) {
		return false;
	}
	declare.declare.Declare container = (declare.declare.Declare) getLink().eContainer();
	return declare.declare.diagram.edit.policies.DeclareBaseItemSemanticEditPolicy.getLinkConstraints().canExistNotChainRepsonse_4012(container, getLink(), getNewSource(), target);
	}

	/**
 * @generated
 */
	protected boolean canReorientTarget() {
			if (!( && )) {
		return false;
	}
						declare.declare.Activity source = getLink().getFromActivity();
				if (!(getLink().eContainer() instanceof declare.declare.Declare)) {
		return false;
	}
	declare.declare.Declare container = (declare.declare.Declare) getLink().eContainer();
	return declare.declare.diagram.edit.policies.DeclareBaseItemSemanticEditPolicy.getLinkConstraints().canExistNotChainRepsonse_4012(container, getLink(), source, getNewTarget());
	}
	
	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
			org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
			throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException("Invalid arguments in reorient link command");  //$NON-NLS-1$
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientSource() throws org.eclipse.core.commands.ExecutionException {
				getLink().setFromActivity(getNewSource());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(getLink());
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult reorientTarget() throws org.eclipse.core.commands.ExecutionException {
				getLink().setLabel(getNewTarget());
	return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(getLink());
	}
		
	/**
 * @generated
 */
	protected declare.declare.NotChainRepsonse getLink() {
		return (declare.declare.NotChainRepsonse) getElementToEdit();
	}
	
	/**
 * @generated
 */
	protected declare.declare.Activity getOldSource() {
		return (declare.declare.Activity) oldEnd;
	}
	
	/**
 * @generated
 */
	protected declare.declare.Activity getNewSource() {
		return (declare.declare.Activity) newEnd;
	}
	
	/**
 * @generated
 */
	protected  getOldTarget() {
		return ;
	}
	
	/**
 * @generated
 */
	protected  getNewTarget() {
		return ;
	}
}
