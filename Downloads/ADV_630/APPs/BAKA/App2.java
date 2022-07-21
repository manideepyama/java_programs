import java.awt.*;
import java.awt.event.*;  
import java.sql.*;
class App2 extends Frame implements ActionListener
{   
  Label deptno,dname,loc,out,t;
  TextField d1,d2,d3;
  Button fi,ne,pr,la;
  Connection con=null;
  Statement st=null;
  ResultSet rs=null;
  App2()
  {
    deptno=new Label("deptno:");
    dname=new Label("dname:");
    loc=new Label("loc:");
    deptno.setBounds(50,50,100,20); 
    dname.setBounds(50,80,100,20); 
    loc.setBounds(50,110,100,20);
    d1=new TextField();
    d2=new TextField();
    d3=new TextField();
    d1.setBounds(150,50,100,20); 
    d2.setBounds(150,80,100,20); 
    d3.setBounds(150,110,100,20); 
    add(deptno);
    add(d1);
    add(dname);
    add(d2);
    add(loc);
    add(d3);
    fi=new Button("First");
    ne=new Button("Next");
    pr=new Button("Previous");
    la=new Button("Last");
    fi.setBounds(30,200,70,20); 
    ne.setBounds(130,200,70,20); 
    pr.setBounds(160,230,70,20); 
    la.setBounds(60,230,70,20); 
    add(fi);
    add(ne);
    add(pr);
    add(la);
    fi.addActionListener(this);
    ne.addActionListener(this);
    pr.addActionListener(this);
    la.addActionListener(this);
    out=new Label();
    out.setBounds(10,300,300,50);
    add(out);
    t=new Label();
    add(t);
    setSize(400,400);
    setVisible(true);
    setTitle("Scrollable Operations on department table");
    setLayout(null);
    addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){System.exit(0);}
    });
   try
   {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
    st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    rs=st.executeQuery("select deptno,dname,loc from dept");
   }
   catch(Exception q) 
   {
     out.setText("Error while connecting or registering the driver..");
     System.out.println(q);
   }
  }
  
  public void actionPerformed(ActionEvent e)
  {
      String str=e.getActionCommand();
      out.setText("");
      if(str.equals("First"))
      {
        try
          {
            rs.first();
            d1.setText(rs.getString(1));
            d2.setText(rs.getString(2));
            d3.setText(rs.getString(3));
            out.setText(rs.getRow()+"st row values..");
          }
          catch(SQLException zx)
          {
            System.out.println(zx);
          }
      }
      else
       if(str.equals("Next"))
       {
         try
          {
            rs.next();
            if(rs.isAfterLast())
            {
              d1.setText("");
              d2.setText("");
              d3.setText("");
              out.setText("Reached After Last Record..");
            }
            else
            {
              d1.setText(rs.getString(1));
              d2.setText(rs.getString(2));
              d3.setText(rs.getString(3));
              out.setText(rs.getRow()+" row values..");
            }
          }
          catch(SQLException zx)
          {
            System.out.println(zx);
          }
       }
       else
        if(str.equals("Previous"))
        {
          try
          {
            rs.previous();
            if(rs.isBeforeFirst())
            {
              d1.setText("");
              d2.setText("");
              d3.setText("");
              out.setText("Reached Before First Record..");
            }
            else
            {
              d1.setText(rs.getString(1));
              d2.setText(rs.getString(2));
              d3.setText(rs.getString(3));
              out.setText(rs.getRow()+" row values..");
            }
          }
          catch(SQLException zx)
          {
            System.out.println(zx);
          }
        }
       else
        if(str.equals("Last"))
        {
          try
          {
            rs.last();
            d1.setText(rs.getString(1));
            d2.setText(rs.getString(2));
            d3.setText(rs.getString(3));
            out.setText(rs.getRow()+" row values..");
          }
          catch(SQLException zx)
          {
            System.out.println(zx);
          }
        } 
  }
  public static void main(String args[]) throws Exception
  {  
    new App2();
  }
}