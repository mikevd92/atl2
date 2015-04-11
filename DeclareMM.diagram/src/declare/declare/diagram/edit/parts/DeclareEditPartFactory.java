package declare.declare.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import declare.declare.diagram.part.DeclareVisualIDRegistry;

/**
 * @generated
 */
public class DeclareEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DeclareVisualIDRegistry.getVisualID(view)) {

			case DeclareEditPart.VISUAL_ID:
				return new DeclareEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case ChoiceEditPart.VISUAL_ID:
				return new ChoiceEditPart(view);

			case InputRelationEditPart.VISUAL_ID:
				return new InputRelationEditPart(view);

			case OutputRelationEditPart.VISUAL_ID:
				return new OutputRelationEditPart(view);

			case AlternatePrecedenceEditPart.VISUAL_ID:
				return new AlternatePrecedenceEditPart(view);

			case AlternateResponseEditPart.VISUAL_ID:
				return new AlternateResponseEditPart(view);

			case ChainPrecedenceEditPart.VISUAL_ID:
				return new ChainPrecedenceEditPart(view);

			case ChainResponseEditPart.VISUAL_ID:
				return new ChainResponseEditPart(view);

			case ChainSuccessionEditPart.VISUAL_ID:
				return new ChainSuccessionEditPart(view);

			case CoExistenceEditPart.VISUAL_ID:
				return new CoExistenceEditPart(view);

			case ExclusiveChoiceEditPart.VISUAL_ID:
				return new ExclusiveChoiceEditPart(view);

			case NotChainPrecedenceEditPart.VISUAL_ID:
				return new NotChainPrecedenceEditPart(view);

			case NotChainRepsonseEditPart.VISUAL_ID:
				return new NotChainRepsonseEditPart(view);

			case NotChainSuccessiveEditPart.VISUAL_ID:
				return new NotChainSuccessiveEditPart(view);

			case NotCoExistenceEditPart.VISUAL_ID:
				return new NotCoExistenceEditPart(view);

			case NotPrecedenceEditPart.VISUAL_ID:
				return new NotPrecedenceEditPart(view);

			case NotRespondedExistenceEditPart.VISUAL_ID:
				return new NotRespondedExistenceEditPart(view);

			case NotResponseEditPart.VISUAL_ID:
				return new NotResponseEditPart(view);

			case NotSuccessionEditPart.VISUAL_ID:
				return new NotSuccessionEditPart(view);

			case PrecedenceEditPart.VISUAL_ID:
				return new PrecedenceEditPart(view);

			case ResponseEditPart.VISUAL_ID:
				return new ResponseEditPart(view);

			case SuccessionEditPart.VISUAL_ID:
				return new SuccessionEditPart(view);

			case RespondedExistenceEditPart.VISUAL_ID:
				return new RespondedExistenceEditPart(view);

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
