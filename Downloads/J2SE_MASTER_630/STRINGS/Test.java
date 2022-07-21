class Test{
	public static void main(String args[]){
		String s1="Sai";
		String s2="Sai";
		String s3=new String("Sai");

		//if(s1==s3) //Hashcode of String
		//if(s1.equals(s2))
		if(s1.equals(s3))
			System.out.println("B R Same ");
		else
			System.out.println("B R N Same");
	}
}