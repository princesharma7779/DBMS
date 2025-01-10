import java.sql.*;
public class Connect
{
  static Connection connect()
  {
	  Connection con = null;
	  try
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adj","root","Rio3341");
		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return con;
  }
}
