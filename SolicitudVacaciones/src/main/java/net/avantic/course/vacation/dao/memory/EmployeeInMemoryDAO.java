package net.avantic.course.vacation.dao.memory;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.avantic.course.vacation.dao.EmployeeDAO;
import net.avantic.course.vacation.model.Employee;

public class EmployeeInMemoryDAO implements EmployeeDAO {

	private Map<String, Employee> map = new HashMap<String, Employee>();
	
	public void save(Employee employee) {
		String uuid = UUID.randomUUID().toString();
		
		employee.setId(uuid);
		map.put(uuid, employee);
	}

	public Employee find(String name) {
		for (Employee employee : map.values()) {
			if (employee.getName().equals(name))
				return employee;
		}
		
		return new Employee();
	}

	public Employee get(String id) {
		if (map.containsKey(id))
			return map.get(id);
		
		return new Employee();
	}

	public void resetStore() {
		map.clear();
	}

}
