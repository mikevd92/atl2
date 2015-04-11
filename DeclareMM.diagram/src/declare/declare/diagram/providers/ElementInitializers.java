package declare.declare.diagram.providers;

import declare.declare.diagram.part.DeclareDiagramEditorPlugin;

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
		ElementInitializers cached = DeclareDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			DeclareDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
