class A{
	A() {System.out.println("Def ");}
	
	void A(int x)  //instance mtd
		{ System.out.println("1 para : "+x); }

	public static void main(String args[])
	{ A a=new A( ); 
	      a.A(123); }
}