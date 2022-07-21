import java.sql.*;

class ExecuteProcedure{
	public static void main(String args[])
		 throws Exception{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

CallableStatement cst=
	         con.prepareCall("{call PEinfo(?,?,?,?)}");

java.util.Scanner s=
	 new java.util.Scanner(System.in);
System.out.println("Enter Eno ");
int eno=s.nextInt();
cst.setInt(1,eno);

cst.registerOutParameter(2,Types.VARCHAR);
cst.registerOutParameter(3,Types.VARCHAR);
cst.registerOutParameter(4,Types.NUMERIC);

cst.execute();
String ename=cst.getString(2);
String ejob=cst.getString(3);
int esal=cst.getInt(4);

System.out.println("Ename is : "+ename);
System.out.println("Ejob is : "+ejob);
System.out.println("Esal is : "+esal);

cst.close();
con.close();
  }
}






