package net.avantic.course.vacation.web.controller;

import java.util.HashMap;
import java.util.Map;

import net.avantic.course.vacation.facade.DoVacationRequestFacade;
import net.avantic.course.vacation.web.command.DoVacationRequestCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoVacationRequestController {

	protected static final String VIEW_NAME = "/vacationRequest";
	
	@Autowired
	private DoVacationRequestFacade doVacationRequestFacade;
	
	@RequestMapping(value = "/vacationRequest", method = RequestMethod.GET)
	public ModelAndView setupForm() {
		DoVacationRequestCommand command = doVacationRequestFacade.newCommand();
		
		return new ModelAndView(VIEW_NAME, getModel(command));
	}
	
	private Map<String, Object> getModel(DoVacationRequestCommand command) {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("doVacationRequestCommand", command);
		
		return model;
	}
	
}
