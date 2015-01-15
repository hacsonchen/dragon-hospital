package com.stpass.dragon.hospital.service.generic;

import java.util.List;

import javax.annotation.Resource;

import org.jboss.logging.Logger;

import com.stpass.dragon.hospital.domain.OperatorBean;
import com.stpass.dragon.util.MD5;
import com.stpass.dragon.hospital.exception.DatabaseException;
import com.stpass.dragon.hospital.exception.DragonException;
import com.stpass.dragon.hospital.exception.RecordNotFoundException;
import com.stpass.dragon.hospital.dao.OperatorDao;
import com.stpass.dragon.hospital.exception.ServiceException;
import com.stpass.dragon.hospital.service.OperatorService;

/**
 * Operator Service Layer
 * @author chenqs@stpass.com
 * @version v0.1 2015/01/02
 */
public class OperatorServiceImpl implements OperatorService {

	private OperatorDao operatorDao;
	
	@Resource
	public void setOperatorDao(OperatorDao operatorDao) {
		this.operatorDao = operatorDao;
	}
	
	public OperatorBean addOperator(OperatorBean operator) {
		System.out.println("addOperator");
		
		operator.setPassword(MD5.crypt(operator.getPassword()));
		operator.setUsername(operator.getUsername().toLowerCase());
		operator = (OperatorBean)this.operatorDao.save(operator);
		System.out.println(operator.getId());
		return operator;
	}

	public void updateOperator(OperatorBean operator) {
		this.operatorDao.update(operator);
		operator.setUsername("hacsonchen");
	}
	
	public void updatePassword(int id, String oldPassword, String newPassword) {
		Logger log = Logger.getLogger("dragonLogger");
		log.debug("updatePassword Begin...");
		OperatorBean o = this.operatorDao.getById(id);
		
		System.out.println("load method end");
		
		if(o == null)
			throw new RecordNotFoundException("没有此用户");
		
		if("".equals(oldPassword.trim()) || "".equals(newPassword.trim()))
			throw new ServiceException("旧密码或新密码不能为空");
		
		System.out.println("load method get begin");
		if(!MD5.crypt(oldPassword).equals(o.getPassword()))
			throw new ServiceException("旧密码错误");
		
		System.out.println("load method get end");
		
		System.out.println("load method setPassword begin");
		o.setPassword(MD5.crypt(newPassword)); 
		System.out.println("load method setPassword end");
		
		
		try {	
			this.operatorDao.update(o);
		} catch(DatabaseException e) {
			throw new ServiceException(e);
		} 	

	}

	public void removeOperator(int id) {

		OperatorBean o = this.operatorDao.getById(id);
		if(!o.isAvailable())
			throw new DragonException("用户已经被锁定");
		
		o.setAvailable(false);
		
		this.operatorDao.update(o);
	}

	public boolean isAvailable(int id) {
		OperatorBean o = this.operatorDao.getById(id);
		return o.isAvailable();
	}

	public OperatorBean getById(int id) {
		return this.operatorDao.getById(id);
	}

	public List<OperatorBean> findAll() {
		return this.operatorDao.selectAll();
	}

	public OperatorBean signIn(String username, String password) {
		OperatorBean o = this.operatorDao.getByUsername(username);
		
		if(o == null)
			throw new RecordNotFoundException("不存在此用户");
		
		if(!o.isAvailable())
			throw new RecordNotFoundException("此用户已被删除");
		
		if(!o.getPassword().equals(MD5.crypt(password)))
			throw new DragonException("用户名或者密码不正确");
		
		return o;
	}

}
