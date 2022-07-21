
//Example For DBMD
import java.sql.*;

class DBMDDemo{
	public static void main(String args[])
		throws Exception{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

DatabaseMetaData dbmd=con.getMetaData();

System.out.println
	("Database Name : "+ dbmd.getDatabaseProductName());

System.out.println("Database Version : "+dbmd.getDatabaseProductVersion());

System.out.println("Driver Name : "+
	dbmd.getDriverName());

System.out.println("Driver Version : "+
	dbmd.getDriverVersion());
	}
}