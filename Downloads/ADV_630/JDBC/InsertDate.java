//Code for Inserting Date Values : 

import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;

class InsertDate{
	public static void main(String args[])
		throws Exception{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

PreparedStatement pst=
	con.prepareStatement("INSERT INTO STUDENT VALUES(?,?)");
//public void setData(int,java.sql.Date) throws SE

Scanner s=new Scanner(System.in);
System.out.println("Enter Sname ");
String sname=s.next();

System.out.println("Enter Dob : [dd-mm-yyyy] ");
String dob=s.next();

SimpleDateFormat sdf=
	new SimpleDateFormat("dd-MM-yyyy");
java.util.Date ud=sdf.parse(dob);

long time=ud.getTime();
java.sql.Date jd=new java.sql.Date(time);

pst.setString(1,sname);
pst.setDate(2,jd);
int i=pst.executeUpdate();
System.out.println("Rec is inserted ...");

pst.close();
con.close();
   }
}