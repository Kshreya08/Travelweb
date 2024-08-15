<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form {border: 4px solid green; width:300px; height:100px;margin:10px;}

input[type=text], input[type=password] {
  width: 200px;
  height: 30px;
   padding: 5px;
   text-align: center;
  border: 1px solid blue;
  box-sizing: border-box;
}

form{
  display: block;
  margin-left: 400px;
  margin-right: 300px;
  margin-top: 75px;
 
  
}
</style>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>   
<s:actionerror />
<div>
<s:form action="viewprocess"> <br>
<s:textfield name="bookingid" label="Booking ID" placeholder="Booking ID" ></s:textfield> 
<s:submit value="Get Details" align="center" />

<br>
<%-- <table>
<s:iterator value="selectdata" >
  <tr>
      <td><s:property/></td>
  </tr>
</s:iterator>
</table>--%>

</s:form>
</div>

</body>
</html>