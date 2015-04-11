package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.CoExistenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class CoExistenceEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * @generated
	 */
	public CoExistenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CoExistenceItemSemanticEditPolicy());
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
		return new CoExistenceFigure();
	}

	/**
	 * @generated
	 */
	public CoExistenceFigure getPrimaryShape() {
		return (CoExistenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class CoExistenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCoExistenceLabelFigure;

		/**
		 * @generated
		 */
		public CoExistenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCoExistenceLabelFigure = new WrappingLabel();

			fFigureCoExistenceLabelFigure.setText("<...>");

			this.add(fFigureCoExistenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCoExistenceLabelFigure() {
			return fFigureCoExistenceLabelFigure;
		}

	}

}
