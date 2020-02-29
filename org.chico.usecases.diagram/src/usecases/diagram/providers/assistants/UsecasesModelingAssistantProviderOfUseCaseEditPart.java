/*
 * 
 */
package usecases.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import usecases.diagram.edit.parts.UseCaseEditPart;
import usecases.diagram.providers.UsecasesElementTypes;
import usecases.diagram.providers.UsecasesModelingAssistantProvider;

/**
 * @generated
 */
public class UsecasesModelingAssistantProviderOfUseCaseEditPart extends UsecasesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((UseCaseEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(UseCaseEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UsecasesElementTypes.Extend_4003);
		types.add(UsecasesElementTypes.Include_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((UseCaseEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(UseCaseEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof UseCaseEditPart) {
			types.add(UsecasesElementTypes.Extend_4003);
		}
		if (targetEditPart instanceof UseCaseEditPart) {
			types.add(UsecasesElementTypes.Include_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((UseCaseEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(UseCaseEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == UsecasesElementTypes.Extend_4003) {
			types.add(UsecasesElementTypes.UseCase_3001);
		} else if (relationshipType == UsecasesElementTypes.Include_4004) {
			types.add(UsecasesElementTypes.UseCase_3001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((UseCaseEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(UseCaseEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UsecasesElementTypes.Association_4001);
		types.add(UsecasesElementTypes.Extend_4003);
		types.add(UsecasesElementTypes.Include_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((UseCaseEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(UseCaseEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == UsecasesElementTypes.Association_4001) {
			types.add(UsecasesElementTypes.Actor_2002);
		} else if (relationshipType == UsecasesElementTypes.Extend_4003) {
			types.add(UsecasesElementTypes.UseCase_3001);
		} else if (relationshipType == UsecasesElementTypes.Include_4004) {
			types.add(UsecasesElementTypes.UseCase_3001);
		}
		return types;
	}

}
