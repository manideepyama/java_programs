import java.lang.*;
                    //public String getName()
class Child extends Thread {
	public void run(){ 
	  for(int i=1;i<=10;i++){
		String tname=getName();
		System.out.println("Thread_Name : "+tname);
	     }
	 }
}

class MainThread{
	public static void main(String args[])
	{
		Child c1=new Child();
		Child c2=new Child();
		           //public void setName(String);
				  c1.setName("Ramesh");
				  c2.setName("Kumar");
		          c1.start();
				  c2.start();
//In main
//java.lang.Thread
    //public static Thread currentThread();
	Thread mt=Thread.currentThread();
	System.out.println
		("Main thread Name : "+mt.getName());
		
	}
}
