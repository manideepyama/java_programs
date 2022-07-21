import java.util.Scanner;
class Employee{
	public static void main(String args[])
	{
		int eno; String ename; 
		                       float esal;  //local variable
		Scanner s=new Scanner(System.in);

		System.out.println("Enter eno : ");
		eno=s.nextInt();

		System.out.println("Enter ename : ");
		ename=s.next();

		System.out.println("Enter salary : ");
		esal=s.nextFloat();

		System.out.println("Eno is  : "+eno);
		System.out.println("Ename is : "+ename);
		System.out.println("Esalary is : "+esal);
	}
}