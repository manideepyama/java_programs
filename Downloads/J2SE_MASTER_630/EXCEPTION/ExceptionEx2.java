import java.util.Scanner;
class ExceptionEx2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter 2 numbers  ");
		x=s.nextInt();
		y=s.nextInt();

		try{
			z=x/y;
			System.out.println("Result is : "+z); }

		catch(ArithmeticException a)
		{System.out.println
			  ("Sorry V R N D B Zero "); 
 System.out.println("Plz Enter Second Num : ");
		 y=s.nextInt();
		 z=x/y;
		 System.out.println("Result is : "+z);
		}
	}
}



