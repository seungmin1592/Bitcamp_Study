<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="number" value="100000000"/>

	<fmt:formatNumber value="100000"/> <br>
	<fmt:formatNumber value="100000" groupingUsed="false"/> <br>
	
	숫자: <fmt:formatNumber value="${number}"/><br>
	퍼센트 : <fmt:formatNumber value="${number/400000000}" type="percent"/> <br>
	통화 : <fmt:formatNumber value="${number}" type="currency" currencySymbol="$"/><br>
	패턴 : <fmt:formatNumber value="${number*10000}" pattern="000,000.00"/><br>
	
	
		
	
	
</body>
</html>