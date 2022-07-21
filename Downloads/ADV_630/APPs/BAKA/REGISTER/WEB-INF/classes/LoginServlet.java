import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
    PrintWriter pw=response.getWriter();
    response.setContentType("text/html");
    pw.print("<body bgcolor=lightblue text=white>");
    String name=request.getParameter("USERNAME");
    String pass=request.getParameter("PASSWORD");
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select username,password from tbl_user where upper(username)=upper('"+name+"')");
      if(rs.next())
      {
        if(pass.equals(rs.getString(2)))
        {
          Statement st1=con.createStatement();
          ResultSet rs1=st1.executeQuery("select * from tab");
          pw.print("<h1 align=center>DataBase Table</h1>");
          pw.print("<br><hr><br><br>");
          pw.print("<form action=table.com method=post>");
           pw.print("<table align=center>");
            pw.print("<tr><td><h2>Select Table:</td>");
             pw.print("<td><select name=TABLE>");
              while(rs1.next())
               pw.print("<option>"+rs1.getString(1)+"</option>");
             pw.print("</select></h2></td>");
            pw.print("</tr>");
            pw.print("<tr><td></td>");
             pw.print("<td><input type=submit value=Download></td>");
            pw.print("</tr>");
           pw.print("</table>");
          pw.print("</form>");
          st1.close();
        }
        else
        {
          pw.print("<h4 center>Invalid Password...Try Again</h4>");
          RequestDispatcher rd=request.getRequestDispatcher("/login.html");
          rd.include(request,response);
        }
      }
      else
      {
        pw.print("<h1 align=center>Register Page</h1>");
         pw.print("<br><hr><br><br>");
         pw.print("<form action=register.com method=post>");
          pw.print("<table align=center>");
           pw.print("<tr><td><h2>FirstName:</td>");
            pw.print("<td><input type=text name=FIRSTNAME></h2></td>");
           pw.print("</tr>");
           pw.print("<tr><td><h2>LastName:</td>");
            pw.print("<td><input type=text name=LASTNAME></h2></td>");
           pw.print("</tr>");
           pw.print("<tr><td><h2>Username:</td>");
            pw.print("<td><input type=text name=RNAME></h2></td>");
           pw.print("</tr>");
           pw.print("<tr><td><h2>Password:</td>");
            pw.print("<td><input type=password name=RPASS></h2></td>");
           pw.print("</tr>");
           pw.print("<tr><td></td>");
            pw.print("<td><input type=submit value=Register></td>");
           pw.print("</tr>");
          pw.print("</table>");
         pw.print("</form>");
      }
      st.close();
      con.close();
    }
    catch(SQLException|ClassNotFoundException e)
    {
      pw.print("<h2 align=center>Unable to continue.."+e+"</h2>");
    }
    pw.print("</body>");
    pw.close();
  }
}