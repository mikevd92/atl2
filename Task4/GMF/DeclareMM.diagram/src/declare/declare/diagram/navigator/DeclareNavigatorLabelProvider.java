package declare.declare.diagram.navigator;

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

import declare.declare.AlternatePrecedence;
import declare.declare.AlternateResponse;
import declare.declare.ChainPrecedence;
import declare.declare.ChainResponse;
import declare.declare.ChainSuccession;
import declare.declare.Choice;
import declare.declare.CoExistence;
import declare.declare.ExclusiveChoice;
import declare.declare.NotChainPrecedence;
import declare.declare.NotChainRepsonse;
import declare.declare.NotChainSuccessive;
import declare.declare.NotCoExistence;
import declare.declare.NotPrecedence;
import declare.declare.NotRespondedExistence;
import declare.declare.NotResponse;
import declare.declare.NotSuccession;
import declare.declare.Precedence;
import declare.declare.RespondedExistence;
import declare.declare.Response;
import declare.declare.Succession;
import declare.declare.diagram.edit.parts.ActivityEditPart;
import declare.declare.diagram.edit.parts.ActivityNameEditPart;
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
import declare.declare.diagram.part.DeclareVisualIDRegistry;
import declare.declare.diagram.providers.DeclareElementTypes;
import declare.declare.diagram.providers.DeclareParserProvider;

/**
 * @generated
 */
