package com.calci;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myservlet")
public class myServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String pass = (String) req.getParameter("pass");

		PrintWriter out=res.getWriter();
		if ((name.equals("kiran")) && (pass.equals("123"))) {
			res.getWriter().append("Hello name is: " + name);
			res.getWriter().append(" and pass is : " + pass);
		} else {
			
			res.setContentType("text/Html");
			out.print("<h3 style='color:red'>Unauthorized person<h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
//			rd.forward(req, res);
			rd.include(req, res);

//			res.sendRedirect("https://www.google.com/search?q="+name);
		}
	}

	// sendRedirect method to send the request to the external pages
	// (google,facebook)
	// requestDispatcher it is used to send the request to another internal pages
	// (mypage.html,index.java)

}
