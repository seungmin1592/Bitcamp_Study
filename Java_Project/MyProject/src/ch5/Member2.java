// 정답풀이
package ch5;

public class Member2 {
	private String name;
	final String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private String birthday;
	private String address;
	
	Member2(String name, String phoneNumber, String major, int grade, String email, String birthday, String address){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	
	Member2(String name, String phoneNumber, String major, int grade, String email){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	
	Member2(String name, String phoneNumber, String major){
		this(name,phoneNumber,major,0,null,null,null);
	}
	
	Member2(){
		this.phoneNumber ="000-0000-0000";
	}
	
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		if(this.birthday == null) {
			System.out.println("생일 : 입력된 데이터가 없습니다.");
		} else {
			System.out.println("생일 : " + birthday);
		}
		if(this.address != null) {
			System.out.println("주소 : " + address);
		} else {
			System.out.println("주소 : 입력된 데이터가 없습니다.");
		}
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Member2 member1 = new Member2("철수", "010-0000-0000","음악",4,"cjftn@gamil.com","2000-10-01","서울");
		member1.name = "영희";
		member1.showInfo();
		//member1.phoneNumber = "00000000";
		
		System.out.println("======================");
		
		Member2 member2 = new Member2("손흥민","010-0000-0000","축구",1,"son@naver.com");
		member2.showInfo();
	}

}
