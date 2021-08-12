package com.bitcamp.op.member.dao;

import java.util.List;

import com.bitcamp.op.member.domain.Member;

public interface Dao {

	// 로그인
	Member selectByIdPw(String id, String pw);
	// 아이디 체크
	int selectById(String memberId);
	// 회원가입
	int insertMember(Member member);
	// 회원 정보 수정
	int updateMember(Member member);
	// 회원 정보 삭제
	int deleteMember(int idx);
	// 회원리스트
	List<Member> selectAll();
	// 페이징 처리가 가능한 리스트
	List<Member> selectList(int startrow, int count); 
	// 전체 회원의 수
	int selectTotalCount();
	
	
}
