package resourcePetriNet.resourcePetriNet.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ResourcePetriNetsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ResourcePetriNetsMM.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
					.equals(view.getType())) {
				return resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
				.getPetriNet().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((resourcePetriNet.resourcePetriNet.PetriNet) domainElement)) {
			return resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getModelID(containerView);
		if (!resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			if (resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
					.getPlace().isSuperTypeOf(domainElement.eClass())) {
				return resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID;
			}
			if (resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
					.getResource().isSuperTypeOf(domainElement.eClass())) {
				return resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID;
			}
			if (resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
					.getTransition().isSuperTypeOf(domainElement.eClass())) {
				return resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getModelID(containerView);
		if (!resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			if (resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
				.getInputArc().isSuperTypeOf(domainElement.eClass())) {
			return resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID;
		}
		if (resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
				.getOutputArc().isSuperTypeOf(domainElement.eClass())) {
			return resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			resourcePetriNet.resourcePetriNet.PetriNet element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return false;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
