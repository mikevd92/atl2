package extendedPetriNets.extendedPetriNets.diagram.part;

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
public class ExtPetriNetsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createExtendedPetriNets1Group());
	}

	/**
	 * Creates "extendedPetriNets" palette tool group
	 * @generated
	 */
	private PaletteContainer createExtendedPetriNets1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.ExtendedPetriNets1Group_title);
		paletteContainer.setId("createExtendedPetriNets1Group"); //$NON-NLS-1$
		paletteContainer.add(createPlace1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		paletteContainer.add(createInputArc3CreationTool());
		paletteContainer.add(createOutputArc4CreationTool());
		paletteContainer.add(createOutputPort5CreationTool());
		paletteContainer.add(createInputPort6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlace1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.Place1CreationTool_title,
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.Place1CreationTool_desc,
				Collections
						.singletonList(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Place_2003));
		entry.setId("createPlace1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
				.getImageDescriptor(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Place_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.Transition2CreationTool_title,
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.Transition2CreationTool_desc,
				Collections
						.singletonList(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Transition_2001));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
				.getImageDescriptor(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Transition_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputArc3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.InputArc3CreationTool_title,
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.InputArc3CreationTool_desc,
				Collections
						.singletonList(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003));
		entry.setId("createInputArc3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
				.getImageDescriptor(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputArc4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.OutputArc4CreationTool_title,
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.OutputArc4CreationTool_desc,
				Collections
						.singletonList(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004));
		entry.setId("createOutputArc4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
				.getImageDescriptor(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPort5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.OutputPort5CreationTool_title,
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.OutputPort5CreationTool_desc,
				Collections
						.singletonList(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputPort_2002));
		entry.setId("createOutputPort5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
				.getImageDescriptor(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputPort_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPort6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.InputPort6CreationTool_title,
				extendedPetriNets.extendedPetriNets.diagram.part.Messages.InputPort6CreationTool_desc,
				Collections
						.singletonList(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputPort_2004));
		entry.setId("createInputPort6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
				.getImageDescriptor(extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputPort_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
