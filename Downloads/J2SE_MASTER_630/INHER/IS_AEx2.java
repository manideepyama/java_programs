class SuperA{
	int x=111;
}
class SubB extends SuperA{
	int x=222;
	void method1()
	{   int x=333; 
		System.out.println("x val is : "+x); 
		System.out.println("x val is : "+this.x); 
		System.out.println("x val is : "+.x); }

	public static void main(String args[])
	{ SubB sb=new SubB();
	              sb.method1(); }
}