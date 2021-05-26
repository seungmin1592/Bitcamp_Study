package ch7;

public class Male extends Person {
	String gender;
	
	Male(String name, String personNum) {
		super(name, personNum);
		this.gender = "남자";
	}
	
	void Hello() {
		System.out.println("안녕하세요 저는 " + name + "입니다. 만 " + ageChange() + "살 입니다. " + "성별은 " + gender + "입니다.");
	}
}
