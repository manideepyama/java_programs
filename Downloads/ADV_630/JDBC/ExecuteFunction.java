
import java.sql.*;

class ExecuteFunction{
	public static void main(String args[]){
		
		Connection con=null;
		CallableStatement cst=null;

		try{
Class.forName("oracle.jdbc.driver.OracleDriver");

con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

String fcall="{?=call FAdd(?,?)}";
cst=con.prepareCall(fcall);

java.util.Scanner s=
	new java.util.Scanner(System.in);
System.out.println("Enter 2 numbers ");
cst.setInt(2,s.nextInt());
cst.setInt(3,s.nextInt());

cst.registerOutParameter(1,Types.NUMERIC);

cst.execute();
int su=cst.getInt(1);
System.out.println("Sum is : "+su);

		}//try
		catch
			(SQLException | ClassNotFoundException e)
		{ System.out.println
			("Sorry Unable to continue...\n"+e);
	    }//catch

		finally{
			try{
				cst.close();
			}
			catch(SQLException se)
			{  se.printStackTrace(); }

			try{
				if(con!=null)
					con.close();
			}
			catch(SQLException s1)
			{  s1.printStackTrace(); }
		}//finally

	}
}