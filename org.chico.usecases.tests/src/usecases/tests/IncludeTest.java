/**
 */
package usecases.tests;

import junit.textui.TestRunner;

import usecases.Include;
import usecases.UsecasesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IncludeTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IncludeTest.class);
	}

	/**
	 * Constructs a new Include test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Include test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Include getFixture() {
		return (Include)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecasesFactory.eINSTANCE.createInclude());
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

} //IncludeTest
