package extendedPetriNets.extendedPetriNets.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ExtPetriNetsModelingAssistantProviderOfTransitionEditPart
		extends
		extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart) {
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004);
		}
		if (targetEditPart instanceof extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart) {
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004);
		}
		if (targetEditPart instanceof extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart) {
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004) {
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputPort_2002);
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Place_2003);
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputPort_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003) {
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputPort_2002);
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Place_2003);
			types.add(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputPort_2004);
		}
		return types;
	}

}
