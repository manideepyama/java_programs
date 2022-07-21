//Code for Inserting Date Values : 

import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;

class ReadDate{
	public static void main(String args[])
		throws Exception{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

PreparedStatement pst=
	con.prepareStatement("SELECT * from student");
ResultSet rs=pst.executeQuery();
rs.next();

String name=rs.getString(1);
java.sql.Date jd=rs.getDate(2);

System.out.println("Sname is : "+name);
System.out.println("Dob : "+jd);

SimpleDateFormat sdf=
	new SimpleDateFormat("dd-MMM-yyyy");
String sd=sdf.format(jd);

System.out.println("Sname is : "+name);
System.out.println("Dob : "+sd);



pst.close();
con.close();
   }
}