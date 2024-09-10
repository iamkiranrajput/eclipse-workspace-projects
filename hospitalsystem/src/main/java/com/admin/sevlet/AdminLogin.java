package com.admin.sevlet;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.entity.User;

@WebServlet("/admin_login")
public class AdminLogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			HttpSession session=req.getSession();
			
			
			if ("admin@gmail.com".equals(email) && "admin".equals(password))
			{
				session.setAttribute("adminObj", new User());
				resp.sendRedirect("admin/index.jsp");
			}
			else {
				session.setAttribute("errorMsg", "Invalid email or password !");
				resp.sendRedirect("admin_login.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
}
