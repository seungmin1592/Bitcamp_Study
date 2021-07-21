<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="dept.dao.DeptDao"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// dept_list.jsp -> 요청을 받고 처리 -> 결과 데이터를 객체속성에 저장 -> view 지정
	
	// 1. 드라이버 로드 : 서블릿 클래스 Loader에서 드라이버 로드
	
	// 2. DB 연결
	Connection conn = null;	
	DeptDao dao = DeptDao.getInstance();
	
	try{
		// jdbcUrl
		conn = ConnectionProvider.getConnection();
		// 6. 결과 데이터 request 의 속성에 저장 -> 데이터 공유(전달)
		request.setAttribute("result", dao.getDeptList(conn));
	} catch(SQLException e){
		e.printStackTrace();
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		JdbcUtil.close(conn);
	}
%>

<jsp:forward page="list_view.jsp" />
<!-- view 의 역할만!!!! -->