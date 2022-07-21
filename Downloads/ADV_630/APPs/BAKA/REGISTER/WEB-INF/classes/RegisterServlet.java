import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
    PrintWriter pw=response.getWriter();
    response.setContentType("text/html");
    String rname=request.getParameter("RNAME");
    String rpass=request.getParameter("RPASS");
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
      Statement st=con.createStatement();
      int x=st.executeUpdate("insert into tbl_user values('"+rname+"','"+rpass+"')");
      RequestDispatcher rd=request.getRequestDispatcher("/login.html");
      rd.forward(request,response);
      st.close();
      con.close();
    }
    catch(SQLException|ClassNotFoundException e)
    {
      pw.print("<h2 align=center>Unable to continue.."+e+"</h2>");
    }
    pw.close();
  }
}