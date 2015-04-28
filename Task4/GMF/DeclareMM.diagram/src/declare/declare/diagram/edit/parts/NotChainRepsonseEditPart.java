package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.NotChainRepsonseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NotChainRepsonseEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * @generated
	 */
	public NotChainRepsonseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NotChainRepsonseItemSemanticEditPolicy());
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
		return new NotChainRepsonseFigure();
	}

	/**
	 * @generated
	 */
	public NotChainRepsonseFigure getPrimaryShape() {
		return (NotChainRepsonseFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class NotChainRepsonseFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotChainRepsonseLabelFigure;

		/**
		 * @generated
		 */
		public NotChainRepsonseFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureNotChainRepsonseLabelFigure = new WrappingLabel();

			fFigureNotChainRepsonseLabelFigure.setText("<...>");

			this.add(fFigureNotChainRepsonseLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotChainRepsonseLabelFigure() {
			return fFigureNotChainRepsonseLabelFigure;
		}

	}

}
