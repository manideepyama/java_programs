class Test {
	public static void main(String args[])
	{  try{
		System.out.println(args[0]);
		System.out.println(args[1]); }

   catch(ArrayIndexOutOfBoundsException a)
	{ System.out.println("Sorry MyDear ");
       System.out.println("Plz Enter 2 values "); }
	}
}