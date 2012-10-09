package net.avantic.course.vacation.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AbstractHibernateDAO {

	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}