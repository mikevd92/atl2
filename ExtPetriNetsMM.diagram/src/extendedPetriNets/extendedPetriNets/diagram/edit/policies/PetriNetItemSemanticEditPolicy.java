package extendedPetriNets.extendedPetriNets.diagram.edit.policies;

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
		extendedPetriNets.extendedPetriNets.diagram.edit.policies.ExtPetriNetsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PetriNetItemSemanticEditPolicy() {
		super(
				extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.PetriNet_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Transition_2001 == req
				.getElementType()) {
			return getGEFWrapper(new extendedPetriNets.extendedPetriNets.diagram.edit.commands.TransitionCreateCommand(
					req));
		}
		if (extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputPort_2002 == req
				.getElementType()) {
			return getGEFWrapper(new extendedPetriNets.extendedPetriNets.diagram.edit.commands.OutputPortCreateCommand(
					req));
		}
		if (extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Place_2003 == req
				.getElementType()) {
			return getGEFWrapper(new extendedPetriNets.extendedPetriNets.diagram.edit.commands.PlaceCreateCommand(
					req));
		}
		if (extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputPort_2004 == req
				.getElementType()) {
			return getGEFWrapper(new extendedPetriNets.extendedPetriNets.diagram.edit.commands.InputPortCreateCommand(
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
