/**
 */
package usecases.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import usecases.UseCasesDiagram;
import usecases.UsecasesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Use Cases Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCasesDiagramTest extends TestCase {

	/**
	 * The fixture for this Use Cases Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCasesDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UseCasesDiagramTest.class);
	}

	/**
	 * Constructs a new Use Cases Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCasesDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Use Cases Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UseCasesDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Use Cases Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCasesDiagram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecasesFactory.eINSTANCE.createUseCasesDiagram());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UseCasesDiagramTest
