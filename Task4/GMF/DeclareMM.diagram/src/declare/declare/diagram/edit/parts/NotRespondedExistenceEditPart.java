package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.NotRespondedExistenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class NotRespondedExistenceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4012;

	/**
	 * @generated
	 */
	public NotRespondedExistenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NotRespondedExistenceItemSemanticEditPolicy());
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
		return new NotRespondedExistenceFigure();
	}

	/**
	 * @generated
	 */
	public NotRespondedExistenceFigure getPrimaryShape() {
		return (NotRespondedExistenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class NotRespondedExistenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotRespondedExistenceLabelFigure;

		/**
		 * @generated
		 */
		public NotRespondedExistenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureNotRespondedExistenceLabelFigure = new WrappingLabel();

			fFigureNotRespondedExistenceLabelFigure.setText("<...>");

			this.add(fFigureNotRespondedExistenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotRespondedExistenceLabelFigure() {
			return fFigureNotRespondedExistenceLabelFigure;
		}

	}

}
