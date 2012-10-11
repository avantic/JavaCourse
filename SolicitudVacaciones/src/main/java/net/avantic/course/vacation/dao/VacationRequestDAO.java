package net.avantic.course.vacation.dao;

import java.util.List;

import net.avantic.course.vacation.model.VacationRequest;

public interface VacationRequestDAO {

	public void save(VacationRequest request);

	public List<VacationRequest> findByEmployee(String string);

	public VacationRequest get(String id);

	public void resetStore();

	public List<VacationRequest> findAll();

	public void delete(VacationRequest vacationRequest);

}
