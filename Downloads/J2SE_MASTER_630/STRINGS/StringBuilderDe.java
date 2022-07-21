class StringBilderdemo{
	public static void main(String args[]){
		java.util.Scanner s=new 
			java.util.Scanner(System.in);

		System.out.println("Enter any string : ");
		String str=s.next();

		StringBuilder sb=new StringBuilder(str);
		if(sb.reverse().toString().equals(str))
			System.out.println("Pol");
		else
			System.out.println("Not");
	}
}