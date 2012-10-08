package net.avantic.course.vacation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import net.avantic.course.vacation.moswl.Employee;

import org.hibernate.annotations.GenericGenerator;
import org.joda.time.DateTime;

@Entity
public class VacationRequest {

	private String id;
	
	private Employee employee;
	
	private DateTime initialDate;
	
	private DateTime finalDate;

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="employeeId")
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


