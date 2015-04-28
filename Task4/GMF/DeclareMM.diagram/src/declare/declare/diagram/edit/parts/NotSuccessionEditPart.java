package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.NotSuccessionItemSemanticEditPolicy;

/**
 * @generated
 */
public class NotSuccessionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4014;

	/**
	 * @generated
	 */
	public NotSuccessionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NotSuccessionItemSemanticEditPolicy());
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
		return new NotSuccessionFigure();
	}

	/**
	 * @generated
	 */
	public NotSuccessionFigure getPrimaryShape() {
		return (NotSuccessionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class NotSuccessionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotSuccessionLabelFigure;

		/**
		 * @generated
		 */
		public NotSuccessionFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureNotSuccessionLabelFigure = new WrappingLabel();

			fFigureNotSuccessionLabelFigure.setText("<...>");

			this.add(fFigureNotSuccessionLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotSuccessionLabelFigure() {
			return fFigureNotSuccessionLabelFigure;
		}

	}

}
