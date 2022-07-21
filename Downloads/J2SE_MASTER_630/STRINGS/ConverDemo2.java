import java.lang.String;
class Convert{
	public static void main(String args[]){
           String x="100";
		   // int y=x; Error String--->int
		   int y=Integer.parseInt(x);
		   System.out.println("y val is : "+y);

           //Boxing Wrapper Class (String)
		      //public static  String valueOf(xxx);
		   int n=100;
		   String m=String.valueOf(n);
		   System.out.println("m val is : "+m);

		   boolean b=true;
		   String sb=String.valueOf(b);
		   System.out.println(sb);
	}
}












