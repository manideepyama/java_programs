class Testing {
	int x,y; //instance fields
   Testing()
	   {x=111; y=222; }

   void getData()
	 {System.out.println("x val is : "+x);
      System.out.println("y val is : "+y); }

	 protected void finalize()
	  { System.out.println("R.D.A.Logic");
	    System.out.println("Object is Deleted "); }

	 public static void main(String args[])
	{ Testing t1=new Testing( ); 
	                  t1.getData( );
					  t1=null;
					System.gc();

	   Testing t2=new Testing();
	   		System.out.println("Values of t2 ");
	                  t2.getData( ); 
    }
}