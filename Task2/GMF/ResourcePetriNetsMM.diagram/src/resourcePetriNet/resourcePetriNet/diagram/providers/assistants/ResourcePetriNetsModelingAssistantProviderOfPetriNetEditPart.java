package resourcePetriNet.resourcePetriNet.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ResourcePetriNetsModelingAssistantProviderOfPetriNetEditPart
		extends
		resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Place_2001);
		types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Resource_2002);
		types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Transition_2003);
		return types;
	}

}
