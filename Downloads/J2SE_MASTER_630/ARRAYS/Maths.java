class Maths{
	int sum(int...x)  // x is SDA
	   { int s=0; for(int i:x) 
		                 { s=s+i;} return s; 	}
    
   public static void main(String args[])
	{ Maths m=new Maths( );
       System.out.println
		   ("sum is : "+m.sum(10,20));

	   System.out.println
		   ("sum is : "+m.sum(10,20,30));
	   
	   System.out.println
		   ("Sum is : "+m.sum());

	   int a[]={10,20,30,40,50};
	   System.out.println
		   ("Sum is : "+m.sum(a));
   
      System.out.println
		  ("sum is : "+m.sum(new int[]{10,20,30}));	   
    }	
}


