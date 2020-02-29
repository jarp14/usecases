/*
* 
*/
package usecases.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import usecases.diagram.providers.UsecasesElementTypes;

/**
 * @generated
 */
public class ExtendItemSemanticEditPolicy extends UsecasesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExtendItemSemanticEditPolicy() {
		super(UsecasesElementTypes.Extend_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
