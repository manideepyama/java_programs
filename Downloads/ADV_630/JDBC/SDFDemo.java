import java.text.SimpleDateFormat;
import java.util.Scanner;

class SDFDemo{
	public static void main(String args[])
		throws Exception
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter DOB dd-MM-yyyy ");
		String dob=s.next();
		System.out.println("DOB : "+dob);

		SimpleDateFormat sdf=
			  new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date ud=sdf.parse(dob);
		System.out.println("Date is : "+ud);

		long time=ud.getTime();
		java.sql.Date jd=new java.sql.Date(time);
		System.out.println("JDate is : "+jd);


	}
}