package net.avantic.course.vacation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.math.RandomUtils;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
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

	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	public DateTime getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(DateTime initialDate) {
		this.initialDate = initialDate;
	}

	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	public DateTime getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(DateTime finalDate) {
		this.finalDate = finalDate;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VacationRequest == false)
			return false;
		
		if (this == obj)
			return true;
		
		VacationRequest request = (VacationRequest) obj;
		return new EqualsBuilder()
			.append(id, request.id)
			.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(RandomUtils.nextInt(), RandomUtils.nextInt())
			.append(id)
			.toHashCode();
	}
	
}


