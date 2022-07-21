import kphb.sssit.IA;
import java.util.Scanner;

class SubB implements IA{
	public void method1()
	{System.out.println("OR m1 of IA "); }

	public static void main(String args[])
	{ IA ia=new SubB();
	        ia.method1(); }
}