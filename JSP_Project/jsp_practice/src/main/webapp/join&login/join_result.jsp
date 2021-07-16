<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	request.setCharacterEncoding("utf-8");
    
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String birthday = request.getParameter("year") + request.getParameter("month") + request.getParameter("day");
    	String gender = request.getParameter("gender");
    	String email = request.getParameter("email");
    	String phone = request.getParameter("phone_2");
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디 : </td>
			<td><%=id %></td>
		</tr>
		<tr>
			<td>비밀번호 : </td>
			<td><%=pw %></td>
		</tr>
		<tr>
			<td>아이디 : </td>
			<td><%=id %></td>
		</tr>
		<tr>
			<td>이름 : </td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>생일 : </td>
			<td><%=birthday %></td>
		</tr>
		<tr>
			<td>성별 : </td>
			<td><%=gender %></td>
		</tr>
		<tr>
			<td>이메일 : </td>
			<td><%=email %></td>
		</tr>
		<tr>
			<td><%=phone %></td>
		</tr>
	</table>
</body>
</html>