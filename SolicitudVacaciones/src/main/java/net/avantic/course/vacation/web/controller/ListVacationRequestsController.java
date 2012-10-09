package net.avantic.course.vacation.web.controller;

import java.util.HashMap;
import java.util.Map;

import net.avantic.course.vacation.facade.ListVacationRequestsFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListVacationRequestsController {

	protected static final String VIEW_NAME = "/listVacationRequests";
	
	@Autowired
	private ListVacationRequestsFacade listVacationRequestsFacade;
	
	@RequestMapping(value = "/listVacationRequests", method = RequestMethod.GET)
	public ModelAndView listVacationRequests() {
		return new ModelAndView(VIEW_NAME, getModel());
	}
	
	private Map<String, Object> getModel() {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("vacationRequests", listVacationRequestsFacade.list());
		
		return model;
	}
	
}
