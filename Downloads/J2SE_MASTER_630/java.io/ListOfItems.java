import java.io.*;
class ListofItems{
	public static void main(String args[])
		throws IOException{
		File f=new File("e:\\adv_super\\jsp");
		String[ ] n=f.list();
		for(String i:n){
			System.out.println(i);
		}
System.out.println("No.of.Items : "+n.length);
	}
}