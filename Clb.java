import java.sql.*;
import java.util.Scanner;
public class Clb
{
 public static void main(String args[])
 {
	 String name;
	 int age,rollnumber;
	 Scanner ip=new Scanner(System.in);
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jbdc:mysql://localhost:3306/adj","root","Rio3341");
		 System.out.println("Enter the name age rollnumber");
		 name=ip.nextLine();
		 age=ip.nextInt();
		 rollnumber=ip.nextInt();
 CallableStatement stmt=con.prepareCall ("{call insertrecord('"+name+"','"+rollnumber+"',''"+age+"')}");
	int res=stmt.executeUpdate();
	if(res>0)
	{
		System.out.println("record inserted");
	}
	else {
		System.out.println("error in inserted");
	}
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 } 
 }
}
