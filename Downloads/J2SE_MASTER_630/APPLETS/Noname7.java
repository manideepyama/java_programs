//MyServlet.java
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyServlet extends HttpServlet
{
	public void service(ServletRequest request,
		ServletResponse response)
		throws ServletException,IOException{
		.......
	}
}



web.xml
<web-app>
   <servlet>
      <servlet-name>LN</servlet-name>
	  <servlet-class>ServletClass</servlet-class>
   </servlet>
   <servlet-mapping>
       <servlet-name>LN</servlet-name>
	   <url-pattern>/publicurl</url-pattern>
   </servlet-mapping>
</web-app>

     <url-pattern> of <servlet-mapping>
	 <servlet-name> of <servlet-mapping>
	 <servlet-name> of <servlet>