	package declare.declare.diagram.part;

	/**
 * @generated
 */
public class DeclareDiagramUpdater {
		
		/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareNodeDescriptor> getSemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		switch (declare.declare.diagram.part.DeclareVisualIDRegistry.getVisualID(view)) {
		case declare.declare.diagram.edit.parts.DeclareEditPart.VISUAL_ID:
	return getDeclare_1000SemanticChildren(view);
	}
		return java.util.Collections.emptyList();
}
	
	/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareNodeDescriptor> getDeclare_1000SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (!view.isSetElement()) {
	return java.util.Collections.emptyList();
}
declare.declare.Declare modelElement = (declare.declare.Declare) view.getElement();
	java.util.LinkedList<declare.declare.diagram.part.DeclareNodeDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getContainsActivities().iterator(); it.hasNext();) {
		declare.declare.Activity childElement = (declare.declare.Activity) it.next();
					int visualID = declare.declare.diagram.part.DeclareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == declare.declare.diagram.edit.parts.ActivityEditPart.VISUAL_ID) {
	result.add(new declare.declare.diagram.part.DeclareNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getContainsSpecialConstraints().iterator(); it.hasNext();) {
		declare.declare.SpecialConstraint childElement = (declare.declare.SpecialConstraint) it.next();
					int visualID = declare.declare.diagram.part.DeclareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == declare.declare.diagram.edit.parts.ChoiceEditPart.VISUAL_ID) {
	result.add(new declare.declare.diagram.part.DeclareNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}
	
		/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (declare.declare.diagram.part.DeclareVisualIDRegistry.getVisualID(view)) {
		case declare.declare.diagram.edit.parts.DeclareEditPart.VISUAL_ID:
	return getDeclare_1000ContainedLinks(view);
case declare.declare.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
	return getActivity_2001ContainedLinks(view);
case declare.declare.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
	return getChoice_2002ContainedLinks(view);
case declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID:
	return getInputRelation_4002ContainedLinks(view);
case declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID:
	return getOutputRelation_4003ContainedLinks(view);
case declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID:
	return getAlternatePrecedence_4004ContainedLinks(view);
case declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID:
	return getAlternateResponse_4005ContainedLinks(view);
case declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID:
	return getChainPrecedence_4006ContainedLinks(view);
case declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID:
	return getChainResponse_4007ContainedLinks(view);
case declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID:
	return getChainSuccession_4008ContainedLinks(view);
case declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID:
	return getCoExistence_4009ContainedLinks(view);
case declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID:
	return getExclusiveChoice_4010ContainedLinks(view);
case declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID:
	return getNotChainPrecedence_4011ContainedLinks(view);
case declare.declare.diagram.edit.parts.NotChainRepsonseEditPart.VISUAL_ID:
	return getNotChainRepsonse_4012ContainedLinks(view);
case declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID:
	return getNotChainSuccessive_4013ContainedLinks(view);
case declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID:
	return getNotCoExistence_4014ContainedLinks(view);
case declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID:
	return getNotPrecedence_4015ContainedLinks(view);
case declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID:
	return getNotRespondedExistence_4016ContainedLinks(view);
case declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID:
	return getNotResponse_4017ContainedLinks(view);
case declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID:
	return getNotSuccession_4018ContainedLinks(view);
case declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID:
	return getPrecedence_4019ContainedLinks(view);
case declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID:
	return getResponse_4020ContainedLinks(view);
case declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID:
	return getSuccession_4021ContainedLinks(view);
case declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID:
	return getRespondedExistence_4001ContainedLinks(view);
	}
		return java.util.Collections.emptyList();
}
	
		/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (declare.declare.diagram.part.DeclareVisualIDRegistry.getVisualID(view)) {
		case declare.declare.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
	return getActivity_2001IncomingLinks(view);
case declare.declare.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
	return getChoice_2002IncomingLinks(view);
case declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID:
	return getInputRelation_4002IncomingLinks(view);
case declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID:
	return getOutputRelation_4003IncomingLinks(view);
case declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID:
	return getAlternatePrecedence_4004IncomingLinks(view);
case declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID:
	return getAlternateResponse_4005IncomingLinks(view);
case declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID:
	return getChainPrecedence_4006IncomingLinks(view);
case declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID:
	return getChainResponse_4007IncomingLinks(view);
case declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID:
	return getChainSuccession_4008IncomingLinks(view);
case declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID:
	return getCoExistence_4009IncomingLinks(view);
case declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID:
	return getExclusiveChoice_4010IncomingLinks(view);
case declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID:
	return getNotChainPrecedence_4011IncomingLinks(view);
case declare.declare.diagram.edit.parts.NotChainRepsonseEditPart.VISUAL_ID:
	return getNotChainRepsonse_4012IncomingLinks(view);
case declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID:
	return getNotChainSuccessive_4013IncomingLinks(view);
case declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID:
	return getNotCoExistence_4014IncomingLinks(view);
case declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID:
	return getNotPrecedence_4015IncomingLinks(view);
case declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID:
	return getNotRespondedExistence_4016IncomingLinks(view);
case declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID:
	return getNotResponse_4017IncomingLinks(view);
case declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID:
	return getNotSuccession_4018IncomingLinks(view);
case declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID:
	return getPrecedence_4019IncomingLinks(view);
case declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID:
	return getResponse_4020IncomingLinks(view);
case declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID:
	return getSuccession_4021IncomingLinks(view);
case declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID:
	return getRespondedExistence_4001IncomingLinks(view);
	}
		return java.util.Collections.emptyList();
}
	
		/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (declare.declare.diagram.part.DeclareVisualIDRegistry.getVisualID(view)) {
		case declare.declare.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
	return getActivity_2001OutgoingLinks(view);
case declare.declare.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
	return getChoice_2002OutgoingLinks(view);
case declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID:
	return getInputRelation_4002OutgoingLinks(view);
case declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID:
	return getOutputRelation_4003OutgoingLinks(view);
case declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID:
	return getAlternatePrecedence_4004OutgoingLinks(view);
case declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID:
	return getAlternateResponse_4005OutgoingLinks(view);
case declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID:
	return getChainPrecedence_4006OutgoingLinks(view);
case declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID:
	return getChainResponse_4007OutgoingLinks(view);
case declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID:
	return getChainSuccession_4008OutgoingLinks(view);
case declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID:
	return getCoExistence_4009OutgoingLinks(view);
case declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID:
	return getExclusiveChoice_4010OutgoingLinks(view);
case declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID:
	return getNotChainPrecedence_4011OutgoingLinks(view);
case declare.declare.diagram.edit.parts.NotChainRepsonseEditPart.VISUAL_ID:
	return getNotChainRepsonse_4012OutgoingLinks(view);
case declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID:
	return getNotChainSuccessive_4013OutgoingLinks(view);
case declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID:
	return getNotCoExistence_4014OutgoingLinks(view);
case declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID:
	return getNotPrecedence_4015OutgoingLinks(view);
case declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID:
	return getNotRespondedExistence_4016OutgoingLinks(view);
case declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID:
	return getNotResponse_4017OutgoingLinks(view);
case declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID:
	return getNotSuccession_4018OutgoingLinks(view);
case declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID:
	return getPrecedence_4019OutgoingLinks(view);
case declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID:
	return getResponse_4020OutgoingLinks(view);
case declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID:
	return getSuccession_4021OutgoingLinks(view);
case declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID:
	return getRespondedExistence_4001OutgoingLinks(view);
	}
		return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getDeclare_1000ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	declare.declare.Declare modelElement = (declare.declare.Declare) view.getElement();
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InputRelation_4002(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_OutputRelation_4003(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_AlternatePrecedence_4004(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_AlternateResponse_4005(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_ChainPrecedence_4006(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_ChainResponse_4007(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_ChainSuccession_4008(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_CoExistence_4009(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_ExclusiveChoice_4010(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_NotChainPrecedence_4011(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_NotChainRepsonse_4012(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_NotChainSuccessive_4013(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_NotCoExistence_4014(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_NotPrecedence_4015(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_NotRespondedExistence_4016(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_NotResponse_4017(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_NotSuccession_4018(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Precedence_4019(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Response_4020(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_Succession_4021(modelElement));	
	result.addAll(getContainedTypeModelFacetLinks_RespondedExistence_4001(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getActivity_2001ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChoice_2002ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getInputRelation_4002ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getOutputRelation_4003ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getAlternatePrecedence_4004ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getAlternateResponse_4005ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainPrecedence_4006ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainResponse_4007ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainSuccession_4008ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getCoExistence_4009ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getExclusiveChoice_4010ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainPrecedence_4011ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainRepsonse_4012ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainSuccessive_4013ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotCoExistence_4014ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotPrecedence_4015ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotRespondedExistence_4016ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotResponse_4017ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotSuccession_4018ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getPrecedence_4019ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getResponse_4020ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getSuccession_4021ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getRespondedExistence_4001ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getActivity_2001IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	declare.declare.Activity modelElement = (declare.declare.Activity) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_OutputRelation_4003(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_AlternatePrecedence_4004(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_AlternateResponse_4005(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_ChainPrecedence_4006(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_ChainResponse_4007(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_ChainSuccession_4008(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_CoExistence_4009(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_ExclusiveChoice_4010(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_NotChainPrecedence_4011(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_NotChainSuccessive_4013(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_NotCoExistence_4014(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_NotPrecedence_4015(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_NotRespondedExistence_4016(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_NotResponse_4017(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_NotSuccession_4018(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_Precedence_4019(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_Response_4020(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_Succession_4021(modelElement, crossReferences));	
	result.addAll(getIncomingTypeModelFacetLinks_RespondedExistence_4001(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChoice_2002IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	declare.declare.Choice modelElement = (declare.declare.Choice) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InputRelation_4002(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getInputRelation_4002IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getOutputRelation_4003IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getAlternatePrecedence_4004IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getAlternateResponse_4005IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainPrecedence_4006IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainResponse_4007IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainSuccession_4008IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getCoExistence_4009IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getExclusiveChoice_4010IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainPrecedence_4011IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainRepsonse_4012IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainSuccessive_4013IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotCoExistence_4014IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotPrecedence_4015IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotRespondedExistence_4016IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotResponse_4017IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotSuccession_4018IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getPrecedence_4019IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getResponse_4020IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getSuccession_4021IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getRespondedExistence_4001IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getActivity_2001OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	declare.declare.Activity modelElement = (declare.declare.Activity) view.getElement();
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InputRelation_4002(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_AlternatePrecedence_4004(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_AlternateResponse_4005(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_ChainPrecedence_4006(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_ChainResponse_4007(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_ChainSuccession_4008(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_CoExistence_4009(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_ExclusiveChoice_4010(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_NotChainPrecedence_4011(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_NotChainRepsonse_4012(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_NotChainSuccessive_4013(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_NotCoExistence_4014(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_NotPrecedence_4015(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_NotRespondedExistence_4016(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_NotResponse_4017(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_NotSuccession_4018(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_Precedence_4019(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_Response_4020(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_Succession_4021(modelElement));	
	result.addAll(getOutgoingTypeModelFacetLinks_RespondedExistence_4001(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChoice_2002OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	declare.declare.Choice modelElement = (declare.declare.Choice) view.getElement();
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_OutputRelation_4003(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getInputRelation_4002OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getOutputRelation_4003OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getAlternatePrecedence_4004OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getAlternateResponse_4005OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainPrecedence_4006OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainResponse_4007OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getChainSuccession_4008OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getCoExistence_4009OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getExclusiveChoice_4010OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainPrecedence_4011OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainRepsonse_4012OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotChainSuccessive_4013OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotCoExistence_4014OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotPrecedence_4015OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotRespondedExistence_4016OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotResponse_4017OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getNotSuccession_4018OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getPrecedence_4019OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getResponse_4020OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getSuccession_4021OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getRespondedExistence_4001OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_InputRelation_4002(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsInputRelations().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.InputRelation) {
		continue;
	}
	declare.declare.InputRelation link = (declare.declare.InputRelation) linkObject;
		if (declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.SpecialConstraint dst = link.getInputRelationToConstraint();
							declare.declare.Activity src = link.getInputRelationFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.InputRelation_4002, declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_OutputRelation_4003(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsOutputRelations().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.OutputRelation) {
		continue;
	}
	declare.declare.OutputRelation link = (declare.declare.OutputRelation) linkObject;
		if (declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			java.util.List targets = link.getOutputRelationToActivity();
Object theTarget = targets.size() == 1 ? targets.get(0) : null;
if (false == theTarget instanceof declare.declare.Activity) {
	continue;
}
declare.declare.Activity dst = (declare.declare.Activity) theTarget;
							declare.declare.SpecialConstraint src = link.getOutputRelationFromConstraint();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.OutputRelation_4003, declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_AlternatePrecedence_4004(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.AlternatePrecedence) {
		continue;
	}
	declare.declare.AlternatePrecedence link = (declare.declare.AlternatePrecedence) linkObject;
		if (declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.AlternatePrecedence_4004, declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_AlternateResponse_4005(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.AlternateResponse) {
		continue;
	}
	declare.declare.AlternateResponse link = (declare.declare.AlternateResponse) linkObject;
		if (declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.AlternateResponse_4005, declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_ChainPrecedence_4006(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.ChainPrecedence) {
		continue;
	}
	declare.declare.ChainPrecedence link = (declare.declare.ChainPrecedence) linkObject;
		if (declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.ChainPrecedence_4006, declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_ChainResponse_4007(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.ChainResponse) {
		continue;
	}
	declare.declare.ChainResponse link = (declare.declare.ChainResponse) linkObject;
		if (declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.ChainResponse_4007, declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_ChainSuccession_4008(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.ChainSuccession) {
		continue;
	}
	declare.declare.ChainSuccession link = (declare.declare.ChainSuccession) linkObject;
		if (declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.ChainSuccession_4008, declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_CoExistence_4009(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.CoExistence) {
		continue;
	}
	declare.declare.CoExistence link = (declare.declare.CoExistence) linkObject;
		if (declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.CoExistence_4009, declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_ExclusiveChoice_4010(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.ExclusiveChoice) {
		continue;
	}
	declare.declare.ExclusiveChoice link = (declare.declare.ExclusiveChoice) linkObject;
		if (declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.ExclusiveChoice_4010, declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotChainPrecedence_4011(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotChainPrecedence) {
		continue;
	}
	declare.declare.NotChainPrecedence link = (declare.declare.NotChainPrecedence) linkObject;
		if (declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotChainPrecedence_4011, declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotChainRepsonse_4012(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotChainRepsonse) {
		continue;
	}
	declare.declare.NotChainRepsonse link = (declare.declare.NotChainRepsonse) linkObject;
		if (declare.declare.diagram.edit.parts.NotChainRepsonseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, link, declare.declare.diagram.providers.DeclareElementTypes.NotChainRepsonse_4012, declare.declare.diagram.edit.parts.NotChainRepsonseEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotChainSuccessive_4013(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotChainSuccessive) {
		continue;
	}
	declare.declare.NotChainSuccessive link = (declare.declare.NotChainSuccessive) linkObject;
		if (declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotChainSuccessive_4013, declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotCoExistence_4014(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotCoExistence) {
		continue;
	}
	declare.declare.NotCoExistence link = (declare.declare.NotCoExistence) linkObject;
		if (declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotCoExistence_4014, declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotPrecedence_4015(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotPrecedence) {
		continue;
	}
	declare.declare.NotPrecedence link = (declare.declare.NotPrecedence) linkObject;
		if (declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotPrecedence_4015, declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotRespondedExistence_4016(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotRespondedExistence) {
		continue;
	}
	declare.declare.NotRespondedExistence link = (declare.declare.NotRespondedExistence) linkObject;
		if (declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotRespondedExistence_4016, declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotResponse_4017(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotResponse) {
		continue;
	}
	declare.declare.NotResponse link = (declare.declare.NotResponse) linkObject;
		if (declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotResponse_4017, declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_NotSuccession_4018(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotSuccession) {
		continue;
	}
	declare.declare.NotSuccession link = (declare.declare.NotSuccession) linkObject;
		if (declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotSuccession_4018, declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_Precedence_4019(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.Precedence) {
		continue;
	}
	declare.declare.Precedence link = (declare.declare.Precedence) linkObject;
		if (declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.Precedence_4019, declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_Response_4020(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.Response) {
		continue;
	}
	declare.declare.Response link = (declare.declare.Response) linkObject;
		if (declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.Response_4020, declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_Succession_4021(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.Succession) {
		continue;
	}
	declare.declare.Succession link = (declare.declare.Succession) linkObject;
		if (declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.Succession_4021, declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID));
		}
	return result;	
}

	/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedTypeModelFacetLinks_RespondedExistence_4001(declare.declare.Declare container) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.RespondedExistence) {
		continue;
	}
	declare.declare.RespondedExistence link = (declare.declare.RespondedExistence) linkObject;
		if (declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
							result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.RespondedExistence_4001, declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID));
		}
	return result;	
}
	
/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_InputRelation_4002(declare.declare.SpecialConstraint target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getInputRelation_InputRelationToConstraint() || false == setting.getEObject() instanceof declare.declare.InputRelation) {
	continue;
}
declare.declare.InputRelation link = (declare.declare.InputRelation) setting.getEObject();
	if (declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getInputRelationFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.InputRelation_4002, declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_OutputRelation_4003(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getOutputRelation_OutputRelationToActivity() || false == setting.getEObject() instanceof declare.declare.OutputRelation) {
	continue;
}
declare.declare.OutputRelation link = (declare.declare.OutputRelation) setting.getEObject();
	if (declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.SpecialConstraint src = link.getOutputRelationFromConstraint();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.OutputRelation_4003, declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_AlternatePrecedence_4004(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.AlternatePrecedence) {
	continue;
}
declare.declare.AlternatePrecedence link = (declare.declare.AlternatePrecedence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.AlternatePrecedence_4004, declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_AlternateResponse_4005(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.AlternateResponse) {
	continue;
}
declare.declare.AlternateResponse link = (declare.declare.AlternateResponse) setting.getEObject();
	if (declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.AlternateResponse_4005, declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_ChainPrecedence_4006(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.ChainPrecedence) {
	continue;
}
declare.declare.ChainPrecedence link = (declare.declare.ChainPrecedence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.ChainPrecedence_4006, declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_ChainResponse_4007(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.ChainResponse) {
	continue;
}
declare.declare.ChainResponse link = (declare.declare.ChainResponse) setting.getEObject();
	if (declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.ChainResponse_4007, declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_ChainSuccession_4008(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.ChainSuccession) {
	continue;
}
declare.declare.ChainSuccession link = (declare.declare.ChainSuccession) setting.getEObject();
	if (declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.ChainSuccession_4008, declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_CoExistence_4009(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.CoExistence) {
	continue;
}
declare.declare.CoExistence link = (declare.declare.CoExistence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.CoExistence_4009, declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_ExclusiveChoice_4010(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.ExclusiveChoice) {
	continue;
}
declare.declare.ExclusiveChoice link = (declare.declare.ExclusiveChoice) setting.getEObject();
	if (declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.ExclusiveChoice_4010, declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotChainPrecedence_4011(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.NotChainPrecedence) {
	continue;
}
declare.declare.NotChainPrecedence link = (declare.declare.NotChainPrecedence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.NotChainPrecedence_4011, declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotChainSuccessive_4013(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.NotChainSuccessive) {
	continue;
}
declare.declare.NotChainSuccessive link = (declare.declare.NotChainSuccessive) setting.getEObject();
	if (declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.NotChainSuccessive_4013, declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotCoExistence_4014(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.NotCoExistence) {
	continue;
}
declare.declare.NotCoExistence link = (declare.declare.NotCoExistence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.NotCoExistence_4014, declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotPrecedence_4015(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.NotPrecedence) {
	continue;
}
declare.declare.NotPrecedence link = (declare.declare.NotPrecedence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.NotPrecedence_4015, declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotRespondedExistence_4016(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.NotRespondedExistence) {
	continue;
}
declare.declare.NotRespondedExistence link = (declare.declare.NotRespondedExistence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.NotRespondedExistence_4016, declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotResponse_4017(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.NotResponse) {
	continue;
}
declare.declare.NotResponse link = (declare.declare.NotResponse) setting.getEObject();
	if (declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.NotResponse_4017, declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_NotSuccession_4018(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.NotSuccession) {
	continue;
}
declare.declare.NotSuccession link = (declare.declare.NotSuccession) setting.getEObject();
	if (declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.NotSuccession_4018, declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_Precedence_4019(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.Precedence) {
	continue;
}
declare.declare.Precedence link = (declare.declare.Precedence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.Precedence_4019, declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_Response_4020(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.Response) {
	continue;
}
declare.declare.Response link = (declare.declare.Response) setting.getEObject();
	if (declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.Response_4020, declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_Succession_4021(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.Succession) {
	continue;
}
declare.declare.Succession link = (declare.declare.Succession) setting.getEObject();
	if (declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.Succession_4021, declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID));
		}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingTypeModelFacetLinks_RespondedExistence_4001(declare.declare.Activity target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() != declare.declare.declarePackage.eINSTANCE.getConstraint_ToActivity() || false == setting.getEObject() instanceof declare.declare.RespondedExistence) {
	continue;
}
declare.declare.RespondedExistence link = (declare.declare.RespondedExistence) setting.getEObject();
	if (declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
				declare.declare.Activity src = link.getFromActivity();
			result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, target, link, declare.declare.diagram.providers.DeclareElementTypes.RespondedExistence_4001, declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID));
		}
	return result;	
}
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_InputRelation_4002(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsInputRelations().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.InputRelation) {
		continue;
	}
	declare.declare.InputRelation link = (declare.declare.InputRelation) linkObject;
		if (declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.SpecialConstraint dst = link.getInputRelationToConstraint();
							declare.declare.Activity src = link.getInputRelationFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.InputRelation_4002, declare.declare.diagram.edit.parts.InputRelationEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_OutputRelation_4003(declare.declare.SpecialConstraint source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsOutputRelations().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.OutputRelation) {
		continue;
	}
	declare.declare.OutputRelation link = (declare.declare.OutputRelation) linkObject;
		if (declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			java.util.List targets = link.getOutputRelationToActivity();
Object theTarget = targets.size() == 1 ? targets.get(0) : null;
if (false == theTarget instanceof declare.declare.Activity) {
	continue;
}
declare.declare.Activity dst = (declare.declare.Activity) theTarget;
							declare.declare.SpecialConstraint src = link.getOutputRelationFromConstraint();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.OutputRelation_4003, declare.declare.diagram.edit.parts.OutputRelationEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_AlternatePrecedence_4004(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.AlternatePrecedence) {
		continue;
	}
	declare.declare.AlternatePrecedence link = (declare.declare.AlternatePrecedence) linkObject;
		if (declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.AlternatePrecedence_4004, declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_AlternateResponse_4005(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.AlternateResponse) {
		continue;
	}
	declare.declare.AlternateResponse link = (declare.declare.AlternateResponse) linkObject;
		if (declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.AlternateResponse_4005, declare.declare.diagram.edit.parts.AlternateResponseEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_ChainPrecedence_4006(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.ChainPrecedence) {
		continue;
	}
	declare.declare.ChainPrecedence link = (declare.declare.ChainPrecedence) linkObject;
		if (declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.ChainPrecedence_4006, declare.declare.diagram.edit.parts.ChainPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_ChainResponse_4007(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.ChainResponse) {
		continue;
	}
	declare.declare.ChainResponse link = (declare.declare.ChainResponse) linkObject;
		if (declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.ChainResponse_4007, declare.declare.diagram.edit.parts.ChainResponseEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_ChainSuccession_4008(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.ChainSuccession) {
		continue;
	}
	declare.declare.ChainSuccession link = (declare.declare.ChainSuccession) linkObject;
		if (declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.ChainSuccession_4008, declare.declare.diagram.edit.parts.ChainSuccessionEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_CoExistence_4009(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.CoExistence) {
		continue;
	}
	declare.declare.CoExistence link = (declare.declare.CoExistence) linkObject;
		if (declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.CoExistence_4009, declare.declare.diagram.edit.parts.CoExistenceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_ExclusiveChoice_4010(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.ExclusiveChoice) {
		continue;
	}
	declare.declare.ExclusiveChoice link = (declare.declare.ExclusiveChoice) linkObject;
		if (declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.ExclusiveChoice_4010, declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotChainPrecedence_4011(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotChainPrecedence) {
		continue;
	}
	declare.declare.NotChainPrecedence link = (declare.declare.NotChainPrecedence) linkObject;
		if (declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotChainPrecedence_4011, declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotChainRepsonse_4012(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotChainRepsonse) {
		continue;
	}
	declare.declare.NotChainRepsonse link = (declare.declare.NotChainRepsonse) linkObject;
		if (declare.declare.diagram.edit.parts.NotChainRepsonseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, link, declare.declare.diagram.providers.DeclareElementTypes.NotChainRepsonse_4012, declare.declare.diagram.edit.parts.NotChainRepsonseEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotChainSuccessive_4013(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotChainSuccessive) {
		continue;
	}
	declare.declare.NotChainSuccessive link = (declare.declare.NotChainSuccessive) linkObject;
		if (declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotChainSuccessive_4013, declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotCoExistence_4014(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotCoExistence) {
		continue;
	}
	declare.declare.NotCoExistence link = (declare.declare.NotCoExistence) linkObject;
		if (declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotCoExistence_4014, declare.declare.diagram.edit.parts.NotCoExistenceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotPrecedence_4015(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotPrecedence) {
		continue;
	}
	declare.declare.NotPrecedence link = (declare.declare.NotPrecedence) linkObject;
		if (declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotPrecedence_4015, declare.declare.diagram.edit.parts.NotPrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotRespondedExistence_4016(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotRespondedExistence) {
		continue;
	}
	declare.declare.NotRespondedExistence link = (declare.declare.NotRespondedExistence) linkObject;
		if (declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotRespondedExistence_4016, declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotResponse_4017(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotResponse) {
		continue;
	}
	declare.declare.NotResponse link = (declare.declare.NotResponse) linkObject;
		if (declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotResponse_4017, declare.declare.diagram.edit.parts.NotResponseEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_NotSuccession_4018(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.NotSuccession) {
		continue;
	}
	declare.declare.NotSuccession link = (declare.declare.NotSuccession) linkObject;
		if (declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.NotSuccession_4018, declare.declare.diagram.edit.parts.NotSuccessionEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_Precedence_4019(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.Precedence) {
		continue;
	}
	declare.declare.Precedence link = (declare.declare.Precedence) linkObject;
		if (declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.Precedence_4019, declare.declare.diagram.edit.parts.PrecedenceEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_Response_4020(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.Response) {
		continue;
	}
	declare.declare.Response link = (declare.declare.Response) linkObject;
		if (declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.Response_4020, declare.declare.diagram.edit.parts.ResponseEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_Succession_4021(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.Succession) {
		continue;
	}
	declare.declare.Succession link = (declare.declare.Succession) linkObject;
		if (declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.Succession_4021, declare.declare.diagram.edit.parts.SuccessionEditPart.VISUAL_ID));
		}
	return result;	
}		
				
		/**
 * @generated
 */
private static java.util.Collection<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingTypeModelFacetLinks_RespondedExistence_4001(declare.declare.Activity source) {
	declare.declare.Declare container = null;
	// Find container element for the link.
	// Climb up by containment hierarchy starting from the source
	// and return the first element that is instance of the container class.
	for (org.eclipse.emf.ecore.EObject element = source; element != null && container == null; element = element.eContainer()) {
		if (element instanceof declare.declare.Declare) {
			container = (declare.declare.Declare) element;
		}
	}
	if (container == null) {
		return java.util.Collections.emptyList();
	}
		java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor> result = new java.util.LinkedList<declare.declare.diagram.part.DeclareLinkDescriptor>();
	for (java.util.Iterator<?> links = container.getContainsConstraints().iterator(); links.hasNext();) {
	org.eclipse.emf.ecore.EObject linkObject = (org.eclipse.emf.ecore.EObject ) links.next();
	if (false == linkObject instanceof declare.declare.RespondedExistence) {
		continue;
	}
	declare.declare.RespondedExistence link = (declare.declare.RespondedExistence) linkObject;
		if (declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID != declare.declare.diagram.part.DeclareVisualIDRegistry.getLinkWithClassVisualID(link)) {
	continue;
}
			declare.declare.Activity dst = link.getToActivity();
							declare.declare.Activity src = link.getFromActivity();
								if (src != source) {
	continue;
}
						result.add(new declare.declare.diagram.part.DeclareLinkDescriptor(src, dst, link, declare.declare.diagram.providers.DeclareElementTypes.RespondedExistence_4001, declare.declare.diagram.edit.parts.RespondedExistenceEditPart.VISUAL_ID));
		}
	return result;	
}		
		
					/**
 * @generated
 */
	public static final org.eclipse.gmf.tooling.runtime.update.DiagramUpdater TYPED_INSTANCE = new org.eclipse.gmf.tooling.runtime.update.DiagramUpdater() {
				/**
 * @generated
 */
		
		public java.util.List<declare.declare.diagram.part.DeclareNodeDescriptor> getSemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
			return DeclareDiagramUpdater.getSemanticChildren(view);
		}

		/**
 * @generated
 */
		
		public java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
			return DeclareDiagramUpdater.getContainedLinks(view);
		}

		/**
 * @generated
 */
		
		public java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getIncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
			return DeclareDiagramUpdater.getIncomingLinks(view);
		}

		/**
 * @generated
 */
		
		public java.util.List<declare.declare.diagram.part.DeclareLinkDescriptor> getOutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
			return DeclareDiagramUpdater.getOutgoingLinks(view);
		}
	}; 
			
	}
