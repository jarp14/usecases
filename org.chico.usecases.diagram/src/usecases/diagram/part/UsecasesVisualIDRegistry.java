/*
* 
*/
package usecases.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import usecases.UseCasesDiagram;
import usecases.UsecasesPackage;
import usecases.diagram.edit.parts.ActorEditPart;
import usecases.diagram.edit.parts.ActorTitleEditPart;
import usecases.diagram.edit.parts.AssociationEditPart;
import usecases.diagram.edit.parts.ExtendEditPart;
import usecases.diagram.edit.parts.ExtendTypeEditPart;
import usecases.diagram.edit.parts.GeneralizationEditPart;
import usecases.diagram.edit.parts.IncludeEditPart;
import usecases.diagram.edit.parts.IncludeTypeEditPart;
import usecases.diagram.edit.parts.SystemEditPart;
import usecases.diagram.edit.parts.SystemSystemUseCasesCompartmentEditPart;
import usecases.diagram.edit.parts.SystemTitleEditPart;
import usecases.diagram.edit.parts.UseCaseEditPart;
import usecases.diagram.edit.parts.UseCaseTitleEditPart;
import usecases.diagram.edit.parts.UseCasesDiagramEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UsecasesVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.chico.usecases.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UseCasesDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UseCasesDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return usecases.diagram.part.UsecasesVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UsecasesDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UsecasesPackage.eINSTANCE.getUseCasesDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UseCasesDiagram) domainElement)) {
			return UseCasesDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = usecases.diagram.part.UsecasesVisualIDRegistry.getModelID(containerView);
		if (!UseCasesDiagramEditPart.MODEL_ID.equals(containerModelID) && !"usecases".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UseCasesDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = usecases.diagram.part.UsecasesVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UseCasesDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UseCasesDiagramEditPart.VISUAL_ID:
			if (UsecasesPackage.eINSTANCE.getSystem().isSuperTypeOf(domainElement.eClass())) {
				return SystemEditPart.VISUAL_ID;
			}
			if (UsecasesPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			break;
		case SystemSystemUseCasesCompartmentEditPart.VISUAL_ID:
			if (UsecasesPackage.eINSTANCE.getUseCase().isSuperTypeOf(domainElement.eClass())) {
				return UseCaseEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = usecases.diagram.part.UsecasesVisualIDRegistry.getModelID(containerView);
		if (!UseCasesDiagramEditPart.MODEL_ID.equals(containerModelID) && !"usecases".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UseCasesDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = usecases.diagram.part.UsecasesVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UseCasesDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UseCasesDiagramEditPart.VISUAL_ID:
			if (SystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemEditPart.VISUAL_ID:
			if (SystemTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemSystemUseCasesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UseCaseEditPart.VISUAL_ID:
			if (UseCaseTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemSystemUseCasesCompartmentEditPart.VISUAL_ID:
			if (UseCaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtendEditPart.VISUAL_ID:
			if (ExtendTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IncludeEditPart.VISUAL_ID:
			if (IncludeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UsecasesPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (UsecasesPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (UsecasesPackage.eINSTANCE.getExtend().isSuperTypeOf(domainElement.eClass())) {
			return ExtendEditPart.VISUAL_ID;
		}
		if (UsecasesPackage.eINSTANCE.getInclude().isSuperTypeOf(domainElement.eClass())) {
			return IncludeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(UseCasesDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case SystemSystemUseCasesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case UseCasesDiagramEditPart.VISUAL_ID:
			return false;
		case ActorEditPart.VISUAL_ID:
		case UseCaseEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return usecases.diagram.part.UsecasesVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return usecases.diagram.part.UsecasesVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return usecases.diagram.part.UsecasesVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return usecases.diagram.part.UsecasesVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return usecases.diagram.part.UsecasesVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return usecases.diagram.part.UsecasesVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
