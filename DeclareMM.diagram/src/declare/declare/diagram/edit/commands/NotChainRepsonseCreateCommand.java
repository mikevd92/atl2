package declare.declare.diagram.edit.commands;

/**
 * @generated
 */
public class NotChainRepsonseCreateCommand extends org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand {
	
	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject source;

	/**
 * @generated
 */
	private final org.eclipse.emf.ecore.EObject target;


	/**
 * @generated
 */
	private final declare.declare.Declare container;

	/**
 * @generated
 */
	public NotChainRepsonseCreateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest request, org.eclipse.emf.ecore.EObject source, org.eclipse.emf.ecore.EObject target) {
		super(request.getLabel(), null, request);
			this.source = source;
	this.target = target;
	container = deduceContainer(source, target);
	}
	
	/**
 * @generated
 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof declare.declare.Activity) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
			if (getContainer() == null) {
		return false;
	}
	return declare.declare.diagram.edit.policies.DeclareBaseItemSemanticEditPolicy.getLinkConstraints().canCreateNotChainRepsonse(getContainer(), getSource(), getTarget());
	}

	
	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
		if (!canExecute()) {
			throw new org.eclipse.core.commands.ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		
		declare.declare.NotChainRepsonse newElement = declare.declare.declareFactory.eINSTANCE.createNotChainRepsonse();
		getContainer().getContainsConstraints().add(newElement);					newElement.setFromActivity(getSource());				newElement.setLabel(getTarget());						doConfigure(newElement, monitor, info);
		((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).setNewElement(newElement);
		return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult(newElement);

	}


		/**
 * @generated
 */
	protected void doConfigure(declare.declare.NotChainRepsonse newElement, org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = ((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).getElementType();
		org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest configureRequest = new org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest.TARGET, getTarget());
		org.eclipse.gmf.runtime.common.core.command.ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
 * @generated
 */
	protected void setElementToEdit(org.eclipse.emf.ecore.EObject element) {
		throw new UnsupportedOperationException();
	}
	
	/**
 * @generated
 */
	protected declare.declare.Activity getSource() {
		return (declare.declare.Activity) source;
	}

	/**
 * @generated
 */
	protected declare.declare.Activity getTarget() {
		return (declare.declare.Activity) target;
	}
	
	/**
 * @generated
 */
	public declare.declare.Declare getContainer() {
		return container;
	}

	/**
 * Default approach is to traverse ancestors of the source to find instance of container.
 * Modify with appropriate logic.
 * @generated
 */
	private static declare.declare.Declare deduceContainer(org.eclipse.emf.ecore.EObject source, org.eclipse.emf.ecore.EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (org.eclipse.emf.ecore.EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof declare.declare.Declare) {
				return (declare.declare.Declare) element;
			}
		}
		return null;
	}

}
