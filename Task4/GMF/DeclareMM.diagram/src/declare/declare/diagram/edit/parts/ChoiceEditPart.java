package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.ChoiceItemSemanticEditPolicy;

/**
 * @generated
 */
public class ChoiceEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public ChoiceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ChoiceItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ChoiceFigure();
	}

	/**
	 * @generated
	 */
	public ChoiceFigure getPrimaryShape() {
		return (ChoiceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ChoiceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureChoiceLabelFigure;

		/**
		 * @generated
		 */
		public ChoiceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureChoiceLabelFigure = new WrappingLabel();

			fFigureChoiceLabelFigure.setText("<...>");

			this.add(fFigureChoiceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureChoiceLabelFigure() {
			return fFigureChoiceLabelFigure;
		}

	}

}
