interface IA{	void method1(); }
interface IB extends IA
  {  void method2(); }

class SubB implements IB{
	public void method1()
	{System.out.println("OR m1 of IA"); }

	public void method2()
	{System.out.println("OR m2 of IB "); }

	public static void main(String args[])
	{ IA ia=new SubB(); 
	       ia.method1(); 
		 //  ia.method2();  CE

        IB ib=new SubB();
		     ib.method2();
			 ib.method1();
		   }
}


/*
class <------ extends <---  class
abstract class <-- extends <-- class
interface <---- extends <--- class  X

class <--- extends <--- abstract class
abstract class <-- extends <-- abstract class 
interface <-- extends <-- abstract class  X

class <--- implements <-- interface
abstract class <-- implements <-- interface
interface <-- extends <-- interface  */







 








