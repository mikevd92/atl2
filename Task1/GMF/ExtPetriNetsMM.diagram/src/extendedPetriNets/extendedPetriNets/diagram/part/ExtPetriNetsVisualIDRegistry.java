package extendedPetriNets.extendedPetriNets.diagram.part;

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
public class ExtPetriNetsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ExtPetriNetsMM.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
					.equals(view.getType())) {
				return extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
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
				extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
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
		if (extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
				.getPetriNet().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((extendedPetriNets.extendedPetriNets.PetriNet) domainElement)) {
			return extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
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
		String containerModelID = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getModelID(containerView);
		if (!extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			if (extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getTransition().isSuperTypeOf(domainElement.eClass())) {
				return extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID;
			}
			if (extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
			}
			if (extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getPlace().isSuperTypeOf(domainElement.eClass())) {
				return extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID;
			}
			if (extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getModelID(containerView);
		if (!extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			if (extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
				.getInputArc().isSuperTypeOf(domainElement.eClass())) {
			return extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID;
		}
		if (extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
				.getOutputArc().isSuperTypeOf(domainElement.eClass())) {
			return extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID;
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
			extendedPetriNets.extendedPetriNets.PetriNet element) {
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
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return false;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
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

		public int getVisualID(View view) {
			return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
