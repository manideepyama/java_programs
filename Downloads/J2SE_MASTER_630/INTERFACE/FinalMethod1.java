class A{
	final void method1()
	{System.out.println("M1 of A"); }
}
class B extends A
{
	public static void main(String args[])
	{ B b=new B();
	      b.method1(); 
	}
}