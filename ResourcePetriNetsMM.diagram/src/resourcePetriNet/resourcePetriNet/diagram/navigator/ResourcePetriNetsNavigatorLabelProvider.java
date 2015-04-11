package resourcePetriNet.resourcePetriNet.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ResourcePetriNetsNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem
				&& !isOwnView(((resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup) {
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup group = (resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup) element;
			return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) {
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem navigatorItem = (resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?platform:/resource/ResourcePetriNetsMM/model/ResourcePetriNets.ecore?PetriNet", resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.PetriNet_1000); //$NON-NLS-1$
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/ResourcePetriNetsMM/model/ResourcePetriNets.ecore?Place", resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Place_2001); //$NON-NLS-1$
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/ResourcePetriNetsMM/model/ResourcePetriNets.ecore?Resource", resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Resource_2002); //$NON-NLS-1$
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/ResourcePetriNetsMM/model/ResourcePetriNets.ecore?Transition", resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Transition_2003); //$NON-NLS-1$
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/ResourcePetriNetsMM/model/ResourcePetriNets.ecore?InputArc", resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.InputArc_4001); //$NON-NLS-1$
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/ResourcePetriNetsMM/model/ResourcePetriNets.ecore?OutputArc", resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.OutputArc_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
						.isKnownElementType(elementType)) {
			image = resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup) {
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup group = (resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) {
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem navigatorItem = (resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000Text(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2001Text(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_2002Text(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2003Text(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getInputArc_4001Text(view);
		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getOutputArc_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPetriNet_1000Text(View view) {
		resourcePetriNet.resourcePetriNet.PetriNet domainModelElement = (resourcePetriNet.resourcePetriNet.PetriNet) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlace_2001Text(View view) {
		IParser parser = resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsParserProvider
				.getParser(
						resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Place_2001,
						view.getElement() != null ? view.getElement() : view,
						resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
								.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResource_2002Text(View view) {
		IParser parser = resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsParserProvider
				.getParser(
						resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Resource_2002,
						view.getElement() != null ? view.getElement() : view,
						resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
								.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_2003Text(View view) {
		IParser parser = resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsParserProvider
				.getParser(
						resourcePetriNet.resourcePetriNet.diagram.providers.ResourcePetriNetsElementTypes.Transition_2003,
						view.getElement() != null ? view.getElement() : view,
						resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
								.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputArc_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutputArc_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
						.getModelID(view));
	}

}
