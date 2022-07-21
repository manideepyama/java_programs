//Code for Inserting Date Values : 
import java.sql.*;
import java.io.*;

class getCLOBDemo{
	public static void main(String args[])
		throws Exception{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

PreparedStatement pst=
	con.prepareStatement("SELECT * from cinfo");
ResultSet rs=pst.executeQuery();
rs.next();

String cname=rs.getString(1);
Reader fr=rs.getCharacterStream(2);

/*
int x;    // public int read();
while( (x=fr.read())!=-1)
		{ System.out.print((char)x);}   */

FileWriter fw=new FileWriter("target");
int x;
x=fr.read();
while(x!=-1)
{
	fw.write(x);
	x=fr.read();
}

fw.flush();
fw.close();
fr.close();

System.out.println("Data is Copied ...");

pst.close();
con.close();
   }
}