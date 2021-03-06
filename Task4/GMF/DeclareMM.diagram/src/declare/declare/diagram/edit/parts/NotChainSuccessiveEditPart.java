package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.NotChainSuccessiveItemSemanticEditPolicy;

/**
 * @generated
 */
public class NotChainSuccessiveEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4018;

	/**
	 * @generated
	 */
	public NotChainSuccessiveEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NotChainSuccessiveItemSemanticEditPolicy());
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
		return new NotChainSuccessiveFigure();
	}

	/**
	 * @generated
	 */
	public NotChainSuccessiveFigure getPrimaryShape() {
		return (NotChainSuccessiveFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class NotChainSuccessiveFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotChainSuccessiveLabelFigure;

		/**
		 * @generated
		 */
		public NotChainSuccessiveFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureNotChainSuccessiveLabelFigure = new WrappingLabel();

			fFigureNotChainSuccessiveLabelFigure.setText("<...>");

			this.add(fFigureNotChainSuccessiveLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotChainSuccessiveLabelFigure() {
			return fFigureNotChainSuccessiveLabelFigure;
		}

	}

}
