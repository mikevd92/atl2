package resourcePetriNet.resourcePetriNet.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class InputArcEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public InputArcEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new resourcePetriNet.resourcePetriNet.diagram.edit.policies.InputArcItemSemanticEditPolicy());
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
		return new InputArcFigure();
	}

	/**
	 * @generated
	 */
	public InputArcFigure getPrimaryShape() {
		return (InputArcFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InputArcFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInputArcWeightFigure;

		/**
		 * @generated
		 */
		public InputArcFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInputArcWeightFigure = new WrappingLabel();

			fFigureInputArcWeightFigure.setText("<...>");

			this.add(fFigureInputArcWeightFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInputArcWeightFigure() {
			return fFigureInputArcWeightFigure;
		}

	}

}
