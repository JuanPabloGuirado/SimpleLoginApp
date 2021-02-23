<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.juanp.dev.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Congratulations!</title>
</head>
<body>

<h2>Your login was successful!</h2>

<%User user = (User) session.getAttribute("user"); %>

Hello <%=user.getUserName() %>!

</body>
</html>