package resourcePetriNet.resourcePetriNet.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		resourcePetriNet.resourcePetriNet.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		resourcePetriNet.resourcePetriNet.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		resourcePetriNet.resourcePetriNet.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		resourcePetriNet.resourcePetriNet.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		resourcePetriNet.resourcePetriNet.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
