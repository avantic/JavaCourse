package net.avantic.course.vacation.facade;

import net.avantic.course.vacation.model.VacationRequest;
import net.avantic.course.vacation.web.command.DoVacationRequestCommand;

public interface DoVacationRequestFacade {

	public void execute(VacationRequest vacationRequest);

	public DoVacationRequestCommand newCommand();

}
