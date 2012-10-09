package net.avantic.course.vacation.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import net.avantic.course.vacation.dao.VacationRequestDAO;
import net.avantic.course.vacation.model.VacationRequest;

public class VacationRequestHibernateDAO extends AbstractHibernateDAO implements VacationRequestDAO {

	public void save(VacationRequest request) {
		getSession().save(request);
	}

	@SuppressWarnings("unchecked")
	public List<VacationRequest> findByEmployee(String name) {
		Criteria criteria = getSession().createCriteria(VacationRequest.class);
		criteria.createCriteria("employee")
			.add(Restrictions.eq("name", name));
		
		return criteria.list();
	}

	public VacationRequest get(String id) {
		return (VacationRequest) getSession().get(VacationRequest.class, id);
	}

}
