/**
 */
package usecases;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Cases Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecases.UseCasesDiagram#getSystems <em>Systems</em>}</li>
 *   <li>{@link usecases.UseCasesDiagram#getActors <em>Actors</em>}</li>
 *   <li>{@link usecases.UseCasesDiagram#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see usecases.UsecasesPackage#getUseCasesDiagram()
 * @model
 * @generated
 */
public interface UseCasesDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link usecases.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see usecases.UsecasesPackage#getUseCasesDiagram_Systems()
	 * @model containment="true"
	 * @generated
	 */
	EList<usecases.System> getSystems();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link usecases.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see usecases.UsecasesPackage#getUseCasesDiagram_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link usecases.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see usecases.UsecasesPackage#getUseCasesDiagram_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // UseCasesDiagram
