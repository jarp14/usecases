/*
 * 
 */
package usecases.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import usecases.diagram.part.UsecasesVisualIDRegistry;

/**
 * @generated
 */
public class UsecasesEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UsecasesVisualIDRegistry.getVisualID(view)) {

			case UseCasesDiagramEditPart.VISUAL_ID:
				return new UseCasesDiagramEditPart(view);

			case SystemEditPart.VISUAL_ID:
				return new SystemEditPart(view);

			case SystemTitleEditPart.VISUAL_ID:
				return new SystemTitleEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorTitleEditPart.VISUAL_ID:
				return new ActorTitleEditPart(view);

			case UseCaseEditPart.VISUAL_ID:
				return new UseCaseEditPart(view);

			case UseCaseTitleEditPart.VISUAL_ID:
				return new UseCaseTitleEditPart(view);

			case SystemSystemUseCasesCompartmentEditPart.VISUAL_ID:
				return new SystemSystemUseCasesCompartmentEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case ExtendEditPart.VISUAL_ID:
				return new ExtendEditPart(view);

			case ExtendTypeEditPart.VISUAL_ID:
				return new ExtendTypeEditPart(view);

			case IncludeEditPart.VISUAL_ID:
				return new IncludeEditPart(view);

			case IncludeTypeEditPart.VISUAL_ID:
				return new IncludeTypeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
