package declare.declare.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import declare.declare.diagram.providers.DeclareElementTypes;

/**
 * @generated
 */
public class NotRespondedExistenceItemSemanticEditPolicy extends
		DeclareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NotRespondedExistenceItemSemanticEditPolicy() {
		super(DeclareElementTypes.NotRespondedExistence_4012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
