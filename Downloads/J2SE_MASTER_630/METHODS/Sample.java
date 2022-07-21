class Sample{
	int x,y; //instance field
	void setData()
	{ x=10;  y=20; }

	void getData()
	{ System.out.println("x val is : "+x);
	  System.out.println("y val is : "+y); }

	public static void main(String args[])
	{ Sample s=new Sample(); 
	                 s.setData( ); 
					 s.getData(); }
}



