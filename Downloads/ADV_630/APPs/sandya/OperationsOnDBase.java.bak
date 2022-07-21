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
class OperationsOnDBase implements ActionListener{
 Frame f=new Frame();
 Label dno;
 Label dname;
 Label loc;
 TextField tdno;
 TextField tdname;
 TextField tloc;
 Button insert;
 Button update;
 Button clear;
 Button find;
 Button delete;
 Connection con;
 Statement st;
 ResultSet rs;
 TextArea dis;
 ResultSetMetaData rsmd;
 OperationsOnDBase(){
  dno=new Label("Dno    :");
  dname=new Label("Dname  :");
  loc=new Label("Loc     :");
  tdno=new TextField(10);
  tdname=new TextField(10);
  tloc=new TextField(10);
  insert=new Button("Insert");
  insert.addActionListener(this);
  update=new Button("Update");
  update.addActionListener(this);
  clear=new Button("Clear");
  clear.addActionListener(this);
  find=new Button("Find");
  find.addActionListener(this);
  delete=new Button("Delete");
  delete.addActionListener(this);
  dis=new TextArea(10,20);
  f.add(dno);
  f.add(tdno);
  f.add(dname);
  f.add(tdname);
  f.add(loc);
  f.add(tloc);
  f.add(insert);
  f.add(update);
  f.add(find);
  f.add(delete);
  f.add(clear);
  f.add(dis);
  f.setVisible(true);
  f.setSize(200,300);
  f.setLayout(new FlowLayout());
  f.addWindowListener(new Mywadapter());
}
public static void main(String args[]){
  OperationsOnDBase o=new OperationsOnDBase();
  o.connectivity();
}//MAIN
//BUTTONS_ACTION
public void actionPerformed(ActionEvent a){
String op=a.getActionCommand();
try{
if(op.equals("Insert"))
 {rs.moveToInsertRow();
  String vdno=tdno.getText().trim();
  rs.updateInt(1,Integer.parseInt(vdno));
  rs.updateString(2,tdname.getText().trim());
  rs.updateString(3,tloc.getText().trim());
  rs.insertRow();
  dis.setText("Record inserted..."); 
 }//INSERT

else if(op.equals("Find")){
  try{
    String vdno=tdno.getText().trim();
    while(rs.next())
     if(rs.getInt(1)==Integer.parseInt(vdno))
       break;
  //for(int c=1;c<=3;c++)
    dis.setText(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
  }
   catch(Exception e){
      dis.setText("sorry record not existed...");
       cleartext();   }
}//FIND

else if(op.equals("Clear")){
  cleartext();
  dis.setText("    ");
}//CLEAR

else if(op.equals("Delete")){
 String vdno=tdno.getText().trim();
 while(rs.next())
  if(rs.getInt(1)==Integer.parseInt(vdno))
   break;
 rs.deleteRow();
 dis.setText("Record deleted...");
}//DELETE
 
else{
 String vdno=tdno.getText().trim();
 while(rs.next())
  if(rs.getInt(1)==Integer.parseInt(vdno))
   break;
  rs.updateString(2,tdname.getText().trim());
  rs.updateString(3,tloc.getText().trim());
  rs.updateRow();
  dis.setText("record updated...");
}//UPDATE
}//TRY
catch(Exception e)
{dis.setText("sorry....");
 tdno.setText(" ");
 tdname.setText("   ");
 tloc.setText("   ");
} 
cleartext();
}//BUTTON_ACTIONS_END
void connectivity()
{       try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs=st.executeQuery("select deptno,dname,loc from dept");  
}
catch(Exception e)
{System.out.println("sorry...");}
        
}//CONNECTIVITY_JDBC
void cleartext()
{try{
tdno.setText(" ");
 tdname.setText("   ");
 tloc.setText("   ");
 rs.beforeFirst();
}
catch(Exception e){
 System.out.println("sorry...");}
}

}//CLASS






