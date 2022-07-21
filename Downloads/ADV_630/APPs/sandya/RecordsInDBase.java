import java.awt.*;
import java.sql.*; 
import java.awt.event.*;
class Mywadapter extends WindowAdapter
{
   public void windowClosing(WindowEvent a)
      {System.exit(1);}
    public void windowClosed(WindowEvent a)
      {System.exit(1);}
}
class RecordsInDBase implements ActionListener{
 Frame f=new Frame();
 Label dno;
 Label dname;
 Label loc;
 TextField tdno;
 TextField tdname;
 TextField tloc;
 Button first;
 Button last;
 Button next;
 Button previous;
 Connection con;
 Statement st;
 ResultSet rs;
 RecordsInDBase(){
  dno=new Label("Dno    :");
  dname=new Label("Dname  :");
  loc=new Label("Loc     :");
  tdno=new TextField(10);
  tdname=new TextField(10);
  tloc=new TextField(10);
  first=new Button("First");
  first.addActionListener(this);
  next=new Button("Next");
  next.addActionListener(this);
  previous=new Button("Previous");
  previous.addActionListener(this);
  last=new Button("Last");
  last.addActionListener(this);
  f.add(dno);
  f.add(tdno);
  f.add(dname);
  f.add(tdname);
  f.add(loc);
  f.add(tloc);
  f.add(first);
  f.add(next);
  f.add(previous);
  f.add(last);
  f.setVisible(true);
  f.setSize(200,300);
  f.setLayout(new FlowLayout());
  f.addWindowListener(new Mywadapter());
 }//CONSTRUCTOR
 public static void main(String args[]) throws Exception{
   RecordsInDBase rid=new RecordsInDBase();
   rid.connectivity();
}//MAIN

void connectivity()
{       try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs=st.executeQuery("select deptno,dname,loc from dept");  
        rs.first();
        load();
}
catch(Exception e)
{System.out.println("sorry...");}
}//CONNECTIVITY_JDBC
void load() throws Exception{
  tdno.setText(rs.getString(1));
  tdname.setText(rs.getString(2));
  tloc.setText(rs.getString(3));
}//LOAD

public void actionPerformed(ActionEvent a){
String op=a.getActionCommand();
try{
 if(op.equals("First"))
  rs.first();
 else if(op.equals("Last"))
  rs.last();
 else if(op.equals("Next")){
  if(!rs.isLast())
     rs.next();}
 else
   if(!rs.isFirst())
     rs.previous();
load();
}//TRY
catch(Exception e){
 System.out.println("sorry...");
}//CATCH
}//END_OF_BUTTON_ACTIONS
 
}//CLASS










