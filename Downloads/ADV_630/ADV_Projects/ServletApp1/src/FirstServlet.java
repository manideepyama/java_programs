import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet {
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
	{
	   PrintWriter out=response.getWriter();
	   out.print("Welcome To Servlet....!");
	   out.close();
	}
}
