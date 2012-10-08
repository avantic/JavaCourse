package net.avantic.course.vacation.dao;

import static org.junit.Assert.*;

import net.avantic.course.vacation.dao.memory.EmployeeInMemoryDAO;
import net.avantic.course.vacation.moswl.Employee;

import org.junit.Before;
import org.junit.Test;

public class EmployeeDAOTest {

	private EmployeeDAO employeeDao;
	
	
	@Before
	public void setup() {
		employeeDao = new EmployeeInMemoryDAO();
	}
	
	@Test
	public void whenEmployeeIsStoredReceiveUniqueIdentifier() throws Exception {
		Employee employee = new Employee("Foo Bar");
		
		employeeDao.save(employee);
		
		assertNotNull(employee.getId());
	}
	
	@Test
	public void employeeCanBeRecoveredByName() throws Exception {
		employeeDao.save(new Employee("Foo Bar"));
		
		Employee employee = employeeDao.find("Foo Bar");
		
		assertEquals("Foo Bar", employee.getName());
	}
	
	@Test
	public void employeeCanBeRecoveredById() throws Exception {
		employeeDao.save(new Employee("Foo Bar"));
		Employee employeeByName = employeeDao.find("Foo Bar");
		
		Employee employeeById = employeeDao.get(employeeByName.getId());
		
		assertEquals(employeeByName, employeeById);
	}
	
}
