package declare.declare.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.policies.ResponseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ResponseEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4020;

	/**
	 * @generated
	 */
	public ResponseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ResponseItemSemanticEditPolicy());
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
		return new ResponseFigure();
	}

	/**
	 * @generated
	 */
	public ResponseFigure getPrimaryShape() {
		return (ResponseFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ResponseFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureResponseLabelFigure;

		/**
		 * @generated
		 */
		public ResponseFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureResponseLabelFigure = new WrappingLabel();

			fFigureResponseLabelFigure.setText("<...>");

			this.add(fFigureResponseLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResponseLabelFigure() {
			return fFigureResponseLabelFigure;
		}

	}

}
