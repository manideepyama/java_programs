class SuperA{
	int x=100; //instance field
}
class SubB {
	  int       y   =    200;
SuperA    sa = new SuperA( ); }

class Has_AEx1{
	public static void main(String args[]){
	      SubB sb=new SubB( );

 System.out.println("y val is : "+sb.y);
 System.out.println("SA val is : "+sb.sa);
 System.out.println("x val is : "+sb.sa.x);
	}
}



