package com.ig.controller;

import java.sql.SQLException;

import com.ig.model.CustDTO;
import com.ig.model.CustVO;
import com.ig.service.CustService;

public class CustController {
	
	private CustService service;

	// setter injection
	public CustController(CustService service) {
		super();
		this.service=service;
	}


	
	public boolean registerCustomer(CustVO vo) {
		// convert vo to dto
		boolean flag = false;
		CustDTO dto = new CustDTO();
		dto.setCustAddr(vo.getCustAddr());
		dto.setCustName(vo.getCustName());
		dto.setMobileNo(Integer.parseInt(vo.getMoblieNo()));
		
		try {
			flag = service.registerCustomer(dto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("SOme Database exception occured ");
		}
		
		return flag;
	}
	
	
	

}
