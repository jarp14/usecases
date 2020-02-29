/*
 * 
 */
package usecases.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import usecases.diagram.providers.UsecasesElementTypes;
import usecases.diagram.providers.UsecasesModelingAssistantProvider;

/**
 * @generated
 */
public class UsecasesModelingAssistantProviderOfUseCasesDiagramEditPart extends UsecasesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UsecasesElementTypes.System_2001);
		types.add(UsecasesElementTypes.Actor_2002);
		return types;
	}

}
