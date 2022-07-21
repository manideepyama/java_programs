import java.io.*;
import java.util.*;

class Employee implements Serializable{
	int eno; String ename; float esal;
	
void	setEmployee
		   (int eno,String ename,float esal)
{ this.eno=eno; this.ename=ename; this.esal=esal; }

void getEmployee(){
	System.out.println("Eno is : "+eno);
	System.out.println("Ename is : "+ename);
	System.out.println("Esal is : "+esal); }
}

class ObjectOutputStreamDemo{
	public static void main(String args[])
		throws IOException{

Employee e=new Employee();
Scanner s=new Scanner(System.in);

System.out.println("Enter eno,ename,salary");
int no=s.nextInt();
String name=s.next();
float sal=s.nextFloat();

e.setEmployee(no,name,sal);
OutputStream os=
	 new FileOutputStream("myeinfo");

//ObjectOutputStream(OutputStream);
ObjectOutputStream oos=
	new ObjectOutputStream(os);
         oos.writeObject(e);
oos.close();
os.close();
System.out.println("Object is Saved ");
	}
}
