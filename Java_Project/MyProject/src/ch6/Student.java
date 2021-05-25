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
	
	void result () {
		int total = korNum + engNum + mathNum;
		float average = total / 3;
		System.out.println(name + "의 총점은 " + total + "이며, 평균은" + average + "입니다." );
	}
	
	public static void main(String[] args) {
		Student[] stu = new Student [10];
		
	}

}
