/*
 * 
 */
package usecases.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

import usecases.diagram.part.UsecasesDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	* @generated
	*/
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(UsecasesDiagramEditorPlugin.getInstance().getPreferenceStore());
	}
}
