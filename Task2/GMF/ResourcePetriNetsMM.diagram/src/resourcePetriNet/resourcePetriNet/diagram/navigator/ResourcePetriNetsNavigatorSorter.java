package resourcePetriNet.resourcePetriNet.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ResourcePetriNetsNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) {
			resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem item = (resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) element;
			return resourcePetriNet.resourcePetriNet.diagram.part.ResourcePetriNetsVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
