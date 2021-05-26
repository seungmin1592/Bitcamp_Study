package ch6;

public class Student {
	private String name;
	private int korNum;
	private int engNum;
	private int mathNum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorNum() {
		return korNum;
	}

	public void setKorNum(int korNum) {
		this.korNum = korNum;
	}

	public int getEngNum() {
		return engNum;
	}

	public void setEngNum(int engNum) {
		this.engNum = engNum;
	}

	public int getMathNum() {
		return mathNum;
	}

	public void setMathNum(int mathNum) {
		this.mathNum = mathNum;
	}

	Student(String name, int korNum, int engNum, int mathNum){
		this.name = name;
		this.korNum = korNum;
		this.engNum = engNum;
		this.mathNum = mathNum;
	}
	
	public int getSum() {
		return getKorNum() + getEngNum() + getMathNum();
	}
	public int getAver() {
		return (getKorNum() + getEngNum() + getMathNum()) / 3;
	}
	
	void print () {
		System.out.println("학생 이름 : " + getName());
		System.out.println("국어 점수 : " + getKorNum());
		System.out.println("영어 점수 : " + getEngNum());
		System.out.println("수학 점수 : " + getMathNum());
		System.out.println("총점은 " + getSum() + "이며, 평균은" + getAver() + "입니다." );
		
	}
	
	public static void main(String[] args) {
		Student[] student = new Student [10];
		
		student[0] = new Student("1번 학생", 49,70,30);
		student[1] = new Student("2번 학생", 59,45,89);
		student[2] = new Student("3번 학생", 41,60,31);
		student[3] = new Student("4번 학생", 42,18,32);
		student[4] = new Student("5번 학생", 43,82,33);
		student[5] = new Student("6번 학생", 44,35,34);
		student[6] = new Student("7번 학생", 45,46,35);
		student[7] = new Student("8번 학생", 46,98,36);
		student[8] = new Student("9번 학생", 47,70,38);
		student[9] = new Student("10번 학생", 100,90,80);
		
		for(int i=0; i<student.length; i++) {
			student[i].print();
			System.out.println("-----------------");
		}

	}

}
