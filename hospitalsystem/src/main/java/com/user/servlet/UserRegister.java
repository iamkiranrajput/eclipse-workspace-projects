package com.user.servlet;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.User;

@WebServlet("/user_register")
public class UserRegister extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String fullName=req.getParameter("fullname");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			User u=new User(fullName, email, password);
			
			UserDao dao=new UserDao(DBConnect.getConn());
			
			boolean f=dao.register(u);
			
			
		if (f) {
            String script = "<script>alert('User registered successfully!');</script>";

			System.out.println("Registeration Successful!");
            resp.getWriter().write(script);
            resp.sendRedirect("user_login.jsp");

		}else {
			System.out.println("Something Went Wrong!");
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
