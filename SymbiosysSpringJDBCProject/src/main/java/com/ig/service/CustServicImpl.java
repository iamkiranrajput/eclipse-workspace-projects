package com.ig.service;

import java.sql.SQLException;

import com.ig.dao.CustDAO;
import com.ig.model.CustBO;
import com.ig.model.CustDTO;

public class CustServicImpl implements CustService {
	private CustDAO dao;
	

	public CustServicImpl(CustDAO dao) {
		super();
		this.dao = dao;
	}




	@Override
	public boolean registerCustomer(CustDTO dto) throws SQLException {
		
		// convert dto to BO object and pass it to insertCustRecord method
		
		CustBO bo = new CustBO();
		bo.setCustAddr(dto.getCustAddr());
		bo.setCustName(dto.getCustName());
		bo.setMobileNo(dto.getMobileNo());
		
		return dao.insertCustRecord(bo);
		
		
	}

}
