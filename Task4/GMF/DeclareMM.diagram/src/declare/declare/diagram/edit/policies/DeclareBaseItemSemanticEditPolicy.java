package declare.declare.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

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
import declare.declare.diagram.part.DeclareDiagramEditorPlugin;
import declare.declare.diagram.part.DeclareVisualIDRegistry;
import declare.declare.diagram.providers.DeclareElementTypes;

/**
 * @generated
 */
public class DeclareBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected DeclareBaseItemSemanticEditPolicy(IElementType elementType) {
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
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						DeclareVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = DeclareElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = DeclareDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			DeclareDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
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
		public boolean canCreateRespondedExistence_4003(Declare container,
				Activity source, Activity target) {
			return canExistRespondedExistence_4003(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAlternatePrecedence_4004(Declare container,
				Activity source, Activity target) {
			return canExistAlternatePrecedence_4004(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateChoice_4005(Declare container, Activity source,
				Activity target) {
			return canExistChoice_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCoExistence_4006(Declare container,
				Activity source, Activity target) {
			return canExistCoExistence_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExclusiveChoice_4007(Declare container,
				Activity source, Activity target) {
			return canExistExclusiveChoice_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNotChainPrecedence_4008(Declare container,
				Activity source, Activity target) {
			return canExistNotChainPrecedence_4008(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNotChainRepsonse_4009(Declare container,
				Activity source, Activity target) {
			return canExistNotChainRepsonse_4009(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNotCoExistence_4010(Declare container,
				Activity source, Activity target) {
			return canExistNotCoExistence_4010(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNotPrecedence_4011(Declare container,
				Activity source, Activity target) {
			return canExistNotPrecedence_4011(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNotRespondedExistence_4012(Declare container,
				Activity source, Activity target) {
			return canExistNotRespondedExistence_4012(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNotResponse_4013(Declare container,
				Activity source, Activity target) {
			return canExistNotResponse_4013(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNotSuccession_4014(Declare container,
				Activity source, Activity target) {
			return canExistNotSuccession_4014(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSuccession_4015(Declare container,
				Activity source, Activity target) {
			return canExistSuccession_4015(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateResponse_4016(Declare container,
				Activity source, Activity target) {
			return canExistResponse_4016(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePrecedence_4017(Declare container,
				Activity source, Activity target) {
			return canExistPrecedence_4017(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNotChainSuccessive_4018(Declare container,
				Activity source, Activity target) {
			return canExistNotChainSuccessive_4018(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateChainPrecedence_4019(Declare container,
				Activity source, Activity target) {
			return canExistChainPrecedence_4019(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateChainResponse_4020(Declare container,
				Activity source, Activity target) {
			return canExistChainResponse_4020(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateChainSuccession_4021(Declare container,
				Activity source, Activity target) {
			return canExistChainSuccession_4021(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAlternateResponse_4022(Declare container,
				Activity source, Activity target) {
			return canExistAlternateResponse_4022(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canExistRespondedExistence_4003(Declare container,
				RespondedExistence linkInstance, Activity source,
				Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAlternatePrecedence_4004(Declare container,
				AlternatePrecedence linkInstance, Activity source,
				Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistChoice_4005(Declare container,
				Choice linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCoExistence_4006(Declare container,
				CoExistence linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistExclusiveChoice_4007(Declare container,
				ExclusiveChoice linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNotChainPrecedence_4008(Declare container,
				NotChainPrecedence linkInstance, Activity source,
				Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNotChainRepsonse_4009(Declare container,
				NotChainRepsonse linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNotCoExistence_4010(Declare container,
				NotCoExistence linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNotPrecedence_4011(Declare container,
				NotPrecedence linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNotRespondedExistence_4012(Declare container,
				NotRespondedExistence linkInstance, Activity source,
				Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNotResponse_4013(Declare container,
				NotResponse linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNotSuccession_4014(Declare container,
				NotSuccession linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSuccession_4015(Declare container,
				Succession linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistResponse_4016(Declare container,
				Response linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPrecedence_4017(Declare container,
				Precedence linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNotChainSuccessive_4018(Declare container,
				NotChainSuccessive linkInstance, Activity source,
				Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistChainPrecedence_4019(Declare container,
				ChainPrecedence linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistChainResponse_4020(Declare container,
				ChainResponse linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistChainSuccession_4021(Declare container,
				ChainSuccession linkInstance, Activity source, Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAlternateResponse_4022(Declare container,
				AlternateResponse linkInstance, Activity source, Activity target) {
			return true;
		}
	}

}
