class Sample{
	static Sample s=new Sample();

	static Sample getObject() 
		         { return s; }
	
	private Sample(){ }	 
    void getData()
	  {System.out.println("Hello Dear "); }
}

class Master{
	public static void main(String args[]){
		Sample s1=Sample.getObject();
		System.out.println("Hcode of s1 : "+s1);
		s1.getData();

		Sample s2=Sample.getObject();
		System.out.println("Hcode of s2 : "+s2);
		s2.getData();
	}
}

