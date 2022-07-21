import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class TableServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

       PrintWriter out=response.getWriter();
	   response.setContentType("text/html");

        //Logic For Reading Table names From Scott User In oracle DB
		try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
Statement st=con.createStatement();
ResultSet rs=
	st.executeQuery("SELECT tname from tab");

//Dynamic Page Creating
out.print("<body bgcolor=green text=white>");
out.print("<form action=down.com method=post>");
out.print("<h1 align=center> Download App </h1><hr><br><br>");

out.print
	("<h2 align=center> Select Tablename : </h2>");

out.print("<select name=TABLE>");
    while(rs.next())
			{
out.print("<option>"+rs.getString(1)+"</option>");
	        }
out.print("</select><input type=submit value=Download...>");

out.print("</form>");

con.close();
st.close();
}//try
		
		catch
		(ClassNotFoundException | SQLException e)
		{
			out.print("<h2 align=center>Unable to continue"+e+"</h2>");
		}//Catch
 
       out.print("</body>");
	   out.close();
	}
}