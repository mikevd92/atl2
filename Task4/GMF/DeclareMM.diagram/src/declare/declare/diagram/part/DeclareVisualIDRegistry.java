package declare.declare.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import declare.declare.Declare;
import declare.declare.diagram.edit.parts.ActivityEditPart;
import declare.declare.diagram.edit.parts.ActivityNameEditPart;
import declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart;
import declare.declare.diagram.edit.parts.AlternateResponseEditPart;
import declare.declare.diagram.edit.parts.ChainPrecedenceEditPart;
import declare.declare.diagram.edit.parts.ChainResponseEditPart;
import declare.declare.diagram.edit.parts.ChainSuccessionEditPart;
import declare.declare.diagram.edit.parts.ChoiceEditPart;
import declare.declare.diagram.edit.parts.CoExistenceEditPart;
import declare.declare.diagram.edit.parts.DeclareEditPart;
import declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart;
import declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart;
import declare.declare.diagram.edit.parts.NotChainRepsonseEditPart;
import declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart;
import declare.declare.diagram.edit.parts.NotCoExistenceEditPart;
import declare.declare.diagram.edit.parts.NotPrecedenceEditPart;
import declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart;
import declare.declare.diagram.edit.parts.NotResponseEditPart;
import declare.declare.diagram.edit.parts.NotSuccessionEditPart;
import declare.declare.diagram.edit.parts.PrecedenceEditPart;
import declare.declare.diagram.edit.parts.RespondedExistenceEditPart;
import declare.declare.diagram.edit.parts.ResponseEditPart;
import declare.declare.diagram.edit.parts.SuccessionEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DeclareVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "DeclareMM.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DeclareEditPart.MODEL_ID.equals(view.getType())) {
				return DeclareEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return declare.declare.diagram.part.DeclareVisualIDRegistry
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
				DeclareDiagramEditorPlugin.getInstance().logError(
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
		if (declare.declare.declarePackage.eINSTANCE.getDeclare()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Declare) domainElement)) {
			return DeclareEditPart.VISUAL_ID;
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
		String containerModelID = declare.declare.diagram.part.DeclareVisualIDRegistry
				.getModelID(containerView);
		if (!DeclareEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DeclareEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = declare.declare.diagram.part.DeclareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DeclareEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DeclareEditPart.VISUAL_ID:
			if (declare.declare.declarePackage.eINSTANCE.getActivity()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = declare.declare.diagram.part.DeclareVisualIDRegistry
				.getModelID(containerView);
		if (!DeclareEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DeclareEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = declare.declare.diagram.part.DeclareVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DeclareEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DeclareEditPart.VISUAL_ID:
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (declare.declare.declarePackage.eINSTANCE.getRespondedExistence()
				.isSuperTypeOf(domainElement.eClass())) {
			return RespondedExistenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getAlternatePrecedence()
				.isSuperTypeOf(domainElement.eClass())) {
			return AlternatePrecedenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getChoice().isSuperTypeOf(
				domainElement.eClass())) {
			return ChoiceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getCoExistence()
				.isSuperTypeOf(domainElement.eClass())) {
			return CoExistenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getExclusiveChoice()
				.isSuperTypeOf(domainElement.eClass())) {
			return ExclusiveChoiceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getNotChainPrecedence()
				.isSuperTypeOf(domainElement.eClass())) {
			return NotChainPrecedenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getNotChainRepsonse()
				.isSuperTypeOf(domainElement.eClass())) {
			return NotChainRepsonseEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getNotCoExistence()
				.isSuperTypeOf(domainElement.eClass())) {
			return NotCoExistenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getNotPrecedence()
				.isSuperTypeOf(domainElement.eClass())) {
			return NotPrecedenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getNotRespondedExistence()
				.isSuperTypeOf(domainElement.eClass())) {
			return NotRespondedExistenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getNotResponse()
				.isSuperTypeOf(domainElement.eClass())) {
			return NotResponseEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getNotSuccession()
				.isSuperTypeOf(domainElement.eClass())) {
			return NotSuccessionEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getSuccession()
				.isSuperTypeOf(domainElement.eClass())) {
			return SuccessionEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getResponse()
				.isSuperTypeOf(domainElement.eClass())) {
			return ResponseEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getPrecedence()
				.isSuperTypeOf(domainElement.eClass())) {
			return PrecedenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getNotChainSuccessive()
				.isSuperTypeOf(domainElement.eClass())) {
			return NotChainSuccessiveEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getChainPrecedence()
				.isSuperTypeOf(domainElement.eClass())) {
			return ChainPrecedenceEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getChainResponse()
				.isSuperTypeOf(domainElement.eClass())) {
			return ChainResponseEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getChainSuccession()
				.isSuperTypeOf(domainElement.eClass())) {
			return ChainSuccessionEditPart.VISUAL_ID;
		}
		if (declare.declare.declarePackage.eINSTANCE.getAlternateResponse()
				.isSuperTypeOf(domainElement.eClass())) {
			return AlternateResponseEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Declare element) {
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
		case DeclareEditPart.VISUAL_ID:
			return false;
		case ActivityEditPart.VISUAL_ID:
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
			return declare.declare.diagram.part.DeclareVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return declare.declare.diagram.part.DeclareVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return declare.declare.diagram.part.DeclareVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return declare.declare.diagram.part.DeclareVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return declare.declare.diagram.part.DeclareVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return declare.declare.diagram.part.DeclareVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
