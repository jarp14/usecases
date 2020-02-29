/*
 * 
 */
package usecases.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import usecases.diagram.part.UsecasesDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	* @generated
	*/
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(UsecasesDiagramEditorPlugin.getInstance().getPreferenceStore());
	}
}
