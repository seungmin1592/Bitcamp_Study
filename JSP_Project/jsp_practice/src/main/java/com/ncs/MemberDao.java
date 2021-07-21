package com.ncs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dept.dao.DeptDao;

public class MemberDao {

	
	// 싱글톤 패턴
	// 1. 인스턴스 생성을 막는다
	private MemberDao() {
		
	}
	// 2. 클래스 내부에서 인스턴스를 생성
	private static MemberDao dao = new MemberDao();
	// 3. 외부에서 참조 값을 반환 받을 수 있는 메소드
	public static MemberDao getInstance() {
		return dao == null? new MemberDao() :dao;
	}
	
	
	// 회원가입
	public int insertMember(Connection conn, Member member) {
		
		int resultCnt = 0;
		PreparedStatement pstmt = null;
		
		String sql = "insert into member values (default, ?,?,?,default)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			
			resultCnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Jdbcutil.close(pstmt);
		}
		
		return resultCnt;
		
	}
	
	public List<Member> getMemberList(Connection conn){
		Statement stmt = null;
		ResultSet rs = null;
		List<Member> list = null;
		
		try {
			
			stmt = conn.createStatement();
			String sql = "select * from member";
			rs = stmt.executeQuery(sql);
			list = new ArrayList<Member>();
			
			while(rs.next()) {
				list.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getTimestamp(5)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			Jdbcutil.close(rs);
			Jdbcutil.close(stmt);
		}
		return list;
	}
	
	
	
}
