class Test{
	int x,y;
	Test(int x,int y)
	   {  this.x=x; this.y=y; }

	void getData()
	   {System.out.println("x val is : "+x);
	    System.out.println("y val is : "+y); }

   public static void main(String args[])
	{ Test t1=new Test(10,20);
	           Test t2=t1; 
	   System.out.println("Hcode of t1 : "+t1);
	   System.out.println("Hcode of t2 : "+t2);

	    System.out.println("Values of t1 : ");
		t1.getData();

	    System.out.println("Values of t2 : ");
		t2.getData();

		t1.x=111;
		t1.y=222;
		System.out.println("After Update of t1 : ");
		t1.getData();
		System.out.println("Data from t2 : ");
		t2.getData();
	   
	}
}