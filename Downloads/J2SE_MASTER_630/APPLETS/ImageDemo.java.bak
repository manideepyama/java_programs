import java.applet.Applet;
import java.awt.Image;
import java.awt.Graphics;

/*<applet code="ImageDemo" width="400" height="400">
</applet> */

public class ImageDemo extends Applet	{	
   Image i1,i2;  

  public void init()
   { i1=getImage(getDocumentBase(),"m1.png"); 
     i2=getImage(getDocumentBase(),"m2.png"); }
  
  public void paint(Graphics g)
	{  
	  for(int i=1;i<=1000;i++)
		{
	  try{	    
		Thread.sleep(1000);
	    g.drawImage(i1,100,100,null); 
		Thread.sleep(1000);
        g.drawImage(i2,100,100,null);   }
		catch(InterruptedException ie)
		   { ie.printStackTrace(); }
		}
	}
}













