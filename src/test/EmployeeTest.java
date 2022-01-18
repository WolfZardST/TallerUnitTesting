package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import main.Employee;
import main.EmployeeType;

public class EmployeeTest {

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

	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void CsEURWorker() {
		Employee employee = new Employee((float) 3500.0, "EUR", (float) 0.4, EmployeeType.Worker);
		assertEquals( 3389.333333, employee.cs() , 0.001);
		
	}
	
	@Test
	public void CsEURSupervisor() {
		Employee employee = new Employee((float) 6500.0, "EUR", (float) 0.2, EmployeeType.Supervisor);
		assertEquals( 6239.403333, employee.cs() , 0.001);
		
	}
	
	@Test
	public void CsEURManager() {
		Employee employee = new Employee( 10000.0f, "EUR",  0.1f, EmployeeType.Manager);
		assertEquals( 9564.403333, employee.cs() , 0.001);
		
	}

	@Test
	public void CalculateYearBonusEURWorker() {
		Employee worker = new Employee(500.23F, "EUR", 0.05F, EmployeeType.Worker);
		float salario = worker.CalculateYearBonus();
		assertEquals(386.00F, salario, 0.00001);
	}
	
	@Test
	public void CalculateYearBonusEURSupervisor() {
		Employee supervisor = new Employee(1400.00F, "EUR", 0.07F, EmployeeType.Supervisor);
		float salario = supervisor.CalculateYearBonus();
		assertEquals(1523.00F, salario, 0.00001);
	}
	
	@Test
	public void CalculateYearBonusEURManager() {
		Employee manager = new Employee(5420.00F, "EUR", 0.10F, EmployeeType.Manager);
		float salario = manager.CalculateYearBonus();
		assertEquals(5535.00F, salario, 0.00001);
	}
}
