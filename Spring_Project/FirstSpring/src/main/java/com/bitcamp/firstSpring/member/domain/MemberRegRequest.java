package com.bitcamp.firstSpring.member.domain;


public class MemberRegRequest {
	String memberid;
	String password;
	String membername;
	
	
	public MemberRegRequest() {}


	public String getMemberid() {
		return memberid;
	}


	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMembername() {
		return membername;
	}


	public void setMembername(String membername) {
		this.membername = membername;
	}


	@Override
	public String toString() {
		return "MemberRegRequest [memberid=" + memberid + ", password=" + password + ", membername=" + membername + "]";
	}
	
	
	

	
	
	
	
}
