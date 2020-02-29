/*
 * 
 */
package usecases.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import usecases.diagram.edit.parts.UseCasesDiagramEditPart;
import usecases.diagram.edit.parts.UsecasesEditPartFactory;
import usecases.diagram.part.UsecasesVisualIDRegistry;

/**
 * @generated
 */
public class UsecasesEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public UsecasesEditPartProvider() {
		super(new UsecasesEditPartFactory(), UsecasesVisualIDRegistry.TYPED_INSTANCE, UseCasesDiagramEditPart.MODEL_ID);
	}

}
