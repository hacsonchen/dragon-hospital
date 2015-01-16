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
	 * ����������
	 * @param operator
	 * @return
	 */
	public OperatorBean addOperator(OperatorBean operator);
	/**
	 * ���²�����
	 * @param operator
	 */
	public void updateOperator(OperatorBean operator);
	/**
	 * �޸Ĳ���������
	 * @param id
	 * @param oldPassword
	 * @param newPassword
	 */
	public void updatePassword(int id,String oldPassword,String newPassword);
	/**
	 * �Ƴ�������
	 * @param id
	 */
	public void removeOperator(int id);
	/**
	 * �����ߵ�½��֤
	 * @param �û���
	 * @param ����
	 * @return
	 */
	public OperatorBean signIn(String username,String password);
	/**
	 * ����ID���������Ƿ����
	 * @param id
	 * @return
	 */
	public boolean isAvailable(int id);
	/**
	 * ����ID��ȡ������
	 * @param id
	 * @return
	 */
	public OperatorBean getById(int id);
	/**
	 * ��ѯ���еĲ�����
	 * @return
	 */
	public List<OperatorBean> findAll();

}
