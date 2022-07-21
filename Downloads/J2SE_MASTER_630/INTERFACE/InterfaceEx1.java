interface IntA{
	public abstract void method1();
}
class SubB implements IntA{
	public void method1()
	{System.out.println("OR m1 of IntA"); }

	public static void main(String args[])
	{ IntA ia=new SubB();
	           ia.method1(); 
	}
}