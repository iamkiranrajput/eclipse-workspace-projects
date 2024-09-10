package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		//this data is comes from the index.html 
		
		String  name= req.getParameter("name");
		String pass=req.getParameter("pass");
		
		
	
		
//		System.out.println(pass+" "+name);
		
//		PrintWriter out =res.getWriter();
//		out.print("name="+name+" pass="+pass);
		
		
//		servlet inside the servlet we can pass the data one servlet to another
		//In Java, the RequestDispatcher class is a part of the Java Servlet API and is used to forward a request from one servlet to another resource, which can be another servlet,
		//a JSP (JavaServer Pages) page, or even a static resource like an HTML file
		
//		req.setAttribute("p",pass);
//		req.setAttribute("n",name);
		
		//it sending the requesrt to the squreservlet with the help of web.xml
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
		
		
		
		
		
		
//		String  name= req.getParameter("name");
//		String pass=req.getParameter("pass");
		res.sendRedirect("sq?name="+name+"&pass="+pass); 
		//it will pass the data one servlet page to another
		//using parameter in url
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	if we dont want to show data in url use do post method

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//	}
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//	}
	
}
