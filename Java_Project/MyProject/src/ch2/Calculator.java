package ch2;

import java.util.Scanner;

public class Calculator {
	int add(int x, int y) {
		int result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		return result;
	}
	int substract(int x, int y) {
		int result = x - y;
		System.out.println(x + " - " + y + " = " + result);
		return result;
	}
	int multiply(int x, int y) {
		int result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		return result;
	}
	double devide(int x, int y) {
		int result = x / y;
		System.out.println(x + " / " + y + " = " + result);
		return result;
	}
	
	double circleRound(int i) {
		double result = 2 * 3.14 * i;
		System.out.println("원의 둘레는 : " + result);
		return result;
	}
	double circleWidth(int i) {
		double result = 3.14 * i * i;
		System.out.println("원의 넓이는 : " + result);
		return result;
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(2, 5);
		cal.substract(5, 2);
		cal.multiply(4, 2);
		cal.devide(10, 2);
		cal.circleRound(3);
		cal.circleWidth(3);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사칙연산의 첫번째 수를 입력하세요.");
		int x = scanner.nextInt();
		System.out.println("사칙연산의 두번째 수를 입력하세요.");
		int y = scanner.nextInt();
		
		cal.add(x, y);
		cal.substract(x, y);
		cal.multiply(x, y);
		cal.devide(x, y);
		
		System.out.println("원의 반지름을 입력하세요.");
		int i = scanner.nextInt();
		cal.circleRound(i);
		cal.circleWidth(i);
		

	}

}
