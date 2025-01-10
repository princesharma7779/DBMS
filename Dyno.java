	import java.sql.*;
import java.util.*;
public class Dyno 
{
    Connection con=null;
    Statement stmt=null;
    String name,city;
    int age,rollnumber;
    Scanner ip;
    public Dyno()
    {
    	con=Connect.connect();
    	ip=new Scanner(System.in);
    }
    void insert()
    {
    	try {
    		System.out.println("Enter the student name age rollnumber");
    		name=ip.nextLine();
    		age=ip.nextInt();
    		rollnumber=ip.nextInt();
    		
    		stmt=con.createStatement();
    		int result=stmt.executeUpdate("insert into student values('"+name+"','"+age+"','"+rollnumber+"','"+city+"')");
    	  if(result>0)
    	  {
    		  System.out.println("record inserted");
    	  }
    	  else {
    		  System.out.println("error in insertion");
    	  }
    	  con.close();
    	}
    	catch( SQLException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    public static void main(String[] args)
    {
    	Dyno ob=new Dyno();
    	ob.insert();
    }
}
