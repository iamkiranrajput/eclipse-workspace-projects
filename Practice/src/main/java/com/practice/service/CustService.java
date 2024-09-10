package com.practice.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.practice.model.CustDto;


public interface CustService {
	boolean registerCustomer(CustDto dto) throws SQLException;
	boolean updateCustomer(CustDto dto) throws SQLException;
	int deleteCustomer(CustDto dto) throws SQLException;
	ArrayList<CustDto> fetchCustomer(CustDto dto) throws SQLException;
}
