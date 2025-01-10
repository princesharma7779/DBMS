import java.sql.*;
public class Sel {
 public static void main(String args [])
 {
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adj","root","Rio3341");
		 Statement stmt=con.createStatement();
		 System.out.println("name  rollnumber age");
		 ResultSet rs=stmt.executeQuery("select * from student");
		 while(rs.next())
		 {
			System.out.println(rs.getString(1) +" "+ rs.getInt(2) +" "+rs.getInt(3) ); 
		 }
		 con.close();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
}
