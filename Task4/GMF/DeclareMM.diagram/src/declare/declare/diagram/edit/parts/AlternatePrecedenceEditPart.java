package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.AlternatePrecedenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class AlternatePrecedenceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public AlternatePrecedenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AlternatePrecedenceItemSemanticEditPolicy());
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
		return new AlternatePrecedenceFigure();
	}

	/**
	 * @generated
	 */
	public AlternatePrecedenceFigure getPrimaryShape() {
		return (AlternatePrecedenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AlternatePrecedenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAlternatePrecedenceLabelFigure;

		/**
		 * @generated
		 */
		public AlternatePrecedenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAlternatePrecedenceLabelFigure = new WrappingLabel();

			fFigureAlternatePrecedenceLabelFigure.setText("<...>");

			this.add(fFigureAlternatePrecedenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAlternatePrecedenceLabelFigure() {
			return fFigureAlternatePrecedenceLabelFigure;
		}

	}

}
