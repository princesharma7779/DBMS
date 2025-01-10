import java.sql.*;
import java.util.*;
public class Dyno1 
{
  Connection con=null;
  Statement stmt=null;
  ResultSet rs=null;
  String name;
  int age;
  static int rollnumber;
  Scanner ip;
  public Dyno1() {
	  con=Connect.connect();
	  ip=new Scanner(System.in);
  }
  void insert()
  {
	  try {
		  System.out.println("Enter the studet name age rollnumber");
		  name=ip.nextLine();
		  age=ip.nextInt();
		  rollnumber=ip.nextInt();
		  stmt=con.createStatement();
		  int result=stmt.executeUpdate("insert into student values('"+name+"','"+age+"','"+rollnumber+"')");
		  if(result>0);{
			  System.out.println("error in insertion");
		  }
		  con.close();
	  }
    catch(SQLException e)
	  {
    	e.printStackTrace();
	  }
  }
  
  void searchByrollnumber(int rollnumber) {
	  try {
		  stmt=con.createStatement();
		  String sql="select * from student where rollnumber='"+rollnumber+"'";
		  rs=stmt.executeQuery(sql);
		  while(rs.next()) {
			  System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+ rs.getInt(3));
		  }
	  }
	  catch (SQLException e) {
		  e.printStackTrace();
	  }
  }
  
  public static void  main(String args[])
  {
	  Dyno1 ob=new Dyno1();
	  int ch;
	  Scanner ip1=new Scanner(System.in);
	  System.out.println("press 1 to insert record");
	  System.out.println("press 2 to search record by rolnumber");
	  ch=ip1.nextInt();
	  switch(ch) {
	  case 1:
		  ob.insert();
		  break;
	  case 2:
		  System.out.println("Enter the rollnumber to be search");
		  rollnumber=ip1.nextInt();
		  ob.searchByrollnumber(rollnumber);
		  break;
		  default:
			  System.out.println("invalid choice");
		  
	  }
  }
}
