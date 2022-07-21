
import java.sql.*;
import static java.lang.System.*;

class ExecuteProcedure{
	public static void main(String args[])
		throws SQLException,ClassNotFoundException
	{
		Class.forName
			("oracle.jdbc.driver.OracleDriver");
		
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

		CallableStatement cst=
			con.prepareCall("{call PInsert(?,?,?)}");
		
		java.util.Scanner s=
			 new java.util.Scanner(in);
		out.println("Enter dno , dname and loc ");

		cst.setInt(1,s.nextInt());
		cst.setString(2,s.next());
		cst.setString(3,s.next());

		cst.execute();
		cst.close();
		con.close();
	}
}