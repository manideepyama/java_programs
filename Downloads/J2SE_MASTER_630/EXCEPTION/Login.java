class MyLoginException extends RuntimeException
{
	MyLoginException(String s)
	{ super(s); }
}

//public boolean equals(String)
class Login{
	public static void main(String args[]){
		String un=args[0];
		String pw=args[1];
		if(un.equals("sssit") && pw.equals("kphb"))
			System.out.println("Valid User ");
		else
		{
			try{ 
			throw new 
				MyLoginException("Invalid Un Or PW"); }

			catch(MyLoginException me)
			  { System.out.println
				        ("Sorry Unable to Continue ... ");
			    System.out.println(me); 
			}
		}
	}
}
