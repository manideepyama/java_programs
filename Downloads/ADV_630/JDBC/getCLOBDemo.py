//Code for Inserting Date Values : 
import java.sql.*;
import java.io.*;

class CLOBDemo{
	public static void main(String args[])
		throws Exception{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

PreparedStatement pst=
	   con.prepareStatement("INSERT INTO CINFO VALUES(?,?)");

pst.setString(1,"Hyd");
File f=new File("p1.sql");
FileReader fr=new FileReader(f);
pst.setClob(2,fr);

int i=pst.executeUpdate();
System.out.println("Rec is inserted ....");

pst.close();
con.close();
   }
}