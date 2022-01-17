package test;

import static org.junit.Assert.*;
import org.junit.*;

import main.Employee;
import main.EmployeeType;

public class EmployeeTest {
	
	private Employee employee;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	/**
	 * Validando método CalculateYearBonus en el escenario de un Worker que cobra 500.18 USD.
	 * Valor esperado: 386.00
	 */
	@Test
	public void CalculateYearBonusUSDWorkerTest() {
		employee = new Employee(500.18F, "USD", 100F, EmployeeType.Worker);
		assertEquals(employee.CalculateYearBonus(), 386F, 0.001);
	}
	
	/**
	 * Validando CalculateYearBonus en el escenario de un Supervisor que cobra 1453.72 USD.
	 * Valor esperado: 1646.72
	 */
	@Test
	public void CalculateYearBonusUSDSupervisorTest() {
		employee = new Employee(1453.72F, "USD", 100F, EmployeeType.Supervisor);
		assertEquals(employee.CalculateYearBonus(), 1646.72F, 0.001);
	}
	
	/**
	 * Validando CalculateYearBonus en el escenario de un Manager que cobra 6506.63 USD.
	 * Valor esperado: 6892.63
	 */
	@Test
	public void CalculateYearBonusUSDManagerTest() {
		employee = new Employee(6506.63F, "USD", 100F, EmployeeType.Manager);
		assertEquals(employee.CalculateYearBonus(), 6892.63F, 0.001);
	}

}
