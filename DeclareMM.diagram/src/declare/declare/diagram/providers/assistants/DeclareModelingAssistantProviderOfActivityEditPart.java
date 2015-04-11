package declare.declare.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import declare.declare.diagram.edit.parts.ActivityEditPart;
import declare.declare.diagram.edit.parts.ChoiceEditPart;
import declare.declare.diagram.providers.DeclareElementTypes;
import declare.declare.diagram.providers.DeclareModelingAssistantProvider;

/**
 * @generated
 */
public class DeclareModelingAssistantProviderOfActivityEditPart extends
		DeclareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ActivityEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ActivityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(19);
		types.add(DeclareElementTypes.InputRelation_4002);
		types.add(DeclareElementTypes.AlternatePrecedence_4004);
		types.add(DeclareElementTypes.AlternateResponse_4005);
		types.add(DeclareElementTypes.ChainPrecedence_4006);
		types.add(DeclareElementTypes.ChainResponse_4007);
		types.add(DeclareElementTypes.ChainSuccession_4008);
		types.add(DeclareElementTypes.CoExistence_4009);
		types.add(DeclareElementTypes.ExclusiveChoice_4010);
		types.add(DeclareElementTypes.NotChainPrecedence_4011);
		types.add(DeclareElementTypes.NotChainSuccessive_4013);
		types.add(DeclareElementTypes.NotCoExistence_4014);
		types.add(DeclareElementTypes.NotPrecedence_4015);
		types.add(DeclareElementTypes.NotRespondedExistence_4016);
		types.add(DeclareElementTypes.NotResponse_4017);
		types.add(DeclareElementTypes.NotSuccession_4018);
		types.add(DeclareElementTypes.Precedence_4019);
		types.add(DeclareElementTypes.Response_4020);
		types.add(DeclareElementTypes.Succession_4021);
		types.add(DeclareElementTypes.RespondedExistence_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(ActivityEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ActivityEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ChoiceEditPart) {
			types.add(DeclareElementTypes.InputRelation_4002);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.AlternatePrecedence_4004);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.AlternateResponse_4005);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.ChainPrecedence_4006);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.ChainResponse_4007);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.ChainSuccession_4008);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.CoExistence_4009);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.ExclusiveChoice_4010);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.NotChainPrecedence_4011);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.NotChainSuccessive_4013);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.NotCoExistence_4014);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.NotPrecedence_4015);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.NotRespondedExistence_4016);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.NotResponse_4017);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.NotSuccession_4018);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.Precedence_4019);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.Response_4020);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.Succession_4021);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(DeclareElementTypes.RespondedExistence_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ActivityEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ActivityEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeclareElementTypes.InputRelation_4002) {
			types.add(DeclareElementTypes.Choice_2002);
		} else if (relationshipType == DeclareElementTypes.AlternatePrecedence_4004) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.AlternateResponse_4005) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.ChainPrecedence_4006) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.ChainResponse_4007) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.ChainSuccession_4008) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.CoExistence_4009) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.ExclusiveChoice_4010) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotChainPrecedence_4011) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotChainSuccessive_4013) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotCoExistence_4014) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotPrecedence_4015) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotRespondedExistence_4016) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotResponse_4017) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotSuccession_4018) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.Precedence_4019) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.Response_4020) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.Succession_4021) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.RespondedExistence_4001) {
			types.add(DeclareElementTypes.Activity_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ActivityEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ActivityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(19);
		types.add(DeclareElementTypes.OutputRelation_4003);
		types.add(DeclareElementTypes.AlternatePrecedence_4004);
		types.add(DeclareElementTypes.AlternateResponse_4005);
		types.add(DeclareElementTypes.ChainPrecedence_4006);
		types.add(DeclareElementTypes.ChainResponse_4007);
		types.add(DeclareElementTypes.ChainSuccession_4008);
		types.add(DeclareElementTypes.CoExistence_4009);
		types.add(DeclareElementTypes.ExclusiveChoice_4010);
		types.add(DeclareElementTypes.NotChainPrecedence_4011);
		types.add(DeclareElementTypes.NotChainSuccessive_4013);
		types.add(DeclareElementTypes.NotCoExistence_4014);
		types.add(DeclareElementTypes.NotPrecedence_4015);
		types.add(DeclareElementTypes.NotRespondedExistence_4016);
		types.add(DeclareElementTypes.NotResponse_4017);
		types.add(DeclareElementTypes.NotSuccession_4018);
		types.add(DeclareElementTypes.Precedence_4019);
		types.add(DeclareElementTypes.Response_4020);
		types.add(DeclareElementTypes.Succession_4021);
		types.add(DeclareElementTypes.RespondedExistence_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ActivityEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ActivityEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DeclareElementTypes.OutputRelation_4003) {
			types.add(DeclareElementTypes.Choice_2002);
		} else if (relationshipType == DeclareElementTypes.AlternatePrecedence_4004) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.AlternateResponse_4005) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.ChainPrecedence_4006) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.ChainResponse_4007) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.ChainSuccession_4008) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.CoExistence_4009) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.ExclusiveChoice_4010) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotChainPrecedence_4011) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotChainSuccessive_4013) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotCoExistence_4014) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotPrecedence_4015) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotRespondedExistence_4016) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotResponse_4017) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.NotSuccession_4018) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.Precedence_4019) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.Response_4020) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.Succession_4021) {
			types.add(DeclareElementTypes.Activity_2001);
		} else if (relationshipType == DeclareElementTypes.RespondedExistence_4001) {
			types.add(DeclareElementTypes.Activity_2001);
		}
		return types;
	}

}
