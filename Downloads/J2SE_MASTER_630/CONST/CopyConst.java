class Sample{
	int x,y;
	Sample()
	{ x=111; y=222; }

	Sample(Sample o)
	{ x=o.x;   y=o.y; }

	void getData(){  
		System.out.println("x val is : "+x);
	System.out.println("y val is : "+y); }

	public static void main(String args[])
	{ Sample s1=new Sample(); 
	   s1.getData( );

	  Sample s2=new Sample(s1); 
	  System.out.println("S2 Data : ");
	        s2.getData( ); }
}

