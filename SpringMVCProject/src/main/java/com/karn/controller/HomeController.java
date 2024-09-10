package com.karn.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.karn.controller.dao.EmpDao;
import com.karn.controller.entity.Emp;

@Controller

public class HomeController {
	
	
	
	
	private EmpDao empDao;
	
	@RequestMapping("/home")
		public String home() {
			return "home";
		}
	
	@RequestMapping("/addEmp")
	public String addEmp() {
		return "addEmp";
	}
	
	@RequestMapping(path="/createEmp", method = RequestMethod.POST)
	public String createEmp(@ModelAttribute Emp emp) {
		
		System.out.println(emp);
		
		int i= empDao.saveEmp(emp);
		return "addEmp";
	}
	
	
	@Bean("hibernateTemplate")
	HibernateTemplate getHT() {
	HibernateTemplate hibernateTemplate =new HibernateTemplate();
	
	return hibernateTemplate;
	}
	
}
