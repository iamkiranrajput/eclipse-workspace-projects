package springmvc.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home ");
		
		model.addAttribute("name","Kiran Rajput");
		model.addAttribute("id",2323);
		List<String> friends=new ArrayList<>();
		friends.add("karn");
		friends.add("veer");
		friends.add("jay");
		friends.add("shiv");
		friends.add("sakshi");
		
		model.addAttribute("friends",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("this is help page");
		
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("name","kiran");
		modelAndView.addObject("rollnumber",121212);
		
		String date= new Date().toGMTString();
		modelAndView.addObject("date",date);
		//setting the  view
		
		List <Integer> list=new ArrayList<>();
		list.add(12);
		list.add(2345);
		list.add(1212);
		list.add(5674);
		
		modelAndView.addObject(list);
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
