interface IA{  void method1(); }
interface IB{  void method2(); }

class SubB implements IA,IB{
	public void method1()
	{System.out.println("OR m1 of IA "); }

	public void method2()
	{System.out.println("OR m2 of IB "); }

	public static void main(String args[]){
		IA ia=new SubB();
		     ia.method1(); 
			 //ia.method2(); CE
	    IB ib=new SubB();
		     ib.method2();
			// ib.method1(); CE
	}
}



