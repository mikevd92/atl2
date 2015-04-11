package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.NotPrecedenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class NotPrecedenceEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4015;

	/**
	 * @generated
	 */
	public NotPrecedenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NotPrecedenceItemSemanticEditPolicy());
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
		return new NotPrecedenceFigure();
	}

	/**
	 * @generated
	 */
	public NotPrecedenceFigure getPrimaryShape() {
		return (NotPrecedenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class NotPrecedenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotPrecedenceLabelFigure;

		/**
		 * @generated
		 */
		public NotPrecedenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureNotPrecedenceLabelFigure = new WrappingLabel();

			fFigureNotPrecedenceLabelFigure.setText("<...>");

			this.add(fFigureNotPrecedenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotPrecedenceLabelFigure() {
			return fFigureNotPrecedenceLabelFigure;
		}

	}

}
