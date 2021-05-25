package ch4;

import java.util.Scanner;

public class Member {
	
	//예방접종 가능 여부 메소드 
	// 15세 미만과 65이상의 경우 무료 예방접종 가능
	void method1(int year) {
		int age = 2021 - year + 1;
		if(age < 15) {
			System.out.println("독감 무료예방접종이 가능합니다.");
		} else if (age >= 65) {
			System.out.println("독감 무료예방접종이 가능합니다.");
		} else { 
			System.out.println("독감 무료접종 대상이 아닙니다.");
		}
		System.out.println("나이는 " + age + "살 입니다.");
	}
	
	void method2(int year) {
		int age = 2021 - year + 1;
		if(age >= 20) {
			System.out.println("20세 이상은 2년마다 무료로 건강검진을 받을 수 있습니다.");
			if(age >= 40) {
				System.out.println("40세 이상은 암 검사도 무료로 가능합니다.");
			}
		}
		
		if((year % 2) == 0 ) {
			System.out.println("짝수 해에 태어난 사람은 검사대상입니다.");
		} else { 
			System.out.println("짝수 해에 태어나지 않은 사람은 검사대상이 아닙니다.");
		}
	}
	public static void main(String[] args) {
		Member member = new Member();
		Scanner scanner = new Scanner(System.in);

		System.out.println("태어난 년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		member.method1(year);
		member.method2(year);

	}

}
