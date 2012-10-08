package net.avantic.course.vacation.model;

import org.joda.time.DateTime;

import net.avantic.course.vacation.moswl.Employee;

public class VacationRequest {

	private String id;
	
	private Employee employee;
	
	private DateTime initialDate;
	
	private DateTime finalDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public DateTime getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(DateTime initialDate) {
		this.initialDate = initialDate;
	}

	public DateTime getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(DateTime finalDate) {
		this.finalDate = finalDate;
	}
	
}


