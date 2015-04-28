package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.AlternateResponseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AlternateResponseEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4022;

	/**
	 * @generated
	 */
	public AlternateResponseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AlternateResponseItemSemanticEditPolicy());
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
		return new AlternateResponseFigure();
	}

	/**
	 * @generated
	 */
	public AlternateResponseFigure getPrimaryShape() {
		return (AlternateResponseFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AlternateResponseFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAlternateResponseLabelFigure;

		/**
		 * @generated
		 */
		public AlternateResponseFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAlternateResponseLabelFigure = new WrappingLabel();

			fFigureAlternateResponseLabelFigure.setText("<...>");

			this.add(fFigureAlternateResponseLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAlternateResponseLabelFigure() {
			return fFigureAlternateResponseLabelFigure;
		}

	}

}
