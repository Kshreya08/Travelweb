<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Welcome</title>
</head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 80%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #F0E68C;
}
body {
  background-color: #F5F5DC;
}
</style>
<jsp:include page="index.jsp"></jsp:include>  
<%@ taglib uri="/struts-tags" prefix="s" %> 
 
<body>
<h3>
Dear <s:property value="empname" />, your booking has been officially confirmed.
</h3>
     
<table>
  <tr>
  <th>Employee ID</th>
    <th>Depart From</th>
    <th>Departure Date</th>
    <th>Going To</th>
    <th>Return Date</th>
    <th>Email ID</th>
  </tr>
  <tr>
    <th><s:property value="empid"/></th>
    <th><s:property value="depfrom"/></th>
    <th><s:property value="depdate"/></th>
    <th><s:property value="goingto"/></th>
    <th><s:property value="returndate"/></th>
    <th><s:property value="empemail" /></th>
  </tr>
  </table>
  <br>
    Contact Number: <s:property value="phonenumber" />  
    <br>
    <br>
    <center>
    <h1></h1>
 <img src="data:image/jpeg;base64,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" alt="thanks" width="250" height="150">
 </h1>
 </center>
     
     
     
</body>
</html>