package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.PrecedenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class PrecedenceEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4017;

	/**
	 * @generated
	 */
	public PrecedenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrecedenceItemSemanticEditPolicy());
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
		return new PrecedenceFigure();
	}

	/**
	 * @generated
	 */
	public PrecedenceFigure getPrimaryShape() {
		return (PrecedenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PrecedenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePrecedenceLabelFigure;

		/**
		 * @generated
		 */
		public PrecedenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePrecedenceLabelFigure = new WrappingLabel();

			fFigurePrecedenceLabelFigure.setText("<...>");

			this.add(fFigurePrecedenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePrecedenceLabelFigure() {
			return fFigurePrecedenceLabelFigure;
		}

	}

}
