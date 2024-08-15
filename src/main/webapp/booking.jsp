<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Travel Booking Form</title>
</head>
<style>
body {
  background-color: #F5F5DC;
}
</style>
<body>
<jsp:include page="index.jsp"></jsp:include>  

<h2>Travel Booking Form</h2>
<s:actionerror />
<s:form action="booking" method="post">
    <s:textfield name="empname" key="label.empname" size="20" />
    <s:textfield name="phonenumber" key="label.phonenumber" size="20" />
    <s:textfield name="empid" key="label.empid" size="20"  />
    <s:textfield name="empemail"  key="label.empemail" size="20"   />
    <s:textfield name="depdate"   key="label.depdate"  size="20"  />
    <s:textfield name="returndate"    key="label.returndate"  size="20"   />
    <s:textfield name="depfrom"   key="label.depfrom" size="20"   />
    <s:textfield name="goingto"   key="label.goingto" size="20"  />
    <s:radio label = "Trip" name = "trip"  
    list="{'One way','Round trip'}" />
    
    <s:select label = "Choose Travel Class" name = "bookclass"
            list="{'First Class','Premium Economy','Business'}" />
    
    
    <s:submit method="execute" key="label.login" align="center" />
    
</s:form>
</body>
</html>