class Demo
{  int y=456; //instance fields

	void method1()  //non static mtd
	  { int x=123;  //local variable
	    System.out.println("M1 x : "+x);  
		System.out.println("M1 y : "+y); }

	void method2(){
		System.out.println("M2 y : "+y); }

   public static void main(String args[])
	{ Demo d=new Demo( );
                  d.method1();
				  d.method2(); 
	  System.out.println("Main y : "+d.y); }
}



