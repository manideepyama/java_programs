import java.awt.*;
import java.awt.event.*;  
import java.sql.*;
class App1 extends Frame implements ActionListener
{   
  Label deptno,dname,loc,out,t;
  TextField d1,d2,d3;
  Button in,up,de,cl,fi;
  Connection con=null;
  Statement st=null;
  ResultSet rs=null;
  App1()
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
    in=new Button("Insert");
    up=new Button("Update");
    de=new Button("Delete");
    cl=new Button("Clear");
    fi=new Button("Find");
    in.setBounds(30,200,70,20); 
    up.setBounds(130,200,70,20); 
    de.setBounds(230,200,70,20); 
    cl.setBounds(60,230,70,20); 
    fi.setBounds(160,230,70,20);
    add(in);
    add(up);
    add(de);
    add(cl);
    add(fi);
    in.addActionListener(this);
    up.addActionListener(this);
    de.addActionListener(this);
    cl.addActionListener(this);
    fi.addActionListener(this);
    out=new Label();
    out.setBounds(10,300,300,50);
    add(out);
    t=new Label();
    add(t);
    setSize(400,400);
    setVisible(true);
    setTitle("IFURD operations on dept table");
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
      if(str.equals("Insert"))
      {
         String num=d1.getText();
         String name=d2.getText();
         String loca=d3.getText();
         if(num.isEmpty()||name.isEmpty()||loca.isEmpty())
            out.setText("Enter valid values..");
         else
         {
          try
          {
           rs.moveToInsertRow();
           rs.updateString(1,num);
           rs.updateString(2,name);
           rs.updateString(3,loca);
           rs.insertRow();
           out.setText("1 record inserted successfully..");
           rs=st.executeQuery("select deptno,dname,loc from dept");
          }
          catch(Exception qw) 
          {
           out.setText("Cannot insert Duplicate values..");
           System.out.println(qw);
          }
         }
         d1.setText("");
         d2.setText("");
         d3.setText("");
      }
      else
       if(str.equals("Clear"))
       {
         d1.setText(" ");
         d2.setText(" ");
         d3.setText(" ");
         out.setText("");
         d1.setText("");
         d2.setText("");
         d3.setText("");
       }
       else
        if(str.equals("Update"))
        {
          String no=d1.getText();
          String name=d2.getText();
          String loca=d3.getText();
          int num;
          if(no.isEmpty() && name.isEmpty() && loca.isEmpty())
            out.setText("Enter the correct values to update the record..");
          else
          {
            try
            {
             num=Integer.parseInt(no.trim());
             rs.beforeFirst();
             while(rs.next())
             {
              if(rs.getInt(1)==num)
              {
                rs.updateString(2,name);
                rs.updateString(3,loca);
                break;
              }
              else
               if(name.equals(rs.getString(2)))
               {
                 rs.updateInt(1,num);
                 rs.updateString(3,loca);
                 break;
               }
              else
               if(loca.equals(rs.getString(3)))
               {
                 rs.updateString(2,name);
                 rs.updateInt(1,num);
                 break;
               }
             }
             rs.updateRow();
             if(rs.isAfterLast())
               out.setText("Record you wish to update is not found..");
             else
               out.setText("Record updated successfully..");
            } 
            catch(Exception as) 
            {
             out.setText("Enter correct values to update the record..");
             System.out.println(as);
            }
            d1.setText("");
            d2.setText("");
            d3.setText(""); 
          }
        }
       else
        if(str.equals("Delete"))
        {
          String num=d1.getText();
          String name=d2.getText();
          String loca=d3.getText();
          try
          {
           int count=0;
           rs.absolute(1);
           if(rs.getRow()==0)
             out.setText("The table is empty..Cannot delete any records!");
           else
           {
            rs.beforeFirst();
            if(!num.isEmpty())
            {
             while(rs.next())
              if(num.equals(rs.getString(1)))
                break;
             rs.deleteRow();
             count++;
             out.setText(count+" Record deleted..");
            }

            if(num.isEmpty())
            {
             if(name.isEmpty() && loca.isEmpty())
                out.setText("Enter values to delete the record..");
             else
              if(!name.isEmpty() && !loca.isEmpty())
              {
               while(rs.next())
               {
                if(name.equals(rs.getString(2)) && loca.equals(rs.getString(3)))
                {
                  rs.deleteRow();
                  count++;
                } 
               }
               out.setText(count+" Record deleted..");
              }
             else
              if(name.isEmpty() && !loca.isEmpty())
              {
               while(rs.next())
                if(loca.equals(rs.getString(3)))
                {
                  rs.deleteRow();
                  count++;
                }
               out.setText(count+" Record deleted..");
              }
             else
              if(!name.isEmpty() && loca.isEmpty())
              {
               while(rs.next())
                if(name.equals(rs.getString(2)))
                {
                  rs.deleteRow();
                  count++;
                }
               out.setText(count+" Record deleted..");
              }               
            }
            if(count==0 && rs.isAfterLast())
             out.setText("Record not found..");
            }
          }
          catch(SQLException zx)
          {
            System.out.println(zx);
          }
          d1.setText("");
          d2.setText("");
          d3.setText("");
        } 
       else
        if(str.equals("Find"))
        {
          String num=d1.getText();
          String name=d2.getText();
          String loca=d3.getText();
          try
          {
           int flag=0;
           rs.beforeFirst();
           if(!num.isEmpty())
           {
             while(rs.next())
              if(num.equals(rs.getString(1)))
                break;
           }
           else
           {
             if(name.isEmpty() && loca.isEmpty())
             {
               out.setText("Enter values to search the record..");
               flag=1;
             }
             else
              if(!name.isEmpty() && !loca.isEmpty())
              {
               while(rs.next())
                if(name.equals(rs.getString(2)) && loca.equals(rs.getString(3)))
                  break;
              }
             else
              if(name.isEmpty() && !loca.isEmpty())
              {
               int count=0;
               while(rs.next())
                if(loca.equals(rs.getString(3)))
                    count++;
               if(count>=2)
               {
                 out.setText("Found "+count+" records..Cannot find the right record~");
                 flag=1;
               }
               else
                if(count==1)
                {
                 rs.beforeFirst();
                 while(rs.next())
                   if(loca.equals(rs.getString(3)))
                      break;
                }
              }
             else
              if(!name.isEmpty() && loca.isEmpty())
              {
               int count=0;
               while(rs.next())
                if(name.equals(rs.getString(2)))
                  count++;
               if(count>=2)
               {
                 out.setText("Found "+count+" records..Cannot find the right record~");
                 flag=1;
               }
               else
                if(count==1)
                {
                 rs.beforeFirst();
                 while(rs.next())
                   if(name.equals(rs.getString(2)))
                      break;
                }
              }            
            }
           if(flag==0)
           {
             d1.setText(rs.getString(1));
             d2.setText(rs.getString(2));    
             d3.setText(rs.getString(3));
             out.setText("Found the record..");
           }
          }
          catch(SQLException op)
          {
            out.setText("Record does not exist..");
            System.out.println(op);
          }
        }
  }
  public static void main(String args[]) throws Exception
  {  
    new App1();
  }
}