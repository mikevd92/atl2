/**
 */
package roleModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import roleModel.Resource;
import roleModel.RoleModelPackage;
import roleModel.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roleModel.impl.ResourceImpl#getHasTask <em>Has Task</em>}</li>
 *   <li>{@link roleModel.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link roleModel.impl.ResourceImpl#getNrOfResources <em>Nr Of Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The cached value of the '{@link #getHasTask() <em>Has Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> hasTask;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrOfResources() <em>Nr Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfResources()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_RESOURCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfResources() <em>Nr Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfResources()
	 * @generated
	 * @ordered
	 */
	protected int nrOfResources = NR_OF_RESOURCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoleModelPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getHasTask() {
		if (hasTask == null) {
			hasTask = new EObjectResolvingEList<Task>(Task.class, this, RoleModelPackage.RESOURCE__HAS_TASK);
		}
		return hasTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleModelPackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfResources() {
		return nrOfResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfResources(int newNrOfResources) {
		int oldNrOfResources = nrOfResources;
		nrOfResources = newNrOfResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleModelPackage.RESOURCE__NR_OF_RESOURCES, oldNrOfResources, nrOfResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoleModelPackage.RESOURCE__HAS_TASK:
				return getHasTask();
			case RoleModelPackage.RESOURCE__NAME:
				return getName();
			case RoleModelPackage.RESOURCE__NR_OF_RESOURCES:
				return getNrOfResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoleModelPackage.RESOURCE__HAS_TASK:
				getHasTask().clear();
				getHasTask().addAll((Collection<? extends Task>)newValue);
				return;
			case RoleModelPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case RoleModelPackage.RESOURCE__NR_OF_RESOURCES:
				setNrOfResources((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RoleModelPackage.RESOURCE__HAS_TASK:
				getHasTask().clear();
				return;
			case RoleModelPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RoleModelPackage.RESOURCE__NR_OF_RESOURCES:
				setNrOfResources(NR_OF_RESOURCES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RoleModelPackage.RESOURCE__HAS_TASK:
				return hasTask != null && !hasTask.isEmpty();
			case RoleModelPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RoleModelPackage.RESOURCE__NR_OF_RESOURCES:
				return nrOfResources != NR_OF_RESOURCES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", nrOfResources: ");
		result.append(nrOfResources);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
