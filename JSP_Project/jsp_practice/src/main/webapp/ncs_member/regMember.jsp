<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.ncs.Member"%>
<%@page import="com.ncs.ConnectionProvider"%>
<%@page import="com.ncs.MemberDao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	request.setCharacterEncoding("UTF-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	
	Timestamp date = Timestamp.valueOf(LocalDateTime.now());
	
	int resultCnt = 0;
	
	Connection conn = null;
	MemberDao dao = MemberDao.getInstance();
	
	try {
		conn = ConnectionProvider.getConnection();
		
		resultCnt = dao.insertMember(conn, new Member(0,id,pw,name,date));
		
	} catch(Exception e){
		e.printStackTrace();
	}
	
	if(resultCnt > 0){
		%>
		<script>
			alert("등록되었습니다.");
			location.href="member_list.jsp";
		</script>
		<%
	} else {
		%>
		<script>
			alert('오류발생으로 등록되지 않았습니다.\n 입력페이지로 다시 이동합니다.');
			window.history.go(-1);
		</script>
		<%
	}
	
	
	
	
	

%>