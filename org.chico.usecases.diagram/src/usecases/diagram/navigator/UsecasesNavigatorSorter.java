/*
* 
*/
package usecases.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import usecases.diagram.part.UsecasesVisualIDRegistry;

/**
 * @generated
 */
public class UsecasesNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof UsecasesNavigatorItem) {
			UsecasesNavigatorItem item = (UsecasesNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return UsecasesVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
