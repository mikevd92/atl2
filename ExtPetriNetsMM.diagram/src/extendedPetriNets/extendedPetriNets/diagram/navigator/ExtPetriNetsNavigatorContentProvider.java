package extendedPetriNets.extendedPetriNets.diagram.navigator;

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

/**
 * @generated
 */
public class ExtPetriNetsNavigatorContentProvider implements
		ICommonContentProvider {

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
	public ExtPetriNetsNavigatorContentProvider() {
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
			ArrayList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem> result = new ArrayList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup) {
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup group = (extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) {
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem navigatorItem = (extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) parentElement;
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
		switch (extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
				.getVisualID(view)) {

		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID: {
			LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup links = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_PetriNet_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID: {
			LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem>();
			Node sv = (Node) view;
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup incominglinks = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_Transition_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup outgoinglinks = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_Transition_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
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

		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID: {
			LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem>();
			Node sv = (Node) view;
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup outgoinglinks = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_OutputPort_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup incominglinks = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_OutputPort_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID: {
			LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem>();
			Node sv = (Node) view;
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup outgoinglinks = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_Place_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup incominglinks = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_Place_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID: {
			LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem>();
			Node sv = (Node) view;
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup outgoinglinks = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_InputPort_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup incominglinks = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_InputPort_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputArcEditPart.VISUAL_ID: {
			LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup target = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_InputArc_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup source = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_InputArc_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
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

		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputArcEditPart.VISUAL_ID: {
			LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem> result = new LinkedList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup target = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_OutputArc_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup source = new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorGroup(
					extendedPetriNets.extendedPetriNets.diagram.part.Messages.NavigatorGroupName_OutputArc_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
							.getType(extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
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
		return extendedPetriNets.extendedPetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem> result = new ArrayList<extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem) {
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem abstractNavigatorItem = (extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsAbstractNavigatorItem) element;
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
