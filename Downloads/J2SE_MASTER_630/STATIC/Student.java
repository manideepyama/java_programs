class Student{
	int sno; String sname; 
	static String course="Java";

	void setStudent(int sno,String sname)
	{ this.sno=sno; this.sname=sname; }

	void getStudent()
	{System.out.println("sno is : "+sno);
	System.out.println("sname is : "+sname);
	System.out.println("course is : "+course); }

	public static void main(String args[])
	{ Student s1=new Student( ); 
	                  s1.setStudent(101,"Bhawin"); 
					  s1.getStudent();

	  Student s2=new Student( ); 
	                  s2.setStudent(102,"Sahasra");
		System.out.println("S2 Object ");
		          s2.getStudent( ); }
}