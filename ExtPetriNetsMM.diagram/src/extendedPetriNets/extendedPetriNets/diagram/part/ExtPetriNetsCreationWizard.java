package extendedPetriNets.extendedPetriNets.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class ExtPetriNetsCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(extendedPetriNets.extendedPetriNets.diagram.part.Messages.ExtPetriNetsCreationWizardTitle);
		setDefaultPageImageDescriptor(extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewextendedPetriNetsWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsCreationWizardPage(
				"DiagramModelFile", getSelection(), "extendedpetrinets_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(extendedPetriNets.extendedPetriNets.diagram.part.Messages.ExtPetriNetsCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(extendedPetriNets.extendedPetriNets.diagram.part.Messages.ExtPetriNetsCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsCreationWizardPage(
				"DomainModelFile", getSelection(), "extendedpetrinets") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".extendedpetrinets_diagram".length()); //$NON-NLS-1$
					setFileName(extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "extendedpetrinets")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(extendedPetriNets.extendedPetriNets.diagram.part.Messages.ExtPetriNetsCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(extendedPetriNets.extendedPetriNets.diagram.part.Messages.ExtPetriNetsCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										extendedPetriNets.extendedPetriNets.diagram.part.Messages.ExtPetriNetsCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								extendedPetriNets.extendedPetriNets.diagram.part.Messages.ExtPetriNetsCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
