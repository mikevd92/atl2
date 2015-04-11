package extendedPetriNets.extendedPetriNets.diagram.preferences;

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
		extendedPetriNets.extendedPetriNets.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		extendedPetriNets.extendedPetriNets.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		extendedPetriNets.extendedPetriNets.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		extendedPetriNets.extendedPetriNets.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		extendedPetriNets.extendedPetriNets.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
