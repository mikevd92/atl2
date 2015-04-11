package declare.declare.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import declare.declare.diagram.edit.commands.AlternatePrecedenceCreateCommand;
import declare.declare.diagram.edit.commands.AlternatePrecedenceReorientCommand;
import declare.declare.diagram.edit.commands.AlternateResponseCreateCommand;
import declare.declare.diagram.edit.commands.AlternateResponseReorientCommand;
import declare.declare.diagram.edit.commands.ChainPrecedenceCreateCommand;
import declare.declare.diagram.edit.commands.ChainPrecedenceReorientCommand;
import declare.declare.diagram.edit.commands.ChainResponseCreateCommand;
import declare.declare.diagram.edit.commands.ChainResponseReorientCommand;
import declare.declare.diagram.edit.commands.ChainSuccessionCreateCommand;
import declare.declare.diagram.edit.commands.ChainSuccessionReorientCommand;
import declare.declare.diagram.edit.commands.CoExistenceCreateCommand;
import declare.declare.diagram.edit.commands.CoExistenceReorientCommand;
import declare.declare.diagram.edit.commands.ExclusiveChoiceCreateCommand;
import declare.declare.diagram.edit.commands.ExclusiveChoiceReorientCommand;
import declare.declare.diagram.edit.commands.InputRelationCreateCommand;
import declare.declare.diagram.edit.commands.InputRelationReorientCommand;
import declare.declare.diagram.edit.commands.NotChainPrecedenceCreateCommand;
import declare.declare.diagram.edit.commands.NotChainPrecedenceReorientCommand;
import declare.declare.diagram.edit.commands.NotChainRepsonseCreateCommand;
import declare.declare.diagram.edit.commands.NotChainRepsonseReorientCommand;
import declare.declare.diagram.edit.commands.NotChainSuccessiveCreateCommand;
import declare.declare.diagram.edit.commands.NotChainSuccessiveReorientCommand;
import declare.declare.diagram.edit.commands.NotCoExistenceCreateCommand;
import declare.declare.diagram.edit.commands.NotCoExistenceReorientCommand;
import declare.declare.diagram.edit.commands.NotPrecedenceCreateCommand;
import declare.declare.diagram.edit.commands.NotPrecedenceReorientCommand;
import declare.declare.diagram.edit.commands.NotRespondedExistenceCreateCommand;
import declare.declare.diagram.edit.commands.NotRespondedExistenceReorientCommand;
import declare.declare.diagram.edit.commands.NotResponseCreateCommand;
import declare.declare.diagram.edit.commands.NotResponseReorientCommand;
import declare.declare.diagram.edit.commands.NotSuccessionCreateCommand;
import declare.declare.diagram.edit.commands.NotSuccessionReorientCommand;
import declare.declare.diagram.edit.commands.OutputRelationCreateCommand;
import declare.declare.diagram.edit.commands.OutputRelationReorientCommand;
import declare.declare.diagram.edit.commands.PrecedenceCreateCommand;
import declare.declare.diagram.edit.commands.PrecedenceReorientCommand;
import declare.declare.diagram.edit.commands.RespondedExistenceCreateCommand;
import declare.declare.diagram.edit.commands.RespondedExistenceReorientCommand;
import declare.declare.diagram.edit.commands.ResponseCreateCommand;
import declare.declare.diagram.edit.commands.ResponseReorientCommand;
import declare.declare.diagram.edit.commands.SuccessionCreateCommand;
import declare.declare.diagram.edit.commands.SuccessionReorientCommand;
import declare.declare.diagram.edit.parts.AlternatePrecedenceEditPart;
import declare.declare.diagram.edit.parts.AlternateResponseEditPart;
import declare.declare.diagram.edit.parts.ChainPrecedenceEditPart;
import declare.declare.diagram.edit.parts.ChainResponseEditPart;
import declare.declare.diagram.edit.parts.ChainSuccessionEditPart;
import declare.declare.diagram.edit.parts.CoExistenceEditPart;
import declare.declare.diagram.edit.parts.ExclusiveChoiceEditPart;
import declare.declare.diagram.edit.parts.InputRelationEditPart;
import declare.declare.diagram.edit.parts.NotChainPrecedenceEditPart;
import declare.declare.diagram.edit.parts.NotChainRepsonseEditPart;
import declare.declare.diagram.edit.parts.NotChainSuccessiveEditPart;
import declare.declare.diagram.edit.parts.NotCoExistenceEditPart;
import declare.declare.diagram.edit.parts.NotPrecedenceEditPart;
import declare.declare.diagram.edit.parts.NotRespondedExistenceEditPart;
import declare.declare.diagram.edit.parts.NotResponseEditPart;
import declare.declare.diagram.edit.parts.NotSuccessionEditPart;
import declare.declare.diagram.edit.parts.OutputRelationEditPart;
import declare.declare.diagram.edit.parts.PrecedenceEditPart;
import declare.declare.diagram.edit.parts.RespondedExistenceEditPart;
import declare.declare.diagram.edit.parts.ResponseEditPart;
import declare.declare.diagram.edit.parts.SuccessionEditPart;
import declare.declare.diagram.part.DeclareVisualIDRegistry;
import declare.declare.diagram.providers.DeclareElementTypes;

