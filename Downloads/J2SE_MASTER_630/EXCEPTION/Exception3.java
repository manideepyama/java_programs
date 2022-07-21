class Exception3 {
	public static void main(String args[])
	{
		try{
		int x=Integer.parseInt(args[0]); 
		System.out.println("Given value : "+x); }

    /* Upto JDK1.6
	catch(ArrayIndexOutOfBoundsException a)
		   {System.out.println("Plz Enter 1 value "); }
  	
	 catch(NumberFormatException ne)
	  {System.out.println("Plz Enter int value "); } */

	 //JDK1.7
	 catch(ArrayIndexOutOfBoundsException |
		 NumberFormatException n)
		{ System.out.println("Plz Enter 1 int value "); }
	}
}