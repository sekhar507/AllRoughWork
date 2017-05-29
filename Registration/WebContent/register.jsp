<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%request.getParameter("userName") ;%>
<%response.getWriter();%>
<%System.out.println("JSP WIll Start::::"); %>
<% System.out.println(2+5);%>
<form action="servlet/Register" method="post">
Name:<input type="text" name="userName">
Password:<input type="password" name="userPass">
Email:<input type= "text" name= "userEmail">
 
<input type="submit" value="register Me" />
</form>


</body>
</html>