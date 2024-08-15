<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<center>
<h2>
Login page</h2>
</center>

</head>
<body>
<s:actionerror />
<s:form action="login" method="post">
<s:textfield name="username" key="label.username" size="20" />
<s:password name="password" key="label.password" size="20" />
<s:submit method="execute"  key="label.login"  align="center" />
</s:form>


</body>
</html>