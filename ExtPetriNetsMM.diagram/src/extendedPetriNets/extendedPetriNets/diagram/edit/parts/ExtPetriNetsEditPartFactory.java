package extendedPetriNets.extendedPetriNets.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ExtPetriNetsEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getVisualID(view)) {

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionNameEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortNameEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortNameEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceNameEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortNameEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortNameEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart(
						view);

			case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
				return new extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart(
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
