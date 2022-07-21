import java.sql.*;

class BatchProcess{
	public static void main(String args[])
		throws ClassNotFoundException,SQLException{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

con.setAutoCommit(false);
Statement st=con.createStatement();

st.addBatch("UPDATE EMP1 SET COMM=9000");
st.addBatch("DELETE FROM EMP1 WHERE JOB='MANAGER'");
st.addBatch("INSERT INTO DEPT VALUES(98,'IIT','KPHB')");

int[ ] r=st.executeBatch();
System.out.println(r[0]+" rec are updated ...");
System.out.println(r[1]+" rec are Deleted ...");
System.out.println(r[2]+" rec are inserted ...");

con.commit();

st.clearBatch();
st.addBatch("DELETE FROM EMP1 WHERE ENAME='JAMES'");

int[ ] y=st.executeBatch();
System.out.println(y[0]+" Rec are Deleted...");

con.rollback();
st.close();
con.close();
	}
}