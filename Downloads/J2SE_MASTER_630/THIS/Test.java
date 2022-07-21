class Test{
	int x=222;  //instance field
	
	void method1()
	{ int x=111;  //local variable
	  System.out.println("M1 x : "+x); 
	  System.out.println("Inst x : "+this.x); }

	public static void main(String args[])
	{ Test t=new Test( );
	            t.method1( ); }
   }