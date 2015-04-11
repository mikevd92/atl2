package resourcePetriNet.resourcePetriNet.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ResourcePetriNetsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createResourcePetriNet1Group());
	}

	/**
	 * Creates "resourcePetriNet" palette tool group
	 * @generated
	 */
	private PaletteContainer createResourcePetriNet1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.ResourcePetriNet1Group_title);
		paletteContainer.setId("createResourcePetriNet1Group"); //$NON-NLS-1$
		paletteContainer.add(createPlace1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		paletteContainer.add(createInputArc3CreationTool());
		paletteContainer.add(createOutputArc4CreationTool());
		paletteContainer.add(createResource5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlace1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.Place1CreationTool_title,
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.Place1CreationTool_desc,
				Collections
						.singletonList(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Place_2001));
		entry.setId("createPlace1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
				.getImageDescriptor(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Place_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.Transition2CreationTool_title,
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.Transition2CreationTool_desc,
				Collections
						.singletonList(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Transition_2003));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
				.getImageDescriptor(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Transition_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputArc3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.InputArc3CreationTool_title,
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.InputArc3CreationTool_desc,
				Collections
						.singletonList(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001));
		entry.setId("createInputArc3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
				.getImageDescriptor(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputArc4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.OutputArc4CreationTool_title,
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.OutputArc4CreationTool_desc,
				Collections
						.singletonList(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002));
		entry.setId("createOutputArc4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
				.getImageDescriptor(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.Resource5CreationTool_title,
				resourcePetriNet.resourcePetriNet.diagram.part.Messages.Resource5CreationTool_desc,
				Collections
						.singletonList(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Resource_2002));
		entry.setId("createResource5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
				.getImageDescriptor(resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Resource_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
