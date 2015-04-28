/**
 */
package resourcePetriNet.resourcePetriNet.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import resourcePetriNet.resourcePetriNet.PetriNet;
import resourcePetriNet.resourcePetriNet.resourcePetriNetFactory;
import resourcePetriNet.resourcePetriNet.resourcePetriNetPackage;

/**
 * This is the item provider adapter for a {@link resourcePetriNet.resourcePetriNet.PetriNet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PetriNet_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PetriNet_name_feature", "_UI_PetriNet_type"),
				 resourcePetriNetPackage.Literals.PETRI_NET__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_GENERIC_PLACES);
			childrenFeatures.add(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_TRANSITIONS);
			childrenFeatures.add(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_INPUT_ARCS);
			childrenFeatures.add(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_OUTPUT_ARCS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PetriNet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PetriNet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PetriNet)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PetriNet_type") :
			getString("_UI_PetriNet_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PetriNet.class)) {
			case resourcePetriNetPackage.PETRI_NET__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case resourcePetriNetPackage.PETRI_NET__CONTAINS_GENERIC_PLACES:
			case resourcePetriNetPackage.PETRI_NET__CONTAINS_TRANSITIONS:
			case resourcePetriNetPackage.PETRI_NET__CONTAINS_INPUT_ARCS:
			case resourcePetriNetPackage.PETRI_NET__CONTAINS_OUTPUT_ARCS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_GENERIC_PLACES,
				 resourcePetriNetFactory.eINSTANCE.createPlace()));

		newChildDescriptors.add
			(createChildParameter
				(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_GENERIC_PLACES,
				 resourcePetriNetFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_TRANSITIONS,
				 resourcePetriNetFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_INPUT_ARCS,
				 resourcePetriNetFactory.eINSTANCE.createInputArc()));

		newChildDescriptors.add
			(createChildParameter
				(resourcePetriNetPackage.Literals.PETRI_NET__CONTAINS_OUTPUT_ARCS,
				 resourcePetriNetFactory.eINSTANCE.createOutputArc()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ResourcePetriNetsEditPlugin.INSTANCE;
	}

}
