<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="member" class="member.Member" scope="request"/>

<!-- 
	1. request 속성에 member 라는 속성을 찾는다!
	2. member가 member.Member 타입의 객체인지 확인!
	3_1. 있다면 -> request.getAttibute("member")
	3_2. 없다면 -> new member.Member() -> request.setAttribute("member",)
-->

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=member %>
	<br>
	<%=member.getName() %>
</body>
</html>