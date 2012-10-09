package net.avantic.course.vacation.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.math.RandomUtils;

public class Employee {

	private String id;
	
	private String name;
	
	private String mail;
	
	public Employee() {}

	public Employee(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee == false)
			return false;
		
		if (this == obj)
			return true;
		
		Employee employee = (Employee) obj;
		return new EqualsBuilder()
			.append(id, employee.id)
			.append(name, employee.name)
			.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(RandomUtils.nextInt(), RandomUtils.nextInt())
			.append(id)
			.append(name)
			.toHashCode();
	}
	
}
