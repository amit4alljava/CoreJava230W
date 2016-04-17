package com.srivastava.apps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("userid");
		String password = request.getParameter("pwd");
		String color = request.getParameter("favColor");
		boolean isCookieFound = false;
		try{
		if(uid.equals(password)){
			// Search the Color in the Cookie
			Cookie cookieArray []=request.getCookies();
			if(cookieArray!=null && cookieArray.length>0){
				for(Cookie cookie : cookieArray){
					if(cookie.getName().equals("favcolor")){
						isCookieFound = true;
						break;
					}
				}
			}
			// If Cookie Not Exist 
			if(!isCookieFound){
				Cookie c = new Cookie("favcolor",color);
				c.setMaxAge(365*24*60*60);
				
				response.addCookie(c);
			}
			
			
			//if(uid.equals("amit") && password.equals("123")){
			// this will create a New Session
			HttpSession session = request.getSession(true);
			session.setAttribute("user-id", uid);
			//int e = 100/0;
			/*RequestDispatcher rd=request.
					getRequestDispatcher("welcomeuser");
			rd.forward(request, response);*/
			
			//out.println("Welcome "+uid);
			// this newurl contains URL + SessionID
			//String newurl = response.encodeRedirectURL("welcomeuser");
			//response.sendRedirect(newurl);
			response.sendRedirect("welcomeuser.amit");
			//response.sendRedirect("welcomeuser?userid="+uid);
		}
		else{
			out.println("Invalid Userid or Password");
		}
		out.close();
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			response.sendRedirect("error.html");
		}
		
	}

}
