<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<nav>
	<ul>
		<li><a href="<c:url value='member/reg'/>">회원가입</a></li>
		<li><a href="<c:url value='member/login'/>">로그인</a></li>
		<li><a href="">로그아웃</a></li>
		<li><a href="">회원리스트</a></li>
		<li><a href="<c:url value='board/list'/>">방명록(게시판)</a></li>
	</ul>
</nav>
