import java.awt.*;
import java.awt.event.*;

class Test implements WindowListener{
	Frame f;
	
	Test()
	{ f=new Frame("Test"); 
	  f.setVisible(true);
	  f.setSize(400,300);
	  f.setBackground(Color.GREEN); 
	  f.addWindowListener(this);}

	public static void main(String args[])
	  { Test t=new Test(); }

public  void windowOpened(WindowEvent w){}
public  void windowClosing(WindowEvent w)
	         {System.exit(1); }
public  void windowClosed(WindowEvent w)
	         {System.exit(1); }
public  void windowIconified(WindowEvent w){}
public  void 
	windowDeiconified(WindowEvent w){}
public  void 
	windowActivated(WindowEvent w){}
public  void 
	windowDeactivated(WindowEvent w){}
}


