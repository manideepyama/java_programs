import java.io.*;
class FileEx1{
	public static void main(String args[])
		throws  IOException{
File f=new File("Sample");
        if(f.exists()){
			System.out.println("Existed ");
		}
		else	{
			System.out.println("Not Existed ");
		}
	}
}