package ch1;

import java.util.Scanner;

class Calculator {
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void subtract(int x, int y) {
		System.out.println(x-y);
	}
	void multiply(int x, int y) {
		System.out.println(x*y);
	}
	void devide(int x, int y) {
		System.out.println(x/y);
	}
	void circleR(double x) {
		System.out.println(2 * 3.14 * x);
	}
	void circleW(double x) {
		System.out.println(3.14 * x * x);
	}
	
	public static void main(String[]args) {
		// 인스턴스 생성 -> 클래스의 정의가 필요(필요한 변수, 필요한 메서드)
		// 클래스이름 참조변수 = new 클래스이름
		
		Calculator cal = new Calculator();
		cal.add(10,20);
		cal.subtract(20, 10);
		cal.devide(10, 3);
		cal.multiply(2, 5);
		cal.circleR(4);
		cal.circleW(4);

	}
	
}

	
