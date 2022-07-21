
import java.sql.*;

class PMDDemo{
	public static void main(String args[])
		throws SQLException,ClassNotFoundException{

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

PreparedStatement pst=
	   con.prepareStatement("INSERT INTO DEPT VALUES(?,?,?)");

ParameterMetaData pmd= pst.getParameterMetaData();
int pc=pmd.getParameterCount();
System.out.println("ParameterCount : "+pc);

System.out.println("Type is : "+ pmd.getParameterType(1));


pst.close();
con.close();
	}
}