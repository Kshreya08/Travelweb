package com.powergrid.db;
import java.sql.*;

public class dbconnectionsample {

	public static void main(String args[])
	{
		System.out.println("update");
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("UPDATE employee SET DepartFrom = 'goa' WHERE EmployeeID = 2193;");  
			while(rs.next())
			{	
				System.out.println(rs.setInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDate(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getDate(7)+"  "+rs.getString(8));
			}
			con.close();  
	}
	catch(Exception e){ System.out.println(e);}  
}


}
