class SuperA{
	SuperA(int x)
	{System.out.println("Para of SA : "+x); }
}
class SubB extends SuperA{
	SubB(int x)
	{   super(x);
		System.out.println("Para of SB "+x); }

	public static void main(String args[])
	{ SubB sb=new SubB(123); }
}






