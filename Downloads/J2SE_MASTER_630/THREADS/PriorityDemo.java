class Cat extends Thread{
	public void run(){
		for(int i=1;i<=10;i++)
		{ System.out.println("Cat .... "+i);}
	}
}
class Rat extends Thread{
	public void run(){
		for(int i=20;i<=30;i++)
		{ System.out.println("Rat .... : "+i);}
	}
}
class PriorityDemo{
	public static void main(String args[])
	{
	Cat c=new Cat();
	Rat r=new Rat();
	   //public int getPriority();
	        int pc=c.getPriority();
			int pr=r.getPriority();
	
   Thread t=Thread.currentThread();
        int pm=t.getPriority();

  System.out.println("Priority of rat : "+pr);
  System.out.println("Priority of cat : "+pc);
  System.out.println("Priority of main : "+pm);
         //public void setPriority(int priority);
		 r.setPriority(10);
 System.out.println("Priority of Rat : "+r.getPriority());

               
	        c.start();
		      r.start();
	for(int i=40;i<=50;i++)
		{System.out.println("Main .... : "+i); }  
	}
}