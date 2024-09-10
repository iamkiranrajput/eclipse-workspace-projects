package com.practice.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practice.model.CustBo;



@Repository
public class CustDaoImpl implements CustDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	boolean flag=false;


//	public CustDaoImpl(JdbcTemplate jdbcTemplate) {
//		super();
//		this.jdbcTemplate = jdbcTemplate;
//	}

	
    @Transactional(rollbackFor = Exception.class)
	public boolean insertCustRecord(CustBo bo) throws SQLException {	
		final String CUST_INSERT_QUERY="Insert into Customer(custUname,custAddr,mobileNo) values(?,?,?)";
		
		try {
		int update = jdbcTemplate.update(CUST_INSERT_QUERY,bo.getName(),bo.getAddress(),bo.getSalary());
		if(update!=0) {
			flag=true;
		}
		}catch(Exception e) {
			e.printStackTrace();			
			throw e;  							//propogation other must know about the error
		}	
		return flag;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public boolean updateCustRecord(CustBo bo) throws SQLException {
		final String CUST_UPDATE_QUERY="Update Customer SET custUname = ?,custAddr = ?,mobileNo=? Where CustId =?";
	
		try {
		int update = jdbcTemplate.update(CUST_UPDATE_QUERY,bo.getName(),bo.getAddress(),bo.getSalary(), bo.getId());
		if(update!=0) {
			flag=true;
		}
		}catch(Exception e) {
			e.printStackTrace();			
			throw e; 
		}	
		return flag;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteCustRecord(CustBo bo) throws SQLException {	
	final String CUST_INSERT_QUERY="delete from Customer where custId=?";
	int record=0;
	
		try {
		 record = jdbcTemplate.update(CUST_INSERT_QUERY,bo.getId());
		
		}catch(Exception e) {
			e.printStackTrace();			
			throw e;                //propogation other must know about the error
		}	
		return record;
	
	}
	@Override
	
	@Transactional(rollbackFor = Exception.class)
	public ArrayList<CustBo> fetchCustRecord(CustBo bo) throws SQLException {
		
		 final String CUST_FETCH_QUERY = "SELECT * FROM Customer WHERE custId = ?";
	        ArrayList<CustBo> records = new ArrayList<>();

	        try {
	            List<CustBo> fetchedRecords = (List<CustBo>) jdbcTemplate.query(CUST_FETCH_QUERY, new Object[]{bo.getId()}, new CustRowMapper());
	            records.addAll(fetchedRecords);
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw e;  
	        }
	        return records;
	    }
		
	
}
