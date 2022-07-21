import java.lang.*;

class Cat extends Thread{
	public void run()
	{for(int i=1;i<=20;i++)
		{System.out.println("Cat ... : "+i); }
	}
}
class Rat extends Thread{
	public void run()
	{for(int i=30;i<=50;i++)
		{System.out.println("Rat ... : "+i); }
	}
}
class ThreadEx1{
	public static void main(String args[]){
		Cat c=new Cat();
		Rat r=new Rat();
		       c.start();
			   r.start();
		for(int i=60;i<=80;i++)
		{System.out.println("Main : "+i);}
	}
}







