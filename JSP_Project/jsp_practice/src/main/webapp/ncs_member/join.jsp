<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table { border:1px solid #000}
	td { padding:5px}
	input[type="submit"] {
		width:100%;
	}
</style>
</head>
<body>
	<form action="regMember.jsp" method="post">
		<h1>회원가입</h1>
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" required></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pw" required></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="가입완료"></td>
			</tr>
		</table>
	</form>
</body>
</html>