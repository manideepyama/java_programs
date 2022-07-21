class Triangle{
	float l,h;
	Triangle(float l,float h)
	{ this.l=l; this.h=h;}

	float findArea(){
		  return (0.5f*l*h); }

	public static void main(String args[])
	{ Triangle t=new Triangle(5.0f,5.0f); 
	         float at=t.findArea( ); 
	 System.out.println("Area of Tri : "+at);
	 }
}



