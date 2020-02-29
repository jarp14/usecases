/*
 * 
 */
package usecases.diagram.providers;

import usecases.diagram.part.UsecasesDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = UsecasesDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UsecasesDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
