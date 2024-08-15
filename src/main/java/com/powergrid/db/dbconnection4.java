package com.powergrid.db;
import java.sql.*;

public class dbconnection4 {

	public static void main(String args[])
	{
		System.out.println("Delete");
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");  
			Statement stmt=con.createStatement(); 
			int result=stmt.executeUpdate("DELETE FROM shreyadb1.booking_record WHERE EMP_NAME = 'anushka' ORDER BY EMP_ID LIMIT 2;");
			System.out.println(result+" Record Deleted"); 
			
			con.close();  
	}
	catch(Exception e){ System.out.println(e);}  
}


}
