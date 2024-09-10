package com.ig.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.ig.constant.CustomerQueries;
import com.ig.model.CustBO;

public class CustDAOImpl implements CustDAO{

	
	
	private DataSource ds;/// we must interface
	
	
	public CustDAOImpl(DataSource ds) {
		super();
		this.ds= ds;
	}

	@Override
	public boolean insertCustRecord(CustBO bo) throws SQLException { /// fully checked category
		Connection con = null;
		boolean flag = false;
		try { //risky code
			con = ds.getConnection();
			PreparedStatement st = con.prepareStatement(CustomerQueries.CUST_INSERT_QUERY);
			st.setString(1, bo.getCustName());
			st.setString(2, bo.getCustAddr());
			st.setInt(3, bo.getMobileNo());
			
			// execute insert command
			
			int result = st.executeUpdate();
			if(result!=0)
				flag = true;
			
		} catch (SQLException e) { //handling code
			
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			throw e;
		}
		finally { // getting always called by JVM irrespective of whether exception occur or not
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	
	

}
