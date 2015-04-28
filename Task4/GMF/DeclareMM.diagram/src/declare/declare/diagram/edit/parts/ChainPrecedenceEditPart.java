package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.ChainPrecedenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class ChainPrecedenceEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4019;

	/**
	 * @generated
	 */
	public ChainPrecedenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ChainPrecedenceItemSemanticEditPolicy());
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
		return new ChainPrecedenceFigure();
	}

	/**
	 * @generated
	 */
	public ChainPrecedenceFigure getPrimaryShape() {
		return (ChainPrecedenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ChainPrecedenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureChainPrecedenceLabelFigure;

		/**
		 * @generated
		 */
		public ChainPrecedenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureChainPrecedenceLabelFigure = new WrappingLabel();

			fFigureChainPrecedenceLabelFigure.setText("<...>");

			this.add(fFigureChainPrecedenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureChainPrecedenceLabelFigure() {
			return fFigureChainPrecedenceLabelFigure;
		}

	}

}
