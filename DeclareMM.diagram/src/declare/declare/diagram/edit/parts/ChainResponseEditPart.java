package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.ChainResponseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ChainResponseEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public ChainResponseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ChainResponseItemSemanticEditPolicy());
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
		return new ChainResponseFigure();
	}

	/**
	 * @generated
	 */
	public ChainResponseFigure getPrimaryShape() {
		return (ChainResponseFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ChainResponseFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureChainResponseLabelFigure;

		/**
		 * @generated
		 */
		public ChainResponseFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureChainResponseLabelFigure = new WrappingLabel();

			fFigureChainResponseLabelFigure.setText("<...>");

			this.add(fFigureChainResponseLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureChainResponseLabelFigure() {
			return fFigureChainResponseLabelFigure;
		}

	}

}
