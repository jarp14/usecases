/*
* 
*/
package usecases.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import usecases.diagram.edit.commands.ActorCreateCommand;
import usecases.diagram.edit.commands.SystemCreateCommand;
import usecases.diagram.providers.UsecasesElementTypes;

/**
 * @generated
 */
public class UseCasesDiagramItemSemanticEditPolicy extends UsecasesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UseCasesDiagramItemSemanticEditPolicy() {
		super(UsecasesElementTypes.UseCasesDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UsecasesElementTypes.System_2001 == req.getElementType()) {
			return getGEFWrapper(new SystemCreateCommand(req));
		}
		if (UsecasesElementTypes.Actor_2002 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
