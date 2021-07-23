<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "손흥민");
	session.setAttribute("name", "이강인");
	application.setAttribute("name", "메시");
	
	Member member = new Member();
	member.setId("cool");
	member.setName("COOL");
	member.setPw("1234");
	session.setAttribute("member", member);
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	표현식 : <span><%= request.getAttribute("name") %></span><br>
	
	표현언어1 : <span>${requestScope.name}</span><br>
	
	내장객체의 표현식이 생략되었을 때 규칙<br><br>
	1. pageScope의 속성을 찾는다 -> <br>
	2. request.Scope -><br> 
	3. sessionScope -><br> 
	4. applicationScope<br>
	<br><br>
	표현언어2 : <span>${name}</span><br>
	표현언어3 : <span>${sessionScope.name}</span><br>
	표현언어4 : <span>${applicationScopename}</span><br>
	<hr>
	param.code : <%=request.getParameter("code") %><br>
	param.code : ${param.code} 
	
	<hr>
	pageContext : <%=pageContext.getRequest().getServletContext().getContextPath() %>
	<br>
	${pageContext.request.requestURL }<br>
	${pageContext.request.requestURI }<br>
	${pageContext.request.contextPath }<br>
	<%= request.getContextPath() %>
	
	
	<br>
	<hr>
	${true} / ${false} / ${100} / ${'손흥민'} / ${null}
	
	
	<hr>
	${member} / ${member.id}
	<br>
	<%= session.getAttribute("member") %> / 
	<%= ((Member)session.getAttribute("member")).getId() %>
	
</body>
</html>