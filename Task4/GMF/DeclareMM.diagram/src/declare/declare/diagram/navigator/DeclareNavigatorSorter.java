package declare.declare.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import declare.declare.diagram.part.DeclareVisualIDRegistry;

/**
 * @generated
 */
public class DeclareNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4024;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DeclareNavigatorItem) {
			DeclareNavigatorItem item = (DeclareNavigatorItem) element;
			return DeclareVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
