
import java.sql.*;
import oracle.jdbc.driver.*;

class DynamicInsert{
	public static void main(String args[]){
		
		Connection con=null;
		PreparedStatement pst=null;

		try{
			DriverManager.registerDriver(new OracleDriver());

	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

	pst=con.prepareStatement("INSERT INTO DEPT VALUES(?,?,?)");

	java.util.Scanner s=
		new java.util.Scanner(System.in);

for(int cnt=1; cnt<=3; cnt++)
{
	System.out.println("Enter dno,dname,loc ");
	int deptno=s.nextInt();
	String dname=s.next( );
	String loc=s.next( ); 

	   pst.setInt(1,deptno);
	   pst.setString(2,dname);
	   pst.setString(3,loc);

	   int i=pst.executeUpdate();
	   System.out.println(i+" Rec are inserted ..");
}//for
			
	}//try
		catch(SQLException se)
		{ System.out.println("Unable to continue....");
		   System.out.println(se);
		}//catch

		finally
		{
			try{ pst.close(); }
			catch(SQLException s)
			    {System.out.println
				   ("Unable to continue...\n"+s);}

			try{
				if(con!=null)
					con.close();}

			catch(SQLException ss)
			   { ss.printStackTrace(); }
		}//finally
	}//main
}//class


