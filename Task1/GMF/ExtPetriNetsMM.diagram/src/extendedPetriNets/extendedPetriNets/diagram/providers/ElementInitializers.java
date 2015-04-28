package extendedPetriNets.extendedPetriNets.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
