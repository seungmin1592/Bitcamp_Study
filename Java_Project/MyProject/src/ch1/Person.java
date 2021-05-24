package ch1;

public class Person {
	String perName;
	String per_Pnum;
	String perNum;
	
	Person(String perName, String per_Pnum, String perNum){
		this.perName = perName;
		this.per_Pnum = per_Pnum;
		this.perNum = perNum;
	}
	
	public static void main(String args[]) {
		Person per = new Person("김승민", "010-0000-0000", "970324-0000000");
		
		System.out.println("이름은 " + per.perName + " 입니다.");
		System.out.println("전화번호는 " + per.per_Pnum + " 입니다.");
		System.out.println("주민등록번호는 " + per.perNum + " 입니다.");
	}
}
