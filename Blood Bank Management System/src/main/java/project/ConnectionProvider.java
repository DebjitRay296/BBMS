package project;
import java.sql.*;
import java.sql.Connection;
public class ConnectionProvider {
	
   public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","manager");
            return con;
        }
        catch(Exception e)
        {
            System.out.print(e);
            return null;
        }
		
    }
}