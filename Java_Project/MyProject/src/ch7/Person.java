package ch7;

public class Person {
	String name;
	String personNum;
	
	Person(String name, String personNum){
		this.name = name;
		this.personNum = personNum;
	}
	
	// 생년을 나이로 계산하는 메소드
	// 100 + (현재년 - 생년)
	int ageChange() {
		String year = personNum.substring(0,2); // 문자열인 personNum의 0~2번째 문자를 추출
		int age = 100 + (21 - Integer.parseInt(year));
		return age;
	}
	
	// 인사하는 메소드
	void Hello() {
		System.out.println("안녕하세요 저는 " + name + "입니다. 만 " + ageChange() + "살 입니다.");
	}
	
	public static void main(String[] args) {
		Person per = new Person("김승민", "970324-1111111");
		per.Hello();
	}
}
