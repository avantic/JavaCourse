package net.avantic.course.vacation.model;

import net.avantic.course.vacation.moswl.Employee;

public class VacationRequest {

	private String id;
	
	private Employee employee;

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
	
}


