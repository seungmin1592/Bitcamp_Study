<%@page import="com.ncs.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<Member> list = (List<Member>)request.getAttribute("result");
%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	td ,th { padding:5px 15px}
	th { background:#ddd}
	a { padding:5px 10px; border:1px solid #000; display:block; width:100px}
	
</style>
</head>
<body>
	<h1>회원 정보 리스트</h1>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>ID</th>
			<th>PW</th>
			<th>이름</th>
			<th>가입일시</th>
		</tr>
		<%
			if(list != null){
				for(int i=0;i<list.size();i++){
					%>
					<tr>
						<td><%=list.get(i).getIdx() %></td>
						<td><%=list.get(i).getId() %></td>
						<td><%=list.get(i).getPw() %></td>
						<td><%=list.get(i).getName() %></td>
						<td><%=list.get(i).getDate() %></td>
					</tr>
				<%
				}
				
			}
		
		%>
	</talbe>
	<button onclick="location.href='join.jsp'">회원 등록</button>
</body>
</html>