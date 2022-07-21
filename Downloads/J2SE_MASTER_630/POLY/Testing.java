class SuperA{   }
class SubB extends SuperA{  }

class Testing	{
public static void main(String args[])
{
		SuperA a=new SuperA( );
		SubB b=new SubB();
		          a=b;
				  //b=a;  invalid 
				  b=(SubB)a;
	}
}