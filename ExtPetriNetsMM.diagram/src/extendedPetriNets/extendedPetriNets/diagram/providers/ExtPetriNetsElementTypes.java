package extendedPetriNets.extendedPetriNets.diagram.providers;

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

/**
 * @generated
 */
public class ExtPetriNetsElementTypes {

	/**
	 * @generated
	 */
	private ExtPetriNetsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType PetriNet_1000 = getElementType("ExtPetriNetsMM.diagram.PetriNet_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_2001 = getElementType("ExtPetriNetsMM.diagram.Transition_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPort_2002 = getElementType("ExtPetriNetsMM.diagram.OutputPort_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Place_2003 = getElementType("ExtPetriNetsMM.diagram.Place_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPort_2004 = getElementType("ExtPetriNetsMM.diagram.InputPort_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputArc_4003 = getElementType("ExtPetriNetsMM.diagram.InputArc_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputArc_4004 = getElementType("ExtPetriNetsMM.diagram.OutputArc_4004"); //$NON-NLS-1$

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

			elements.put(
					PetriNet_1000,
					extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
							.getPetriNet());

			elements.put(
					Transition_2001,
					extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
							.getTransition());

			elements.put(
					OutputPort_2002,
					extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
							.getOutputPort());

			elements.put(
					Place_2003,
					extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
							.getPlace());

			elements.put(
					InputPort_2004,
					extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
							.getInputPort());

			elements.put(
					InputArc_4003,
					extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
							.getInputArc());

			elements.put(
					OutputArc_4004,
					extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
							.getOutputArc());
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
			KNOWN_ELEMENT_TYPES.add(PetriNet_1000);
			KNOWN_ELEMENT_TYPES.add(Transition_2001);
			KNOWN_ELEMENT_TYPES.add(OutputPort_2002);
			KNOWN_ELEMENT_TYPES.add(Place_2003);
			KNOWN_ELEMENT_TYPES.add(InputPort_2004);
			KNOWN_ELEMENT_TYPES.add(InputArc_4003);
			KNOWN_ELEMENT_TYPES.add(OutputArc_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return PetriNet_1000;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_2001;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return OutputPort_2002;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return Place_2003;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return InputPort_2004;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return InputArc_4003;
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return OutputArc_4004;
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
			return extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
