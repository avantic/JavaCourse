package net.avantic.course.vacation.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import net.avantic.course.vacation.model.VacationRequest;
import net.avantic.course.vacation.moswl.Employee;

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
public class VacationRequestDAOTest {
	
	/* WARNING: these tests are not unit tests, they may preserve the given order */

	@Autowired
	private VacationRequestDAO vacationRequestDao;
	
	@Test
	public void whenVacationRequestIsStoreReceiveUniqueIdentifier() throws Exception {
		VacationRequest request = new VacationRequest();
		request.setEmployee(new Employee());
		
		vacationRequestDao.save(request);
		
		assertNotNull(request.getId());
	}
	
	@Test
	public void vacationRequestCanBeRecoveredByEmployeeName () throws Exception {
		Employee employee = new Employee("Foo Bar");
		VacationRequest request = new VacationRequest();
		request.setEmployee(employee);
		vacationRequestDao.save(request);
		
		List<VacationRequest> requests = vacationRequestDao.findByEmployee("Foo Bar");
		
		assertEquals(request, requests.get(0));
	}
	
	@Test
	public void vacationRequestCanBeRecoveredById() throws Exception {
		List<VacationRequest> requests = vacationRequestDao.findByEmployee("Foo Bar");
		VacationRequest requestByName = requests.get(0);
		
		VacationRequest requestById = vacationRequestDao.get(requestByName.getId());
		
		assertEquals(requestByName, requestById);
	}
	
}
