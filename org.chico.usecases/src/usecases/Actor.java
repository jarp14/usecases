/**
 */
package usecases;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecases.Actor#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see usecases.UsecasesPackage#getActor()
 * @model annotation="gmf.node label='title' label.icon='false' figure='svg' svg.uri='platform:/plugin/org.chico.usecases/icons/user.svg' tool.small.bundle='org.chico.usecases.figures' tool.name='Actor' tool.small.path='images/Actor.gif' label.placement='external'"
 * @generated
 */
public interface Actor extends EObject {
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
	 * @see usecases.UsecasesPackage#getActor_Title()
	 * @model default="[title]"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link usecases.Actor#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Actor
