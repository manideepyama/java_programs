class SuperA{
	void method1(int x)
	 {System.out.println("M1 of SA : "+x); }
}
class SubB extends SuperA{
	void method1(int x)
	{System.out.println("M1 of SB : "+x); }
}
class OREx1{
	public static void main(String args[]){
		SuperA sa=new SuperA( );
		              sa.method1(999);

					  sa=new SubB();
					  sa.method1(888);
					  
					  sa=new SuperA( );
					  sa.method1(777);
	}
}


