final class A{
	int x=10;
	void method1()
	{System.out.println("M1 x : "+x); }
	public static void main(String args[])
	{ A a=new A( );
	      a.method1(); }
}

class B extends A{

}