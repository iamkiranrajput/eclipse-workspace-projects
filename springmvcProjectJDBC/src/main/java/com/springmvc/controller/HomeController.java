package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.Emp;
import com.springmvc.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	@RequestMapping("addemp")
	public String addEmp() {
		return "addEmp";
	}
	@RequestMapping(path="/createEmp", method = RequestMethod.POST)
	public String  registerUser(@ModelAttribute Emp emp, @RequestParam("salary") String img) {

		userService.registerEmp(emp);
		
		//		System.out.println(  img);
//		System.out.println(user);
		return "addEmp";
	}
	
	
	
	
	
}