public class DeclareNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DeclareDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DeclareDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DeclareNavigatorItem
				&& !isOwnView(((DeclareNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DeclareNavigatorGroup) {
			DeclareNavigatorGroup group = (DeclareNavigatorGroup) element;
			return DeclareDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DeclareNavigatorItem) {
			DeclareNavigatorItem navigatorItem = (DeclareNavigatorItem) element;
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
		switch (DeclareVisualIDRegistry.getVisualID(view)) {
		case DeclareEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?platform:/resource/DeclareMM/model/Declare.ecore?Declare", DeclareElementTypes.Declare_1000); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?platform:/resource/DeclareMM/model/Declare.ecore?Activity", DeclareElementTypes.Activity_2001); //$NON-NLS-1$
		case RespondedExistenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?RespondedExistence", DeclareElementTypes.RespondedExistence_4003); //$NON-NLS-1$
		case AlternatePrecedenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?AlternatePrecedence", DeclareElementTypes.AlternatePrecedence_4004); //$NON-NLS-1$
		case ChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?Choice", DeclareElementTypes.Choice_4005); //$NON-NLS-1$
		case CoExistenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?CoExistence", DeclareElementTypes.CoExistence_4006); //$NON-NLS-1$
		case ExclusiveChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?ExclusiveChoice", DeclareElementTypes.ExclusiveChoice_4007); //$NON-NLS-1$
		case NotChainPrecedenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?NotChainPrecedence", DeclareElementTypes.NotChainPrecedence_4008); //$NON-NLS-1$
		case NotChainRepsonseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?NotChainRepsonse", DeclareElementTypes.NotChainRepsonse_4009); //$NON-NLS-1$
		case NotCoExistenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?NotCoExistence", DeclareElementTypes.NotCoExistence_4010); //$NON-NLS-1$
		case NotPrecedenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?NotPrecedence", DeclareElementTypes.NotPrecedence_4011); //$NON-NLS-1$
		case NotRespondedExistenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?NotRespondedExistence", DeclareElementTypes.NotRespondedExistence_4012); //$NON-NLS-1$
		case NotResponseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?NotResponse", DeclareElementTypes.NotResponse_4013); //$NON-NLS-1$
		case NotSuccessionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?NotSuccession", DeclareElementTypes.NotSuccession_4014); //$NON-NLS-1$
		case SuccessionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?Succession", DeclareElementTypes.Succession_4015); //$NON-NLS-1$
		case ResponseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?Response", DeclareElementTypes.Response_4016); //$NON-NLS-1$
		case PrecedenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?Precedence", DeclareElementTypes.Precedence_4017); //$NON-NLS-1$
		case NotChainSuccessiveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?NotChainSuccessive", DeclareElementTypes.NotChainSuccessive_4018); //$NON-NLS-1$
		case ChainPrecedenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?ChainPrecedence", DeclareElementTypes.ChainPrecedence_4019); //$NON-NLS-1$
		case ChainResponseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?ChainResponse", DeclareElementTypes.ChainResponse_4020); //$NON-NLS-1$
		case ChainSuccessionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?ChainSuccession", DeclareElementTypes.ChainSuccession_4021); //$NON-NLS-1$
		case AlternateResponseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?platform:/resource/DeclareMM/model/Declare.ecore?AlternateResponse", DeclareElementTypes.AlternateResponse_4022); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DeclareDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DeclareElementTypes.isKnownElementType(elementType)) {
			image = DeclareElementTypes.getImage(elementType);
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
		if (element instanceof DeclareNavigatorGroup) {
			DeclareNavigatorGroup group = (DeclareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DeclareNavigatorItem) {
			DeclareNavigatorItem navigatorItem = (DeclareNavigatorItem) element;
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
		switch (DeclareVisualIDRegistry.getVisualID(view)) {
		case DeclareEditPart.VISUAL_ID:
			return getDeclare_1000Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2001Text(view);
		case RespondedExistenceEditPart.VISUAL_ID:
			return getRespondedExistence_4003Text(view);
		case AlternatePrecedenceEditPart.VISUAL_ID:
			return getAlternatePrecedence_4004Text(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_4005Text(view);
		case CoExistenceEditPart.VISUAL_ID:
			return getCoExistence_4006Text(view);
		case ExclusiveChoiceEditPart.VISUAL_ID:
			return getExclusiveChoice_4007Text(view);
		case NotChainPrecedenceEditPart.VISUAL_ID:
			return getNotChainPrecedence_4008Text(view);
		case NotChainRepsonseEditPart.VISUAL_ID:
			return getNotChainRepsonse_4009Text(view);
		case NotCoExistenceEditPart.VISUAL_ID:
			return getNotCoExistence_4010Text(view);
		case NotPrecedenceEditPart.VISUAL_ID:
			return getNotPrecedence_4011Text(view);
		case NotRespondedExistenceEditPart.VISUAL_ID:
			return getNotRespondedExistence_4012Text(view);
		case NotResponseEditPart.VISUAL_ID:
			return getNotResponse_4013Text(view);
		case NotSuccessionEditPart.VISUAL_ID:
			return getNotSuccession_4014Text(view);
		case SuccessionEditPart.VISUAL_ID:
			return getSuccession_4015Text(view);
		case ResponseEditPart.VISUAL_ID:
			return getResponse_4016Text(view);
		case PrecedenceEditPart.VISUAL_ID:
			return getPrecedence_4017Text(view);
		case NotChainSuccessiveEditPart.VISUAL_ID:
			return getNotChainSuccessive_4018Text(view);
		case ChainPrecedenceEditPart.VISUAL_ID:
			return getChainPrecedence_4019Text(view);
		case ChainResponseEditPart.VISUAL_ID:
			return getChainResponse_4020Text(view);
		case ChainSuccessionEditPart.VISUAL_ID:
			return getChainSuccession_4021Text(view);
		case AlternateResponseEditPart.VISUAL_ID:
			return getAlternateResponse_4022Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDeclare_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivity_2001Text(View view) {
		IParser parser = DeclareParserProvider
				.getParser(DeclareElementTypes.Activity_2001,
						view.getElement() != null ? view.getElement() : view,
						DeclareVisualIDRegistry
								.getType(ActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRespondedExistence_4003Text(View view) {
		RespondedExistence domainModelElement = (RespondedExistence) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAlternatePrecedence_4004Text(View view) {
		AlternatePrecedence domainModelElement = (AlternatePrecedence) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_4005Text(View view) {
		Choice domainModelElement = (Choice) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoExistence_4006Text(View view) {
		CoExistence domainModelElement = (CoExistence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExclusiveChoice_4007Text(View view) {
		ExclusiveChoice domainModelElement = (ExclusiveChoice) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotChainPrecedence_4008Text(View view) {
		NotChainPrecedence domainModelElement = (NotChainPrecedence) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotChainRepsonse_4009Text(View view) {
		NotChainRepsonse domainModelElement = (NotChainRepsonse) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotCoExistence_4010Text(View view) {
		NotCoExistence domainModelElement = (NotCoExistence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotPrecedence_4011Text(View view) {
		NotPrecedence domainModelElement = (NotPrecedence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotRespondedExistence_4012Text(View view) {
		NotRespondedExistence domainModelElement = (NotRespondedExistence) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotResponse_4013Text(View view) {
		NotResponse domainModelElement = (NotResponse) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotSuccession_4014Text(View view) {
		NotSuccession domainModelElement = (NotSuccession) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSuccession_4015Text(View view) {
		Succession domainModelElement = (Succession) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResponse_4016Text(View view) {
		Response domainModelElement = (Response) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrecedence_4017Text(View view) {
		Precedence domainModelElement = (Precedence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNotChainSuccessive_4018Text(View view) {
		NotChainSuccessive domainModelElement = (NotChainSuccessive) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChainPrecedence_4019Text(View view) {
		ChainPrecedence domainModelElement = (ChainPrecedence) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChainResponse_4020Text(View view) {
		ChainResponse domainModelElement = (ChainResponse) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChainSuccession_4021Text(View view) {
		ChainSuccession domainModelElement = (ChainSuccession) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAlternateResponse_4022Text(View view) {
		AlternateResponse domainModelElement = (AlternateResponse) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			DeclareDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return DeclareEditPart.MODEL_ID.equals(DeclareVisualIDRegistry
				.getModelID(view));
	}

}
