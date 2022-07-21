class MathsTest{
	static int sum(int x,int y)
	{ return (x+y); }
}

class Testing{
	public static void main(String args[])
	{  MathsTest t=new MathsTest();
	                 int s=t.sum(10,20); 
	   System.out.println("Sum is : "+s);

	   int r=MathsTest.sum(50,50);
	   System.out.println("Sum is : "+r);
	}
}