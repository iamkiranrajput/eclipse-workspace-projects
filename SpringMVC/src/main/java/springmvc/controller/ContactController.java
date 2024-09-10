package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.service.UserService;

@Controller
//@Component
public class ContactController {
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","LearnWithKiran");
		m.addAttribute("Desc", "Home for programmer");
	}
	
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processForm", method =RequestMethod.POST)
	public String processForm( @ModelAttribute User user, Model model)
	{
		
		this.userService.createUser(user);
		
//		System.out.println(user);
//		System.out.println(user.toString());
//		model.addAttribute(user);
		return "success";
	}
	
	
	
	
//	public String processForm(
//			@RequestParam("email") String email, 
//			@RequestParam("username") String username, 
//			@RequestParam("password") String password, Model model)
//	{
//		
//		
//		model.addAttribute("password", password);
//		model.addAttribute("username", username);
//		model.addAttribute("email", email);
//		
//		
////		System.out.println("user email is : " + email +
////				" password : "+password+" and name is : "+username);
//		
//		return "success";
//		
//		
//	}
	
	
	
//	public String processForm(HttpServletRequest request) {
//		
//		String email = request.getParameter("email");
//		String name = request.getParameter("username");
//		String password = request.getParameter("password");
//
//		System.out.println("user email is : " + email +
//				" password : "+password+" and name is : "+name);
//		
//		return "";
//		
//		
//	}
}
