class Demo {
	void greetings()
	{ System.out.println("Hello ");
	  System.out.println("My Dear "); }

	 void sum(int x,int y)  //x,y formal para
	   {     int s;
		     s=x+y;
			 System.out.println("Sum is : "+s); }

	   int sq(int x)
	    { int s;
	       s=x*x; return s; }

   public static void main(String args[])
	{ Demo d=new Demo();
                  d.greetings( );
				  d.sum(10,20); //10 and 20 actual
				  d.sum(5+5,10*2);
		    	   int n=10,m=20;
		           d.sum(n,m);
		int r=d.sq(9);
		System.out.println("Res : "+r); 
	}
}





