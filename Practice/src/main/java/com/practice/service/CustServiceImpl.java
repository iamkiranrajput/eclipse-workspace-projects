package com.practice.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dao.CustDAO;
import com.practice.model.CustBo;
import com.practice.model.CustDto;


@Service
public class CustServiceImpl implements CustService {
	
	@Autowired
	private CustDAO dao;
	
	
	
	
	
//	public CustServiceImpl(CustDAO dao) {
//		super();
//		this.dao = dao;
//	}




	CustBo bo =new CustBo();

	@Override
	public boolean registerCustomer(CustDto dto) throws SQLException {
		boolean flag = false;
		bo.setAddress(dto.getAddress());
		bo.setId(dto.getId());
		bo.setName(dto.getName());
		bo.setSalary(dto.getSalary());
		try {
			flag= dao.insertCustRecord(bo);	
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return flag;
	}


	@Override
	public boolean updateCustomer(CustDto dto) throws SQLException {
		boolean flag = false;
		bo.setAddress(dto.getAddress());
		bo.setId(dto.getId());
		bo.setName(dto.getName());
		bo.setSalary(dto.getSalary());
		try {
			flag= dao.updateCustRecord(bo);
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return flag;
	}
	
	@Override
	public int deleteCustomer(CustDto dto) throws SQLException {
		int record = 0;
		bo.setId(dto.getId());
		try {
			record= dao.deleteCustRecord(bo);	
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return record;
	}


	@Override
	public ArrayList<CustDto> fetchCustomer(CustDto dto) throws SQLException {
		ArrayList records = new ArrayList<>();	
		bo.setId(dto.getId());
		try {
			records= dao.fetchCustRecord(bo);
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return records;
	}

}
