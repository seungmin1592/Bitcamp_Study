<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" cotent="text/html; charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String name = "Son";
	%>
	
	안녕하세요 <%= name %>
	<%= request.getContextPath() %>
	
	
</body>
</html>