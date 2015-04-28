/**
 */
package declare.declare.provider;

import declare.declare.util.declareAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class declareItemProviderAdapterFactory extends declareAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public declareItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.Declare} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareItemProvider declareItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.Declare}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclareAdapter() {
		if (declareItemProvider == null) {
			declareItemProvider = new DeclareItemProvider(this);
		}

		return declareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.RespondedExistence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespondedExistenceItemProvider respondedExistenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.RespondedExistence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRespondedExistenceAdapter() {
		if (respondedExistenceItemProvider == null) {
			respondedExistenceItemProvider = new RespondedExistenceItemProvider(this);
		}

		return respondedExistenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.CoExistence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoExistenceItemProvider coExistenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.CoExistence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoExistenceAdapter() {
		if (coExistenceItemProvider == null) {
			coExistenceItemProvider = new CoExistenceItemProvider(this);
		}

		return coExistenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.Response} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseItemProvider responseItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponseAdapter() {
		if (responseItemProvider == null) {
			responseItemProvider = new ResponseItemProvider(this);
		}

		return responseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.Precedence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceItemProvider precedenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.Precedence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrecedenceAdapter() {
		if (precedenceItemProvider == null) {
			precedenceItemProvider = new PrecedenceItemProvider(this);
		}

		return precedenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.Succession} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessionItemProvider successionItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.Succession}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSuccessionAdapter() {
		if (successionItemProvider == null) {
			successionItemProvider = new SuccessionItemProvider(this);
		}

		return successionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.AlternateResponse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternateResponseItemProvider alternateResponseItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.AlternateResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternateResponseAdapter() {
		if (alternateResponseItemProvider == null) {
			alternateResponseItemProvider = new AlternateResponseItemProvider(this);
		}

		return alternateResponseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.AlternatePrecedence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternatePrecedenceItemProvider alternatePrecedenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.AlternatePrecedence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternatePrecedenceAdapter() {
		if (alternatePrecedenceItemProvider == null) {
			alternatePrecedenceItemProvider = new AlternatePrecedenceItemProvider(this);
		}

		return alternatePrecedenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.ChainResponse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainResponseItemProvider chainResponseItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.ChainResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChainResponseAdapter() {
		if (chainResponseItemProvider == null) {
			chainResponseItemProvider = new ChainResponseItemProvider(this);
		}

		return chainResponseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.ChainSuccession} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainSuccessionItemProvider chainSuccessionItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.ChainSuccession}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChainSuccessionAdapter() {
		if (chainSuccessionItemProvider == null) {
			chainSuccessionItemProvider = new ChainSuccessionItemProvider(this);
		}

		return chainSuccessionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.ChainPrecedence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainPrecedenceItemProvider chainPrecedenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.ChainPrecedence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChainPrecedenceAdapter() {
		if (chainPrecedenceItemProvider == null) {
			chainPrecedenceItemProvider = new ChainPrecedenceItemProvider(this);
		}

		return chainPrecedenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.NotCoExistence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotCoExistenceItemProvider notCoExistenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.NotCoExistence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotCoExistenceAdapter() {
		if (notCoExistenceItemProvider == null) {
			notCoExistenceItemProvider = new NotCoExistenceItemProvider(this);
		}

		return notCoExistenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.NotRespondedExistence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotRespondedExistenceItemProvider notRespondedExistenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.NotRespondedExistence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotRespondedExistenceAdapter() {
		if (notRespondedExistenceItemProvider == null) {
			notRespondedExistenceItemProvider = new NotRespondedExistenceItemProvider(this);
		}

		return notRespondedExistenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.NotResponse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotResponseItemProvider notResponseItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.NotResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotResponseAdapter() {
		if (notResponseItemProvider == null) {
			notResponseItemProvider = new NotResponseItemProvider(this);
		}

		return notResponseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.NotPrecedence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotPrecedenceItemProvider notPrecedenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.NotPrecedence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotPrecedenceAdapter() {
		if (notPrecedenceItemProvider == null) {
			notPrecedenceItemProvider = new NotPrecedenceItemProvider(this);
		}

		return notPrecedenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.NotSuccession} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotSuccessionItemProvider notSuccessionItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.NotSuccession}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotSuccessionAdapter() {
		if (notSuccessionItemProvider == null) {
			notSuccessionItemProvider = new NotSuccessionItemProvider(this);
		}

		return notSuccessionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.NotChainRepsonse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotChainRepsonseItemProvider notChainRepsonseItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.NotChainRepsonse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotChainRepsonseAdapter() {
		if (notChainRepsonseItemProvider == null) {
			notChainRepsonseItemProvider = new NotChainRepsonseItemProvider(this);
		}

		return notChainRepsonseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.NotChainSuccessive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotChainSuccessiveItemProvider notChainSuccessiveItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.NotChainSuccessive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotChainSuccessiveAdapter() {
		if (notChainSuccessiveItemProvider == null) {
			notChainSuccessiveItemProvider = new NotChainSuccessiveItemProvider(this);
		}

		return notChainSuccessiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.NotChainPrecedence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotChainPrecedenceItemProvider notChainPrecedenceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.NotChainPrecedence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotChainPrecedenceAdapter() {
		if (notChainPrecedenceItemProvider == null) {
			notChainPrecedenceItemProvider = new NotChainPrecedenceItemProvider(this);
		}

		return notChainPrecedenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.Choice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceItemProvider choiceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceAdapter() {
		if (choiceItemProvider == null) {
			choiceItemProvider = new ChoiceItemProvider(this);
		}

		return choiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link declare.declare.ExclusiveChoice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveChoiceItemProvider exclusiveChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link declare.declare.ExclusiveChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExclusiveChoiceAdapter() {
		if (exclusiveChoiceItemProvider == null) {
			exclusiveChoiceItemProvider = new ExclusiveChoiceItemProvider(this);
		}

		return exclusiveChoiceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (declareItemProvider != null) declareItemProvider.dispose();
		if (activityItemProvider != null) activityItemProvider.dispose();
		if (respondedExistenceItemProvider != null) respondedExistenceItemProvider.dispose();
		if (coExistenceItemProvider != null) coExistenceItemProvider.dispose();
		if (responseItemProvider != null) responseItemProvider.dispose();
		if (precedenceItemProvider != null) precedenceItemProvider.dispose();
		if (successionItemProvider != null) successionItemProvider.dispose();
		if (alternateResponseItemProvider != null) alternateResponseItemProvider.dispose();
		if (alternatePrecedenceItemProvider != null) alternatePrecedenceItemProvider.dispose();
		if (chainResponseItemProvider != null) chainResponseItemProvider.dispose();
		if (chainSuccessionItemProvider != null) chainSuccessionItemProvider.dispose();
		if (chainPrecedenceItemProvider != null) chainPrecedenceItemProvider.dispose();
		if (notCoExistenceItemProvider != null) notCoExistenceItemProvider.dispose();
		if (notRespondedExistenceItemProvider != null) notRespondedExistenceItemProvider.dispose();
		if (notResponseItemProvider != null) notResponseItemProvider.dispose();
		if (notPrecedenceItemProvider != null) notPrecedenceItemProvider.dispose();
		if (notSuccessionItemProvider != null) notSuccessionItemProvider.dispose();
		if (notChainRepsonseItemProvider != null) notChainRepsonseItemProvider.dispose();
		if (notChainSuccessiveItemProvider != null) notChainSuccessiveItemProvider.dispose();
		if (notChainPrecedenceItemProvider != null) notChainPrecedenceItemProvider.dispose();
		if (choiceItemProvider != null) choiceItemProvider.dispose();
		if (exclusiveChoiceItemProvider != null) exclusiveChoiceItemProvider.dispose();
	}

}
