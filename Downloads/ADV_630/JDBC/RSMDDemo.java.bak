
//Example on RSMDDemo
import java.sql.*;

class RSMDDemo{
	public static void main(String args[])
		throws Exception{

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

Statement st=con.createStatement();

java.util.Scanner s=
	 new java.util.Scanner(System.in);
System.out.println("Enter Tablename ");
String tname=s.next();

ResultSet rs=
	st.executeQuery("SELECT * from "+tname);

ResultSetMetaData rsmd=rs.getMetaData();
int nc=rsmd.getColumnCount();
System.out.println("No.of.Columns : "+nc);

    for(int c=1;c<=nc;c++)
		{
	    String c_name=rsmd.getColumnName(c);
		String c_type=rsmd.getColumnTypeName(c);
		System.out.println("Col_name : "+c_name);
		System.out.println("Col_Type  : "+c_type);
		System.out.println("===================");
	    }

st.close();
con.close();
	}
}