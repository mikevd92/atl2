package resourcePetriNet.resourcePetriNet.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ResourcePetriNetsNavigatorItem
		extends
		resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public ResourcePetriNetsNavigatorItem(View view, Object parent,
			boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((resourcePetriNet.resourcePetriNet.diagram.navigator.ResourcePetriNetsNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
