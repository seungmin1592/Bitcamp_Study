<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="dept.dao.DeptDao"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	// 사용자가 전달하는 deptno 받고 -> 실행 -> 결과
	String deptno = request.getParameter("deptno");
	
	
	int resultCnt = 0; 
	// DB에 있는 데이터를 삭제
	
	// 데이터베이스 드라이버 로드
	
	
	// 연결
	Connection conn = null;
	
	DeptDao dao = DeptDao.getInstance();
	
	try{
		conn = ConnectionProvider.getConnection();
		
		resultCnt = dao.deleteDept(conn, Integer.parseInt(deptno));
	} catch(SQLException e){
		e.printStackTrace();
	} catch(Exception e2) {
		e2.printStackTrace(); 
	} finally {
		JdbcUtil.close(conn);
	}
	
	
	// 실행 결과에 맞는 응답
	if(resultCnt>0){
			%>
			<script>
				alert('수정되었습니다.')
				location.href = 'dept_list.jsp';
			</script>
			<%
		} else {
			%>
			<script>
				alert('해당 데이터를 찾지 못했습니다.')
				location.href = 'dept_list.jsp';
			</script>
			<%
		}

%>
%>