import java.io.*;
class FileEx2{
	public static void main(String args[])
		 throws IOException{

File f=new File("e:\\adv_super\\jsp","apple");
if( f.exists() )
	{System.out.println("Existed "); 
         if(f.isFile())
			 System.out.println("yes it is File ");
    }
else
	{ System.out.println("Not Existed "); }
	}
}