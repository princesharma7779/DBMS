import java.sql.*;
public class Insertrecord
{
 public static void main(String [] args)
 {
	 try
	 {
		 String connstring="jdbc:mysql://localhost:3306/adj";
		 String user="root";
		 String pass="Rio3341";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection(connstring,user,pass);
		 Statement stmt=con.createStatement();
		 int res=stmt.executeUpdate("insert into student values('ayush','24','54','indore')");
		 if (res>0)
		 {
			 System.out.println("record inserted");
		 }
		 else {
			 System.out.println("error in insertion");
		 }
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
}
