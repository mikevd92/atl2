package declare.declare.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import declare.declare.diagram.part.DeclareVisualIDRegistry;
import declare.declare.diagram.part.Messages;

/**
 * @generated
 */
public class DeclareNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DeclareNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<DeclareNavigatorItem> result = new ArrayList<DeclareNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, DeclareEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof DeclareNavigatorGroup) {
			DeclareNavigatorGroup group = (DeclareNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DeclareNavigatorItem) {
			DeclareNavigatorItem navigatorItem = (DeclareNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DeclareVisualIDRegistry.getVisualID(view)) {

		case DeclareEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			DeclareNavigatorGroup links = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Declare_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(RespondedExistenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(AlternatePrecedenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(CoExistenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ExclusiveChoiceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainPrecedenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainRepsonseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotCoExistenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotPrecedenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotRespondedExistenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotResponseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotSuccessionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(SuccessionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ResponseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(PrecedenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainSuccessiveEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainPrecedenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainResponseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainSuccessionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(AlternateResponseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ActivityEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Node sv = (Node) view;
			DeclareNavigatorGroup incominglinks = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Activity_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup outgoinglinks = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Activity_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(RespondedExistenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(RespondedExistenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(AlternatePrecedenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(AlternatePrecedenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(CoExistenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(CoExistenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ExclusiveChoiceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ExclusiveChoiceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainPrecedenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainPrecedenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainRepsonseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainRepsonseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotCoExistenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotCoExistenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotPrecedenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotPrecedenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotRespondedExistenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotRespondedExistenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotResponseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotResponseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotSuccessionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotSuccessionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(SuccessionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(SuccessionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ResponseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ResponseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(PrecedenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(PrecedenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainSuccessiveEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(NotChainSuccessiveEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainPrecedenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainPrecedenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainResponseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainResponseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainSuccessionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(ChainSuccessionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(AlternateResponseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DeclareVisualIDRegistry
							.getType(AlternateResponseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RespondedExistenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_RespondedExistence_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_RespondedExistence_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AlternatePrecedenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_AlternatePrecedence_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_AlternatePrecedence_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ChoiceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Choice_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Choice_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CoExistenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_CoExistence_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_CoExistence_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExclusiveChoiceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_ExclusiveChoice_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_ExclusiveChoice_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NotChainPrecedenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotChainPrecedence_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotChainPrecedence_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NotChainRepsonseEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotChainRepsonse_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotChainRepsonse_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NotCoExistenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotCoExistence_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotCoExistence_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NotPrecedenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotPrecedence_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotPrecedence_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NotRespondedExistenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotRespondedExistence_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotRespondedExistence_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NotResponseEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotResponse_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotResponse_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NotSuccessionEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotSuccession_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotSuccession_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SuccessionEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Succession_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Succession_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ResponseEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Response_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Response_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PrecedenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Precedence_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_Precedence_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NotChainSuccessiveEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotChainSuccessive_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_NotChainSuccessive_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ChainPrecedenceEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_ChainPrecedence_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_ChainPrecedence_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ChainResponseEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_ChainResponse_4020_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_ChainResponse_4020_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ChainSuccessionEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_ChainSuccession_4021_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_ChainSuccession_4021_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AlternateResponseEditPart.VISUAL_ID: {
			LinkedList<DeclareAbstractNavigatorItem> result = new LinkedList<DeclareAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DeclareNavigatorGroup target = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_AlternateResponse_4022_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DeclareNavigatorGroup source = new DeclareNavigatorGroup(
					Messages.NavigatorGroupName_AlternateResponse_4022_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DeclareVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DeclareEditPart.MODEL_ID.equals(DeclareVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DeclareNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<DeclareNavigatorItem> result = new ArrayList<DeclareNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new DeclareNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof DeclareAbstractNavigatorItem) {
			DeclareAbstractNavigatorItem abstractNavigatorItem = (DeclareAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
