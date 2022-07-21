import java.awt.*;
class Student{
	Student(){
		Frame f=new Frame("Student");
		f.setVisible(true);
		f.setSize(400,300);
		f.setLayout(new GridLayout(2,2));
		f.setBackground(Color.GREEN);

		Panel p1=new Panel();
		p1.setLayout(new FlowLayout());
		Label lblsno=new Label("Sno");
		TextField txtsno=new TextField(10);
		p1.add(lblsno);
		p1.add(txtsno);
		f.add(p1);

		//Creating RadioButton
CheckboxGroup cbg=new CheckboxGroup();
Checkbox cm=new Checkbox("Male",true,cbg);
Checkbox cf=new Checkbox("Female",false,cbg);

Panel p2=new Panel();
p2.setLayout(new GridLayout(6,1));
p2.add(cm);
p2.add(cf);
f.add(p2);

Panel p3=new Panel();
p3.setLayout(new GridLayout(6,1));
Checkbox ckm=new Checkbox("Music");
Checkbox cks=new Checkbox("Sports",true);
           p3.add(ckm);
		   p3.add(cks);
           f.add(p3);

Panel p4=new Panel();
p4.setLayout(new FlowLayout());
Label lc=new Label("City");
Choice c=new Choice();
        c.add("Hyd");
		c.add("Vizag");
		c.add("Kadapa");
	
	p4.add(lc);
	p4.add(c);
    
		  f.add(p4);
	}
	public static void main(String args[])
	{ Student s=new Student();}
}