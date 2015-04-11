package declare.declare.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import declare.declare.diagram.providers.DeclareElementTypes;
import declare.declare.diagram.providers.DeclareModelingAssistantProvider;

/**
 * @generated
 */
public class DeclareModelingAssistantProviderOfDeclareEditPart extends
		DeclareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DeclareElementTypes.Activity_2001);
		types.add(DeclareElementTypes.Choice_2002);
		return types;
	}

}
