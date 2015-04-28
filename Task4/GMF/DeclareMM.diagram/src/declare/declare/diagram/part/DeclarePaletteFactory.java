package declare.declare.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import declare.declare.diagram.providers.DeclareElementTypes;

/**
 * @generated
 */
public class DeclarePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDeclare1Group());
	}

	/**
	 * Creates "declare" palette tool group
	 * @generated
	 */
	private PaletteContainer createDeclare1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Declare1Group_title);
		paletteContainer.setId("createDeclare1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivity1CreationTool());
		paletteContainer.add(createRespondedExistence2CreationTool());
		paletteContainer.add(createCoExistence3CreationTool());
		paletteContainer.add(createResponse4CreationTool());
		paletteContainer.add(createPrecedence5CreationTool());
		paletteContainer.add(createSuccession6CreationTool());
		paletteContainer.add(createAlternateResponse7CreationTool());
		paletteContainer.add(createAlternatePrecedence8CreationTool());
		paletteContainer.add(createChainResponse9CreationTool());
		paletteContainer.add(createChainSuccession10CreationTool());
		paletteContainer.add(createChainPrecedence11CreationTool());
		paletteContainer.add(createNotCoExistence12CreationTool());
		paletteContainer.add(createNotRespondedExistence13CreationTool());
		paletteContainer.add(createNotResponse14CreationTool());
		paletteContainer.add(createNotPrecedence15CreationTool());
		paletteContainer.add(createNotSuccession16CreationTool());
		paletteContainer.add(createNotChainRepsonse17CreationTool());
		paletteContainer.add(createNotChainSuccessive18CreationTool());
		paletteContainer.add(createNotChainPrecedence19CreationTool());
		paletteContainer.add(createChoice20CreationTool());
		paletteContainer.add(createExclusiveChoice21CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Activity1CreationTool_title,
				Messages.Activity1CreationTool_desc,
				Collections.singletonList(DeclareElementTypes.Activity_2001));
		entry.setId("createActivity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.Activity_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRespondedExistence2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RespondedExistence2CreationTool_title,
				Messages.RespondedExistence2CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.RespondedExistence_4003));
		entry.setId("createRespondedExistence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.RespondedExistence_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoExistence3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.CoExistence3CreationTool_title,
				Messages.CoExistence3CreationTool_desc,
				Collections.singletonList(DeclareElementTypes.CoExistence_4006));
		entry.setId("createCoExistence3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.CoExistence_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResponse4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Response4CreationTool_title,
				Messages.Response4CreationTool_desc,
				Collections.singletonList(DeclareElementTypes.Response_4016));
		entry.setId("createResponse4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.Response_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrecedence5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Precedence5CreationTool_title,
				Messages.Precedence5CreationTool_desc,
				Collections.singletonList(DeclareElementTypes.Precedence_4017));
		entry.setId("createPrecedence5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.Precedence_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSuccession6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Succession6CreationTool_title,
				Messages.Succession6CreationTool_desc,
				Collections.singletonList(DeclareElementTypes.Succession_4015));
		entry.setId("createSuccession6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.Succession_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAlternateResponse7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.AlternateResponse7CreationTool_title,
				Messages.AlternateResponse7CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.AlternateResponse_4022));
		entry.setId("createAlternateResponse7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.AlternateResponse_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAlternatePrecedence8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.AlternatePrecedence8CreationTool_title,
				Messages.AlternatePrecedence8CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.AlternatePrecedence_4004));
		entry.setId("createAlternatePrecedence8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.AlternatePrecedence_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChainResponse9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ChainResponse9CreationTool_title,
				Messages.ChainResponse9CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.ChainResponse_4020));
		entry.setId("createChainResponse9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.ChainResponse_4020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChainSuccession10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ChainSuccession10CreationTool_title,
				Messages.ChainSuccession10CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.ChainSuccession_4021));
		entry.setId("createChainSuccession10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.ChainSuccession_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChainPrecedence11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ChainPrecedence11CreationTool_title,
				Messages.ChainPrecedence11CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.ChainPrecedence_4019));
		entry.setId("createChainPrecedence11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.ChainPrecedence_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotCoExistence12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.NotCoExistence12CreationTool_title,
				Messages.NotCoExistence12CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.NotCoExistence_4010));
		entry.setId("createNotCoExistence12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.NotCoExistence_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotRespondedExistence13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.NotRespondedExistence13CreationTool_title,
				Messages.NotRespondedExistence13CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.NotRespondedExistence_4012));
		entry.setId("createNotRespondedExistence13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.NotRespondedExistence_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotResponse14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.NotResponse14CreationTool_title,
				Messages.NotResponse14CreationTool_desc,
				Collections.singletonList(DeclareElementTypes.NotResponse_4013));
		entry.setId("createNotResponse14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.NotResponse_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotPrecedence15CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.NotPrecedence15CreationTool_title,
				Messages.NotPrecedence15CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.NotPrecedence_4011));
		entry.setId("createNotPrecedence15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.NotPrecedence_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotSuccession16CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.NotSuccession16CreationTool_title,
				Messages.NotSuccession16CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.NotSuccession_4014));
		entry.setId("createNotSuccession16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.NotSuccession_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotChainRepsonse17CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.NotChainRepsonse17CreationTool_title,
				Messages.NotChainRepsonse17CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.NotChainRepsonse_4009));
		entry.setId("createNotChainRepsonse17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.NotChainRepsonse_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotChainSuccessive18CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.NotChainSuccessive18CreationTool_title,
				Messages.NotChainSuccessive18CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.NotChainSuccessive_4018));
		entry.setId("createNotChainSuccessive18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.NotChainSuccessive_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotChainPrecedence19CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.NotChainPrecedence19CreationTool_title,
				Messages.NotChainPrecedence19CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.NotChainPrecedence_4008));
		entry.setId("createNotChainPrecedence19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.NotChainPrecedence_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice20CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Choice20CreationTool_title,
				Messages.Choice20CreationTool_desc,
				Collections.singletonList(DeclareElementTypes.Choice_4005));
		entry.setId("createChoice20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.Choice_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExclusiveChoice21CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ExclusiveChoice21CreationTool_title,
				Messages.ExclusiveChoice21CreationTool_desc,
				Collections
						.singletonList(DeclareElementTypes.ExclusiveChoice_4007));
		entry.setId("createExclusiveChoice21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DeclareElementTypes
				.getImageDescriptor(DeclareElementTypes.ExclusiveChoice_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
