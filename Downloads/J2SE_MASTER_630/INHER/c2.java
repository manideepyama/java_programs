class SuperA{
	SuperA()
	{System.out.println("Def of SA "); }
}
class SubB extends SuperA{
	SubB(int x)
	{System.out.println("Para of SB : "+x); }

	public static void main(String args[])
	{ SubB sb=new SubB(123); }
}




