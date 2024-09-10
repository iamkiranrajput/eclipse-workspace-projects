package com.ig.service;

import java.sql.SQLException;

import com.ig.model.CustDTO;

public interface CustService {
	
	boolean registerCustomer(CustDTO dto) throws SQLException;

}
