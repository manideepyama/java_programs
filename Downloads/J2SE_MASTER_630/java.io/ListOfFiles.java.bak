import java.io.*;
class ListofFiles{
	public static void main(String args[])
		throws IOException{

File f=new File("e:\\adv_super\\jsp");
String[ ] n=f.list();
int cnt=0;
for(String i:n)
{
	File f2=new File(f,i);
	if(f2.isFile())
	{
		System.out.println(i);
		cnt++;
	}
}
System.out.println("No.of.Files : "+cnt);
   }
}


