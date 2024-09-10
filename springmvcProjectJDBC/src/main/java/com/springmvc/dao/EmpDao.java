package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.Emp;

@Repository
public class EmpDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveEmp(Emp emp) {
		String sql="Insert into emp(id, address,designation,email,fullName,password,salary) values (?,?,?,?,?,?,?)";
	int i=jdbcTemplate.update(sql,emp.getId(),emp.getAddress(),emp.getDesignation(),emp.getEmail(),emp.getFullName(),emp.getPassword(),emp.getSalary());
	return i;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public EmpDao() {
		super();
	}
	
	
	
}

