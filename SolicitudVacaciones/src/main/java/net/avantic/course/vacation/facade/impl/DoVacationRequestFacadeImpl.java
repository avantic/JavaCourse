package net.avantic.course.vacation.facade.impl;

import net.avantic.course.vacation.dao.VacationRequestDAO;
import net.avantic.course.vacation.exception.ValidationException;
import net.avantic.course.vacation.facade.DoVacationRequestFacade;
import net.avantic.course.vacation.model.VacationRequest;
import net.avantic.course.vacation.service.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;

public class DoVacationRequestFacadeImpl implements DoVacationRequestFacade {

	@Autowired
	private VacationRequestDAO vacationRequestDAO;
	
	@Autowired
	private NotificationService mailNotificationService;
	
	public void execute(VacationRequest vacationRequest) {
		if (vacationRequest.getEmployee() == null)
			throw new ValidationException("The vacation request should refer an employee");
		if (vacationRequest.getInitialDate() == null)
			throw new ValidationException("The vacation request should indicate an initial date");
		if (vacationRequest.getFinalDate() == null)
			throw new ValidationException("The vacation request should indicate a final date");
		
		vacationRequestDAO.save(vacationRequest);
		
		if (vacationRequest.getEmployee().getMail() != null)
			mailNotificationService.notify(
					vacationRequest.getEmployee().getMail(), 
					"Your vacation request is stored in the system");
	}

}
