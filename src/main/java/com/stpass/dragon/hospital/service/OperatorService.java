package com.stpass.dragon.hospital.service;

import java.util.List;

import com.stpass.dragon.hospital.domain.OperatorBean;

/**
 * Operator Service Interface
 * @author chenqs@stpass.com
 * @version OperatorService.java, v0.1 2015/01/01
 */
public interface OperatorService {

	/**
	 * 新增操作者
	 * @param operator
	 * @return
	 */
	public OperatorBean addOperator(OperatorBean operator);
	/**
	 * 更新操作者
	 * @param operator
	 */
	public void updateOperator(OperatorBean operator);
	/**
	 * 修改操作者密码
	 * @param id
	 * @param oldPassword
	 * @param newPassword
	 */
	public void updatePassword(int id,String oldPassword,String newPassword);
	/**
	 * 移除操作者
	 * @param id
	 */
	public void removeOperator(int id);
	/**
	 * 操作者登陆验证
	 * @param 用户名
	 * @param 密码
	 * @return
	 */
	public OperatorBean signIn(String username,String password);
	/**
	 * 根据ID检查操作者是否可用
	 * @param id
	 * @return
	 */
	public boolean isAvailable(int id);
	/**
	 * 根据ID获取操作者
	 * @param id
	 * @return
	 */
	public OperatorBean getById(int id);
	/**
	 * 查询所有的操作者
	 * @return
	 */
	public List<OperatorBean> findAll();

}
