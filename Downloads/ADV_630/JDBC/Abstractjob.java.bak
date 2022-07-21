import java.sql.*;
import oracle.jdbc.driver.*;

class AbstractJob{
	public static void main(String args[])
	{
       Connection con=null;
	   Statement st=null;
	   
       try{
          DriverManager.registerDriver
			  (new OracleDriver());         

	  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

	   st=con.createStatement();
	   
	   ResultSet rs=
		 st.executeQuery("SELECT job,sum(sal),max(sal),min(sal),count(sal)  from emp group by job order by job");

      while( rs.next())
		   {
		      for(int c=1;c<=5;c++)
			   { System.out.print(rs.getString(c)+"\t"); }
			  System.out.println(" ");
	       }//while

	   }//try
	   
	   catch(SQLException s){
              System.out.println("Unable to continue...");
			  System.out.println(s);
	   }//catch

	   finally{

           try{
			   st.close();
		   }
		   catch(SQLException se1)
		       { System.out.println(se1); }

		   try{
           if(con!=null)
			   con.close(); }   

		   catch(SQLException se)
		      {System.out.println(se); }

	   }//finally

	}//main
}//class