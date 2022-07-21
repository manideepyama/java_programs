class Test{
	int x,y;
	void setData(int a,int b)
	{ x=a; y=b; }

	void findBiggest()
	{   if(x>y)
		   System.out.println("Biggest is : "+x);
	    else
		System.out.println("Biggest is : "+y); }

	public static void main(String args[])
	{ Test t=new Test(); 
	            t.setData(120,20);    
				t.findBiggest( ); } 
}


