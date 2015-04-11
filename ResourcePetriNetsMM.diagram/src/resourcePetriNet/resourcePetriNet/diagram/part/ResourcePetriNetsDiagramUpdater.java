package resourcePetriNet.resourcePetriNet.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ResourcePetriNetsDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsNodeDescriptor> getSemanticChildren(
			View view) {
		switch (resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsNodeDescriptor> getPetriNet_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		resourcePetriNet.resourcePetriNet.PetriNet modelElement = (resourcePetriNet.resourcePetriNet.PetriNet) view
				.getElement();
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsNodeDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContainsGenericPlaces()
				.iterator(); it.hasNext();) {
			resourcePetriNet.resourcePetriNet.GenericPlace childElement = (resourcePetriNet.resourcePetriNet.GenericPlace) it
					.next();
			int visualID = resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID) {
				result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID) {
				result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContainsTransitions().iterator(); it
				.hasNext();) {
			resourcePetriNet.resourcePetriNet.Transition childElement = (resourcePetriNet.resourcePetriNet.Transition) it
					.next();
			int visualID = resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
				result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getContainedLinks(
			View view) {
		switch (resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000ContainedLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2001ContainedLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2002ContainedLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2003ContainedLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getInputArc_4001ContainedLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getOutputArc_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getIncomingLinks(
			View view) {
		switch (resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2001IncomingLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2002IncomingLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2003IncomingLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getInputArc_4001IncomingLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getOutputArc_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2001OutgoingLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2002OutgoingLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2003OutgoingLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getInputArc_4001OutgoingLinks(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getOutputArc_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getPetriNet_1000ContainedLinks(
			View view) {
		resourcePetriNet.resourcePetriNet.PetriNet modelElement = (resourcePetriNet.resourcePetriNet.PetriNet) view
				.getElement();
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InputArc_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_OutputArc_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getPlace_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getResource_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getTransition_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getInputArc_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getOutputArc_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getPlace_2001IncomingLinks(
			View view) {
		resourcePetriNet.resourcePetriNet.Place modelElement = (resourcePetriNet.resourcePetriNet.Place) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_OutputArc_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getResource_2002IncomingLinks(
			View view) {
		resourcePetriNet.resourcePetriNet.Resource modelElement = (resourcePetriNet.resourcePetriNet.Resource) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_OutputArc_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getTransition_2003IncomingLinks(
			View view) {
		resourcePetriNet.resourcePetriNet.Transition modelElement = (resourcePetriNet.resourcePetriNet.Transition) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputArc_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getInputArc_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getOutputArc_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getPlace_2001OutgoingLinks(
			View view) {
		resourcePetriNet.resourcePetriNet.Place modelElement = (resourcePetriNet.resourcePetriNet.Place) view
				.getElement();
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputArc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getResource_2002OutgoingLinks(
			View view) {
		resourcePetriNet.resourcePetriNet.Resource modelElement = (resourcePetriNet.resourcePetriNet.Resource) view
				.getElement();
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputArc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getTransition_2003OutgoingLinks(
			View view) {
		resourcePetriNet.resourcePetriNet.Transition modelElement = (resourcePetriNet.resourcePetriNet.Transition) view
				.getElement();
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_OutputArc_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getInputArc_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getOutputArc_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getContainedTypeModelFacetLinks_InputArc_4001(
			resourcePetriNet.resourcePetriNet.PetriNet container) {
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		for (Iterator<?> links = container.getContainsInputArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof resourcePetriNet.resourcePetriNet.InputArc) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.InputArc link = (resourcePetriNet.resourcePetriNet.InputArc) linkObject;
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID != resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.Transition dst = link
					.getInputArcToTransition();
			resourcePetriNet.resourcePetriNet.GenericPlace src = link
					.getInputArcFromPlace();
			result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor(
					src,
					dst,
					link,
					resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001,
					resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getContainedTypeModelFacetLinks_OutputArc_4002(
			resourcePetriNet.resourcePetriNet.PetriNet container) {
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		for (Iterator<?> links = container.getContainsOutputArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof resourcePetriNet.resourcePetriNet.OutputArc) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.OutputArc link = (resourcePetriNet.resourcePetriNet.OutputArc) linkObject;
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID != resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.GenericPlace dst = link
					.getOutputArcToPlace();
			resourcePetriNet.resourcePetriNet.Transition src = link
					.getOutputArcFromTransition();
			result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor(
					src,
					dst,
					link,
					resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002,
					resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getIncomingTypeModelFacetLinks_InputArc_4001(
			resourcePetriNet.resourcePetriNet.Transition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
					.getInputArc_InputArcToTransition()
					|| false == setting.getEObject() instanceof resourcePetriNet.resourcePetriNet.InputArc) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.InputArc link = (resourcePetriNet.resourcePetriNet.InputArc) setting
					.getEObject();
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID != resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.GenericPlace src = link
					.getInputArcFromPlace();
			result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor(
					src,
					target,
					link,
					resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001,
					resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getIncomingTypeModelFacetLinks_OutputArc_4002(
			resourcePetriNet.resourcePetriNet.GenericPlace target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
					.getOutputArc_OutputArcToPlace()
					|| false == setting.getEObject() instanceof resourcePetriNet.resourcePetriNet.OutputArc) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.OutputArc link = (resourcePetriNet.resourcePetriNet.OutputArc) setting
					.getEObject();
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID != resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.Transition src = link
					.getOutputArcFromTransition();
			result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor(
					src,
					target,
					link,
					resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002,
					resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getOutgoingTypeModelFacetLinks_InputArc_4001(
			resourcePetriNet.resourcePetriNet.GenericPlace source) {
		resourcePetriNet.resourcePetriNet.PetriNet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof resourcePetriNet.resourcePetriNet.PetriNet) {
				container = (resourcePetriNet.resourcePetriNet.PetriNet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		for (Iterator<?> links = container.getContainsInputArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof resourcePetriNet.resourcePetriNet.InputArc) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.InputArc link = (resourcePetriNet.resourcePetriNet.InputArc) linkObject;
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID != resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.Transition dst = link
					.getInputArcToTransition();
			resourcePetriNet.resourcePetriNet.GenericPlace src = link
					.getInputArcFromPlace();
			if (src != source) {
				continue;
			}
			result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor(
					src,
					dst,
					link,
					resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001,
					resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getOutgoingTypeModelFacetLinks_OutputArc_4002(
			resourcePetriNet.resourcePetriNet.Transition source) {
		resourcePetriNet.resourcePetriNet.PetriNet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof resourcePetriNet.resourcePetriNet.PetriNet) {
				container = (resourcePetriNet.resourcePetriNet.PetriNet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor>();
		for (Iterator<?> links = container.getContainsOutputArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof resourcePetriNet.resourcePetriNet.OutputArc) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.OutputArc link = (resourcePetriNet.resourcePetriNet.OutputArc) linkObject;
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID != resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			resourcePetriNet.resourcePetriNet.GenericPlace dst = link
					.getOutputArcToPlace();
			resourcePetriNet.resourcePetriNet.Transition src = link
					.getOutputArcFromTransition();
			if (src != source) {
				continue;
			}
			result.add(new resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor(
					src,
					dst,
					link,
					resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002,
					resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsNodeDescriptor> getSemanticChildren(
				View view) {
			return ResourcePetriNetsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getContainedLinks(
				View view) {
			return ResourcePetriNetsDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getIncomingLinks(
				View view) {
			return ResourcePetriNetsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsLinkDescriptor> getOutgoingLinks(
				View view) {
			return ResourcePetriNetsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
