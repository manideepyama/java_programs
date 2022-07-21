class Rect{
	float l,b;   //instance fields
	Rect() { l=4.0f; b=4.0f; }
	float findArea()
	{ return (l*b);}

	public static void main(String args[])
	{ Rect r=new Rect( ); 
	       float ar=r.findArea( ); 
  System.out.println("Area of Rect : "+ar); }
}