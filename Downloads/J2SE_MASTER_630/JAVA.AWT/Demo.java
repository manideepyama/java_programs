import java.awt.*;
import java.awt.event.*;

class Demo implements ActionListener {
	TextField tf;
	Demo(){
		Frame f=new Frame("Demo");
		             f.setVisible(true);
					 f.setSize(300,150);
					 f.setLayout(new FlowLayout());
					 f.setBackground(Color.CYAN);

		 tf=new TextField(30);
		Button btn=new Button("Click");

         btn.addActionListener(this);

		             f.add(tf);
					 f.add(btn);					
	}//const

	public void actionPerformed(ActionEvent a)
	     {  tf.setText("Hello...."); }
	
	public static void main(String args[])
	{ Demo d=new Demo(); } //main

}//class