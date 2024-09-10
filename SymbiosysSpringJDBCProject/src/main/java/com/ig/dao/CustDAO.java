package com.ig.dao;

import java.sql.SQLException;

import com.ig.model.CustBO;

public interface CustDAO {

	boolean insertCustRecord(CustBO bo)throws SQLException;
	
	
}
