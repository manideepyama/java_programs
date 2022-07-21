class ATM{
	public synchronized void wd(String s)
	{  for(int i=1;i<=10;i++)
		   {
		    try{ Thread.sleep(1000); }
			catch(InterruptedException a)
			   {a.printStackTrace(); }
			System.out.println("Wd By Mr|Mrs. "+s); 
		   }
	}
}
class Thread1 extends Thread{
    ATM a;
	Thread1(ATM a){ this.a=a; }
	public void run(){ a.wd("Ramesh"); }
}
class Thread2 extends Thread{
    ATM a;
	Thread2(ATM a){ this.a=a; }
	public void run(){ a.wd("Suresh"); }
}
class SynDemo{
	public static void main(String args[]){
		ATM a=new ATM();
		Thread1 t1=new Thread1(a);
		Thread2 t2=new Thread2(a);
		                t1.start();
						t2.start();
	}
}