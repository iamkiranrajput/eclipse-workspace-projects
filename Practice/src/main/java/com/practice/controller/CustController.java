package com.practice.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.model.CustDto;
import com.practice.model.CustVo;
import com.practice.service.CustService;


@Component
public class CustController {
	
	@Autowired
	private CustService service;
	
	
//	public CustController(CustService service) {
//		super();
//		this.service = service;
//	}

	CustDto dto =new CustDto();

	public boolean registerCustomer(CustVo vo) {
		
		boolean flag=false;
		dto.setAddress(vo.getAddress());
		dto.setName(vo.getName());
		dto.setId(vo.getId());
		dto.setSalary(vo.getSalary());
			
		try {
			flag = service.registerCustomer(dto);
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("some database exception occured ");
		}
		
		return flag;
		
	}	
	
	public boolean updateCustomer(CustVo vo) {
			boolean flag=false;
			dto.setAddress(vo.getAddress());
			dto.setName(vo.getName());
			dto.setId(vo.getId());
			dto.setSalary(vo.getSalary());		
			try {
				flag = service.updateCustomer(dto);
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("some database exception occured ");
			}
			return flag;
			
		}
	
	
	public int deleteCustomer(CustVo vo) {
		int result=0;
		dto.setId(vo.getId());	
		try {
			result = service.deleteCustomer(dto);
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("some database exception occured ");
		}
		return result;
		
	}
	
	
	public ArrayList<CustDto> fetchCustomer(CustVo vo){
		
		dto.setId(vo.getId());	
		
		 ArrayList<CustDto> records = new ArrayList<>();
		try {
			records = service.fetchCustomer(dto);
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("some database exception occured ");
		}
		
		return records;
		
	}
	
	
}
