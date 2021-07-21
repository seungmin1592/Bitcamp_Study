<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.ncs.ConnectionProvider"%>
<%@page import="com.ncs.MemberDao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = null;
	MemberDao dao = MemberDao.getInstance();
	
	try {
		conn = ConnectionProvider.getConnection();
		
		request.setAttribute("result", dao.getMemberList(conn));		
	} catch(SQLException e){
		e.printStackTrace();
	} catch(Exception e){
		e.printStackTrace();
	} finally {
		JdbcUtil.close(conn);
	}
%>
	
<jsp:forward page="list_view.jsp" />
	