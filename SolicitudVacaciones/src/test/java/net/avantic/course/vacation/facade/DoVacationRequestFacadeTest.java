package net.avantic.course.vacation.facade;

import static org.junit.Assert.*;
import net.avantic.course.vacation.exception.ValidationException;
import net.avantic.course.vacation.model.Employee;
import net.avantic.course.vacation.model.VacationRequest;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:applicationContext.xml",
	"classpath:applicationContext-datasource.xml",
	"classpath:applicationContext-hibernate.xml"
})
@ActiveProfiles("testing")
public class DoVacationRequestFacadeTest {

	@Autowired
	private DoVacationRequestFacade doVacationRequestFacade;
	
	@Test(expected = ValidationException.class)
	public void requestsWithoutEmployeeThrowsAnException() throws Exception {
		VacationRequest vacationRequest = new VacationRequest();
		
		doVacationRequestFacade.execute(vacationRequest);
	}
	
	@Test(expected = ValidationException.class)
	public void requestsWithoutInitialDateThrowsAnException() throws Exception {
		VacationRequest vacationRequest = new VacationRequest();
		vacationRequest.setEmployee(new Employee());
		
		doVacationRequestFacade.execute(vacationRequest);
	}
	
	@Test(expected = ValidationException.class)
	public void requestsWithoutFinalDateThrowsAnException() throws Exception {
		VacationRequest vacationRequest = new VacationRequest();
		vacationRequest.setEmployee(new Employee());
		vacationRequest.setInitialDate(new DateTime());
		
		doVacationRequestFacade.execute(vacationRequest);
	}
	
	@Test
	public void validRequetsArePersisted() throws Exception {
		VacationRequest vacationRequest = new VacationRequest();
		vacationRequest.setEmployee(new Employee());
		vacationRequest.setInitialDate(new DateTime());
		vacationRequest.setFinalDate(new DateTime());
		
		assertNull(vacationRequest.getId());
		
		doVacationRequestFacade.execute(vacationRequest);
		
		assertNotNull(vacationRequest.getId());
	}
	
	@Test
	public void sendingMailNotification() throws Exception {
		Employee employee = new Employee("Foo Bar");
		employee.setMail("foo@bar.com");
		VacationRequest vacationRequest = new VacationRequest();
		vacationRequest.setEmployee(employee);
		vacationRequest.setInitialDate(new DateTime());
		vacationRequest.setFinalDate(new DateTime());
		
		doVacationRequestFacade.execute(vacationRequest);
	}
	
}
