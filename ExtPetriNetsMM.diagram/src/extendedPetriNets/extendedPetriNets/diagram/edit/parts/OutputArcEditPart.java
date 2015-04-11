package extendedPetriNets.extendedPetriNets.diagram.edit.parts;

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
public class OutputArcEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public OutputArcEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new extendedPetriNets.extendedPetriNets.diagram.edit.policies.OutputArcItemSemanticEditPolicy());
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
		return new OutputArcFigure();
	}

	/**
	 * @generated
	 */
	public OutputArcFigure getPrimaryShape() {
		return (OutputArcFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class OutputArcFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOutputArcWeightFigure;

		/**
		 * @generated
		 */
		public OutputArcFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureOutputArcWeightFigure = new WrappingLabel();

			fFigureOutputArcWeightFigure.setText("<...>");

			this.add(fFigureOutputArcWeightFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOutputArcWeightFigure() {
			return fFigureOutputArcWeightFigure;
		}

	}

}
