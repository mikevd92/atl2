package resourcePetriNet.resourcePetriNet.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class OutputArcItemSemanticEditPolicy
		extends
		resourcePetriNet.resourcePetriNet.diagram.edit.policies.ResourcePetriNetsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutputArcItemSemanticEditPolicy() {
		super(
				resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
