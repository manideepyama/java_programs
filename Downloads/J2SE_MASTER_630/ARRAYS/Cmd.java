//Cmd.java
class Cmd{
	public static void main(String args[ ])
	{
		System.out.println("No.of.Arg : "+args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);

        System.out.println("All Values : ");
		/* for(int i=0;i<args.length;i++)
		      {System.out.println(args[i]);}  */

	    for(String i:args)
		   {System.out.println(i);}
	}
}