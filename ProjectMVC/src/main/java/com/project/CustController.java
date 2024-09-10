package com.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustController {
		@RequestMapping("/contact")
		public String Contact() {
			return "contact";
		}
		@RequestMapping("/home")
		public String home() {
			return "home";
		}
		
		@RequestMapping("/about")
		public String about() {
			return "about";
		}
}
