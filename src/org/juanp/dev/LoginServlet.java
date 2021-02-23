package org.juanp.dev;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.juanp.dev.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId, password;
		
		//taking the credentials and storing them in string objects
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		
		LoginService ls = new LoginService();
		boolean result = ls.authenticate(userId, password);
		
		//redirecting process
		if(result) {
			response.sendRedirect("success.jsp");
			return; 
		} else {
			response.sendRedirect("login.jsp");
			return; 
		}
	}

}
