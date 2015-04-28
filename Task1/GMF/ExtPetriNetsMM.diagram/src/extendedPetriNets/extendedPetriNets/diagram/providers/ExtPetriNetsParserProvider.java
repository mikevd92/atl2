package extendedPetriNets.extendedPetriNets.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ExtPetriNetsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser transitionName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionName_5001Parser() {
		if (transitionName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getTransition_Name() };
			extendedPetriNets.extendedPetriNets.diagram.parsers.MessageFormatParser parser = new extendedPetriNets.extendedPetriNets.diagram.parsers.MessageFormatParser(
					features);
			transitionName_5001Parser = parser;
		}
		return transitionName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPortName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPortName_5002Parser() {
		if (outputPortName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getGenericPlace_Name() };
			extendedPetriNets.extendedPetriNets.diagram.parsers.MessageFormatParser parser = new extendedPetriNets.extendedPetriNets.diagram.parsers.MessageFormatParser(
					features);
			outputPortName_5002Parser = parser;
		}
		return outputPortName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser placeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPlaceName_5003Parser() {
		if (placeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getGenericPlace_Name() };
			extendedPetriNets.extendedPetriNets.diagram.parsers.MessageFormatParser parser = new extendedPetriNets.extendedPetriNets.diagram.parsers.MessageFormatParser(
					features);
			placeName_5003Parser = parser;
		}
		return placeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPortName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInputPortName_5004Parser() {
		if (inputPortName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { extendedPetriNets.extendedPetriNets.extendedPetriNetsPackage.eINSTANCE
					.getGenericPlace_Name() };
			extendedPetriNets.extendedPetriNets.diagram.parsers.MessageFormatParser parser = new extendedPetriNets.extendedPetriNets.diagram.parsers.MessageFormatParser(
					features);
			inputPortName_5004Parser = parser;
		}
		return inputPortName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID:
			return getTransitionName_5001Parser();
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.OutputPortNameEditPart.VISUAL_ID:
			return getOutputPortName_5002Parser();
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID:
			return getPlaceName_5003Parser();
		case extendedPetriNets.extendedPetriNets.diagram.edit.parts.InputPortNameEditPart.VISUAL_ID:
			return getInputPortName_5004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(extendedPetriNets.extendedPetriNets.diagram.part.ExtPetriNetsVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (extendedPetriNets.extendedPetriNets.diagram.providers.ExtPetriNetsElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
