package extendedPetriNets.extendedPetriNets.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class InputArcItemSemanticEditPolicy
		extends
		extendedPetriNets.extendedPetriNets.diagram.edit.policies.ExtPetriNetsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InputArcItemSemanticEditPolicy() {
		super(
				extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
