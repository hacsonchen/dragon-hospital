package com.stpass.dragon.hospital.dao.hibernate;

import com.stpass.dragon.hospital.dao.hibernate.GenericDaoHibernate;
import com.stpass.dragon.hospital.dao.OperatorDao;
import com.stpass.dragon.hospital.domain.OperatorBean;

public class OperatorDaoHibernate extends GenericDaoHibernate<OperatorBean> implements OperatorDao {	

	public OperatorBean getById(int id) {
		return (OperatorBean)this.load(id);
	}
	
	public OperatorBean getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}	

}
