package net.avantic.course.vacation.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.avantic.course.vacation.dao.VacationRequestDAO;
import net.avantic.course.vacation.facade.ListVacationRequestsFacade;
import net.avantic.course.vacation.model.VacationRequest;

public class ListVacationRequestsFacadeImpl implements ListVacationRequestsFacade {

	@Autowired 
	private VacationRequestDAO vacationRequestDao;
	
	public List<VacationRequest> list() {
		return vacationRequestDao.findAll();
	}

}
