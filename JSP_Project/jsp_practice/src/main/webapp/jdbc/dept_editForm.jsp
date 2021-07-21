<%@page import="java.sql.SQLException"%>
<%@page import="dept.dao.DeptDao"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dept.domain.Dept"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String deptno = request.getParameter("deptno");
	// out.println(deptno);
	
	// 전달받은 부서번호로 부서정보를 가져온다 -> 처리 -> Dept -> 공유
	// 1. 데이터베이스 드라이버 로드 : 서블릿 클래스 Loader에서 드라이버 로드
		
	// 2. DB 연결
	Connection conn = null;
	DeptDao dao = null;
	try {
		conn = ConnectionProvider.getConnection();
		dao = DeptDao.getInstance();
		
		// 부서정보를 form_view.jsp 전달(공유)
		request.setAttribute("dept", dao.selectByDeptno(conn, Integer.parseInt(deptno)));
	} catch (SQLException e){
		e.printStackTrace();
	}
	

	
	
%>
<jsp:forward page="form_view.jsp"/>