/**
 * @generated
 */
public class ActivityItemSemanticEditPolicy extends
		DeclareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityItemSemanticEditPolicy() {
		super(DeclareElementTypes.Activity_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == OutputRelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == AlternatePrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == AlternateResponseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == ChainPrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == ChainResponseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == ChainSuccessionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == CoExistenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == ExclusiveChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == NotChainPrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == NotChainSuccessiveEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == NotCoExistenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == NotPrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == NotRespondedExistenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == NotResponseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == NotSuccessionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == PrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == ResponseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == SuccessionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(incomingLink) == RespondedExistenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == InputRelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == AlternatePrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == AlternateResponseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == ChainPrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == ChainResponseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == ChainSuccessionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == CoExistenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == ExclusiveChoiceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == NotChainPrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == NotChainRepsonseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == NotChainSuccessiveEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == NotCoExistenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == NotPrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == NotRespondedExistenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == NotResponseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == NotSuccessionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == PrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == ResponseEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == SuccessionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DeclareVisualIDRegistry.getVisualID(outgoingLink) == RespondedExistenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DeclareElementTypes.InputRelation_4002 == req.getElementType()) {
			return getGEFWrapper(new InputRelationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.OutputRelation_4003 == req.getElementType()) {
			return null;
		}
		if (DeclareElementTypes.AlternatePrecedence_4004 == req
				.getElementType()) {
			return getGEFWrapper(new AlternatePrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.AlternateResponse_4005 == req.getElementType()) {
			return getGEFWrapper(new AlternateResponseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.ChainPrecedence_4006 == req.getElementType()) {
			return getGEFWrapper(new ChainPrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.ChainResponse_4007 == req.getElementType()) {
			return getGEFWrapper(new ChainResponseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.ChainSuccession_4008 == req.getElementType()) {
			return getGEFWrapper(new ChainSuccessionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.CoExistence_4009 == req.getElementType()) {
			return getGEFWrapper(new CoExistenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.ExclusiveChoice_4010 == req.getElementType()) {
			return getGEFWrapper(new ExclusiveChoiceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotChainPrecedence_4011 == req.getElementType()) {
			return getGEFWrapper(new NotChainPrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotChainRepsonse_4012 == req.getElementType()) {
			return getGEFWrapper(new NotChainRepsonseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotChainSuccessive_4013 == req.getElementType()) {
			return getGEFWrapper(new NotChainSuccessiveCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotCoExistence_4014 == req.getElementType()) {
			return getGEFWrapper(new NotCoExistenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotPrecedence_4015 == req.getElementType()) {
			return getGEFWrapper(new NotPrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotRespondedExistence_4016 == req
				.getElementType()) {
			return getGEFWrapper(new NotRespondedExistenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotResponse_4017 == req.getElementType()) {
			return getGEFWrapper(new NotResponseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotSuccession_4018 == req.getElementType()) {
			return getGEFWrapper(new NotSuccessionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.Precedence_4019 == req.getElementType()) {
			return getGEFWrapper(new PrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.Response_4020 == req.getElementType()) {
			return getGEFWrapper(new ResponseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.Succession_4021 == req.getElementType()) {
			return getGEFWrapper(new SuccessionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.RespondedExistence_4001 == req.getElementType()) {
			return getGEFWrapper(new RespondedExistenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DeclareElementTypes.InputRelation_4002 == req.getElementType()) {
			return null;
		}
		if (DeclareElementTypes.OutputRelation_4003 == req.getElementType()) {
			return getGEFWrapper(new OutputRelationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.AlternatePrecedence_4004 == req
				.getElementType()) {
			return getGEFWrapper(new AlternatePrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.AlternateResponse_4005 == req.getElementType()) {
			return getGEFWrapper(new AlternateResponseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.ChainPrecedence_4006 == req.getElementType()) {
			return getGEFWrapper(new ChainPrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.ChainResponse_4007 == req.getElementType()) {
			return getGEFWrapper(new ChainResponseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.ChainSuccession_4008 == req.getElementType()) {
			return getGEFWrapper(new ChainSuccessionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.CoExistence_4009 == req.getElementType()) {
			return getGEFWrapper(new CoExistenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.ExclusiveChoice_4010 == req.getElementType()) {
			return getGEFWrapper(new ExclusiveChoiceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotChainPrecedence_4011 == req.getElementType()) {
			return getGEFWrapper(new NotChainPrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotChainRepsonse_4012 == req.getElementType()) {
			return null;
		}
		if (DeclareElementTypes.NotChainSuccessive_4013 == req.getElementType()) {
			return getGEFWrapper(new NotChainSuccessiveCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotCoExistence_4014 == req.getElementType()) {
			return getGEFWrapper(new NotCoExistenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotPrecedence_4015 == req.getElementType()) {
			return getGEFWrapper(new NotPrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotRespondedExistence_4016 == req
				.getElementType()) {
			return getGEFWrapper(new NotRespondedExistenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotResponse_4017 == req.getElementType()) {
			return getGEFWrapper(new NotResponseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.NotSuccession_4018 == req.getElementType()) {
			return getGEFWrapper(new NotSuccessionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.Precedence_4019 == req.getElementType()) {
			return getGEFWrapper(new PrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.Response_4020 == req.getElementType()) {
			return getGEFWrapper(new ResponseCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.Succession_4021 == req.getElementType()) {
			return getGEFWrapper(new SuccessionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DeclareElementTypes.RespondedExistence_4001 == req.getElementType()) {
			return getGEFWrapper(new RespondedExistenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case InputRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new InputRelationReorientCommand(req));
		case OutputRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new OutputRelationReorientCommand(req));
		case AlternatePrecedenceEditPart.VISUAL_ID:
			return getGEFWrapper(new AlternatePrecedenceReorientCommand(req));
		case AlternateResponseEditPart.VISUAL_ID:
			return getGEFWrapper(new AlternateResponseReorientCommand(req));
		case ChainPrecedenceEditPart.VISUAL_ID:
			return getGEFWrapper(new ChainPrecedenceReorientCommand(req));
		case ChainResponseEditPart.VISUAL_ID:
			return getGEFWrapper(new ChainResponseReorientCommand(req));
		case ChainSuccessionEditPart.VISUAL_ID:
			return getGEFWrapper(new ChainSuccessionReorientCommand(req));
		case CoExistenceEditPart.VISUAL_ID:
			return getGEFWrapper(new CoExistenceReorientCommand(req));
		case ExclusiveChoiceEditPart.VISUAL_ID:
			return getGEFWrapper(new ExclusiveChoiceReorientCommand(req));
		case NotChainPrecedenceEditPart.VISUAL_ID:
			return getGEFWrapper(new NotChainPrecedenceReorientCommand(req));
		case NotChainRepsonseEditPart.VISUAL_ID:
			return getGEFWrapper(new NotChainRepsonseReorientCommand(req));
		case NotChainSuccessiveEditPart.VISUAL_ID:
			return getGEFWrapper(new NotChainSuccessiveReorientCommand(req));
		case NotCoExistenceEditPart.VISUAL_ID:
			return getGEFWrapper(new NotCoExistenceReorientCommand(req));
		case NotPrecedenceEditPart.VISUAL_ID:
			return getGEFWrapper(new NotPrecedenceReorientCommand(req));
		case NotRespondedExistenceEditPart.VISUAL_ID:
			return getGEFWrapper(new NotRespondedExistenceReorientCommand(req));
		case NotResponseEditPart.VISUAL_ID:
			return getGEFWrapper(new NotResponseReorientCommand(req));
		case NotSuccessionEditPart.VISUAL_ID:
			return getGEFWrapper(new NotSuccessionReorientCommand(req));
		case PrecedenceEditPart.VISUAL_ID:
			return getGEFWrapper(new PrecedenceReorientCommand(req));
		case ResponseEditPart.VISUAL_ID:
			return getGEFWrapper(new ResponseReorientCommand(req));
		case SuccessionEditPart.VISUAL_ID:
			return getGEFWrapper(new SuccessionReorientCommand(req));
		case RespondedExistenceEditPart.VISUAL_ID:
			return getGEFWrapper(new RespondedExistenceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
