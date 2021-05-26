package ch6;

public class StudentMain {

	public static void main(String[] args) {
		Student2[] students = new Student2[10];
		
		students[0] = new Student2("홍길동1", 100, 40, 20);
		students[1] = new Student2("홍길동2", 90, 40, 20);
		students[2] = new Student2("홍길동3", 80, 40, 20);
		students[3] = new Student2("홍길동4", 70, 40, 20);
		students[4] = new Student2("홍길동5", 60, 40, 20);
		students[5] = new Student2("홍길동6", 50, 40, 20);
		students[6] = new Student2("홍길동7", 53, 40, 20);
		students[7] = new Student2("홍길동8", 54, 40, 20);
		students[8] = new Student2("홍길동9", 76, 40, 20);
		students[9] = new Student2("홍길동10", 86, 40, 20);
		
		System.out.println("이름 \t\t 국어 \t 영어\t 수학 \t 총점 \t 평균 \t");
		System.out.println("==================================================");
		for(int i = 0; i < students.length; i++){
			System.out.print(students[i].getName());
			System.out.print("\t\t");
			System.out.print(students[i].getKor());
			System.out.print("\t");
			System.out.print(students[i].getEng());
			System.out.print("\t");
			System.out.print(students[i].getMath());
			System.out.print("\t");
			System.out.print(students[i].getSum());
			System.out.print("\t");
			System.out.println(students[i].getAvg());
		}
	}

}
