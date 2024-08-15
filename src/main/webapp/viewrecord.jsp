<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Booking Record</title>
</head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 40%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 6px;
}

tr:nth-child(even) {
  background-color: #F0E68C;
}
body {
  background-color: #F5F5DC;
}
</style>

<body>
<jsp:include page="index.jsp"></jsp:include>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<h2>Hello <s:property value="empname" />, your Booking Status </h2>
<table>
	<tr>
		<td>Booking ID</td>
		<td><s:property value="recid" /></td>
	</tr>
	<tr>
		<td>Employee Name</td>
		<td><s:property value="empname" /></td>
	</tr>
	<tr>
		<td>Employee Phone</td>
		<td><s:property value="empphone" /></td>
	</tr>
	<tr>
		<td>Employee ID</td>
		<td><s:property value="empid" /></td>
	</tr>
	<tr>
		<td>Depart Date</td>
		<td><s:property value="depdate" /></td>
	</tr>
	<tr>
		<td>Return Date</td>
		<td><s:property value="retdate" /></td>
	</tr>
	<tr>
		<td>Depart From</td>
		<td><s:property value="deptfrm" /></td>
	</tr>
	
<tr>
		<td>Going To</td>
		<td><s:property value="goingto" /></td>
	</tr>
		
<tr>
		<td>Trip</td>
		<td><s:property value="trip" /></td>
	</tr>
		
<tr>
		<td>Travel Class</td>
		<td><s:property value="travelclass" /></td>
	</tr>
	<tr>
		<td>Email ID</td>
		<td><s:property value="email" /></td>
	</tr>
	
</table> 

</body>
</html>