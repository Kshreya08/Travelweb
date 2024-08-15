package com.powergrid.db;
import java.sql.*;

public class DBConnection {
	
	public static void main(String args[])
	{
		System.out.println("test");
		try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");  
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from employee");  
				while(rs.next())
				{	
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDate(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getDate(7)+"  "+rs.getString(8));
				}
				con.close();  
		}
		catch(Exception e){ System.out.println(e);}  
}

	
}