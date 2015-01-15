package com.stpass.dragon.hospital.dao;

import java.util.List;

import com.stpass.dragon.hospital.domain.OperatorBean;

public interface OperatorDao {
	
	public Object save(OperatorBean operator);
	public void update(OperatorBean operator);
	public void delete(OperatorBean operator);
	public OperatorBean getById(int id);
	public OperatorBean getByUsername(String username);
	public List<OperatorBean> selectAll();
	
}
