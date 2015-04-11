/**
 *
 * $Id$
 */
package extendedPetriNets.validation;

import extendedPetriNets.GenericPlace;
import extendedPetriNets.InputArc;
import extendedPetriNets.OutputArc;
import extendedPetriNets.Transition;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link extendedPetriNets.PetriNet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PetriNetValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateContainsGenericPlaces(EList<GenericPlace> value);
	boolean validateContainsTransitions(EList<Transition> value);
	boolean validateContainsInputArcs(EList<InputArc> value);
	boolean validateContainsOutputArcs(EList<OutputArc> value);
}