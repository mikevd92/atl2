package resourcePetriNet.resourcePetriNet.diagram.providers;

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
public class ResourcePetriNetsElementTypes {

	/**
	 * @generated
	 */
	private ResourcePetriNetsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType PetriNet_1000 = getElementType("ResourcePetriNetsMM.diagram.PetriNet_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Place_2001 = getElementType("ResourcePetriNetsMM.diagram.Place_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_2002 = getElementType("ResourcePetriNetsMM.diagram.Resource_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_2003 = getElementType("ResourcePetriNetsMM.diagram.Transition_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputArc_4001 = getElementType("ResourcePetriNetsMM.diagram.InputArc_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputArc_4002 = getElementType("ResourcePetriNetsMM.diagram.OutputArc_4002"); //$NON-NLS-1$

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
					resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
							.getPetriNet());

			elements.put(
					Place_2001,
					resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
							.getPlace());

			elements.put(
					Resource_2002,
					resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
							.getResource());

			elements.put(
					Transition_2003,
					resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
							.getTransition());

			elements.put(
					InputArc_4001,
					resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
							.getInputArc());

			elements.put(
					OutputArc_4002,
					resourcePetriNet.resourcePetriNet.resourcePetriNetPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(Place_2001);
			KNOWN_ELEMENT_TYPES.add(Resource_2002);
			KNOWN_ELEMENT_TYPES.add(Transition_2003);
			KNOWN_ELEMENT_TYPES.add(InputArc_4001);
			KNOWN_ELEMENT_TYPES.add(OutputArc_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return PetriNet_1000;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return Place_2001;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return Resource_2002;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_2003;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return InputArc_4001;
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return OutputArc_4002;
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
			return resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
