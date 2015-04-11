package extendedPetriNets.extendedPetriNets.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ExtPetriNetsModelingAssistantProviderOfPetriNetEditPart
		extends
		extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Transition_2001);
		types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputPort_2002);
		types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Place_2003);
		types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputPort_2004);
		return types;
	}

}
