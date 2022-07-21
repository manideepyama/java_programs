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
class RecordDemo implements ActionListener
{
	Frame f;
	Label lbldeptno,lbldeptname,lblloc,lblall;
    TextField tfdeptno,tfdeptname,tfloc;
    Button btnf,btnn,btnp,btnl,btnc;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;

	RecordDemo()
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
		lblloc=new Label("LOCATION 		         ");
		lblall=new Label("                                  ENTER THE ABOVE DETAILS !                                    ");

		tfdeptno=new TextField(50);
        tfdeptname=new TextField(50);
		tfloc=new TextField(50);

		btnf=new Button("First");
		btnn=new Button("Next");
		btnp=new Button("Previous");
		btnl=new Button("Last");
		btnc=new Button("Clear");

		f.add(lbldeptno);f.add(tfdeptno);
		f.add(lbldeptname);f.add(tfdeptname);
		f.add(lblloc);f.add(tfloc);
		f.add(btnf);
		f.add(btnn);
		f.add(btnp);
		f.add(btnl);
		f.add(btnc);
		f.add(lblall);

		lbldeptno.setFont(fo);
		lbldeptname.setFont(fo);
		lblloc.setFont(fo);
		lblall.setFont(fo);
		btnf.setFont(fo);
		btnn.setFont(fo);
		btnp.setFont(fo);
		btnl.setFont(fo);
		btnc.setFont(fo);

		btnf.addActionListener(this);
        btnn.addActionListener(this);
		btnp.addActionListener(this);
		btnl.addActionListener(this);
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
			st=con.createStatement
				(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("SELECT * FROM DEPT");
		}
		catch (Exception sql1)
		{
			sql1.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent a)
	{
		String call=a.getActionCommand();
		if(call.equals("First"))
		{
			try
			{
				rs.first();
				tfdeptno.setText(rs.getInt(1)+"");
				tfdeptname.setText(rs.getString(2));
				tfloc.setText(rs.getString(3));
			}
			catch(Exception sql)
			{
				sql.printStackTrace();
			}
		}
		else if(call.equals("Next"))
		{
			try
			{
				if(rs.isLast())
				{
					lblall.setText("                                  THIS IS THE LAST RECORD !");
				}
				else
				{
					rs.next();
					tfdeptno.setText(rs.getInt(1)+"");
					tfdeptname.setText(rs.getString(2));
					tfloc.setText(rs.getString(3));
				}
			}
			catch (Exception sql)
			{
				sql.printStackTrace();
			}
		}
		else if(call.equals("Previous"))
		{
			try
			{
			if(rs.isFirst())
			{
				lblall.setText("                                      THIS IS THE FIRST RECORD !");
			}
			else if(rs.isBeforeFirst())
			{
				lblall.setText("                                           RECORD NOT FOUND !");
			}
			else
			{
				rs.previous();
				tfdeptno.setText(rs.getInt(1)+"");
			    tfdeptname.setText(rs.getString(2));
				tfloc.setText(rs.getString(3));
			}
			}
			catch(Exception sql)
			{
				sql.printStackTrace();
			}
		}
		else if(call.equals("Last"))
		{
			try
			{
				rs.last();
                tfdeptno.setText(rs.getInt(1)+"");
			    tfdeptname.setText(rs.getString(2));
				tfloc.setText(rs.getString(3));
			}
			catch(Exception sql)
			{
				sql.printStackTrace();
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
		RecordDemo rd=new RecordDemo();
	}
}