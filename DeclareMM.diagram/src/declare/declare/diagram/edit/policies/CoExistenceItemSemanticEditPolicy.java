package declare.declare.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import declare.declare.diagram.providers.DeclareElementTypes;

/**
 * @generated
 */
public class CoExistenceItemSemanticEditPolicy extends
		DeclareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoExistenceItemSemanticEditPolicy() {
		super(DeclareElementTypes.CoExistence_4009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
