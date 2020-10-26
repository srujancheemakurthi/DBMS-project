package hotelSrujan;
import javax.swing.*;
import java.sql.*;

public class HotelSrujanData {
	 

	public static Connection ConnectDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mysql","root","admin");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from login");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2));  
			
			JOptionPane.showMessageDialog(null, "Connection Made");
			return con;
			 
			} 
			
		catch(Exception e)
		{
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Connection Errorrrrrrrrrrrr"); 
			return null;
		}
	}
	
}
