import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDept {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * from dept");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			
			st.close();
			con.close();			
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
