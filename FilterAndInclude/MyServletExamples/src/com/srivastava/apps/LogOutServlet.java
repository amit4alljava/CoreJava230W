package com.srivastava.apps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogOutServlet
 */
public class LogOutServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session==null){
			response.sendRedirect("index.html");
		}
		else
		{
			response.setHeader("Cache-Control", 
					"no-store, no-cache, must-revalidate");
			
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			
			session.removeAttribute("user-id");
			session.invalidate();
			response.getWriter().println("Logout SuccessFully...");
		}
	}

}
