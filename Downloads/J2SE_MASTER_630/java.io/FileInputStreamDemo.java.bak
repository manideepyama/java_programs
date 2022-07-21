//FileInputStream(String file);
import java.io.*;
class FileInputStreamDemo{
	public static void main(String args[]){
		try{
FileInputStream fis=
	new FileInputStream("Sample");
int nb=fis.available();
System.out.println("No.of.Bytes : "+nb);
        
       for(int i=1;i<=nb;i++)
			    {  int x= fis.read(); 
	                System.out.print((char)x);     }

		fis.close();
		}
		catch(IOException ioe){
			System.out.println
				("Sorry Unable to continue .. "+ioe);
		}
	}
}