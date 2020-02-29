/**
 */
package usecases;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecases.Generalization#getSource <em>Source</em>}</li>
 *   <li>{@link usecases.Generalization#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see usecases.UsecasesPackage#getGeneralization()
 * @model annotation="gmf.link source='source' target='target' tool.name='Generalization' style='solid' width='1' color='0,0,0' target.decoration='closedarrow' tool.small.bundle='org.chico.usecases.figures' tool.small.path='images/Generalization.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Generalization extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Actor)
	 * @see usecases.UsecasesPackage#getGeneralization_Source()
	 * @model required="true"
	 * @generated
	 */
	Actor getSource();

	/**
	 * Sets the value of the '{@link usecases.Generalization#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Actor value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Actor)
	 * @see usecases.UsecasesPackage#getGeneralization_Target()
	 * @model required="true"
	 * @generated
	 */
	Actor getTarget();

	/**
	 * Sets the value of the '{@link usecases.Generalization#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Actor value);

} // Generalization
