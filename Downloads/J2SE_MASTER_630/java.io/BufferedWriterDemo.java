//BufferedWriter(Writer):
     //public void writeLine()

import java.io.*;

class BufferedWriterDemo{
	public static void main(String args[])
		throws IOException{
FileWriter fw=new FileWriter("Info");
BufferedWriter bw=new BufferedWriter(fw);
bw.write(65);   bw.newLine();
bw.write(new char[]{'s','a','i'});
bw.newLine();   //public void newLine();
bw.write("Have a good Day");
bw.newLine();
bw.close();
System.out.println("Data is Saved ");
	}
}
   