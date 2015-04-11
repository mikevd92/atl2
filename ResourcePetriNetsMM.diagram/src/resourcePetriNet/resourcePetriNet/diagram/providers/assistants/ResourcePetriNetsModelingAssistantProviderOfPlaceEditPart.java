package resourcePetriNet.resourcePetriNet.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ResourcePetriNetsModelingAssistantProviderOfPlaceEditPart
		extends
		resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001);
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
				(resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart) {
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001);
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
				(resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001) {
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Transition_2003);
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
		return doGetRelTypesOnTarget((resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002);
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
				(resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002) {
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Transition_2003);
		}
		return types;
	}

}
