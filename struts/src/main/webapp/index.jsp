<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h1>Welcome To Struts 2!</h1>
	<s:form action="login">
	<s:textfield name="username" label="username"></s:textfield>
	<s:textfield name="password" label="password"></s:textfield>
	<s:submit></s:submit>
</s:form>

</body>
</html>