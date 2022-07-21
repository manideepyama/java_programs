import java.sql.*;
import oracle.jdbc.driver.*;

class ReadDeptII
{
	public static void main(String args[])
	{
		Connection con=null;  //local variable
		Statement st=null;

		try{
			DriverManager.registerDriver(
				new OracleDriver());
			
		 con=DriverManager.getConnection
				("jdbc:oracle:oci8:@orcl","scott","tiger");

		  st=con.createStatement();

		  ResultSet rs=
			  st.executeQuery("SELECT * from dept");

		  while( rs.next( ))
			{
			     System.out.println("===============");
                 System.out.println
					 ("Deptno    : "+rs.getString(1));
				 System.out.println
					 ("Dname     :"+rs.getString(2));
				 System.out.println
					 ("Dloc          :"+rs.getString(3));
              }                         
		}//try
		catch(SQLException se)
		{
			System.out.println
				("Sorry unable to continue...");
			System.out.println(se);
		}//catch
		finally
		{
			try{	st.close(); }

			catch(SQLException s1)
			 {System.out.println
				("unable to continue.. \n "+s1);}

			try{
				if(con!=null)
				{
   	        con.close();	
			System.out.println("connection is Closed");
				}
			}
			catch(SQLException s)
			{System.out.println
				  ("Unable to continue..."+s);}

		}//finally
	}//main
}//class
