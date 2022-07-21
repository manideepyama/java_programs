class Master{
	void print()  //instance mtd
	{System.out.println("Hello"); }
}
class Systems{
	static Master out=new Master(); }

class Testing{
	public static void main(String args[])
	{  Systems.out.print(); }
}