// Servlet Class Must be Public
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
PrintWriter out = response.getWriter();
out.println("Hello User ");
out.close();
}
}