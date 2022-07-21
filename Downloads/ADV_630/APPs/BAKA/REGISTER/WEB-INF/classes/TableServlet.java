import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class TableServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
    PrintWriter pw=response.getWriter();
    response.setContentType("application/pdf");
    String tab=request.getParameter("TABLE");
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("SELECT * from "+tab);
      ResultSetMetaData rsmd=rs.getMetaData();
      int nc=rsmd.getColumnCount();
      pw.print("<table>");
       pw.print("<tr>");
        for(int c=1;c<=nc;c++)
          pw.print("<th>"+rsmd.getColumnName(c)+"</th>");
       pw.print("</tr>");
       while(rs.next())
       {
         pw.print("<tr>");
         for(int col=1;col<=nc;col++)
           pw.print("<td>"+rs.getString(col)+"</td>"); 
         pw.print("</tr>");
       }
      pw.print("</table>");
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