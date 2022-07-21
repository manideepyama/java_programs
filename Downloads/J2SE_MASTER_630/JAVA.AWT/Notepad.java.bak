import java.awt.event.*;
import java.awt.*;

class Mywadapter extends WindowAdapter{
	public void windowClosing(WindowEvent a)
	{ System.exit(1); }
	public void windowClosed(WindowEvent a)
	{ System.exit(1); }
}

class Notepad implements ActionListener{
	TextArea ta;
	Menu mf,mc;
	MenuItem mib,mii,mie,mibl,migl;
	MenuBar mb;
	Frame f;

   Notepad()
	{  f=new Frame("Note");
       f.setVisible(true);
	   f.setSize(300,300);
	   f.addWindowListener(new Mywadapter());

	   ta=new TextArea("",24,80);
	   f.add(ta);

	   mf=new Menu("Font");
	   mib=new MenuItem("Bold");
	       mib.addActionListener(this);

	   mii=new MenuItem("Italic");
	   	       mii.addActionListener(this);

	   mie=new MenuItem("Exit");
	   	       mie.addActionListener(this);

	       mf.add(mib);
		   mf.add(mii);
		   mf.add(mie);

        mc=new Menu("Colors");
		mibl=new MenuItem("Blue");
			       mibl.addActionListener(this);

		migl=new MenuItem("Green");
			       migl.addActionListener(this);

		  mc.add(mibl);
		  mc.add(migl);

		  mb=new MenuBar();
		  mb.add(mf);
		  mb.add(mc);

		  f.setMenuBar(mb);
	 }
    
	public static void main(String args[])
	{ Notepad n=new Notepad(); }

	public void actionPerformed(ActionEvent a)
	  { String bname=a.getActionCommand();
	    if(bname.equals("Blue"))
		     {ta.setBackground(Color.BLUE);}
		else if(bname.equals("Green"))
			ta.setForeground(Color.GREEN);
		else if(bname.equals("Exit"))
			System.exit(1);
		else if(bname.equals("Bold"))
		  {
			Font f=new Font("Times New Roman",
				Font.BOLD,40);
			ta.setFont(f);
		  }
		  else if(bname.equals("Italic"))
		  {
			  Font f=new Font("Times New Roman",
				  Font.ITALIC,40);
			  ta.setFont(f);
		  }
		}
}



