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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roleModel.impl.TaskImpl#getHasResource <em>Has Resource</em>}</li>
 *   <li>{@link roleModel.impl.TaskImpl#getTaskToTask <em>Task To Task</em>}</li>
 *   <li>{@link roleModel.impl.TaskImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getHasResource() <em>Has Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasResource;

	/**
	 * The cached value of the '{@link #getTaskToTask() <em>Task To Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskToTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> taskToTask;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoleModelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getHasResource() {
		if (hasResource == null) {
			hasResource = new EObjectResolvingEList<Resource>(Resource.class, this, RoleModelPackage.TASK__HAS_RESOURCE);
		}
		return hasResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTaskToTask() {
		if (taskToTask == null) {
			taskToTask = new EObjectResolvingEList<Task>(Task.class, this, RoleModelPackage.TASK__TASK_TO_TASK);
		}
		return taskToTask;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoleModelPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoleModelPackage.TASK__HAS_RESOURCE:
				return getHasResource();
			case RoleModelPackage.TASK__TASK_TO_TASK:
				return getTaskToTask();
			case RoleModelPackage.TASK__NAME:
				return getName();
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
			case RoleModelPackage.TASK__HAS_RESOURCE:
				getHasResource().clear();
				getHasResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case RoleModelPackage.TASK__TASK_TO_TASK:
				getTaskToTask().clear();
				getTaskToTask().addAll((Collection<? extends Task>)newValue);
				return;
			case RoleModelPackage.TASK__NAME:
				setName((String)newValue);
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
			case RoleModelPackage.TASK__HAS_RESOURCE:
				getHasResource().clear();
				return;
			case RoleModelPackage.TASK__TASK_TO_TASK:
				getTaskToTask().clear();
				return;
			case RoleModelPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
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
			case RoleModelPackage.TASK__HAS_RESOURCE:
				return hasResource != null && !hasResource.isEmpty();
			case RoleModelPackage.TASK__TASK_TO_TASK:
				return taskToTask != null && !taskToTask.isEmpty();
			case RoleModelPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //TaskImpl
