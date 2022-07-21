import java.sql.*;
import java.awt.event.*;
import java.awt.*;
class SSSITPro1 extends Frame implements ActionListener{
	Button first,next,previous,last;
	TextField dno,dname,dloc;
	Label l;
	ResultSet rs=null;
	 Connection con=null;
		Statement st=null;
		
	SSSITPro1(){
	   Frame f=new Frame();
	   f.addWindowListener(new WindowAdapter(){
	     public void windowClosing(WindowEvent w){
		   System.exit(0);
		 }
	   });
	   f.setSize(800,800);
	   Font font=new Font("Serif",Font.BOLD,26);
	   f.setLayout(new GridLayout(10,1,10,10));
	   Label l1=new Label("DEPT NO : ");
	   l1.setFont(font);
	   f.add(l1);
	   dno=new TextField();
	   dno.setFont(font);
	   f.add(dno);
	   Label l2=new Label("DEPT NAME : ");
       l2.setFont(font);
	   f.add(l2);
	   dname=new TextField();
	   dname.setFont(font);
       f.add(dname);
	   Label l3=new Label("LOCATION : ");
	   l3.setFont(font);
	   f.add(l3);
	   dloc=new TextField();
       dloc.setFont(font);
       f.add(dloc);
	   first=new Button("FIRST");
       first.addActionListener(this);    
	   f.add(first);
	   next=new Button("NEXT");
       next.addActionListener(this);    
	   f.add(next);
       previous =new Button("PREVIOUS");
	   previous.addActionListener(this);
	   f.add(previous);
	   last = new Button("LAST");
	   last.addActionListener(this);
	   f.add(last);
	   l=new Label("");
	   l.setFont(font);
	   f.add(l);
	   try{
		      Class.forName("oracle.jdbc.driver.OracleDriver");
			  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			  st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             rs=st.executeQuery("SELECT * FROM DEPT");
		     rs.next();
			 dno.setText(rs.getString(1));
            dname.setText(rs.getString(2));
			dloc.setText(rs.getString(3));
		   }
        catch(SQLException | ClassNotFoundException se){
			 System.out.println("unable to continue...\n"+se);
		
		}
	  f.setVisible(true);

	}
	public void actionPerformed(ActionEvent e){
	   if(e.getSource()==first){
		   try{
			rs.first();
			//System.out.println("rs : "+rs);
			dno.setText(rs.getString(1));
            dname.setText(rs.getString(2));
			dloc.setText(rs.getString(3));
			l.setText("FIRST RECORD ");
		   }
		   catch(SQLException e1){
		      l.setText("invalid first operation");
		   }
		}
		else if(e.getSource()==next){
		 try{
			   
			rs.next();
			//System.out.println("rs : "+rs);
          if(!rs.isAfterLast()){
			dno.setText(rs.getString(1));
            dname.setText(rs.getString(2));
			dloc.setText(rs.getString(3));
			l.setText("next operation performed!");
		  }
		  else{
		    l.setText("reached after last "); 
			rs.previous();
		  }
		}
		   catch(SQLException e1){
		      l.setText("invalid next operation");
		   }
		}
		else if(e.getSource()==previous){
		 try{
			   
			rs.previous();
			if(!rs.isBeforeFirst()){
			dno.setText(rs.getString(1));
            dname.setText(rs.getString(2));
			dloc.setText(rs.getString(3));
			l.setText("previous operation performed");
			}
            else{
				l.setText("reached before First");
		        rs.next();
			 }
		 }
		   catch(SQLException e1){
		      l.setText("invalid next operation");
		   }
		}//elseif
		else if(e.getSource()==last){
		 try{
			   
			rs.last();
			dno.setText(rs.getString(1));
            dname.setText(rs.getString(2));
			dloc.setText(rs.getString(3));
			l.setText("LAST RECORD");
		   }
		   catch(SQLException e1){
		      l.setText("invalid next operation");
		   }
		}//elseif
	}
	public static void main(String[] args) 
	{
	  SSSITPro1 s=new SSSITPro1();
	}
}
