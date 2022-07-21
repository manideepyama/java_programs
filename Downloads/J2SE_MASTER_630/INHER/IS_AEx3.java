class SuperA{
	void method1()
	{ System.out.println("M1 of SA "); }
}
class SubB extends SuperA{
	void method1()
	{  //super.method1();  
		System.out.println("M1 of SB "); }

   public static void main(String args[])
	{ SubB sb=new SubB( );
                 sb.method1( ); }
}




