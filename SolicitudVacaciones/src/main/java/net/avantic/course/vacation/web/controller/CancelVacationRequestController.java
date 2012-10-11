package net.avantic.course.vacation.web.controller;

import net.avantic.course.vacation.facade.CancelVacationRequestFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CancelVacationRequestController {
	
	@Autowired
	private CancelVacationRequestFacade cancelVacationRequestFacade;

	@RequestMapping(value = "/vacationRequest/{idVacationRequest}", method = RequestMethod.DELETE) 
	public @ResponseBody String cancelVacationRequest(@PathVariable("idVacationRequest") String idVacationRequest) {
		cancelVacationRequestFacade.cancel(idVacationRequest);
		
		return("Done");
	}	
	
}
