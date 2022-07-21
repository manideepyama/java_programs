
import java.sql.*;

class CreateTableDemo{
	public static void main(String args[])
		throws SQLException,ClassNotFoundException
	{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

Statement st=con.createStatement();

if(!st.execute("CREATE TABLE EMPLOYEE(ENO NUMBER(3),ENAME VARCHAR(20))"))
		{ System.out.println("Table is Created "); } 

 st.close();
 con.close();
	}
}
