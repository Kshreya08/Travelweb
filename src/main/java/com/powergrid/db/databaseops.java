package com.powergrid.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class databaseops {
	Connection con = null;
	
	Connection getconnection()
	{
		Connection obj = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");
		}
		catch(Exception e)
		{
			System.out.println("Error - "+e.getMessage());
		}
		return obj;
	}
}



	
	
		
		
	




