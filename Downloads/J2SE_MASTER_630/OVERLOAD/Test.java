class Test {
void method1()
{System.out.println("M1 wout arg : "); }

void method1(int x)
{ System.out.println("M1 with int : "+x);}

void method1(int x,int y)
{System.out.println("M1 with 2 : "+x+" "+y); }

   public static void main(String args[])
	{ Test t=new Test();
                t.method1(10); 
				t.method1(10,20);
				t.method1(); 
	}
}


