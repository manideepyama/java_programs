//java.lang.Thread
   //public static void sleep(long mills) throws InterruptedException

class Cat extends Thread{
	public void run()
	{ 
		try{ sleep(10000); }
		catch(InterruptedException ie)
		   {ie.printStackTrace(); }
		for(int i=1;i<=10;i++)
		{System.out.println("Cat ... : "+i); }
	}
}
class Rat extends Thread{
	public void run(){
		for(int i=20;i<=30;i++)
		{System.out.println("Rat ... : "+i); }
	}
}
class SleepDemo{
	public static void main(String args[])
		   throws InterruptedException {		
		Cat c=new Cat();
		Rat r=new Rat();
		        c.start();
				r.start();

        Thread.sleep(5000);
		for(int i=40;i<=50;i++)
		  {System.out.println("Main ... : "+i); }
	}
}
