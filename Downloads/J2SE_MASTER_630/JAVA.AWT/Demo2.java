import java.awt.*;
import java.awt.event.*;

class Demo2 implements ActionListener{
	TextField tf;
	Button btnc,btncl;
	Frame f;

	Demo2(){
		f=new Frame("Demo2");
		f.setVisible(true);
		f.setSize(300,200);
		f.setBackground(Color.GREEN);
		f.setLayout(new FlowLayout());

		tf=new TextField(36);
		btnc=new Button("Click");
		btnc.addActionListener(this);

		btncl=new Button("Clear");
		btncl.addActionListener(this);

		f.add(tf); f.add(btnc); f.add(btncl);
	}

	public static void main(String args[])
	{ Demo2 d=new Demo2(); }

	public void actionPerformed(ActionEvent a){
        String bname=a.getActionCommand();
		//tf.setText(bname);
		
		if(bname.equals("Click"))
		{
	     	java.util.Date d=new java.util.Date();
	 	   tf.setText(" "+d);  //setText(String);
		}
		else if(bname.equals("Clear"))
			tf.setText("  ");  
	}
}