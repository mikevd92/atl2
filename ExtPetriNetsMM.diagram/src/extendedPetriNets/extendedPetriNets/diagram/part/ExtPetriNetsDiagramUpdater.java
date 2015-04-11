package extendedPetriNets.extendedPetriNets.diagram.part;

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
public class ExtPetriNetsDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor> getSemanticChildren(
			View view) {
		switch (extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor> getPetriNet_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		extendedPetriNets.extendedPetriNets.PetriNet modelElement = (extendedPetriNets.extendedPetriNets.PetriNet) view
				.getElement();
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContainsTransitions().iterator(); it
				.hasNext();) {
			extendedPetriNets.extendedPetriNets.Transition childElement = (extendedPetriNets.extendedPetriNets.Transition) it
					.next();
			int visualID = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
				result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContainsGenericPlaces()
				.iterator(); it.hasNext();) {
			extendedPetriNets.extendedPetriNets.GenericPlace childElement = (extendedPetriNets.extendedPetriNets.GenericPlace) it
					.next();
			int visualID = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
				result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID) {
				result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
				result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getContainedLinks(
			View view) {
		switch (extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000ContainedLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2001ContainedLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2002ContainedLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2003ContainedLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_2004ContainedLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getInputArc_4003ContainedLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getOutputArc_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getIncomingLinks(
			View view) {
		switch (extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2001IncomingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2002IncomingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2003IncomingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_2004IncomingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getInputArc_4003IncomingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getOutputArc_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2001OutgoingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2002OutgoingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2003OutgoingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_2004OutgoingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getInputArc_4003OutgoingLinks(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getOutputArc_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getPetriNet_1000ContainedLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.PetriNet modelElement = (extendedPetriNets.extendedPetriNets.PetriNet) view
				.getElement();
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InputArc_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_OutputArc_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getTransition_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutputPort_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getPlace_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getInputPort_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getInputArc_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutputArc_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getTransition_2001IncomingLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.Transition modelElement = (extendedPetriNets.extendedPetriNets.Transition) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputArc_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutputPort_2002IncomingLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.OutputPort modelElement = (extendedPetriNets.extendedPetriNets.OutputPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_OutputArc_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getPlace_2003IncomingLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.Place modelElement = (extendedPetriNets.extendedPetriNets.Place) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_OutputArc_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getInputPort_2004IncomingLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.InputPort modelElement = (extendedPetriNets.extendedPetriNets.InputPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_OutputArc_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getInputArc_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutputArc_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getTransition_2001OutgoingLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.Transition modelElement = (extendedPetriNets.extendedPetriNets.Transition) view
				.getElement();
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_OutputArc_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutputPort_2002OutgoingLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.OutputPort modelElement = (extendedPetriNets.extendedPetriNets.OutputPort) view
				.getElement();
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputArc_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getPlace_2003OutgoingLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.Place modelElement = (extendedPetriNets.extendedPetriNets.Place) view
				.getElement();
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputArc_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getInputPort_2004OutgoingLinks(
			View view) {
		extendedPetriNets.extendedPetriNets.InputPort modelElement = (extendedPetriNets.extendedPetriNets.InputPort) view
				.getElement();
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputArc_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getInputArc_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutputArc_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getContainedTypeModelFacetLinks_InputArc_4003(
			extendedPetriNets.extendedPetriNets.PetriNet container) {
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		for (Iterator<?> links = container.getContainsInputArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof extendedPetriNets.extendedPetriNets.InputArc) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.InputArc link = (extendedPetriNets.extendedPetriNets.InputArc) linkObject;
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID != extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.Transition dst = link
					.getInputArcToTransition();
			extendedPetriNets.extendedPetriNets.GenericPlace src = link
					.getInputArcFromPlace();
			result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor(
					src,
					dst,
					link,
					extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003,
					extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getContainedTypeModelFacetLinks_OutputArc_4004(
			extendedPetriNets.extendedPetriNets.PetriNet container) {
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		for (Iterator<?> links = container.getContainsOutputArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof extendedPetriNets.extendedPetriNets.OutputArc) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.OutputArc link = (extendedPetriNets.extendedPetriNets.OutputArc) linkObject;
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID != extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.GenericPlace dst = link
					.getOutputArcToPlace();
			extendedPetriNets.extendedPetriNets.Transition src = link
					.getOutputArcFromTransition();
			result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor(
					src,
					dst,
					link,
					extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004,
					extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getIncomingTypeModelFacetLinks_InputArc_4003(
			extendedPetriNets.extendedPetriNets.Transition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getInputArc_InputArcToTransition()
					|| false == setting.getEObject() instanceof extendedPetriNets.extendedPetriNets.InputArc) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.InputArc link = (extendedPetriNets.extendedPetriNets.InputArc) setting
					.getEObject();
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID != extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.GenericPlace src = link
					.getInputArcFromPlace();
			result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor(
					src,
					target,
					link,
					extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003,
					extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getIncomingTypeModelFacetLinks_OutputArc_4004(
			extendedPetriNets.extendedPetriNets.GenericPlace target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getOutputArc_OutputArcToPlace()
					|| false == setting.getEObject() instanceof extendedPetriNets.extendedPetriNets.OutputArc) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.OutputArc link = (extendedPetriNets.extendedPetriNets.OutputArc) setting
					.getEObject();
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID != extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.Transition src = link
					.getOutputArcFromTransition();
			result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor(
					src,
					target,
					link,
					extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004,
					extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutgoingTypeModelFacetLinks_InputArc_4003(
			extendedPetriNets.extendedPetriNets.GenericPlace source) {
		extendedPetriNets.extendedPetriNets.PetriNet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof extendedPetriNets.extendedPetriNets.PetriNet) {
				container = (extendedPetriNets.extendedPetriNets.PetriNet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		for (Iterator<?> links = container.getContainsInputArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof extendedPetriNets.extendedPetriNets.InputArc) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.InputArc link = (extendedPetriNets.extendedPetriNets.InputArc) linkObject;
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID != extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.Transition dst = link
					.getInputArcToTransition();
			extendedPetriNets.extendedPetriNets.GenericPlace src = link
					.getInputArcFromPlace();
			if (src != source) {
				continue;
			}
			result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor(
					src,
					dst,
					link,
					extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003,
					extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutgoingTypeModelFacetLinks_OutputArc_4004(
			extendedPetriNets.extendedPetriNets.Transition source) {
		extendedPetriNets.extendedPetriNets.PetriNet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof extendedPetriNets.extendedPetriNets.PetriNet) {
				container = (extendedPetriNets.extendedPetriNets.PetriNet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor>();
		for (Iterator<?> links = container.getContainsOutputArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof extendedPetriNets.extendedPetriNets.OutputArc) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.OutputArc link = (extendedPetriNets.extendedPetriNets.OutputArc) linkObject;
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID != extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			extendedPetriNets.extendedPetriNets.GenericPlace dst = link
					.getOutputArcToPlace();
			extendedPetriNets.extendedPetriNets.Transition src = link
					.getOutputArcFromTransition();
			if (src != source) {
				continue;
			}
			result.add(new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor(
					src,
					dst,
					link,
					extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004,
					extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
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

		public List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsNodeDescriptor> getSemanticChildren(
				View view) {
			return ExtPetriNetsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getContainedLinks(
				View view) {
			return ExtPetriNetsDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getIncomingLinks(
				View view) {
			return ExtPetriNetsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsLinkDescriptor> getOutgoingLinks(
				View view) {
			return ExtPetriNetsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
