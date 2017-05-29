<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Struts 2 Hello World Example</h1>
<s:form action="login">
<s:textfield name="username" label="username"></s:textfield>
<s:password name="password" label="password"></s:password>
<s:submit/>
</s:form>
</body>
</html>
