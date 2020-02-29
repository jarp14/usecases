/*
* 
*/
package usecases.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import usecases.Actor;
import usecases.Association;
import usecases.Extend;
import usecases.Generalization;
import usecases.Include;
import usecases.System;
import usecases.UseCase;
import usecases.UseCasesDiagram;
import usecases.UsecasesPackage;
import usecases.diagram.edit.parts.ActorEditPart;
import usecases.diagram.edit.parts.AssociationEditPart;
import usecases.diagram.edit.parts.ExtendEditPart;
import usecases.diagram.edit.parts.GeneralizationEditPart;
import usecases.diagram.edit.parts.IncludeEditPart;
import usecases.diagram.edit.parts.SystemEditPart;
import usecases.diagram.edit.parts.SystemSystemUseCasesCompartmentEditPart;
import usecases.diagram.edit.parts.UseCaseEditPart;
import usecases.diagram.edit.parts.UseCasesDiagramEditPart;
import usecases.diagram.providers.UsecasesElementTypes;

/**
 * @generated
 */
public class UsecasesDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<UsecasesNodeDescriptor> getSemanticChildren(View view) {
		switch (UsecasesVisualIDRegistry.getVisualID(view)) {
		case UseCasesDiagramEditPart.VISUAL_ID:
			return getUseCasesDiagram_1000SemanticChildren(view);
		case SystemSystemUseCasesCompartmentEditPart.VISUAL_ID:
			return getSystemSystemUseCasesCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UsecasesNodeDescriptor> getUseCasesDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UseCasesDiagram modelElement = (UseCasesDiagram) view.getElement();
		LinkedList<UsecasesNodeDescriptor> result = new LinkedList<UsecasesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSystems().iterator(); it.hasNext();) {
			System childElement = (System) it.next();
			int visualID = UsecasesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SystemEditPart.VISUAL_ID) {
				result.add(new UsecasesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActors().iterator(); it.hasNext();) {
			Actor childElement = (Actor) it.next();
			int visualID = UsecasesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new UsecasesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UsecasesNodeDescriptor> getSystemSystemUseCasesCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) containerView.getElement();
		LinkedList<UsecasesNodeDescriptor> result = new LinkedList<UsecasesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUseCases().iterator(); it.hasNext();) {
			UseCase childElement = (UseCase) it.next();
			int visualID = UsecasesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UseCaseEditPart.VISUAL_ID) {
				result.add(new UsecasesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UsecasesLinkDescriptor> getContainedLinks(View view) {
		switch (UsecasesVisualIDRegistry.getVisualID(view)) {
		case UseCasesDiagramEditPart.VISUAL_ID:
			return getUseCasesDiagram_1000ContainedLinks(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_2001ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002ContainedLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_3001ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002ContainedLinks(view);
		case ExtendEditPart.VISUAL_ID:
			return getExtend_4003ContainedLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UsecasesLinkDescriptor> getIncomingLinks(View view) {
		switch (UsecasesVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_2001IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002IncomingLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_3001IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002IncomingLinks(view);
		case ExtendEditPart.VISUAL_ID:
			return getExtend_4003IncomingLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UsecasesLinkDescriptor> getOutgoingLinks(View view) {
		switch (UsecasesVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_2001OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002OutgoingLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_3001OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4001OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4002OutgoingLinks(view);
		case ExtendEditPart.VISUAL_ID:
			return getExtend_4003OutgoingLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getUseCasesDiagram_1000ContainedLinks(View view) {
		UseCasesDiagram modelElement = (UseCasesDiagram) view.getElement();
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Association_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extend_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Include_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getSystem_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getActor_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getUseCase_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getAssociation_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getGeneralization_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getExtend_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getInclude_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getSystem_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getActor_2002IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getUseCase_3001IncomingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Association_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extend_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Include_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getAssociation_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getGeneralization_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getExtend_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getInclude_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getSystem_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getActor_2002OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getUseCase_3001OutgoingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Extend_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Include_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getAssociation_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getGeneralization_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getExtend_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsecasesLinkDescriptor> getInclude_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<UsecasesLinkDescriptor> getContainedTypeModelFacetLinks_Association_4001(
			UseCasesDiagram container) {
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			Actor src = link.getSource();
			result.add(new UsecasesLinkDescriptor(src, dst, link, UsecasesElementTypes.Association_4001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UsecasesLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4002(
			UseCasesDiagram container) {
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getTarget();
			Actor src = link.getSource();
			result.add(new UsecasesLinkDescriptor(src, dst, link, UsecasesElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UsecasesLinkDescriptor> getContainedTypeModelFacetLinks_Extend_4003(
			UseCasesDiagram container) {
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Extend) {
				continue;
			}
			Extend link = (Extend) linkObject;
			if (ExtendEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			UseCase src = link.getSource();
			result.add(new UsecasesLinkDescriptor(src, dst, link, UsecasesElementTypes.Extend_4003,
					ExtendEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UsecasesLinkDescriptor> getContainedTypeModelFacetLinks_Include_4004(
			UseCasesDiagram container) {
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Include) {
				continue;
			}
			Include link = (Include) linkObject;
			if (IncludeEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			UseCase src = link.getSource();
			result.add(new UsecasesLinkDescriptor(src, dst, link, UsecasesElementTypes.Include_4004,
					IncludeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UsecasesLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4001(UseCase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UsecasesPackage.eINSTANCE.getAssociation_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor src = link.getSource();
			result.add(new UsecasesLinkDescriptor(src, target, link, UsecasesElementTypes.Association_4001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UsecasesLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4002(Actor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UsecasesPackage.eINSTANCE.getGeneralization_Target()
					|| false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor src = link.getSource();
			result.add(new UsecasesLinkDescriptor(src, target, link, UsecasesElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UsecasesLinkDescriptor> getIncomingTypeModelFacetLinks_Extend_4003(UseCase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UsecasesPackage.eINSTANCE.getExtend_Target()
					|| false == setting.getEObject() instanceof Extend) {
				continue;
			}
			Extend link = (Extend) setting.getEObject();
			if (ExtendEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase src = link.getSource();
			result.add(new UsecasesLinkDescriptor(src, target, link, UsecasesElementTypes.Extend_4003,
					ExtendEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UsecasesLinkDescriptor> getIncomingTypeModelFacetLinks_Include_4004(UseCase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UsecasesPackage.eINSTANCE.getInclude_Target()
					|| false == setting.getEObject() instanceof Include) {
				continue;
			}
			Include link = (Include) setting.getEObject();
			if (IncludeEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase src = link.getSource();
			result.add(new UsecasesLinkDescriptor(src, target, link, UsecasesElementTypes.Include_4004,
					IncludeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UsecasesLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4001(Actor source) {
		UseCasesDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof UseCasesDiagram) {
				container = (UseCasesDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			Actor src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UsecasesLinkDescriptor(src, dst, link, UsecasesElementTypes.Association_4001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UsecasesLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4002(Actor source) {
		UseCasesDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof UseCasesDiagram) {
				container = (UseCasesDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getTarget();
			Actor src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UsecasesLinkDescriptor(src, dst, link, UsecasesElementTypes.Generalization_4002,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UsecasesLinkDescriptor> getOutgoingTypeModelFacetLinks_Extend_4003(UseCase source) {
		UseCasesDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof UseCasesDiagram) {
				container = (UseCasesDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Extend) {
				continue;
			}
			Extend link = (Extend) linkObject;
			if (ExtendEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			UseCase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UsecasesLinkDescriptor(src, dst, link, UsecasesElementTypes.Extend_4003,
					ExtendEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<UsecasesLinkDescriptor> getOutgoingTypeModelFacetLinks_Include_4004(UseCase source) {
		UseCasesDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof UseCasesDiagram) {
				container = (UseCasesDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UsecasesLinkDescriptor> result = new LinkedList<UsecasesLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Include) {
				continue;
			}
			Include link = (Include) linkObject;
			if (IncludeEditPart.VISUAL_ID != UsecasesVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getTarget();
			UseCase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UsecasesLinkDescriptor(src, dst, link, UsecasesElementTypes.Include_4004,
					IncludeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<UsecasesNodeDescriptor> getSemanticChildren(View view) {
			return UsecasesDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UsecasesLinkDescriptor> getContainedLinks(View view) {
			return UsecasesDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UsecasesLinkDescriptor> getIncomingLinks(View view) {
			return UsecasesDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UsecasesLinkDescriptor> getOutgoingLinks(View view) {
			return UsecasesDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
