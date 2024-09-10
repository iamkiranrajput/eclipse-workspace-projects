package httpSession;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/mySession")

public class Mysession extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = (String) request.getParameter("name");
		String pass = (String) request.getParameter("pass");

		PrintWriter out = response.getWriter();
		if (name.equals("kiran") && pass.equals("123")) {

//			request.setAttribute("name_key"," Kiran Rajput");

			HttpSession session = request.getSession();
			session.setAttribute("name_key", "Kiran Rajput");

			RequestDispatcher rd = request.getRequestDispatcher("/Home.jsp");
			rd.forward(request, response);
		} else {

			response.setContentType("text/html");
			out.print("<h3>UnAuthorized Person</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);

		}

	}
}
