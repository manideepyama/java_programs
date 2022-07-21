
//Reading Data From Given Table

import java.sql.*;

class ReadTable{
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

if( st.execute("SELECT * from "+tname) )
{
	ResultSet rs=st.getResultSet();
	ResultSetMetaData rsmd=rs.getMetaData();

	int nc=rsmd.getColumnCount();
	//code for printing Column_names
	for(int c=1;c<=nc;c++)
	{
		System.out.print
			(rsmd.getColumnName(c)+"\t");
	}
	System.out.println("");

	//code for printing ResultSet Data
	while(rs.next())
	{
		for(int co=1;co<=nc;co++)
		{
			System.out.print(rs.getString(co)+"\t");
		}
		System.out.println("");
	}
}//if

st.close();
con.close();

	}//main
}//class












