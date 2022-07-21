
public class Student {
	int sno;
	String sname;
	int stot;

	public static void main(String[] args) {

		Student s = new Student(101, "Ramesh", 230);
		System.out.println("Sno is : " + s.sno);
		System.out.println("Sname is : " + s.sname);
		System.out.println("Stot is : " + s.stot);

	}

	public Student(int sno, String sname, int stot) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.stot = stot;
	}

}
