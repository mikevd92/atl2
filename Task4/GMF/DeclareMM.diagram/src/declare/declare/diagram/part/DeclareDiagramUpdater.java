package declare.declare.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import declare.declare.Activity;
import declare.declare.AlternatePrecedence;
import declare.declare.AlternateResponse;
import declare.declare.ChainPrecedence;
import declare.declare.ChainResponse;
import declare.declare.ChainSuccession;
import declare.declare.Choice;
import declare.declare.CoExistence;
import declare.declare.Declare;
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
import declare.declare.diagram.providers.DeclareElementTypes;

/**
 * @generated
 */
public class DeclareDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<DeclareNodeDescriptor> getSemanticChildren(View view) {
		switch (DeclareVisualIDRegistry.getVisualID(view)) {
		case DeclareEditPart.VISUAL_ID:
			return getDeclare_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareNodeDescriptor> getDeclare_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Declare modelElement = (Declare) view.getElement();
		LinkedList<DeclareNodeDescriptor> result = new LinkedList<DeclareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContainsActivities().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = DeclareVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new DeclareNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getContainedLinks(View view) {
		switch (DeclareVisualIDRegistry.getVisualID(view)) {
		case DeclareEditPart.VISUAL_ID:
			return getDeclare_1000ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2001ContainedLinks(view);
		case RespondedExistenceEditPart.VISUAL_ID:
			return getRespondedExistence_4003ContainedLinks(view);
		case AlternatePrecedenceEditPart.VISUAL_ID:
			return getAlternatePrecedence_4004ContainedLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_4005ContainedLinks(view);
		case CoExistenceEditPart.VISUAL_ID:
			return getCoExistence_4006ContainedLinks(view);
		case ExclusiveChoiceEditPart.VISUAL_ID:
			return getExclusiveChoice_4007ContainedLinks(view);
		case NotChainPrecedenceEditPart.VISUAL_ID:
			return getNotChainPrecedence_4008ContainedLinks(view);
		case NotChainRepsonseEditPart.VISUAL_ID:
			return getNotChainRepsonse_4009ContainedLinks(view);
		case NotCoExistenceEditPart.VISUAL_ID:
			return getNotCoExistence_4010ContainedLinks(view);
		case NotPrecedenceEditPart.VISUAL_ID:
			return getNotPrecedence_4011ContainedLinks(view);
		case NotRespondedExistenceEditPart.VISUAL_ID:
			return getNotRespondedExistence_4012ContainedLinks(view);
		case NotResponseEditPart.VISUAL_ID:
			return getNotResponse_4013ContainedLinks(view);
		case NotSuccessionEditPart.VISUAL_ID:
			return getNotSuccession_4014ContainedLinks(view);
		case SuccessionEditPart.VISUAL_ID:
			return getSuccession_4015ContainedLinks(view);
		case ResponseEditPart.VISUAL_ID:
			return getResponse_4016ContainedLinks(view);
		case PrecedenceEditPart.VISUAL_ID:
			return getPrecedence_4017ContainedLinks(view);
		case NotChainSuccessiveEditPart.VISUAL_ID:
			return getNotChainSuccessive_4018ContainedLinks(view);
		case ChainPrecedenceEditPart.VISUAL_ID:
			return getChainPrecedence_4019ContainedLinks(view);
		case ChainResponseEditPart.VISUAL_ID:
			return getChainResponse_4020ContainedLinks(view);
		case ChainSuccessionEditPart.VISUAL_ID:
			return getChainSuccession_4021ContainedLinks(view);
		case AlternateResponseEditPart.VISUAL_ID:
			return getAlternateResponse_4022ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getIncomingLinks(View view) {
		switch (DeclareVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2001IncomingLinks(view);
		case RespondedExistenceEditPart.VISUAL_ID:
			return getRespondedExistence_4003IncomingLinks(view);
		case AlternatePrecedenceEditPart.VISUAL_ID:
			return getAlternatePrecedence_4004IncomingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_4005IncomingLinks(view);
		case CoExistenceEditPart.VISUAL_ID:
			return getCoExistence_4006IncomingLinks(view);
		case ExclusiveChoiceEditPart.VISUAL_ID:
			return getExclusiveChoice_4007IncomingLinks(view);
		case NotChainPrecedenceEditPart.VISUAL_ID:
			return getNotChainPrecedence_4008IncomingLinks(view);
		case NotChainRepsonseEditPart.VISUAL_ID:
			return getNotChainRepsonse_4009IncomingLinks(view);
		case NotCoExistenceEditPart.VISUAL_ID:
			return getNotCoExistence_4010IncomingLinks(view);
		case NotPrecedenceEditPart.VISUAL_ID:
			return getNotPrecedence_4011IncomingLinks(view);
		case NotRespondedExistenceEditPart.VISUAL_ID:
			return getNotRespondedExistence_4012IncomingLinks(view);
		case NotResponseEditPart.VISUAL_ID:
			return getNotResponse_4013IncomingLinks(view);
		case NotSuccessionEditPart.VISUAL_ID:
			return getNotSuccession_4014IncomingLinks(view);
		case SuccessionEditPart.VISUAL_ID:
			return getSuccession_4015IncomingLinks(view);
		case ResponseEditPart.VISUAL_ID:
			return getResponse_4016IncomingLinks(view);
		case PrecedenceEditPart.VISUAL_ID:
			return getPrecedence_4017IncomingLinks(view);
		case NotChainSuccessiveEditPart.VISUAL_ID:
			return getNotChainSuccessive_4018IncomingLinks(view);
		case ChainPrecedenceEditPart.VISUAL_ID:
			return getChainPrecedence_4019IncomingLinks(view);
		case ChainResponseEditPart.VISUAL_ID:
			return getChainResponse_4020IncomingLinks(view);
		case ChainSuccessionEditPart.VISUAL_ID:
			return getChainSuccession_4021IncomingLinks(view);
		case AlternateResponseEditPart.VISUAL_ID:
			return getAlternateResponse_4022IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getOutgoingLinks(View view) {
		switch (DeclareVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2001OutgoingLinks(view);
		case RespondedExistenceEditPart.VISUAL_ID:
			return getRespondedExistence_4003OutgoingLinks(view);
		case AlternatePrecedenceEditPart.VISUAL_ID:
			return getAlternatePrecedence_4004OutgoingLinks(view);
		case ChoiceEditPart.VISUAL_ID:
			return getChoice_4005OutgoingLinks(view);
		case CoExistenceEditPart.VISUAL_ID:
			return getCoExistence_4006OutgoingLinks(view);
		case ExclusiveChoiceEditPart.VISUAL_ID:
			return getExclusiveChoice_4007OutgoingLinks(view);
		case NotChainPrecedenceEditPart.VISUAL_ID:
			return getNotChainPrecedence_4008OutgoingLinks(view);
		case NotChainRepsonseEditPart.VISUAL_ID:
			return getNotChainRepsonse_4009OutgoingLinks(view);
		case NotCoExistenceEditPart.VISUAL_ID:
			return getNotCoExistence_4010OutgoingLinks(view);
		case NotPrecedenceEditPart.VISUAL_ID:
			return getNotPrecedence_4011OutgoingLinks(view);
		case NotRespondedExistenceEditPart.VISUAL_ID:
			return getNotRespondedExistence_4012OutgoingLinks(view);
		case NotResponseEditPart.VISUAL_ID:
			return getNotResponse_4013OutgoingLinks(view);
		case NotSuccessionEditPart.VISUAL_ID:
			return getNotSuccession_4014OutgoingLinks(view);
		case SuccessionEditPart.VISUAL_ID:
			return getSuccession_4015OutgoingLinks(view);
		case ResponseEditPart.VISUAL_ID:
			return getResponse_4016OutgoingLinks(view);
		case PrecedenceEditPart.VISUAL_ID:
			return getPrecedence_4017OutgoingLinks(view);
		case NotChainSuccessiveEditPart.VISUAL_ID:
			return getNotChainSuccessive_4018OutgoingLinks(view);
		case ChainPrecedenceEditPart.VISUAL_ID:
			return getChainPrecedence_4019OutgoingLinks(view);
		case ChainResponseEditPart.VISUAL_ID:
			return getChainResponse_4020OutgoingLinks(view);
		case ChainSuccessionEditPart.VISUAL_ID:
			return getChainSuccession_4021OutgoingLinks(view);
		case AlternateResponseEditPart.VISUAL_ID:
			return getAlternateResponse_4022OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getDeclare_1000ContainedLinks(
			View view) {
		Declare modelElement = (Declare) view.getElement();
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RespondedExistence_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AlternatePrecedence_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Choice_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CoExistence_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExclusiveChoice_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NotChainPrecedence_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NotChainRepsonse_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NotCoExistence_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NotPrecedence_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NotRespondedExistence_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NotResponse_4013(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NotSuccession_4014(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Succession_4015(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Response_4016(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Precedence_4017(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NotChainSuccessive_4018(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ChainPrecedence_4019(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ChainResponse_4020(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ChainSuccession_4021(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AlternateResponse_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getActivity_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getRespondedExistence_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getAlternatePrecedence_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChoice_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getCoExistence_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getExclusiveChoice_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainPrecedence_4008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainRepsonse_4009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotCoExistence_4010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotPrecedence_4011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotRespondedExistence_4012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotResponse_4013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotSuccession_4014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getSuccession_4015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getResponse_4016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getPrecedence_4017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainSuccessive_4018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainPrecedence_4019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainResponse_4020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainSuccession_4021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getAlternateResponse_4022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getActivity_2001IncomingLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RespondedExistence_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AlternatePrecedence_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Choice_4005(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CoExistence_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExclusiveChoice_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NotChainPrecedence_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NotChainRepsonse_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NotCoExistence_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NotPrecedence_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NotRespondedExistence_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NotResponse_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NotSuccession_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Succession_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Response_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Precedence_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NotChainSuccessive_4018(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ChainPrecedence_4019(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ChainResponse_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ChainSuccession_4021(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AlternateResponse_4022(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getRespondedExistence_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getAlternatePrecedence_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChoice_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getCoExistence_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getExclusiveChoice_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainPrecedence_4008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainRepsonse_4009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotCoExistence_4010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotPrecedence_4011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotRespondedExistence_4012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotResponse_4013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotSuccession_4014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getSuccession_4015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getResponse_4016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getPrecedence_4017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainSuccessive_4018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainPrecedence_4019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainResponse_4020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainSuccession_4021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getAlternateResponse_4022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getActivity_2001OutgoingLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RespondedExistence_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AlternatePrecedence_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Choice_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CoExistence_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExclusiveChoice_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NotChainPrecedence_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NotChainRepsonse_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NotCoExistence_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NotPrecedence_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NotRespondedExistence_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NotResponse_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NotSuccession_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Succession_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Response_4016(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Precedence_4017(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NotChainSuccessive_4018(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ChainPrecedence_4019(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ChainResponse_4020(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ChainSuccession_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AlternateResponse_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getRespondedExistence_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getAlternatePrecedence_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChoice_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getCoExistence_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getExclusiveChoice_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainPrecedence_4008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainRepsonse_4009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotCoExistence_4010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotPrecedence_4011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotRespondedExistence_4012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotResponse_4013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotSuccession_4014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getSuccession_4015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getResponse_4016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getPrecedence_4017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getNotChainSuccessive_4018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainPrecedence_4019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainResponse_4020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getChainSuccession_4021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DeclareLinkDescriptor> getAlternateResponse_4022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_RespondedExistence_4003(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RespondedExistence) {
				continue;
			}
			RespondedExistence link = (RespondedExistence) linkObject;
			if (RespondedExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.RespondedExistence_4003,
					RespondedExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_AlternatePrecedence_4004(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AlternatePrecedence) {
				continue;
			}
			AlternatePrecedence link = (AlternatePrecedence) linkObject;
			if (AlternatePrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.AlternatePrecedence_4004,
					AlternatePrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_Choice_4005(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Choice) {
				continue;
			}
			Choice link = (Choice) linkObject;
			if (ChoiceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.Choice_4005, ChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_CoExistence_4006(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CoExistence) {
				continue;
			}
			CoExistence link = (CoExistence) linkObject;
			if (CoExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.CoExistence_4006,
					CoExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_ExclusiveChoice_4007(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExclusiveChoice) {
				continue;
			}
			ExclusiveChoice link = (ExclusiveChoice) linkObject;
			if (ExclusiveChoiceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.ExclusiveChoice_4007,
					ExclusiveChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotChainPrecedence_4008(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotChainPrecedence) {
				continue;
			}
			NotChainPrecedence link = (NotChainPrecedence) linkObject;
			if (NotChainPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotChainPrecedence_4008,
					NotChainPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotChainRepsonse_4009(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotChainRepsonse) {
				continue;
			}
			NotChainRepsonse link = (NotChainRepsonse) linkObject;
			if (NotChainRepsonseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotChainRepsonse_4009,
					NotChainRepsonseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotCoExistence_4010(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotCoExistence) {
				continue;
			}
			NotCoExistence link = (NotCoExistence) linkObject;
			if (NotCoExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotCoExistence_4010,
					NotCoExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotPrecedence_4011(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotPrecedence) {
				continue;
			}
			NotPrecedence link = (NotPrecedence) linkObject;
			if (NotPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotPrecedence_4011,
					NotPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotRespondedExistence_4012(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotRespondedExistence) {
				continue;
			}
			NotRespondedExistence link = (NotRespondedExistence) linkObject;
			if (NotRespondedExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotRespondedExistence_4012,
					NotRespondedExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotResponse_4013(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotResponse) {
				continue;
			}
			NotResponse link = (NotResponse) linkObject;
			if (NotResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotResponse_4013,
					NotResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotSuccession_4014(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotSuccession) {
				continue;
			}
			NotSuccession link = (NotSuccession) linkObject;
			if (NotSuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotSuccession_4014,
					NotSuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_Succession_4015(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Succession) {
				continue;
			}
			Succession link = (Succession) linkObject;
			if (SuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.Succession_4015,
					SuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_Response_4016(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Response) {
				continue;
			}
			Response link = (Response) linkObject;
			if (ResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.Response_4016,
					ResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_Precedence_4017(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Precedence) {
				continue;
			}
			Precedence link = (Precedence) linkObject;
			if (PrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.Precedence_4017,
					PrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotChainSuccessive_4018(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotChainSuccessive) {
				continue;
			}
			NotChainSuccessive link = (NotChainSuccessive) linkObject;
			if (NotChainSuccessiveEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotChainSuccessive_4018,
					NotChainSuccessiveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_ChainPrecedence_4019(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ChainPrecedence) {
				continue;
			}
			ChainPrecedence link = (ChainPrecedence) linkObject;
			if (ChainPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.ChainPrecedence_4019,
					ChainPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_ChainResponse_4020(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ChainResponse) {
				continue;
			}
			ChainResponse link = (ChainResponse) linkObject;
			if (ChainResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.ChainResponse_4020,
					ChainResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_ChainSuccession_4021(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ChainSuccession) {
				continue;
			}
			ChainSuccession link = (ChainSuccession) linkObject;
			if (ChainSuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.ChainSuccession_4021,
					ChainSuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getContainedTypeModelFacetLinks_AlternateResponse_4022(
			Declare container) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AlternateResponse) {
				continue;
			}
			AlternateResponse link = (AlternateResponse) linkObject;
			if (AlternateResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.AlternateResponse_4022,
					AlternateResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_RespondedExistence_4003(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof RespondedExistence) {
				continue;
			}
			RespondedExistence link = (RespondedExistence) setting.getEObject();
			if (RespondedExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.RespondedExistence_4003,
					RespondedExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_AlternatePrecedence_4004(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof AlternatePrecedence) {
				continue;
			}
			AlternatePrecedence link = (AlternatePrecedence) setting
					.getEObject();
			if (AlternatePrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.AlternatePrecedence_4004,
					AlternatePrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_Choice_4005(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof Choice) {
				continue;
			}
			Choice link = (Choice) setting.getEObject();
			if (ChoiceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.Choice_4005, ChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_CoExistence_4006(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof CoExistence) {
				continue;
			}
			CoExistence link = (CoExistence) setting.getEObject();
			if (CoExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.CoExistence_4006,
					CoExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_ExclusiveChoice_4007(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof ExclusiveChoice) {
				continue;
			}
			ExclusiveChoice link = (ExclusiveChoice) setting.getEObject();
			if (ExclusiveChoiceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.ExclusiveChoice_4007,
					ExclusiveChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotChainPrecedence_4008(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof NotChainPrecedence) {
				continue;
			}
			NotChainPrecedence link = (NotChainPrecedence) setting.getEObject();
			if (NotChainPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.NotChainPrecedence_4008,
					NotChainPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotChainRepsonse_4009(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof NotChainRepsonse) {
				continue;
			}
			NotChainRepsonse link = (NotChainRepsonse) setting.getEObject();
			if (NotChainRepsonseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.NotChainRepsonse_4009,
					NotChainRepsonseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotCoExistence_4010(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof NotCoExistence) {
				continue;
			}
			NotCoExistence link = (NotCoExistence) setting.getEObject();
			if (NotCoExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.NotCoExistence_4010,
					NotCoExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotPrecedence_4011(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof NotPrecedence) {
				continue;
			}
			NotPrecedence link = (NotPrecedence) setting.getEObject();
			if (NotPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.NotPrecedence_4011,
					NotPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotRespondedExistence_4012(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof NotRespondedExistence) {
				continue;
			}
			NotRespondedExistence link = (NotRespondedExistence) setting
					.getEObject();
			if (NotRespondedExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.NotRespondedExistence_4012,
					NotRespondedExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotResponse_4013(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof NotResponse) {
				continue;
			}
			NotResponse link = (NotResponse) setting.getEObject();
			if (NotResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.NotResponse_4013,
					NotResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotSuccession_4014(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof NotSuccession) {
				continue;
			}
			NotSuccession link = (NotSuccession) setting.getEObject();
			if (NotSuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.NotSuccession_4014,
					NotSuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_Succession_4015(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof Succession) {
				continue;
			}
			Succession link = (Succession) setting.getEObject();
			if (SuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.Succession_4015,
					SuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_Response_4016(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof Response) {
				continue;
			}
			Response link = (Response) setting.getEObject();
			if (ResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.Response_4016,
					ResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_Precedence_4017(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof Precedence) {
				continue;
			}
			Precedence link = (Precedence) setting.getEObject();
			if (PrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.Precedence_4017,
					PrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotChainSuccessive_4018(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof NotChainSuccessive) {
				continue;
			}
			NotChainSuccessive link = (NotChainSuccessive) setting.getEObject();
			if (NotChainSuccessiveEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.NotChainSuccessive_4018,
					NotChainSuccessiveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_ChainPrecedence_4019(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof ChainPrecedence) {
				continue;
			}
			ChainPrecedence link = (ChainPrecedence) setting.getEObject();
			if (ChainPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.ChainPrecedence_4019,
					ChainPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_ChainResponse_4020(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof ChainResponse) {
				continue;
			}
			ChainResponse link = (ChainResponse) setting.getEObject();
			if (ChainResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.ChainResponse_4020,
					ChainResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_ChainSuccession_4021(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof ChainSuccession) {
				continue;
			}
			ChainSuccession link = (ChainSuccession) setting.getEObject();
			if (ChainSuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.ChainSuccession_4021,
					ChainSuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_AlternateResponse_4022(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE
					.getConstraint_ToActivity()
					|| false == setting.getEObject() instanceof AlternateResponse) {
				continue;
			}
			AlternateResponse link = (AlternateResponse) setting.getEObject();
			if (AlternateResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Activity src = link.getFromActivity();
			result.add(new DeclareLinkDescriptor(src, target, link,
					DeclareElementTypes.AlternateResponse_4022,
					AlternateResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_RespondedExistence_4003(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RespondedExistence) {
				continue;
			}
			RespondedExistence link = (RespondedExistence) linkObject;
			if (RespondedExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.RespondedExistence_4003,
					RespondedExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_AlternatePrecedence_4004(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AlternatePrecedence) {
				continue;
			}
			AlternatePrecedence link = (AlternatePrecedence) linkObject;
			if (AlternatePrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.AlternatePrecedence_4004,
					AlternatePrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_Choice_4005(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Choice) {
				continue;
			}
			Choice link = (Choice) linkObject;
			if (ChoiceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.Choice_4005, ChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_CoExistence_4006(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CoExistence) {
				continue;
			}
			CoExistence link = (CoExistence) linkObject;
			if (CoExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.CoExistence_4006,
					CoExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_ExclusiveChoice_4007(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExclusiveChoice) {
				continue;
			}
			ExclusiveChoice link = (ExclusiveChoice) linkObject;
			if (ExclusiveChoiceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.ExclusiveChoice_4007,
					ExclusiveChoiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotChainPrecedence_4008(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotChainPrecedence) {
				continue;
			}
			NotChainPrecedence link = (NotChainPrecedence) linkObject;
			if (NotChainPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotChainPrecedence_4008,
					NotChainPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotChainRepsonse_4009(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotChainRepsonse) {
				continue;
			}
			NotChainRepsonse link = (NotChainRepsonse) linkObject;
			if (NotChainRepsonseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotChainRepsonse_4009,
					NotChainRepsonseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotCoExistence_4010(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotCoExistence) {
				continue;
			}
			NotCoExistence link = (NotCoExistence) linkObject;
			if (NotCoExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotCoExistence_4010,
					NotCoExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotPrecedence_4011(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotPrecedence) {
				continue;
			}
			NotPrecedence link = (NotPrecedence) linkObject;
			if (NotPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotPrecedence_4011,
					NotPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotRespondedExistence_4012(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotRespondedExistence) {
				continue;
			}
			NotRespondedExistence link = (NotRespondedExistence) linkObject;
			if (NotRespondedExistenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotRespondedExistence_4012,
					NotRespondedExistenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotResponse_4013(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotResponse) {
				continue;
			}
			NotResponse link = (NotResponse) linkObject;
			if (NotResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotResponse_4013,
					NotResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotSuccession_4014(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotSuccession) {
				continue;
			}
			NotSuccession link = (NotSuccession) linkObject;
			if (NotSuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotSuccession_4014,
					NotSuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_Succession_4015(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Succession) {
				continue;
			}
			Succession link = (Succession) linkObject;
			if (SuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.Succession_4015,
					SuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_Response_4016(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Response) {
				continue;
			}
			Response link = (Response) linkObject;
			if (ResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.Response_4016,
					ResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_Precedence_4017(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Precedence) {
				continue;
			}
			Precedence link = (Precedence) linkObject;
			if (PrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.Precedence_4017,
					PrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotChainSuccessive_4018(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NotChainSuccessive) {
				continue;
			}
			NotChainSuccessive link = (NotChainSuccessive) linkObject;
			if (NotChainSuccessiveEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.NotChainSuccessive_4018,
					NotChainSuccessiveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_ChainPrecedence_4019(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ChainPrecedence) {
				continue;
			}
			ChainPrecedence link = (ChainPrecedence) linkObject;
			if (ChainPrecedenceEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.ChainPrecedence_4019,
					ChainPrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_ChainResponse_4020(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ChainResponse) {
				continue;
			}
			ChainResponse link = (ChainResponse) linkObject;
			if (ChainResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.ChainResponse_4020,
					ChainResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_ChainSuccession_4021(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ChainSuccession) {
				continue;
			}
			ChainSuccession link = (ChainSuccession) linkObject;
			if (ChainSuccessionEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.ChainSuccession_4021,
					ChainSuccessionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_AlternateResponse_4022(
			Activity source) {
		Declare container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Declare) {
				container = (Declare) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DeclareLinkDescriptor> result = new LinkedList<DeclareLinkDescriptor>();
		for (Iterator<?> links = container.getContainsConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AlternateResponse) {
				continue;
			}
			AlternateResponse link = (AlternateResponse) linkObject;
			if (AlternateResponseEditPart.VISUAL_ID != DeclareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getToActivity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Activity) {
				continue;
			}
			Activity dst = (Activity) theTarget;
			Activity src = link.getFromActivity();
			if (src != source) {
				continue;
			}
			result.add(new DeclareLinkDescriptor(src, dst, link,
					DeclareElementTypes.AlternateResponse_4022,
					AlternateResponseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */

		public List<DeclareNodeDescriptor> getSemanticChildren(View view) {
			return DeclareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<DeclareLinkDescriptor> getContainedLinks(View view) {
			return DeclareDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<DeclareLinkDescriptor> getIncomingLinks(View view) {
			return DeclareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<DeclareLinkDescriptor> getOutgoingLinks(View view) {
			return DeclareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
