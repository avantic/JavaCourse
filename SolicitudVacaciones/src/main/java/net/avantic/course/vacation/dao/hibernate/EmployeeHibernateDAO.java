package net.avantic.course.vacation.dao.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import net.avantic.course.vacation.dao.EmployeeDAO;
import net.avantic.course.vacation.model.Employee;

public class EmployeeHibernateDAO extends AbstractHibernateDAO implements EmployeeDAO {

	public void save(Employee employee) {
		getSession().save(employee);
	}

	public Employee find(String name) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("name", name));
		
		return (Employee) criteria.uniqueResult();
	}

	public Employee get(String id) {
		return (Employee) getSession().get(Employee.class, id);
	}

}
