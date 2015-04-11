package resourcePetriNet.resourcePetriNet.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ResourcePetriNetsEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getVisualID(view)) {

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart(
						view);

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart(
						view);

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceNameEditPart(
						view);

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart(
						view);

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceNameEditPart(
						view);

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart(
						view);

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionNameEditPart(
						view);

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart(
						view);

			case resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
				return new resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
