abstract class SuperA{
	void method1()
	{ System.out.println("M1 of SuperA");  }
	abstract void method2();
}
class SubB extends SuperA{
	void method2()
	{System.out.println("OR m2 of SuperA"); }

    void method3()
	{System.out.println("M3 of SB "); }
}
class AbstractEx1{
	public static void main(String args[]){
		SuperA sa=new SubB();
		               sa.method1(); 
					   sa.method2(); 
	// sa.method3();  CE

	SubB sb=new SubB();
	           sb.method3();
			   sb.method2();
			   sb.method1();
					
	}
}