class A{	int x=111; }
class B extends A{ int x=222; }
class C extends B{
	int x=333;
	void method1()
	{System.out.println(super.super.x);}
	public static void main(String agrs[])
	{ C c=new C( );
	       c.method1(); }
}