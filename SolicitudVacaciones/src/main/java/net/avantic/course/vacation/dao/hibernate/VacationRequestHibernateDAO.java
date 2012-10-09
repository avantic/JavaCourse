package net.avantic.course.vacation.dao.hibernate;

import java.util.List;

import net.avantic.course.vacation.dao.VacationRequestDAO;
import net.avantic.course.vacation.model.VacationRequest;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

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

	public void resetStore() {
		Query query = getSession().createQuery("delete from VacationRequest");
		query.executeUpdate();
	}

}
