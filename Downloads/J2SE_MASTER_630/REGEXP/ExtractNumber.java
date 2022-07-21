import java.io.*;
import java.util.regex.*;

class ExtractNumber{
	public static void main(String args[])
		throws IOException{
		BufferedReader br=
			new BufferedReader
			   (new FileReader("student.txt"));

PrintWriter pw=new PrintWriter("Number");

Pattern p=Pattern.compile("[6789][0-9]{9}");
String line=null;
line=br.readLine();

while(line!=null)
		{
             Matcher m=p.matcher(line);
			 while(m.find())
			      { String n=m.group(); 
			        pw.println(n);}

             line=br.readLine();			 
        }
		System.out.println("Numbers Extracted ");
	br.close();
	pw.close();
	}
}