import java.io.*;
class ReadData2{
	public static void main(String args[]){
		//JDK1.8
		java.util.Scanner s=
			 new java.util.Scanner(System.in);
		System.out.println("Enter File name ");
		String fname=s.next();

		try(FileInputStream fis=
			      new FileInputStream(fname))
		{
			int x;
			while( (x=fis.read())!=-1)
			    {System.out.print((char)x);}
		}
		catch(IOException ioe)
		{ System.out.println
			   ("Sorry File not found"); }
	}//main
}//class