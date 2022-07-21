
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

class FlexDBConnection{
	public static void main(String args[])
		throws SQLException,
		ClassNotFoundException,IOException
	{
		Properties p=new Properties();
		FileInputStream fis=
			 new FileInputStream("db.prop");
		p.load(fis);

		String driver=p.getProperty("DRIVER");
		String url=p.getProperty("URL");
		String username=p.getProperty("USERNAME");
		String password=p.getProperty("PASSWORD");
		String table=p.getProperty("TABLE");

		//DBLogic
		Class.forName(driver);
		Connection con = DriverManager.getConnection
			(url,username,password);

		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery
			("SELECT * from "+table);

		ResultSetMetaData rsmd=rs.getMetaData();
		int nc=rsmd.getColumnCount();

		while(rs.next())
		{
			for(int c=1;c<=nc;c++)
			{
				System.out.print(rs.getString(c)+"\t");
			}
			System.out.println(" ");
		}
       st.close();
	   con.close();
	}
}
