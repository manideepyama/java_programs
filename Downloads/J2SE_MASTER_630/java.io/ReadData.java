import java.io.*;
class ReadData{
	public static void main(String args[]){
FileInputStream fis=null; //local variable
		try{
 fis=new FileInputStream("Sample");
 int x;
 while( (x=fis.read() )!=-1 )
			{ System.out.print((char)x);}

		}//try
		catch(IOException fne){
System.out.println("Sorry File not found ");
		}//catch
		finally{
            try{
				if(fis!=null)
				{
		          fis.close(); 
				  System.out.println("\n File is Closed");
				}
			  }
             catch(IOException ioe)
			 { ioe.printStackTrace(); }
		}//finally
	}//main
}//class