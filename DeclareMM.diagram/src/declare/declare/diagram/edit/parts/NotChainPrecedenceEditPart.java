package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.NotChainPrecedenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class NotChainPrecedenceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4011;

	/**
	 * @generated
	 */
	public NotChainPrecedenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NotChainPrecedenceItemSemanticEditPolicy());
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
		return new NotChainPrecedenceFigure();
	}

	/**
	 * @generated
	 */
	public NotChainPrecedenceFigure getPrimaryShape() {
		return (NotChainPrecedenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class NotChainPrecedenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotChainPrecedenceLabelFigure;

		/**
		 * @generated
		 */
		public NotChainPrecedenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureNotChainPrecedenceLabelFigure = new WrappingLabel();

			fFigureNotChainPrecedenceLabelFigure.setText("<...>");

			this.add(fFigureNotChainPrecedenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotChainPrecedenceLabelFigure() {
			return fFigureNotChainPrecedenceLabelFigure;
		}

	}

}
