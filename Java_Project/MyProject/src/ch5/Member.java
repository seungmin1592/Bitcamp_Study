package ch5;

public class Member {
	String name;
	String phoneNum;
	String major;
	int grade;
	String email;
	String birthday;
	String address;

	Member (String name, String phoneNum, String major, int grade, String email, String birthday, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	
	Member (String name, String phoneNum, String major, int grade, String email){
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	
	void method() {
		System.out.println("이름은 " + name);
		System.out.println("전화번호는 " + phoneNum);
		System.out.println("전공은 " + major);
		System.out.println("학년은 " + grade);
		System.out.println("email은 " + email);
		System.out.println("생일은 " + birthday);
		System.out.println("주소는 " + address);
	}
	
	public static void main(String[] args) {
		Member member1 = new Member("김승민", "010-0000-0000", "없음", 1, "tmdals1592@naver.com","3월 24일", "경기도 안산시");
		member1.method();
		
		System.out.println("=========================");
		
		Member member2 = new Member("홍길동", "010-1111-1111", "컴공", 1,"rlfehd@naver.com");
		member2.method();
	}

}
