// 정답 풀이
package ch5;

public class MemberMain {

	public static void main(String[] args) {
		Member2 member1 = new Member2("철수", "010-0000-0000","음악",4,"cjftn@gamil.com","2000-10-01","서울");
		//member1.name = "영회";
		member1.setName("영희");
		member1.showInfo();
		System.out.println(member1.getName());
	}

}
