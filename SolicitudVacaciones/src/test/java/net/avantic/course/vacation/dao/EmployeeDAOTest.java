package net.avantic.course.vacation.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.avantic.course.vacation.model.Employee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:applicationContext.xml"	
})
@ActiveProfiles("testing")
public class EmployeeDAOTest {
	
	/* WARNING: these tests are not unit tests, they may preserve the given order */

	@Autowired
	private EmployeeDAO employeeDao;
	
	@Test
	public void whenEmployeeIsStoredReceiveUniqueIdentifier() throws Exception {
		Employee employee = new Employee("Foo Bar");
		
		employeeDao.save(employee);
		
		assertNotNull(employee.getId());
	}
	
	@Test
	public void employeeCanBeRecoveredByName() throws Exception {
		Employee employee = employeeDao.find("Foo Bar");
		
		assertEquals("Foo Bar", employee.getName());
	}
	
	@Test
	public void employeeCanBeRecoveredById() throws Exception {
		Employee employeeByName = employeeDao.find("Foo Bar");
		
		Employee employeeById = employeeDao.get(employeeByName.getId());
		
		assertEquals(employeeByName, employeeById);
		assertEquals("Foo Bar", employeeById.getName());
	}
	
}
