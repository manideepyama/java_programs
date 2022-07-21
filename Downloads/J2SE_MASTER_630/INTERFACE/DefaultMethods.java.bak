interface IA{
	void method1(); //public abstract
	default  void method2(){
		System.out.println("Def m2 from JDK1.8");
	}
}
class SubB implements IA{
	public void method1()
	{System.out.println("OR m1 of IA"); }

	public static void main(String args[]){
		IA a=new SubB();
		     a.method1();
			 a.method2();
	}
}