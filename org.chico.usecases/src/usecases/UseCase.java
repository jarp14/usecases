/**
 */
package usecases;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecases.UseCase#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see usecases.UsecasesPackage#getUseCase()
 * @model annotation="gmf.node label='title' label.icon='false' figure='ellipse' border.color='0,0,0' tool.small.bundle='org.chico.usecases.figures' tool.small.path='images/UseCase.gif' tool.name='Use Case'"
 * @generated
 */
public interface UseCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"[use case]"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see usecases.UsecasesPackage#getUseCase_Title()
	 * @model default="[use case]"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link usecases.UseCase#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // UseCase
