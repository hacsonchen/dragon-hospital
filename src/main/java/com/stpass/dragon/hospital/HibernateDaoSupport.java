package com.stpass.dragon.hospital;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDaoSupport {
	
	private Session session;
	
	private SessionFactory sessionFactory;
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession() {
	    this.session = this.sessionFactory.getCurrentSession();
		//System.out.println("Session hashCode:" + this.session.hashCode());
		return this.session;
	}
	
	protected Query createQuery(String hql) {
		return this.getSession().createQuery(hql);
	}
	
	
	protected SQLQuery executeSql(String sql) {
		return this.getSession().createSQLQuery(sql);
	}
	

}