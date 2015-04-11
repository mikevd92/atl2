package resourcePetriNet.resourcePetriNet.diagram.navigator;

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
public class ResourcePetriNetsNavigatorContentProvider implements
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
	public ResourcePetriNetsNavigatorContentProvider() {
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
			ArrayList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem> result = new ArrayList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem>();
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
							resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup) {
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup group = (resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) {
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem navigatorItem = (resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) parentElement;
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
		switch (resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
				.getVisualID(view)) {

		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID: {
			LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup links = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_PetriNet_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID: {
			LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem>();
			Node sv = (Node) view;
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup outgoinglinks = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_Place_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup incominglinks = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_Place_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
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

		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID: {
			LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem>();
			Node sv = (Node) view;
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup outgoinglinks = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_Resource_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup incominglinks = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_Resource_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
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

		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID: {
			LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem>();
			Node sv = (Node) view;
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup incominglinks = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_Transition_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup outgoinglinks = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_Transition_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID));
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

		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.InputArcEditPart.VISUAL_ID: {
			LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup target = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_InputArc_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup source = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_InputArc_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
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

		case resourcePetriNet.resourcePetriNet.diagram.edit.parts.OutputArcEditPart.VISUAL_ID: {
			LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem> result = new LinkedList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup target = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_OutputArc_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup source = new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorGroup(
					resourcePetriNet.resourcePetriNet.diagram.part.Messages.NavigatorGroupName_OutputArc_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
							.getType(resourcePetriNet.resourcePetriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
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
		return resourcePetriNet.resourcePetriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem> result = new ArrayList<resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem) {
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem abstractNavigatorItem = (resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem) element;
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
