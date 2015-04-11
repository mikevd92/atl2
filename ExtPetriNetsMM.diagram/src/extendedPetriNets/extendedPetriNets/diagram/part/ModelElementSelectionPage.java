package extendedPetriNets.extendedPetriNets.diagram.part;

import org.eclipse.gmf.tooling.runtime.part.DefaultModelElementSelectionPage;

/**
 * Wizard page that allows to select element from model.
 * @generated
 */
public class ModelElementSelectionPage extends DefaultModelElementSelectionPage {

	/**
	 * @generated
	 */
	public ModelElementSelectionPage(String pageName) {
		super(
				extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory(),
				pageName);
	}

	/**
	 * Override to provide custom model element description.
	 * @generated
	 */
	protected String getSelectionTitle() {
		return extendedPetriNets.extendedPetriNets.diagram.part.Messages.ModelElementSelectionPageMessage;
	}

}
