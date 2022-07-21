import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ConfigDemoServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

     PrintWriter out=response.getWriter();
	 response.setContentType("text/html");
      
	 //reading values From web.xml 
	 ServletConfig config=getServletConfig();
	 String driver=
		  config.getInitParameter("DRIVER");
	String url=
		  config.getInitParameter("URL");
	String username=
		  config.getInitParameter("USERNAME");
   String password=
		  config.getInitParameter("PASSWORD");
   String table=
		  config.getInitParameter("TABLE");

//javax.servlet.ServletConfig
   //public Enumeration getInitParameterNames();

//java.util.Enumeration
   //public boolean hasMoreElements()
   //public Object nextElement()

Enumeration<String> e=   config.getInitParameterNames();
String s=" ";
while(e.hasMoreElements())
		   { s=s+e.nextElement()+"<br>"; }

//Display Init-Parameter
out.print("<body bgcolor=green text=white><h1 align=center> ServletConfig Object </h1><hr><br><br>");

out.print("<table align=center border=2>");
out.print("<tr bgcolor=blue><td colspan=2> Parameter Names and Values </td></tr>");

out.print("<tr><td>DRIVER : </td><td>"+driver+"</td></tr>");

out.print("<tr><td>URL : </td><td>"+url+"</td></tr>");

out.print("<tr><td>USERNAME : </td><td>"+username+"</td></tr>");

out.print("<tr><td>PASSWORD : </td><td>"+password+"</td></tr>");

out.print("<tr><td>TABLE : </td><td>"+table+"</td></tr>");

out.print("<tr><td>Parameter_Names: </td><td>"+s+"</td></tr>");

out.print("</table>");
out.print("</body>");

	 out.close();
	}
}