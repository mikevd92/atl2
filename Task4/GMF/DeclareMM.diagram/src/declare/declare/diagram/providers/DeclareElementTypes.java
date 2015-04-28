package declare.declare.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import declare.declare.diagram.edit.parts.ActivityEditPart;
import declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart;
import declare.declare.diagram.edit.parts.AlternateResponseEditPart;
import declare.declare.diagram.edit.parts.ChainPrecedenceEditPart;
import declare.declare.diagram.edit.parts.ChainResponseEditPart;
import declare.declare.diagram.edit.parts.ChainSuccessionEditPart;
import declare.declare.diagram.edit.parts.ChoiceEditPart;
import declare.declare.diagram.edit.parts.CoExistenceEditPart;
import declare.declare.diagram.edit.parts.DeclareEditPart;
import declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart;
import declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart;
import declare.declare.diagram.edit.parts.NotChainRepsonseEditPart;
import declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart;
import declare.declare.diagram.edit.parts.NotCoExistenceEditPart;
import declare.declare.diagram.edit.parts.NotPrecedenceEditPart;
import declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart;
import declare.declare.diagram.edit.parts.NotResponseEditPart;
import declare.declare.diagram.edit.parts.NotSuccessionEditPart;
import declare.declare.diagram.edit.parts.PrecedenceEditPart;
import declare.declare.diagram.edit.parts.RespondedExistenceEditPart;
import declare.declare.diagram.edit.parts.ResponseEditPart;
import declare.declare.diagram.edit.parts.SuccessionEditPart;
import declare.declare.diagram.part.DeclareDiagramEditorPlugin;

/**
 * @generated
 */
public class DeclareElementTypes {

