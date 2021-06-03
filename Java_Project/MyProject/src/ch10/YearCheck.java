package ch10;

import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		try {
			System.out.println("태어난 년도를 입력하세요.");
			Scanner scanner = new Scanner(System.in);
			int year = scanner.nextInt();
			
			System.out.println("태어난 년도는 : " + year + "년 입니다.");
		} catch (Exception e) {
			System.out.println("숫자로 입력하세요.");
		}

	}

}
