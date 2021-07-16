<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<p><%=id %>님 로그인이 완료되었습니다.
		<tr>
			<td colspan="2">
				회원정보
			</td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%=id %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=pw %></td>
		</tr>
	</table>
</body>
</html>