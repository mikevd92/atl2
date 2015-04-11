package declare.declare.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * @generated
 */
public abstract class DeclareAbstractNavigatorItem extends PlatformObject {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { ITabbedPropertySheetPageContributor.class };
		final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor() {
			public String getContributorId() {
				return "DeclareMM.diagram"; //$NON-NLS-1$
			}
		};
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof declare.declare.diagram.navigator.DeclareAbstractNavigatorItem
						&& adapterType == ITabbedPropertySheetPageContributor.class) {
					return propertySheetPageContributor;
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, declare.declare.diagram.navigator.DeclareAbstractNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private Object myParent;

	/**
	 * @generated
	 */
	protected DeclareAbstractNavigatorItem(Object parent) {
		myParent = parent;
	}

	/**
	 * @generated
	 */
	public Object getParent() {
		return myParent;
	}

}
