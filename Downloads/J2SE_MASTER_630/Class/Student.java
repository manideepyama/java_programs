class Student{
	int m1,m2,m3;
	void setStudent(int a,int b,int c)
	 { m1=a; m2=b; m3=c; }
	
	boolean findResult()
	{ if (m1>34 && m2>34 && m3>34)
		      return true; 
      else 
		     return false;  }

	public static void main(String args[])
	{ Student s=new Student(); 
	                  s.setStudent(20,50,50); 
		if(s.findResult())
			System.out.println("Pass");
		else
			System.out.println("Fail");
		}
}



