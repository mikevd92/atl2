package extendedPetriNets.extendedPetriNets.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class OutputArcItemSemanticEditPolicy
		extends
		extendedPetriNets.extendedPetriNets.diagram.edit.policies.ExtPetriNetsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutputArcItemSemanticEditPolicy() {
		super(
				extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
