package com.powergrid.db;
import java.sql.*;

public class dbconnection2 {

	public static void main(String args[])
	{
		System.out.println("update");
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");  
			Statement stmt=con.createStatement(); 
			int row = stmt.executeUpdate("UPDATE employee SET DepartFrom ='New delhi' where DepartFrom = 'patna'");
			
			System.out.println("No of rows updated = "+row);
			
			con.close();  
	}
	catch(Exception e){ System.out.println(e);}  
}


}
