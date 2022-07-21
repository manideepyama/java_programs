
                                 1                                        2,3,...,n
Syn:String <sv>="{?=call <Fun|Pro_Name>(?,?,....)}";
Eg:  String fcall="{?=call Fadd(?,?)}";

java.sql.Connection
   public CallableStatement prepareCall(String)
     throws SQLException
 Eg:  CallableStatement cst=con.prepareCall(fcall);


java.sql.CallableStatement
   public void setXxx(int,xxx)throws SQLException
            int - pos of InputParameter
			xxx - value to be inserted 

	      Eg:   cst.setInt(2,90);
		  cst.setInt(3,90);

Step-4:
java.sql.CallableStatement
   public void registerOutParameter(int,int)
   throws SQLException
        int - output Pos. Parameter
		int - final static int variables of java.sql.Types

Eg:  cst.registerOutParameter(1,Types.NUMERIC);
                                                  //javap java.sql.Types

Step-5 : 
java.sql.CallableStatement
   public boolean execute() throws SQLException
       Eg:  cst.execute();

Step-6:
  java.sql.CallableStatement
     public xxx getXxx(int ) throws SQLException
	        int s=cst.getInt(1);
			System.out.println("Sum is : "+s);

Step-7:  
java.sql.CallableStatement
    public void close() throws SQLException
	   cst.close();











       













		                   












		           

