class Sample{
	int x,y;
	void setData(int a,int b)
	{ x=a; y=b; }

	void copy(Sample o)
	{ x=o.x;  y=o.y;  }

	void getData()
	{System.out.println("x val is : "+x);
	  System.out.println("y val is : "+y); }

	public static void main(String args[])
	{ Sample s1=new Sample();
	                  s1.setData(110,220); 
					  s1.getData();

	  Sample s2=new Sample( ); 
	                 s2.copy(s1); 
	System.out.println("After copy ");
	s2.getData(); }
}




