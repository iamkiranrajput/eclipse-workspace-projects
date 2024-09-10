package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class squreservlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

//		sc.removeAttribute("name");
		
		String name=(String) req.getParameter("name");
		String pass=(String) req.getParameter("pass");


//		String name=(String) req.getAttribute("n");
//		String pass= (String) req.getAttribute("p");
//		String pass= (String) req.getParameter("pass");
		
		
		PrintWriter out=resp.getWriter();
		out.print("name "+name +"  pass"+pass);
	}
	
}
