class Sample{
	int x;

	public static void main(String args[]){
		Sample s1=new Sample();
		               s1.x=111;
		 System.out.println("x of s1 : "+s1.x);

		Sample s2=new Sample();
		               s2.x=222;
		System.out.println("x of s2 : "+s2.x);
		System.out.println("x of s1 : "+s1.x);
	}
}