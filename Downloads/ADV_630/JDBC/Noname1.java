
java.sql.DatabaseMetaData (Interface)
public abstract 
  String getDatabaseProductName( )
  String getDatabaseProductVersion( )
  String getDatabaseProductMajorVersion( )
  String getDatabaseProductMinorVersion( )
  String getDriverName( )
  String getDriverVersion( )
  String getDriverMajorVersion( )
  String getDriverMinorVersion( )

java.sql.Connection
   public DatabaseMetaData getMetaData()
               throws SQLException


java.sql.ResultSetMetaData(i)
public abstract 
	 int getColumnCount( );
	 String getColumnName(int colno);
	 String getColumnTypeName(int colno); 
	    |- Datatypes W.R.T Database(oracle)

	 int getColumnType(int col);
	    |- public final static int of java.sql.Types

java.sql.ResultSet
   public ResultSetMetaData getMetaData()
      throws SQLException

java.sql.ParameterMetaData(i)
    public abstract int getParameterCount( );
	public abstract String getParameterMode(int);
	public abstract String getParameterType(int);

by using 
java.sql.PreparedStatement
     public ParameterMetaData     getParameterMetaData();

java.sql.CallableStatement
    public ParameterMetaData getParameterMetaData();

