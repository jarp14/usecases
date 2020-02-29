/*
* 
*/
package usecases.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import usecases.diagram.edit.parts.ActorEditPart;
import usecases.diagram.edit.parts.ActorTitleEditPart;
import usecases.diagram.edit.parts.AssociationEditPart;
import usecases.diagram.edit.parts.ExtendEditPart;
import usecases.diagram.edit.parts.ExtendTypeEditPart;
import usecases.diagram.edit.parts.GeneralizationEditPart;
import usecases.diagram.edit.parts.IncludeEditPart;
import usecases.diagram.edit.parts.IncludeTypeEditPart;
import usecases.diagram.edit.parts.SystemEditPart;
import usecases.diagram.edit.parts.SystemTitleEditPart;
import usecases.diagram.edit.parts.UseCaseEditPart;
import usecases.diagram.edit.parts.UseCaseTitleEditPart;
import usecases.diagram.edit.parts.UseCasesDiagramEditPart;
import usecases.diagram.part.UsecasesDiagramEditorPlugin;
import usecases.diagram.part.UsecasesVisualIDRegistry;
import usecases.diagram.providers.UsecasesElementTypes;
import usecases.diagram.providers.UsecasesParserProvider;

/**
 * @generated
 */
public class UsecasesNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UsecasesDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UsecasesDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UsecasesNavigatorItem && !isOwnView(((UsecasesNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UsecasesNavigatorGroup) {
			UsecasesNavigatorGroup group = (UsecasesNavigatorGroup) element;
			return UsecasesDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UsecasesNavigatorItem) {
			UsecasesNavigatorItem navigatorItem = (UsecasesNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (UsecasesVisualIDRegistry.getVisualID(view)) {
		case UseCasesDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?usecases?UseCasesDiagram", UsecasesElementTypes.UseCasesDiagram_1000); //$NON-NLS-1$
		case SystemEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?usecases?System", UsecasesElementTypes.System_2001); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?usecases?Actor", UsecasesElementTypes.Actor_2002); //$NON-NLS-1$
		case UseCaseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?usecases?UseCase", UsecasesElementTypes.UseCase_3001); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?usecases?Association", UsecasesElementTypes.Association_4001); //$NON-NLS-1$
		case GeneralizationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?usecases?Generalization", UsecasesElementTypes.Generalization_4002); //$NON-NLS-1$
		case ExtendEditPart.VISUAL_ID:
			return getImage("Navigator?Link?usecases?Extend", UsecasesElementTypes.Extend_4003); //$NON-NLS-1$
		case IncludeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?usecases?Include", UsecasesElementTypes.Include_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UsecasesDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UsecasesElementTypes.isKnownElementType(elementType)) {
			image = UsecasesElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof UsecasesNavigatorGroup) {
			UsecasesNavigatorGroup group = (UsecasesNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UsecasesNavigatorItem) {
			UsecasesNavigatorItem navigatorItem = (UsecasesNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (UsecasesVisualIDRegistry.getVisualID(view)) {
		case UseCasesDiagramEditPart.VISUAL_ID:
			return getUseCasesDiagram_1000Text(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_2001Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002Text(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_3001Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001Text(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002Text(view);
		case ExtendEditPart.VISUAL_ID:
			return getExtend_4003Text(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUseCasesDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getSystem_2001Text(View view) {
		IParser parser = UsecasesParserProvider.getParser(UsecasesElementTypes.System_2001,
				view.getElement() != null ? view.getElement() : view,
				UsecasesVisualIDRegistry.getType(SystemTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UsecasesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_2002Text(View view) {
		IParser parser = UsecasesParserProvider.getParser(UsecasesElementTypes.Actor_2002,
				view.getElement() != null ? view.getElement() : view,
				UsecasesVisualIDRegistry.getType(ActorTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UsecasesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUseCase_3001Text(View view) {
		IParser parser = UsecasesParserProvider.getParser(UsecasesElementTypes.UseCase_3001,
				view.getElement() != null ? view.getElement() : view,
				UsecasesVisualIDRegistry.getType(UseCaseTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UsecasesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociation_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getGeneralization_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getExtend_4003Text(View view) {
		IParser parser = UsecasesParserProvider.getParser(UsecasesElementTypes.Extend_4003,
				view.getElement() != null ? view.getElement() : view,
				UsecasesVisualIDRegistry.getType(ExtendTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UsecasesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInclude_4004Text(View view) {
		IParser parser = UsecasesParserProvider.getParser(UsecasesElementTypes.Include_4004,
				view.getElement() != null ? view.getElement() : view,
				UsecasesVisualIDRegistry.getType(IncludeTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UsecasesDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return UseCasesDiagramEditPart.MODEL_ID.equals(UsecasesVisualIDRegistry.getModelID(view));
	}

}
