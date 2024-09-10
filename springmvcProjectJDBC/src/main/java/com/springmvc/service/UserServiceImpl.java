package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.EmpDao;
import com.springmvc.entity.Emp;

@Repository
public class UserServiceImpl implements UserService {
	@Autowired
	EmpDao empDao;
	@Override
	
	
	public int registerEmp(Emp emp) {
		int i = empDao.saveEmp(emp);
		
		return i;
	}
	
	
	
	
	
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	public UserServiceImpl() {
		super();
	}
	
	
	

}
