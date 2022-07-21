class Sample
{  int x; 
    int y;  }

class ObjectDemo
{	public static void main(String args[])
	{	 Sample s1=new Sample( );
		 System.out.println(s1);
		 s1.x=111;  
		 s1.y=222;
		 System.out.println("x val is : "+s1.x);
		 System.out.println("y val is : "+s1.y);
	}
}


