/*
* 
*/
package usecases.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import usecases.diagram.edit.commands.UseCaseCreateCommand;
import usecases.diagram.providers.UsecasesElementTypes;

/**
 * @generated
 */
public class SystemSystemUseCasesCompartmentItemSemanticEditPolicy extends UsecasesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SystemSystemUseCasesCompartmentItemSemanticEditPolicy() {
		super(UsecasesElementTypes.System_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UsecasesElementTypes.UseCase_3001 == req.getElementType()) {
			return getGEFWrapper(new UseCaseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
