class Maths{
	static int x=111; //Class Variable
	public static void main(String args[])
	{System.out.println("Maths x : "+x); }
}

class Testing{
	public static void main(String args[])
	{ System.out.println("Testing x : "+Maths.x); }
}