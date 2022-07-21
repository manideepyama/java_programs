import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ValidateServlet implements Filter{
	public void init(FilterConfig config)
	{}

	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
		throws IOException,ServletException{
		PrintWriter out=response.getWriter();
	response.setContentType("text/html");

 		String fname=request.getParameter("FNAME");
		String lname=request.getParameter("LNAME");
		int age=
			Integer.parseInt(request.getParameter("AGE"));

		if(fname.equals(""))
			out.print(" Fname is Required...! ");
		else if(lname.equals(""))
			out.print(" Lname is Required ..! ");
		else if(age==0)
			out.print(" age is Required ...! ");
		else
		 {
			out.print("<div style=border-style:dashed; border-color:red; font-size:10;>");
			out.print("<pre>");
			chain.doFilter(request,response);
			out.print("</pre>");
			out.print("</div>");
		 }

	out.close();
	}

	public void destroy()
	{}

}