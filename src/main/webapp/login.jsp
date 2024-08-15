<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {font-family: Arial,Helvetica, sans-serif;}
form {border: 4px solid blue; width:300px; height:200px;margin:20px;}

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
  margin-left: 450px;
  margin-right: 300px;
 
  
}
</style>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
<%@ taglib uri="/struts-tags" prefix="s" %>  
  <div>
<s:form action="loginprocess">  
<br>
<br>
<br>
<s:textfield name="username" label="Name" placeholder="" ></s:textfield>  
<s:password name="userpass" label="Password" placeholder="Password"></s:password> 

<s:submit value="login" align="center"/>

</s:form>   

</div>
</body>
</html>