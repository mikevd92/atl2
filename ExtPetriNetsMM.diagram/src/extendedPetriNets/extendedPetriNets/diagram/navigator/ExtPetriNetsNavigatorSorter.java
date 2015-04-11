package extendedPetriNets.extendedPetriNets.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ExtPetriNetsNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) {
			extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem item = (extendedPetriNets.extendedPetriNets.diagram.navigator.ExtPetriNetsNavigatorItem) element;
			return extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
