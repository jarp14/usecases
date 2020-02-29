/**
 */
package usecases;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecases.System#getTitle <em>Title</em>}</li>
 *   <li>{@link usecases.System#getUseCases <em>Use Cases</em>}</li>
 * </ul>
 *
 * @see usecases.UsecasesPackage#getSystem()
 * @model annotation="gmf.node label='title' tool.name='System' size='300,400' tool.small.bundle='org.chico.usecases.figures' tool.small.path='images/System.gif'"
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"[title]"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see usecases.UsecasesPackage#getSystem_Title()
	 * @model default="[title]"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link usecases.System#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' containment reference list.
	 * The list contents are of type {@link usecases.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Cases</em>' containment reference list.
	 * @see usecases.UsecasesPackage#getSystem_UseCases()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='false'"
	 * @generated
	 */
	EList<UseCase> getUseCases();

} // System
