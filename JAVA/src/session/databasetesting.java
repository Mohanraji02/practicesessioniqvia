package session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class databasetesting {
	
	
	public static void main(String[] s) throws ClassNotFoundException, SQLException
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","mohan");
	Statement smt=con.createStatement();
ResultSet rs=	smt.executeQuery("select * from practice");
	while(rs.next())
	{
		System.out.println(rs.getString(1));
		//System.out.println(rs.getString(1));
	}
		}
		
		catch(SQLException e)
		{
			System.out.print(e.getMessage()+e.getErrorCode());
		}
	}

}
