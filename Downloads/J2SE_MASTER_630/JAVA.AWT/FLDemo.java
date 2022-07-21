import java.awt.*;
class FLDemo{
	FLDemo(){
		Frame f=new Frame("Login");
		f.setVisible(true);
		f.setSize(300,160);
		f.setBackground(Color.CYAN); 
		                          //java.awt.Color

		Label lblun=new Label("Username");
		Label lblpw=new Label("Password ");

		TextField txtun=new TextField(20);
		TextField txtpw=new TextField(20);
     //java.awt.TextField
	    //public void setEchoChar(char);
		txtpw.setEchoChar('$');


		Button btnl=new Button("Login");
		Button btnc=new Button("Cancel");

		f.setLayout(new FlowLayout());
		f.add(lblun); f.add(txtun);
		f.add(lblpw); f.add(txtpw);
		f.add(btnl); f.add(btnc);
	}
	public static void main(String args[])
	{ FLDemo f=new FLDemo(); }
}