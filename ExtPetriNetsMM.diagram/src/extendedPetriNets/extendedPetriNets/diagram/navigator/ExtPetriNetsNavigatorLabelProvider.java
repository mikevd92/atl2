package extendedPetriNets.extendedPetriNets.diagram.navigator;

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
public class ExtPetriNetsNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem
				&& !isOwnView(((extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) element)
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
		if (element instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup) {
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup group = (extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup) element;
			return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) {
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem navigatorItem = (extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) element;
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
		switch (extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?platform:/resource/ExtPetriNetsMM/model/ExtPetriNets.ecore?PetriNet", extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.PetriNet_1000); //$NON-NLS-1$
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/ExtPetriNetsMM/model/ExtPetriNets.ecore?Transition", extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Transition_2001); //$NON-NLS-1$
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/ExtPetriNetsMM/model/ExtPetriNets.ecore?OutputPort", extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputPort_2002); //$NON-NLS-1$
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/ExtPetriNetsMM/model/ExtPetriNets.ecore?Place", extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Place_2003); //$NON-NLS-1$
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/ExtPetriNetsMM/model/ExtPetriNets.ecore?InputPort", extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputPort_2004); //$NON-NLS-1$
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/ExtPetriNetsMM/model/ExtPetriNets.ecore?InputArc", extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputArc_4003); //$NON-NLS-1$
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/ExtPetriNetsMM/model/ExtPetriNets.ecore?OutputArc", extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputArc_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
						.isKnownElementType(elementType)) {
			image = extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
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
		if (element instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup) {
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup group = (extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) {
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem navigatorItem = (extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) element;
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
		switch (extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getVisualID(view)) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000Text(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2001Text(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2002Text(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2003Text(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_2004Text(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID:
			return getInputArc_4003Text(view);
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID:
			return getOutputArc_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPetriNet_1000Text(View view) {
		extendedPetriNets.extendedPetriNets.PetriNet domainModelElement = (extendedPetriNets.extendedPetriNets.PetriNet) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_2001Text(View view) {
		IParser parser = extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsParserProvider
				.getParser(
						extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Transition_2001,
						view.getElement() != null ? view.getElement() : view,
						extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
								.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputPort_2002Text(View view) {
		IParser parser = extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsParserProvider
				.getParser(
						extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.OutputPort_2002,
						view.getElement() != null ? view.getElement() : view,
						extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
								.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlace_2003Text(View view) {
		IParser parser = extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsParserProvider
				.getParser(
						extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.Place_2003,
						view.getElement() != null ? view.getElement() : view,
						extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
								.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputPort_2004Text(View view) {
		IParser parser = extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsParserProvider
				.getParser(
						extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes.InputPort_2004,
						view.getElement() != null ? view.getElement() : view,
						extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
								.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputArc_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutputArc_4004Text(View view) {
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
		return extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
						.getModelID(view));
	}

}
