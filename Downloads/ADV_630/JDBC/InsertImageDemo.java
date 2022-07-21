//Code for Inserting Image : 
import java.sql.*;
import java.io.*;

class InsertImageDemo{
	public static void main(String args[])
		throws Exception{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

PreparedStatement pst=
	con.prepareStatement("INSERT INTO STU1 VALUES(?,?)");

pst.setString(1,"James");
FileInputStream fis=
	new FileInputStream("m1.png");
pst.setBinaryStream(2,fis);

int i=pst.executeUpdate();
System.out.println("Image is Inserted");



pst.close();
con.close();
   }
}