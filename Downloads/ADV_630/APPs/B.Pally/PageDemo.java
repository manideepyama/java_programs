import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.sql.*;
import java.io.*;

class wd extends WindowAdapter
{
	public void windowClosing(WindowEvent w)
	{
		System.exit(1);
	}
	public void windowClosed(WindowEvent w)
	{
		System.exit(1);
	}
}
class PageDemo implements ActionListener
{
	Frame f;
	Label lbldeptno,lbldeptname,lblloc,lblall,lblnote;
    TextField tfdeptno,tfdeptname,tfloc;
    Button btni,btnu,btnd,btnf,btnc;
	Connection con=null;
	PreparedStatement pst=null;

	PageDemo()
	{
		f=new Frame("DEPARTMENT DATABASE");
		f.setVisible(true);
		f.setSize(555,300);
		f.setBackground(Color.CYAN);
		f.setLayout(new FlowLayout());
		f.addWindowListener(new wd());
		Font fo=new Font("Times new roman",Font.BOLD,13);

		lbldeptno=new Label("DEPARTMENT NO.    ");
		lbldeptname=new Label("DEPARTMENT NAME");
		lblloc=new Label("LOCATION               ");
		lblall=new Label("                            ENTER THE ABOVE DETAILS !                                    ");
		lblnote=new Label("FOR UPDATE , ENTER DEPARTMENT NO. AND UPDATED NAME AND LOCATION !");

		tfdeptno=new TextField(50);
        tfdeptname=new TextField(50);
		tfloc=new TextField(50);

		btni=new Button("Insert");
		btnu=new Button("Update");
		btnd=new Button("Delete");
		btnf=new Button("Find");
		btnc=new Button("Clear");
		
		f.add(lbldeptno);f.add(tfdeptno);
		f.add(lbldeptname);f.add(tfdeptname);
		f.add(lblloc);f.add(tfloc);
		f.add(btni);
		f.add(btnu);
		f.add(btnd);
		f.add(btnf);
		f.add(btnc);
		f.add(lblall);
		f.add(lblnote);
		lbldeptno.setFont(fo);
		lbldeptname.setFont(fo);
		lblloc.setFont(fo);
		lblall.setFont(fo);
		btni.setFont(fo);
		btnu.setFont(fo);
		btnd.setFont(fo);
		btnf.setFont(fo);
		btnc.setFont(fo);

		btni.addActionListener(this);
        btnu.addActionListener(this);
		btnd.addActionListener(this);
		btnf.addActionListener(this);
		btnc.addActionListener(this);
        
		try
		{
	    Properties p = new Properties();
		FileInputStream fis = 
			new FileInputStream("op.prop");
		p.load(fis);
		String driver = p.getProperty("DRIVER");
        String url = p.getProperty("URL");
		String username = p.getProperty("USERNAME");
		String password = p.getProperty("PASSWORD");
		String table = p.getProperty("TABLE");

		Class.forName(driver);
		con = DriverManager.getConnection(url,username,password);
		}
		catch (Exception se)
		{
			se.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent a)
	{
		String call=a.getActionCommand();
		String deptno = tfdeptno.getText();
		String deptname = tfdeptname.getText();
		String loc = tfloc.getText();

		if(call.equals("Insert"))
		{
			if(deptno.equals("") || deptname.equals("") || loc.equals(""))
			{
			lblall.setText("                               COMPLETE THE ABOVE DETAILS !");
			}
			else
			{
				try
				{   
					int deptno1=Integer.parseInt(deptno);
					pst = con.prepareStatement("INSERT INTO DEPT VALUES(?,?,?)");
					pst.setInt(1,deptno1);
					pst.setString(2,deptname);
                    pst.setString(3,loc);
					pst.executeUpdate();
					lblall.setText("                                            RECORD INSERTED !");
					tfdeptno.setText("\0");
					tfdeptname.setText("\0");
					tfloc.setText("\0");
					
				}
				catch (Exception sql1)
				{
					lblall.setText("                                           INVALID RECORD !");
				    tfdeptno.setText("\0");
				    tfdeptname.setText("\0");
		            tfloc.setText("\0");
					sql1.printStackTrace();
				}
			}
		}
		else if(call.equals("Delete"))
		{
			if(deptno.equals("") || deptname.equals("") || loc.equals(""))
			    {
					lblall.setText("                               COMPLETE THE ABOVE DETAILS !");
			    }
			else
			{
			 try																					
			 {
				PreparedStatement pst1=con.prepareStatement("DELETE FROM DEPT WHERE deptno=? and upper(dname)=upper(?) and upper(loc)=upper(?)");
				int deptno1=Integer.parseInt(deptno);
				pst1.setInt(1,deptno1);
				pst1.setString(2,deptname);
				pst1.setString(3,loc);
				int c=pst1.executeUpdate();

				if(c==0)
					{
						lblall.setText("                                           RECORD NOT FOUND !");
					}
					else
					{
						lblall.setText("                                             RECORD DELETED !");
					}
					tfdeptno.setText("\0");
					tfdeptname.setText("\0");
					tfloc.setText("\0");
			 }
			 catch (Exception sql2)
			 {
				lblall.setText("                                           INVALID RECORD !");
				tfdeptno.setText("\0");
				tfdeptname.setText("\0");
		        tfloc.setText("\0");
				sql2.printStackTrace();
		     }
			}
		}
		else if(call.equals("Update"))
		{
			if(deptno.equals("") || deptname.equals("") || loc.equals(""))
			{
				lblall.setText("                               COMPLETE THE ABOVE DETAILS !");
			}
			else
			{
				try
				{
					int deptno1=Integer.parseInt(deptno);
				    pst=con.prepareStatement("SELECT * FROM DEPT WHERE DEPTNO=?");
					pst.setInt(1,deptno1);
					ResultSet rs=pst.executeQuery();
					if(rs.next())
					{
						pst=con.prepareStatement("UPDATE DEPT SET DNAME=?,LOC=? WHERE DEPTNO=?");
						pst.setString(1,deptname);
						pst.setString(2,loc);
						pst.setInt(3,deptno1);
						pst.executeUpdate();
						lblall.setText("                                             RECORD UPDATED !");
						tfdeptno.setText("\0");
						tfdeptname.setText("\0");
						tfloc.setText("\0");

					}
					else
					{
					    lblall.setText("                                           RECORD NOT FOUND !");
    				}
				}
				catch (Exception sql4)
				{
					lblall.setText("                                           INVALID RECORD !");
				    tfdeptno.setText("\0");
				    tfdeptname.setText("\0");
		            tfloc.setText("\0");
					sql4.printStackTrace();
				}
			}
		}
		else if(call.equals("Find"))
		{
			if(deptno.equals("") && deptname.equals("") && loc.equals(""))
			{
				lblall.setText("                               COMPLETE THE ABOVE DETAILS !");
			}
			else
			{
			   try
			   {
				   if(!deptno.equals(""))
				   {
					   int deptno1=Integer.parseInt(deptno);
					   pst=con.prepareStatement("SELECT * FROM DEPT WHERE deptno=?");
					   pst.setInt(1,deptno1);
					   pst.executeQuery();
					   ResultSet rs=pst.getResultSet();
					   if(rs.next())
					   {
						   tfdeptname.setText(rs.getString(2));
					       tfloc.setText(rs.getString(3));
					       lblall.setText("                                                RECORD FOUND !");
					   }
					   else
					   {
						   lblall.setText("                                           RECORD NOT FOUND !");
					   }
				   }
				   else if(!deptname.equals(""))
				   {   
					   pst=con.prepareStatement("SELECT * FROM DEPT WHERE upper(dname)=upper(?)");
					   pst.setString(1,deptname);
					   pst.executeQuery();
                       ResultSet rs=pst.getResultSet();
					   if(rs.next())
					   {
						   tfdeptno.setText(rs.getInt(1)+"");
					       tfloc.setText(rs.getString(3));
					       lblall.setText("                                                RECORD FOUND !");
					   }
					   else
					   {
						   lblall.setText("                                           RECORD NOT FOUND !");
					   }
				   }
                   else if(!loc.equals(""))
				   {   
					   pst=con.prepareStatement("SELECT * FROM DEPT WHERE upper(loc)=upper(?)");
					   pst.setString(1,loc);
					   pst.executeQuery(); 
                       ResultSet rs=pst.getResultSet();
					   if(rs.next())
					   {
						   tfdeptno.setText(rs.getInt(1)+"");
					       tfdeptname.setText(rs.getString(2));
					       lblall.setText("                                                RECORD FOUND !");
					   }
					   else
					   {
						   lblall.setText("                                           RECORD NOT FOUND !");
					   }
				   }
			   }
			   catch(Exception sql3)
			   {
				   lblall.setText("                                           INVALID RECORD !");
				   tfdeptno.setText("\0");
				   tfdeptname.setText("\0");
		           tfloc.setText("\0");
				   sql3.printStackTrace();
		       }
			}
		}
		else if(call.equals("Clear"))
		{
			tfdeptno.setText("\0");
		    tfdeptname.setText("\0");
		    tfloc.setText("\0");
		}
	}

	public static void main(String args[])
	{
		PageDemo p=new PageDemo();
	}
}//class