import java.awt.*;
class Login{
	Login(){
		Label lblun=new Label("Username");
		Label lblpw=new Label("Password");

		TextField txtun=new TextField(20);
		TextField txtpw=new TextField(20);

		Button btnl=new Button("Login");
		Button btnc=new Button("Cancel");

		Frame frm=new Frame("Login");

		frm.add(lblun);  frm.add(txtun);
		frm.add(lblpw); frm.add(txtpw);
		frm.add(btnl);   frm.add(btnc);

		//public void setVisible(boolean);
		      frm.setVisible(true);
        //public void setSize(int,int);
		      frm.setSize(300,200); 
	}

	public static void main(String args[])
	{  Login l=new Login();}
}