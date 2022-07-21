import java.awt.event.*;
import java.awt.*;

class Mywadapter extends WindowAdapter{
	public void windowClosing(WindowEvent w)
	{ System.exit(1); }
	public void windowClosed(WindowEvent w)
	{ System.exit(1); }
}

class Test2{
	Frame f;

	Test2()
	{ f=new Frame("Window");
	  f.setVisible(true);
	  f.setSize(300,300);
	  f.setBackground(Color.GREEN);

	  //f.addWindowListener(WindowListener);
	  //addWindowListener(WindowAdapter);
	  f.addWindowListener(new Mywadapter());	  
	 }

	 public static void main(String args[])
	 { Test2 t=new Test2();}
}