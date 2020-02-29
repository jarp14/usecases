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
public class IncludeItemSemanticEditPolicy extends UsecasesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IncludeItemSemanticEditPolicy() {
		super(UsecasesElementTypes.Include_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
