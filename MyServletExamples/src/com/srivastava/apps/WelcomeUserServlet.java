package com.srivastava.apps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeUserServlet
 */
public class WelcomeUserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		if(session==null){
			response.sendRedirect("index.html");
		}
		else{
			String color= "red";
			Cookie cookieArray []=request.getCookies();
			if(cookieArray!=null && cookieArray.length>0){
				for(Cookie cookie : cookieArray){
					if(cookie.getName().equals("favcolor")){
						color = cookie.getValue();
						break;
					}
				}
			}
			
			session.getCreationTime();
			session.getLastAccessedTime();
			session.setMaxInactiveInterval(60*1000);
			response.setHeader("Cache-Control", 
					"no-store, no-cache, must-revalidate");
			
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			
		//String uid = request.getParameter("userid");
			String uid = (String)session.getAttribute("user-id");
			String newurl = response.encodeURL("logout");
			out.println("<html><body bgcolor='"+color+"'>"
					+ "<form action='"+newurl+"'> <input type='submit' value='Logout'></form>"
					+ "<h1>Welcome "+uid+"</h1></body></html>");
		out.close();
		}
	}

}
