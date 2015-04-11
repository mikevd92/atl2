package declare.declare.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import declare.declare.diagram.edit.parts.DeclareEditPart;
import declare.declare.diagram.edit.parts.DeclareEditPartFactory;
import declare.declare.diagram.part.DeclareVisualIDRegistry;

/**
 * @generated
 */
public class DeclareEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DeclareEditPartProvider() {
		super(new DeclareEditPartFactory(),
				DeclareVisualIDRegistry.TYPED_INSTANCE,
				DeclareEditPart.MODEL_ID);
	}

}
