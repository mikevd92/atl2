package declare.declare.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import declare.declare.diagram.edit.commands.ActivityCreateCommand;
import declare.declare.diagram.edit.commands.ChoiceCreateCommand;
import declare.declare.diagram.providers.DeclareElementTypes;

/**
 * @generated
 */
public class DeclareItemSemanticEditPolicy extends
		DeclareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeclareItemSemanticEditPolicy() {
		super(DeclareElementTypes.Declare_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeclareElementTypes.Activity_2001 == req.getElementType()) {
			return getGEFWrapper(new ActivityCreateCommand(req));
		}
		if (DeclareElementTypes.Choice_2002 == req.getElementType()) {
			return getGEFWrapper(new ChoiceCreateCommand(req));
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
