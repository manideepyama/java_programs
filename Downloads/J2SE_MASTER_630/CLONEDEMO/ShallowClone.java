/* java.lang.Object
 protected native Object clone()
 throws CloneNotSupportedException; */
 

import java.lang.Cloneable;

class Test implements Cloneable{
	int x,y;
	Test(int x,int y)
	   {  this.x=x; this.y=y; }

	void getData()
	   {System.out.println("x val is : "+x);
	    System.out.println("y val is : "+y); }

   public static void main(String args[])
	   throws CloneNotSupportedException
	{ 
	   Test t1=new Test(10,20);
       System.out.println("Hcode of t1 : "+t1);
   	   
	   Test t2=(Test)t1.clone();
	   System.out.println("Hcode of t2 : "+t2);

	   System.out.println("T1 Values ");
	   t1.getData();
	   System.out.println("t2 Values  ");
	   t2.getData();

	   t1.x=111;
	   t1.y=222;
	   System.out.println("After Update of t1 ");
	   t1.getData();
	   System.out.println("t2 values ");
	   t2.getData();
	}
}