	/**
	 * @generated
	 */
	private DeclareElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DeclareDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Declare_1000 = getElementType("DeclareMM.diagram.Declare_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Activity_2001 = getElementType("DeclareMM.diagram.Activity_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RespondedExistence_4003 = getElementType("DeclareMM.diagram.RespondedExistence_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AlternatePrecedence_4004 = getElementType("DeclareMM.diagram.AlternatePrecedence_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Choice_4005 = getElementType("DeclareMM.diagram.Choice_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CoExistence_4006 = getElementType("DeclareMM.diagram.CoExistence_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExclusiveChoice_4007 = getElementType("DeclareMM.diagram.ExclusiveChoice_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NotChainPrecedence_4008 = getElementType("DeclareMM.diagram.NotChainPrecedence_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NotChainRepsonse_4009 = getElementType("DeclareMM.diagram.NotChainRepsonse_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NotCoExistence_4010 = getElementType("DeclareMM.diagram.NotCoExistence_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NotPrecedence_4011 = getElementType("DeclareMM.diagram.NotPrecedence_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NotRespondedExistence_4012 = getElementType("DeclareMM.diagram.NotRespondedExistence_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NotResponse_4013 = getElementType("DeclareMM.diagram.NotResponse_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NotSuccession_4014 = getElementType("DeclareMM.diagram.NotSuccession_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Succession_4015 = getElementType("DeclareMM.diagram.Succession_4015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Response_4016 = getElementType("DeclareMM.diagram.Response_4016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Precedence_4017 = getElementType("DeclareMM.diagram.Precedence_4017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NotChainSuccessive_4018 = getElementType("DeclareMM.diagram.NotChainSuccessive_4018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ChainPrecedence_4019 = getElementType("DeclareMM.diagram.ChainPrecedence_4019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ChainResponse_4020 = getElementType("DeclareMM.diagram.ChainResponse_4020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ChainSuccession_4021 = getElementType("DeclareMM.diagram.ChainSuccession_4021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AlternateResponse_4022 = getElementType("DeclareMM.diagram.AlternateResponse_4022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Declare_1000,
					declare.declare.declarePackage.eINSTANCE.getDeclare());

			elements.put(Activity_2001,
					declare.declare.declarePackage.eINSTANCE.getActivity());

			elements.put(RespondedExistence_4003,
					declare.declare.declarePackage.eINSTANCE
							.getRespondedExistence());

			elements.put(AlternatePrecedence_4004,
					declare.declare.declarePackage.eINSTANCE
							.getAlternatePrecedence());

			elements.put(Choice_4005,
					declare.declare.declarePackage.eINSTANCE.getChoice());

			elements.put(CoExistence_4006,
					declare.declare.declarePackage.eINSTANCE.getCoExistence());

			elements.put(ExclusiveChoice_4007,
					declare.declare.declarePackage.eINSTANCE
							.getExclusiveChoice());

			elements.put(NotChainPrecedence_4008,
					declare.declare.declarePackage.eINSTANCE
							.getNotChainPrecedence());

			elements.put(NotChainRepsonse_4009,
					declare.declare.declarePackage.eINSTANCE
							.getNotChainRepsonse());

			elements.put(NotCoExistence_4010,
					declare.declare.declarePackage.eINSTANCE
							.getNotCoExistence());

			elements.put(NotPrecedence_4011,
					declare.declare.declarePackage.eINSTANCE.getNotPrecedence());

			elements.put(NotRespondedExistence_4012,
					declare.declare.declarePackage.eINSTANCE
							.getNotRespondedExistence());

			elements.put(NotResponse_4013,
					declare.declare.declarePackage.eINSTANCE.getNotResponse());

			elements.put(NotSuccession_4014,
					declare.declare.declarePackage.eINSTANCE.getNotSuccession());

			elements.put(Succession_4015,
					declare.declare.declarePackage.eINSTANCE.getSuccession());

			elements.put(Response_4016,
					declare.declare.declarePackage.eINSTANCE.getResponse());

			elements.put(Precedence_4017,
					declare.declare.declarePackage.eINSTANCE.getPrecedence());

			elements.put(NotChainSuccessive_4018,
					declare.declare.declarePackage.eINSTANCE
							.getNotChainSuccessive());

			elements.put(ChainPrecedence_4019,
					declare.declare.declarePackage.eINSTANCE
							.getChainPrecedence());

			elements.put(ChainResponse_4020,
					declare.declare.declarePackage.eINSTANCE.getChainResponse());

			elements.put(ChainSuccession_4021,
					declare.declare.declarePackage.eINSTANCE
							.getChainSuccession());

			elements.put(AlternateResponse_4022,
					declare.declare.declarePackage.eINSTANCE
							.getAlternateResponse());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Declare_1000);
			KNOWN_ELEMENT_TYPES.add(Activity_2001);
			KNOWN_ELEMENT_TYPES.add(RespondedExistence_4003);
			KNOWN_ELEMENT_TYPES.add(AlternatePrecedence_4004);
			KNOWN_ELEMENT_TYPES.add(Choice_4005);
			KNOWN_ELEMENT_TYPES.add(CoExistence_4006);
			KNOWN_ELEMENT_TYPES.add(ExclusiveChoice_4007);
			KNOWN_ELEMENT_TYPES.add(NotChainPrecedence_4008);
			KNOWN_ELEMENT_TYPES.add(NotChainRepsonse_4009);
			KNOWN_ELEMENT_TYPES.add(NotCoExistence_4010);
			KNOWN_ELEMENT_TYPES.add(NotPrecedence_4011);
			KNOWN_ELEMENT_TYPES.add(NotRespondedExistence_4012);
			KNOWN_ELEMENT_TYPES.add(NotResponse_4013);
			KNOWN_ELEMENT_TYPES.add(NotSuccession_4014);
			KNOWN_ELEMENT_TYPES.add(Succession_4015);
			KNOWN_ELEMENT_TYPES.add(Response_4016);
			KNOWN_ELEMENT_TYPES.add(Precedence_4017);
			KNOWN_ELEMENT_TYPES.add(NotChainSuccessive_4018);
			KNOWN_ELEMENT_TYPES.add(ChainPrecedence_4019);
			KNOWN_ELEMENT_TYPES.add(ChainResponse_4020);
			KNOWN_ELEMENT_TYPES.add(ChainSuccession_4021);
			KNOWN_ELEMENT_TYPES.add(AlternateResponse_4022);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DeclareEditPart.VISUAL_ID:
			return Declare_1000;
		case ActivityEditPart.VISUAL_ID:
			return Activity_2001;
		case RespondedExistenceEditPart.VISUAL_ID:
			return RespondedExistence_4003;
		case AlternatePrecedenceEditPart.VISUAL_ID:
			return AlternatePrecedence_4004;
		case ChoiceEditPart.VISUAL_ID:
			return Choice_4005;
		case CoExistenceEditPart.VISUAL_ID:
			return CoExistence_4006;
		case ExclusiveChoiceEditPart.VISUAL_ID:
			return ExclusiveChoice_4007;
		case NotChainPrecedenceEditPart.VISUAL_ID:
			return NotChainPrecedence_4008;
		case NotChainRepsonseEditPart.VISUAL_ID:
			return NotChainRepsonse_4009;
		case NotCoExistenceEditPart.VISUAL_ID:
			return NotCoExistence_4010;
		case NotPrecedenceEditPart.VISUAL_ID:
			return NotPrecedence_4011;
		case NotRespondedExistenceEditPart.VISUAL_ID:
			return NotRespondedExistence_4012;
		case NotResponseEditPart.VISUAL_ID:
			return NotResponse_4013;
		case NotSuccessionEditPart.VISUAL_ID:
			return NotSuccession_4014;
		case SuccessionEditPart.VISUAL_ID:
			return Succession_4015;
		case ResponseEditPart.VISUAL_ID:
			return Response_4016;
		case PrecedenceEditPart.VISUAL_ID:
			return Precedence_4017;
		case NotChainSuccessiveEditPart.VISUAL_ID:
			return NotChainSuccessive_4018;
		case ChainPrecedenceEditPart.VISUAL_ID:
			return ChainPrecedence_4019;
		case ChainResponseEditPart.VISUAL_ID:
			return ChainResponse_4020;
		case ChainSuccessionEditPart.VISUAL_ID:
			return ChainSuccession_4021;
		case AlternateResponseEditPart.VISUAL_ID:
			return AlternateResponse_4022;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return declare.declare.diagram.providers.DeclareElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return declare.declare.diagram.providers.DeclareElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return declare.declare.diagram.providers.DeclareElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
