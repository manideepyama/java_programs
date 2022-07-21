
import java.sql.*;

class UpdateRec{
	public static void main(String args[]){

		Connection con=null;
		PreparedStatement pst=null;

		try{
			Class.forName
				("oracle.jdbc.driver.OracleDriver");

			con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

			pst=con.prepareStatement("UPDATE EMP SET SAL=?,COMM=? WHERE upper(JOB)=upper(?)");

			java.util.Scanner s=
				new java.util.Scanner(System.in);
			System.out.println("Enter sal ");
			int sal=s.nextInt( );
			pst.setInt(1,sal);

			System.out.println("Enter Comm ");
			int comm=s.nextInt();
			pst.setInt(2,comm);

			System.out.println("Enter job : ");
			String job=s.next();
			pst.setString(3,job);

            int i=pst.executeUpdate();  
			System.out.println
				(i+" Rec are Updated ...");
		}//try

		/*
		catch(ClassNotFoundException cnfe)
		{
			System.out.println
				("Sorry Drivers are not Existed ");
		}//catch_1
		
		catch(SQLException se)
		{ System.out.println("Unable to continue.... "); 
		   System.out.println(se);
		}//catch_2   */

//JDK1.7
catch(SQLException | ClassNotFoundException e)
		{ System.out.println
	      ("Sorry Unable to Continue.... \n "+e);}

		finally{
			try{pst.close();}
			catch(SQLException s1)
				  {s1.printStackTrace();}

			try{ if(con!=null)
				      con.close(); }
			catch(SQLException s2)
			    { s2.printStackTrace();}
		}//finally
	}
}