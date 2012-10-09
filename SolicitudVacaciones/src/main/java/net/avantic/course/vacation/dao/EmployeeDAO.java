package net.avantic.course.vacation.dao;

import net.avantic.course.vacation.model.Employee;

public interface EmployeeDAO {

	public void save(Employee employee);

	public Employee find(String string);

	public Employee get(String id);

	public void resetStore();

}
