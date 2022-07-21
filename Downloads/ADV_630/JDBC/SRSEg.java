
import java.sql.*;

class SRSEG{
	public static void main(String args[])
		throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

ResultSet rs=
	st.executeQuery("SELECT Ename from emp");
System.out.println
	("IsBeforeFirst ? : "+ rs.isBeforeFirst());


rs.first();
System.out.println("IsFirst ? : "+rs.isFirst());
System.out.println
	("First_Name : " +rs.getString(1));

rs.last();
System.out.println("IsLast ? : "+rs.isLast());
System.out.println
	("Last_Name : "+rs.getString(1));

rs.afterLast();
System.out.println("IsAfterLast ? : "+
	rs.isAfterLast());

System.out.println("Rec in B <--- D");

while(rs.previous())
		{
	    System.out.println(rs.getString(1));
        }

System.out.println("IsBeforeFirst ? : "+
	rs.isBeforeFirst());





	}
}