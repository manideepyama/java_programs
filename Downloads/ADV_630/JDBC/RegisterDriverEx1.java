
import java.sql.*;
import oracle.jdbc.driver.*;

class RegisterDriverEx1
{  public static void main(String args[])
    throws SQLException{

		DriverManager.registerDriver
			             (new OracleDriver());
	}
}