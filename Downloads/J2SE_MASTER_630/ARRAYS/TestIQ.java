class Employee{
	int eno; String ename; float esal;
	java.util.Scanner s=
		new java.util.Scanner(System.in);

   void setEmployee(){
   System.out.println("Enter eno,ename,salary");
   eno=s.nextInt();
   ename=s.next( );
   esal=s.nextFloat();
   }

   void getEmployee()
	{System.out.println("Eno is : "+eno);
     System.out.println("Ename is : "+ename);
	 System.out.println("Esalary is : "+esal); }

	public static void main(String args[]){
		Employee[ ] e=new Employee[3];
		int i;

		for(i=0;i<e.length;i++)
		{e[i]=new Employee(); }

		for(i=0;i<e.length;i++)
      		e[i].setEmployee();

		for(Employee j:e)
		    {j.getEmployee();
		     System.out.println
				 ("==============");}

	}
}








