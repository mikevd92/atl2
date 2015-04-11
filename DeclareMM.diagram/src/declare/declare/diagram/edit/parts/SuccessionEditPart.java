package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.SuccessionItemSemanticEditPolicy;

/**
 * @generated
 */
public class SuccessionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4021;

	/**
	 * @generated
	 */
	public SuccessionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SuccessionItemSemanticEditPolicy());
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
		return new SuccessionFigure();
	}

	/**
	 * @generated
	 */
	public SuccessionFigure getPrimaryShape() {
		return (SuccessionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SuccessionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSuccessionLabelFigure;

		/**
		 * @generated
		 */
		public SuccessionFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSuccessionLabelFigure = new WrappingLabel();

			fFigureSuccessionLabelFigure.setText("<...>");

			this.add(fFigureSuccessionLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSuccessionLabelFigure() {
			return fFigureSuccessionLabelFigure;
		}

	}

}
