package resourcePetriNet.resourcePetriNet.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class InputArcItemSemanticEditPolicy
		extends
		resourcePetriNet.resourcePetriNet.diagram.edit.policies.ResourcePetriNetsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InputArcItemSemanticEditPolicy() {
		super(
				resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
