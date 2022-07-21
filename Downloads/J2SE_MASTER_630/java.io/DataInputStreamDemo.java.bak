/*
InputStream
         |- int read()
DataInputStream   */

import java.io.*;
class DataInputStreamDemo{
	public static void main(String args[])
		throws IOException{

FileOutputStream fos=
	         new FileOutputStream("MyInfo");
DataInputStream dis=
	new DataInputStream(System.in);

System.out.println("Enter Data Press * For Exit");
int x;
while( (x=dis.read() )!='*' )
		   { fos.write(x); }
fos.close();
dis.close();
System.out.println("Data is Saved "); 
	}
}




