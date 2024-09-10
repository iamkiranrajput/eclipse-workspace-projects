package com.practice.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.practice.model.CustBo;

public interface CustDAO<E> {
	boolean insertCustRecord(CustBo bo) throws SQLException;
	boolean updateCustRecord(CustBo bo) throws SQLException;
	int deleteCustRecord(CustBo bo) throws SQLException;
	ArrayList<E> fetchCustRecord(CustBo bo) throws SQLException;
}
