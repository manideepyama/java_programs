import java.awt.*;
import java.awt.Color;

class BLDemo{
	BLDemo(){
		Frame f=new Frame("Login");
		f.setVisible(true);
		f.setSize(300,300);
		//public void setBackground(int color);
		f.setBackground(Color.YELLOW);

		f.setLayout(new BorderLayout());
		Button btn=new Button("NORTH");
		f.add(btn,BorderLayout.NORTH);

		f.add(new Button("SOUTH"),
			BorderLayout.SOUTH);
		f.add(new Button("CENTER"),
			BorderLayout.CENTER);

	}
	public static void main(String args[])
	{ BLDemo b=new BLDemo(); }
}