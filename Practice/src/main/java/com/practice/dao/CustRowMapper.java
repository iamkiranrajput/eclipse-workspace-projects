package com.practice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CustRowMapper implements ResultSetExtractor {

	@Override
	public List <Object> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
        List<Object> result = new ArrayList<>();

		
        while (rs.next()) {
            int id = rs.getInt("custId");
            String name = rs.getString("CustUname");
            String address= rs.getString("custAddr");
            int mobileNo= rs.getInt("mobileNo");

           ArrayList<Object> list= new ArrayList<>();
           
           list.add(id);
           list.add(name);
           list.add(address);
           list.add(mobileNo);
           
            result.add(list);
        }

        return result;
    
		

	}

}
