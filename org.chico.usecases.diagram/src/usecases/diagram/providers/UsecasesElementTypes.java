/*
 * 
 */
package usecases.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import usecases.UsecasesPackage;
import usecases.diagram.edit.parts.ActorEditPart;
import usecases.diagram.edit.parts.AssociationEditPart;
import usecases.diagram.edit.parts.ExtendEditPart;
import usecases.diagram.edit.parts.GeneralizationEditPart;
import usecases.diagram.edit.parts.IncludeEditPart;
import usecases.diagram.edit.parts.SystemEditPart;
import usecases.diagram.edit.parts.UseCaseEditPart;
import usecases.diagram.edit.parts.UseCasesDiagramEditPart;
import usecases.diagram.part.UsecasesDiagramEditorPlugin;

/**
 * @generated
 */
public class UsecasesElementTypes {

	/**
	* @generated
	*/
	private UsecasesElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UsecasesDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UseCasesDiagram_1000 = getElementType(
			"org.chico.usecases.diagram.UseCasesDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType System_2001 = getElementType("org.chico.usecases.diagram.System_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_2002 = getElementType("org.chico.usecases.diagram.Actor_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UseCase_3001 = getElementType("org.chico.usecases.diagram.UseCase_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Association_4001 = getElementType("org.chico.usecases.diagram.Association_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Generalization_4002 = getElementType(
			"org.chico.usecases.diagram.Generalization_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Extend_4003 = getElementType("org.chico.usecases.diagram.Extend_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Include_4004 = getElementType("org.chico.usecases.diagram.Include_4004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UseCasesDiagram_1000, UsecasesPackage.eINSTANCE.getUseCasesDiagram());

			elements.put(System_2001, UsecasesPackage.eINSTANCE.getSystem());

			elements.put(Actor_2002, UsecasesPackage.eINSTANCE.getActor());

			elements.put(UseCase_3001, UsecasesPackage.eINSTANCE.getUseCase());

			elements.put(Association_4001, UsecasesPackage.eINSTANCE.getAssociation());

			elements.put(Generalization_4002, UsecasesPackage.eINSTANCE.getGeneralization());

			elements.put(Extend_4003, UsecasesPackage.eINSTANCE.getExtend());

			elements.put(Include_4004, UsecasesPackage.eINSTANCE.getInclude());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UseCasesDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(System_2001);
			KNOWN_ELEMENT_TYPES.add(Actor_2002);
			KNOWN_ELEMENT_TYPES.add(UseCase_3001);
			KNOWN_ELEMENT_TYPES.add(Association_4001);
			KNOWN_ELEMENT_TYPES.add(Generalization_4002);
			KNOWN_ELEMENT_TYPES.add(Extend_4003);
			KNOWN_ELEMENT_TYPES.add(Include_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UseCasesDiagramEditPart.VISUAL_ID:
			return UseCasesDiagram_1000;
		case SystemEditPart.VISUAL_ID:
			return System_2001;
		case ActorEditPart.VISUAL_ID:
			return Actor_2002;
		case UseCaseEditPart.VISUAL_ID:
			return UseCase_3001;
		case AssociationEditPart.VISUAL_ID:
			return Association_4001;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_4002;
		case ExtendEditPart.VISUAL_ID:
			return Extend_4003;
		case IncludeEditPart.VISUAL_ID:
			return Include_4004;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return usecases.diagram.providers.UsecasesElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return usecases.diagram.providers.UsecasesElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return usecases.diagram.providers.UsecasesElementTypes.getElement(elementTypeAdapter);
		}
	};

}
