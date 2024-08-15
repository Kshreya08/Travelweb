package com.powergrid.db;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;  
import java.util.List;  

public class dbconnection3 
{
	
	private static String INSERT_QUERY = "INSERT INTO booking_record (EMP_NAME, EMP_PHONE, EMP_ID, DEPART_DATE, RETURN_DATE, DEPART_FROM, GOING_TO, TRIP, TRAVEL_CLASS, Email_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static String CHK_USER_QUERY = "SELECT COUNT(*) FROM Employee_details WHERE EMP_ID = ?";
	private static String PWD_QUERY = "SELECT COUNT(*) FROM Employee_details WHERE PASSWORD = ?" ;
	private static String BOOKINGID_QUERY = "SELECT RECORD_ID, EMP_NAME, EMP_PHONE, EMP_ID,  DEPART_DATE, RETURN_DATE, DEPART_FROM, GOING_TO, TRIP, TRAVEL_CLASS, Email_ID FROM  booking_record WHERE RECORD_ID = ?";
	private static String DELETE_QUERY = "DELETE FROM booking_record WHERE RECORD_ID = ?";
	String mystring = "This is test string";
	int a = 10;
	int b= 20;

	public static void main(String args[])
	{
		System.out.println("INSERT");
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");  
			Statement stmt=con.createStatement(); 
			int result=stmt.executeUpdate("INSERT INTO booking_record (EMP_NAME,EMP_PHONE,EMP_ID,DEPART_DATE,RETURN_DATE,DEPART_FROM,GOING_TO,TRIP,TRAVEL_CLASS,Email_ID) VALUES ('Shreya','9897969594','2193021','21/08/23', '24/09/23','patna','Delhi', 'Oneway','PremiumEconomy','shreya23@gmail.com'),('lavanya','9876389234','2193022','27/08/23', '29/09/23','Delhi','Patna','Oneway','PremiumEconomy','lavanya523@gmail.com'),('Priyanka','9354194538','2193024','08/08/23','10/08/23','Bangalore','Delhi','Oneway','PremiumEconomy','Priyanka144@gmail.com'),('Anushka','9871186547','2193023','12/08/23','15/08/23','Bagdogra','Patna','Oneway','First_class','Anushka98@gmail.com'),('Bhavya','9871186548','2193023','15/08/23','18/08/23','Mumbai','Bangalore','RoundTrip','Business','Bhavya12@gmail.com'");
			
			System.out.println(result+" Record INSERTED"); 
			
			con.close();  
			}
			catch(Exception e){ System.out.println(e);} 
	}

	
	public void insert(String empname, String empphone, String empid, String depdate, String retdate, String departfrom, String goingto, String trip, String travelclass, String emailid)
	{
		PreparedStatement insertstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");  
			insertstmt = con.prepareStatement(INSERT_QUERY);
			insertstmt.setString(1, empname);
			insertstmt.setString(2, empphone);
			insertstmt.setString(3, empid);
			insertstmt.setString(4, depdate);
			insertstmt.setString(5, retdate);
			insertstmt.setString(6, departfrom);
			insertstmt.setString(7, goingto);
			insertstmt.setString(8, trip);
			insertstmt.setString(9, travelclass);
			insertstmt.setString(10, emailid);
			int insertcnt = insertstmt.executeUpdate();
			System.out.println("Insert count = "+insertcnt);
			con.close();  
		}
		catch(Exception e)
		{ System.out.println(e);}  
	
		
	}
	
	public boolean checkusername(String username)
	{
		PreparedStatement selectstmt = null;
		ResultSet rs = null;
		int records = 0;
		boolean ret = false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21"); 
			selectstmt = con.prepareStatement(CHK_USER_QUERY);
			selectstmt.setString(1, username);
			rs = selectstmt.executeQuery();
			while(rs.next())
			{  
				records = rs.getInt(1);  
			}  	
			con.close();
			
			if (records>0)
			{
				ret = true;
			}
			
		
		}
		
			catch(Exception e)
			{System.out.println(e);}
		return ret;	
	}
	public boolean checkpassword(String password)
	{
		PreparedStatement selectstmt2 = null;
		ResultSet rs = null;
		int records;
	
		boolean ret = false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21"); 
			selectstmt2 = con.prepareStatement(PWD_QUERY);
			selectstmt2.setString(2, password);
			rs = selectstmt2.executeQuery();
			while(rs.next())
			{  
				records = rs.getInt(2);  
			}
			
			
			if(password.equals(rs.getString("PASSWORD")))
			{
				ret = true;
			}  
		}
		
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
		
		return ret;

			
	}

	public static boolean validate (String username,String userpass)
	{  
		boolean status=false;  
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");  
			PreparedStatement ps=con.prepareStatement("select * from Employee_details where emp_id = ? and password = ?");  
			ps.setString(1,username);  
			ps.setString(2,userpass);  
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  
		}
		catch(Exception e)
		{e.printStackTrace();}  
		return status;  
	}
	
	
	
	
	
	public List getbookingrecord(String recordid)
	{
		PreparedStatement selectstmt3 = null;
		ResultSet rs = null;
		List <String>selectdata  = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shreyadb1","root","$Hreya21");
			selectstmt3 = con.prepareStatement(BOOKINGID_QUERY);
			selectstmt3.setInt(1,Integer.parseInt(recordid));
			rs = selectstmt3.executeQuery();
			while(rs.next())
			{
				selectdata = new ArrayList<String>();
				selectdata.add(Integer.toString(rs.getInt("RECORD_ID")));
				selectdata.add(rs.getString("EMP_NAME"));
				selectdata.add(rs.getString("EMP_PHONE"));
				selectdata.add(rs.getString("EMP_ID"));
				selectdata.add(rs.getString("DEPART_DATE"));
				selectdata.add(rs.getString("RETURN_DATE"));
				selectdata.add(rs.getString("DEPART_FROM"));
				selectdata.add(rs.getString("GOING_TO"));
				selectdata.add(rs.getString("TRIP"));
				selectdata.add(rs.getString("TRAVEL_CLASS"));
				selectdata.add(rs.getString("Email_ID"));
			}
			con.close();
			
		}
		catch(Exception e)
		{System.out.println(e);}
		return selectdata;
	}
	
			
}
	
	


	
	

	
		



