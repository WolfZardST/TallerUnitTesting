package test;

import static org.junit.Assert.*;
import org.junit.*;

import main.*;

public class EmployeeTest {
	
	private Employee employee;

	/**
	 * Validando método cs() en el escenario de un Worker que cobra 785.13 USD. 
	 * bonusPercentage: 0.3
	 * Valor esperado: 849.463333
	 */
	@Test
	public void CsUSDWorker() {
		employee = new Employee(785.13f, "USD", 0.3f, EmployeeType.Worker);
		assertEquals( 849.463333, employee.cs() , 0.001);
	}
	
	/**
	 * Validando método cs() en el escenario de un Supervisor que cobra 6500.0 USD.
	 * bonusPercentage: 0.2
	 * Valor esperado: 6564.403333
	 */
	@Test
	public void CsUSDSupervisor() {
		employee = new Employee((float) 6500.0, "USD", (float) 0.2, EmployeeType.Supervisor);
		assertEquals( 6564.403333, employee.cs() , 0.001);
	}
	
	/**
	 * Validando método cs() en el escenario de un Manager que cobra 7200.00 USD.
	 * bonusPercentage: 0.5
	 * Valor esperado: 7264.683593
	 */
	@Test
	public void CsUSDManager() {
		employee = new Employee((float) 7200.00, "USD", (float) 0.5, EmployeeType.Manager);
		assertEquals( 7264.683593, employee.cs() , 0.001);
	}
	
	/**
	 * Validando método cs() en el escenario de un Worker que cobra 3500.0 EUR.
	 * bonusPercentage: 0.4
	 * Valor esperado: 3389.333333
	 */
	@Test
	public void CsEURWorker() {
		employee = new Employee((float) 3500.0, "EUR", (float) 0.4, EmployeeType.Worker);
		assertEquals( 3389.333333, employee.cs() , 0.001);
	}
	
	/**
	 * Validando método cs() en el escenario de un Supervisor que cobra 6500.0 EUR.
	 * bonusPercentage: 0.2
	 * Valor esperado: 6239.403333
	 */
	@Test
	public void CsEURSupervisor() {
		employee = new Employee((float) 6500.0, "EUR", (float) 0.2, EmployeeType.Supervisor);
		assertEquals( 6239.403333, employee.cs() , 0.001);
	}
	
	/**
	 * Validando método cs() en el escenario de un Manager que cobra 10000.0 EUR.
	 * bonusPercentage: 0.1
	 * Valor esperado: 9564.403333
	 */
	@Test
	public void CsEURManager() {
		employee = new Employee( 10000.0f, "EUR",  0.1f, EmployeeType.Manager);
		assertEquals( 9564.403333, employee.cs() , 0.001);
	}

	/**
	 * Validando método CalculateYearBonus() en el escenario de un Worker que cobra 500.18 USD.
	 * Valor esperado: 386.00
	 */
	@Test
	public void CalculateYearBonusUSDWorker() {
		employee = new Employee(500.18F, "USD", 100F, EmployeeType.Worker);
		assertEquals(employee.CalculateYearBonus(), 386F, 0.001);
	}
	
	/**
	 * Validando CalculateYearBonus() en el escenario de un Supervisor que cobra 1453.72 USD.
	 * Valor esperado: 1646.72
	 */
	@Test
	public void CalculateYearBonusUSDSupervisor() {
		employee = new Employee(1453.72F, "USD", 100F, EmployeeType.Supervisor);
		assertEquals(employee.CalculateYearBonus(), 1646.72F, 0.001);
	}
	
	/**
	 * Validando CalculateYearBonus() en el escenario de un Manager que cobra 6506.63 USD.
	 * Valor esperado: 6892.63
	 */
	@Test
	public void CalculateYearBonusUSDManager() {
		employee = new Employee(6506.63F, "USD", 100F, EmployeeType.Manager);
		assertEquals(employee.CalculateYearBonus(), 6892.63F, 0.001);
	}
	
	/**
	 * Validando CalculateYearBonus() en el escenario de un Worker que cobra 500.23 EUR.
	 * Valor esperado: 386.00
	 */

	@Test
	public void CalculateYearBonusEURWorker() {
		Employee worker = new Employee(500.23F, "EUR", 0.05F, EmployeeType.Worker);
		float salario = worker.CalculateYearBonus();
		assertEquals(386.00F, salario, 0.00001);
	}
	
	/**
	 * Validando CalculateYearBonus() en el escenario de un Supervisor que cobra 1400.00 EUR.
	 * Valor esperado: 1523.00
	 */
	@Test
	public void CalculateYearBonusEURSupervisor() {
		Employee supervisor = new Employee(1400.00F, "EUR", 0.07F, EmployeeType.Supervisor);
		float salario = supervisor.CalculateYearBonus();
		assertEquals(1523.00F, salario, 0.00001);
	}
	
	/**
	 * Validando CalculateYearBonus() en el escenario de un Manager que cobra 5420.00 EUR.
	 * Valor esperado: 5535.00
	 */
	@Test
	public void CalculateYearBonusEURManager() {
		Employee manager = new Employee(5420.00F, "EUR", 0.10F, EmployeeType.Manager);
		float salario = manager.CalculateYearBonus();
		assertEquals(5535.00F, salario, 0.00001);
	}
}
