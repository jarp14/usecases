
/*
 * 
 */
package usecases.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import usecases.diagram.providers.UsecasesElementTypes;

/**
 * @generated
 */
public class UsecasesPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createSystem2CreationTool());
		paletteContainer.add(createUseCase3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAssociation1CreationTool());
		paletteContainer.add(createExtend2CreationTool());
		paletteContainer.add(createGeneralization3CreationTool());
		paletteContainer.add(createInclude4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Actor1CreationTool_title,
				Messages.Actor1CreationTool_desc, Collections.singletonList(UsecasesElementTypes.Actor_2002));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				UsecasesDiagramEditorPlugin.findImageDescriptor("/org.chico.usecases.figures/images/Actor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSystem2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.System2CreationTool_title,
				Messages.System2CreationTool_desc, Collections.singletonList(UsecasesElementTypes.System_2001));
		entry.setId("createSystem2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				UsecasesDiagramEditorPlugin.findImageDescriptor("/org.chico.usecases.figures/images/System.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUseCase3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UseCase3CreationTool_title,
				Messages.UseCase3CreationTool_desc, Collections.singletonList(UsecasesElementTypes.UseCase_3001));
		entry.setId("createUseCase3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				UsecasesDiagramEditorPlugin.findImageDescriptor("/org.chico.usecases.figures/images/UseCase.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociation1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Association1CreationTool_title,
				Messages.Association1CreationTool_desc,
				Collections.singletonList(UsecasesElementTypes.Association_4001));
		entry.setId("createAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				UsecasesDiagramEditorPlugin.findImageDescriptor("/org.chico.usecases.figures/images/Association.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExtend2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Extend2CreationTool_title,
				Messages.Extend2CreationTool_desc, Collections.singletonList(UsecasesElementTypes.Extend_4003));
		entry.setId("createExtend2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				UsecasesDiagramEditorPlugin.findImageDescriptor("/org.chico.usecases.figures/images/Extend.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeneralization3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Generalization3CreationTool_title,
				Messages.Generalization3CreationTool_desc,
				Collections.singletonList(UsecasesElementTypes.Generalization_4002));
		entry.setId("createGeneralization3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UsecasesDiagramEditorPlugin
				.findImageDescriptor("/org.chico.usecases.figures/images/Generalization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInclude4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Include4CreationTool_title,
				Messages.Include4CreationTool_desc, Collections.singletonList(UsecasesElementTypes.Include_4004));
		entry.setId("createInclude4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				UsecasesDiagramEditorPlugin.findImageDescriptor("/org.chico.usecases.figures/images/Include.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
