package ch6;

public class Average {
	
	int[] korNum = { 100, 90, 49, 50, 30, 70, 80, 77, 85, 94};
	int[] engNum = { 69, 57, 68, 35, 98, 65, 79, 18, 93, 45};
	int[] mathNum = { 89, 56, 78, 35, 95, 48, 69, 74, 54, 35};


	void kor_total() {
		int sum = 0;
		for(int i = 0; i<korNum.length; i++) {
			sum += korNum[i];
			System.out.println(i+1 + "번째 학생의 국어 점수는 : " + korNum[i]);
		}
		int result = sum / korNum.length;
		System.out.println("해당 반의 국어 점수 평균은 : " + result + "점 입니다.");
	}
	void eng_total() {
		int sum = 0;
		for(int i = 0; i<engNum.length; i++) {
			sum += engNum[i];
			System.out.println(i+1 + "번째 학생의 영어 점수는 : " + engNum[i]);
		}
		int result = sum / engNum.length;
		System.out.println("해당 반의 영어 점수 평균은 : " + result + "점 입니다.");
	}
	void math_total() {
		int sum = 0;
		for(int i = 0; i<mathNum.length; i++) {
			sum += mathNum[i];
			System.out.println(i+1 + "번째 학생의 수학 점수는 : " + mathNum[i]);
		}
		int result = sum / mathNum.length;
		System.out.println("해당 반의 수학 점수 평균은 : " + result + "점 입니다.");
	}
	
	
	public static void main(String[] args) {
		Average stu = new Average();
		stu.kor_total();
		System.out.println("=============");
		stu.eng_total();
		System.out.println("=============");
		stu.math_total();
		
	}

}
