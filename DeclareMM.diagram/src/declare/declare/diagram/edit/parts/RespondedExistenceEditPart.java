package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.RespondedExistenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class RespondedExistenceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public RespondedExistenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RespondedExistenceItemSemanticEditPolicy());
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
		return new RespondedExistenceFigure();
	}

	/**
	 * @generated
	 */
	public RespondedExistenceFigure getPrimaryShape() {
		return (RespondedExistenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RespondedExistenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRespondedExistenceLabelFigure;

		/**
		 * @generated
		 */
		public RespondedExistenceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRespondedExistenceLabelFigure = new WrappingLabel();

			fFigureRespondedExistenceLabelFigure.setText("<...>");

			this.add(fFigureRespondedExistenceLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRespondedExistenceLabelFigure() {
			return fFigureRespondedExistenceLabelFigure;
		}

	}

}
