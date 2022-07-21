import java.io.*;
class FileEx3{
	public static void main(String args[])
		throws IOException{
File f=new File("e:\\adv_super\\jsp","kphb");
if(f.exists() ){
	if(f.isDirectory())
	    {
		  File f1=new File(f,"MyHeart");
		  f1.createNewFile();
		  System.out.println("File is Created ");
	    }
   }
else
		{System.out.println("sorry Not Found "); }
	}
}

