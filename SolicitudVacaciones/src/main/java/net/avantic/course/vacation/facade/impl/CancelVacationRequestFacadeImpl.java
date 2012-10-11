package net.avantic.course.vacation.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;

import net.avantic.course.vacation.dao.VacationRequestDAO;
import net.avantic.course.vacation.facade.CancelVacationRequestFacade;
import net.avantic.course.vacation.model.VacationRequest;

public class CancelVacationRequestFacadeImpl implements CancelVacationRequestFacade {

	@Autowired
	private VacationRequestDAO vacationRequestDao;
	
	public void cancel(String idVacationRequest) {
		VacationRequest vacationRequest = vacationRequestDao.get(idVacationRequest);
		vacationRequestDao.delete(vacationRequest);
	}

}
