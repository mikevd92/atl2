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
public class ResourcePetriNetsModelingAssistantProviderOfTransitionEditPart
		extends
		resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002);
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
				(resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart) {
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002);
		}
		if (targetEditPart instanceof resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart) {
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002);
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
				(resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002) {
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Place_2001);
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Resource_2002);
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
		return doGetRelTypesOnTarget((resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001);
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
				(resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001) {
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Place_2001);
			types.add(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Resource_2002);
		}
		return types;
	}

}
