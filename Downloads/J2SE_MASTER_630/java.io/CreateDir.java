import java.io.*;
class CreateDir{
	public static void main(String args[])
		throws IOException{
		File f1=new File("e:\\adv_super\\jdbc");
		File f2=new File(f1,"mydata");
		if(!f2.exists())
		    { f2.mkdir();
		      System.out.println("Dir is Created "); 
			}

	}
}