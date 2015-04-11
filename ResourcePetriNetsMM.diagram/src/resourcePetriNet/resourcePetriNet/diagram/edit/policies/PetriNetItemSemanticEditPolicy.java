package resourcePetriNet.resourcePetriNet.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class PetriNetItemSemanticEditPolicy
		extends
		resourcePetriNet.resourcePetriNet.diagram.edit.policies.ResourcePetriNetsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PetriNetItemSemanticEditPolicy() {
		super(
				resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.PetriNet_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Place_2001 == req
				.getElementType()) {
			return getGEFWrapper(new resourcePetriNet.resourcePetriNet.diagram.edit.commands.PlaceCreateCommand(
					req));
		}
		if (resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Resource_2002 == req
				.getElementType()) {
			return getGEFWrapper(new resourcePetriNet.resourcePetriNet.diagram.edit.commands.ResourceCreateCommand(
					req));
		}
		if (resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Transition_2003 == req
				.getElementType()) {
			return getGEFWrapper(new resourcePetriNet.resourcePetriNet.diagram.edit.commands.TransitionCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
