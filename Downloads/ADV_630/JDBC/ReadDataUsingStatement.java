
import java.sql.*;

class ReadDataUsingStatement{
	public static void main(String args[])
		throws SQLException,ClassNotFoundException
	{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

Statement st=con.createStatement();

if(st.execute("SELECT * from DEPT"))
		{
	       ResultSet rs=st.getResultSet();
		   while(rs.next())
			{
			    for(int c=1;c<=3;c++)
				{
		System.out.print(rs.getString(c)+"\t");
				}
				System.out.println("");
		    }//while
        }//true
		st.close();
		con.close();
	}
}
