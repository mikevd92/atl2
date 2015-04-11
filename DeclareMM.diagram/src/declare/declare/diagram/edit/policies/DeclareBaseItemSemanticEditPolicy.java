package declare.declare.diagram.edit.policies;

/**
 * @generated
 */
public class DeclareBaseItemSemanticEditPolicy extends org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy {

		/**
 * Extended request data key to hold editpart visual id.
 * @generated
 */
	public static final String VISUAL_ID_KEY = "visual_id";  //$NON-NLS-1$

	/**
 * @generated
 */
	private final org.eclipse.gmf.runtime.emf.type.core.IElementType myElementType;
	
		/**
 * @generated
 */
	protected DeclareBaseItemSemanticEditPolicy(org.eclipse.gmf.runtime.emf.type.core.IElementType elementType) {
		myElementType = elementType;
	}

	/**
 * Extended request data key to hold editpart visual id.
 * Add visual id of edited editpart to extended data of the request
 * so command switch can decide what kind of diagram element is being edited.
 * It is done in those cases when it's not possible to deduce diagram
 * element kind from domain element.
 * 
 * @generated
 */
	public org.eclipse.gef.commands.Command getCommand(org.eclipse.gef.Request request) {
		if (request instanceof org.eclipse.gef.requests.ReconnectRequest) {
			Object view = ((org.eclipse.gef.requests.ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof org.eclipse.gmf.runtime.notation.View) {
				Integer id = new Integer(declare.declare.diagram.part.DeclareVisualIDRegistry.getVisualID((org.eclipse.gmf.runtime.notation.View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}
	
	/**
 * Returns visual id from request parameters.
 * @generated
 */
	protected int getVisualID(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

		/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSemanticCommand(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
	org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest completedRequest = completeRequest(request);
	org.eclipse.gef.commands.Command semanticCommand = getSemanticCommandSwitch(completedRequest);
	semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
	if (completedRequest instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest) {
		org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest destroyRequest = (org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest) completedRequest;
		return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command addDeleteViewCommand(org.eclipse.gef.commands.Command mainCommand, org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest completedRequest){
		org.eclipse.gef.commands.Command deleteViewCommand = getGEFWrapper(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), (org.eclipse.gmf.runtime.notation.View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
}
	
		/**
 * @generated
 */
	private org.eclipse.gef.commands.Command getEditHelperCommand(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request, org.eclipse.gef.commands.Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			org.eclipse.gmf.runtime.common.core.command.ICommand command = editPolicyCommand instanceof org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy ? ((org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy) editPolicyCommand).getICommand() : new org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy(editPolicyCommand);
			request.setParameter(org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		org.eclipse.gmf.runtime.emf.type.core.IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		org.eclipse.gmf.runtime.common.core.command.ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand)) {
				command = new org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(command);
		}
		return editPolicyCommand;
	}
	
		/**
 * @generated
 */
	private org.eclipse.gmf.runtime.emf.type.core.IElementType getContextElementType(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType requestContextElementType = declare.declare.diagram.providers.DeclareElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSemanticCommandSwitch(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest req) {
	if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest) {
		return getCreateRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) {
		return getCreateCommand((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest) {
		return getConfigureCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest) {
		return getDestroyElementCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest) {
		return getDestroyReferenceCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest) {
		return getDuplicateCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest) {
		return getEditContextCommand((org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest) {
		return getMoveCommand((org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest) {
		return getReorientReferenceRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest) {
		return getReorientRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest) {
		return getSetCommand((org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest) req);
	}
	return null;
}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCreateRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCreateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSetCommand(org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getEditContextCommand(org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyElementCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyReferenceCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDuplicateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getMoveCommand(org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getReorientReferenceRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest req) {
	return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getReorientRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest req) {
	return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
}
	
		/**
 * @generated
 */
	protected final org.eclipse.gef.commands.Command getGEFWrapper(org.eclipse.gmf.runtime.common.core.command.ICommand cmd) {
		return new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(cmd);
	}

	/**
 * Returns editing domain from the host edit part.
 * @generated
 */
	protected org.eclipse.emf.transaction.TransactionalEditingDomain getEditingDomain() {
		return ((org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) getHost()).getEditingDomain();
	}

		/**
 * Clean all shortcuts to the host element from the same diagram
 * @generated
 */
	protected void addDestroyShortcutsCommand(org.eclipse.gmf.runtime.common.core.command.ICompositeCommand cmd, org.eclipse.gmf.runtime.notation.View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (java.util.Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			org.eclipse.gmf.runtime.notation.View nextView = (org.eclipse.gmf.runtime.notation.View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), nextView));
		}
	}

	
	/**
 * @generated
 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = declare.declare.diagram.part.DeclareDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			declare.declare.diagram.part.DeclareDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}


/**
 * @generated
 */
public static class LinkConstraints {

	/**
 * @generated
 */
	LinkConstraints() {
		// use static method #getLinkConstraints() to access instance
	}

	
/**
 * @generated
 */
public boolean canCreateInputRelation(declare.declare.Declare container, declare.declare.Activity source, declare.declare.SpecialConstraint target) {
						return canExistInputRelation(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateOutputRelation(declare.declare.Declare container, declare.declare.SpecialConstraint source, declare.declare.Activity target) {
						return canExistOutputRelation(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateAlternatePrecedence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistAlternatePrecedence(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateAlternateResponse(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistAlternateResponse(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateChainPrecedence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistChainPrecedence(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateChainResponse(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistChainResponse(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateChainSuccession(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistChainSuccession(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateCoExistence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistCoExistence(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateExclusiveChoice(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistExclusiveChoice(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateNotChainPrecedence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistNotChainPrecedence(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateNotChainRepsonse(declare.declare.Declare container, declare.declare.Activity source,declare.declare.Activity  target) {
						return canExistNotChainRepsonse(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateNotChainSuccessive(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistNotChainSuccessive(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateNotCoExistence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistNotCoExistence(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateNotPrecedence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistNotPrecedence(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateNotRespondedExistence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistNotRespondedExistence(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateNotResponse(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistNotResponse(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateNotSuccession(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistNotSuccession(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreatePrecedence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistPrecedence(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateResponse(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistResponse(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateSuccession(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistSuccession(container, null, source, target);
}


/**
 * @generated
 */
public boolean canCreateRespondedExistence(declare.declare.Declare container, declare.declare.Activity source, declare.declare.Activity target) {
						return canExistRespondedExistence(container, null, source, target);
}

	
	/**
 * @generated
 */
	public boolean canExistInputRelation(declare.declare.Declare container, declare.declare.InputRelation linkInstance, declare.declare.Activity source, declare.declare.SpecialConstraint target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistOutputRelation(declare.declare.Declare container, declare.declare.OutputRelation linkInstance, declare.declare.SpecialConstraint source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistAlternatePrecedence(declare.declare.Declare container, declare.declare.AlternatePrecedence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistAlternateResponse(declare.declare.Declare container, declare.declare.AlternateResponse linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistChainPrecedence(declare.declare.Declare container, declare.declare.ChainPrecedence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistChainResponse(declare.declare.Declare container, declare.declare.ChainResponse linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistChainSuccession(declare.declare.Declare container, declare.declare.ChainSuccession linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistCoExistence(declare.declare.Declare container, declare.declare.CoExistence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistExclusiveChoice(declare.declare.Declare container, declare.declare.ExclusiveChoice linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistNotChainPrecedence(declare.declare.Declare container, declare.declare.NotChainPrecedence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistNotChainRepsonse(declare.declare.Declare container, declare.declare.NotChainRepsonse linkInstance, declare.declare.Activity source,declare.declare.Activity  target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistNotChainSuccessive(declare.declare.Declare container, declare.declare.NotChainSuccessive linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistNotCoExistence(declare.declare.Declare container, declare.declare.NotCoExistence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistNotPrecedence(declare.declare.Declare container, declare.declare.NotPrecedence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistNotRespondedExistence(declare.declare.Declare container, declare.declare.NotRespondedExistence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistNotResponse(declare.declare.Declare container, declare.declare.NotResponse linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistNotSuccession(declare.declare.Declare container, declare.declare.NotSuccession linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistPrecedence(declare.declare.Declare container, declare.declare.Precedence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistResponse(declare.declare.Declare container, declare.declare.Response linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistSuccession(declare.declare.Declare container, declare.declare.Succession linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}

	/**
 * @generated
 */
	public boolean canExistRespondedExistence(declare.declare.Declare container, declare.declare.RespondedExistence linkInstance, declare.declare.Activity source, declare.declare.Activity target) {
		return true;
	}
}

	}
