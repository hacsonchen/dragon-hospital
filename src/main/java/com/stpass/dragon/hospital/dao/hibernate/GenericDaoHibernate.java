package com.stpass.dragon.hospital.dao.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import com.stpass.dragon.hospital.HibernateDaoSupport;
import com.stpass.dragon.hospital.exception.DatabaseException;

/**
 * generic hibernate method
 * 
 * @author chenqs@stpass.com
 * @version GenericHibernateDao.java, v0.1 2015/01/02
 */
public class GenericDaoHibernate<T> extends HibernateDaoSupport {

	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public GenericDaoHibernate() {
		Type t = getClass().getGenericSuperclass();
        if(t instanceof ParameterizedType){
            Type[] p = ((ParameterizedType)t).getActualTypeArguments();
            this.clazz = (Class<T>)p[0];
        }
	}
	
	public GenericDaoHibernate(Class<T> clazz) {
		this.clazz = clazz; 
	}

	public Object save(T obj) {
		try {
			return this.getSession().save(obj);
		} catch (Exception e) {
			throw new DatabaseException(e);
		}
	}

	public void delete(T obj) {
		try {
			this.getSession().delete(obj);
		} catch (Exception e) {
			throw new DatabaseException(e);
		}
	}

	public void update(T obj) {
		try {
			this.getSession().update(obj);
		} catch (Exception e) {
			throw new DatabaseException(e);
		}
	}

	public Object load(Serializable id) {
		try {
			return this.getSession().load(clazz, id);
		} catch (Exception e) {
			throw new DatabaseException(e);
		}
	}

	public Object get(Serializable id) {
		try {
			return this.getSession().get(clazz, id);
		} catch (Exception e) {
			throw new DatabaseException(e);
		}
	}
	
    @SuppressWarnings("unchecked")
	public List<T> selectAll() {
    	return this.getSession().createCriteria(clazz).list();
    }

}
