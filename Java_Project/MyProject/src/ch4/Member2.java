// 정답 풀이
package ch4;

import java.util.Calendar;
import java.util.Scanner;

public class Member2 {
	
	
	void vaccinCheck(int birthYear) {
		int age = 2021 - birthYear;
		
		boolean check1 = age < 15 || age >= 65;
		boolean check2 = age >= 15 && age < 65;
		
		if(check1) {
			System.out.println("독감 무료 예방 접종이 가능합니다.");
		} else {
			System.out.println("독감 무료 예방 접종 대상이 아닙니다.");
		}
		
		System.out.println(check1);
		System.out.println(check2);
		
		if(check2) {
			System.out.println("건강검진 대상입니다.");
		} else {
			System.out.println("건강검진 대상이 아닙니다.");
		}
			
	}
	
	void checkup(int birthYear) {
		
		int age = 2021 - birthYear;;
		boolean check1 = birthYear % 2 == 0 && 2021 % 2 == 0 || birthYear % 2 == 1 && 2021 % 2 == 1;
		boolean check2 = birthYear % 2 == 2021 % 2;
				
				
		if(age >= 20 && check2) {
			System.out.println("검진 대상");
			if(age >= 40) {
				System.out.println("암검진 대상자");
			}
		} else { 
			System.out.println("검진대상이 아닙니다.");
		}
	}
	
	// 태어난 년도를 입력하면 나이를 반환하는 메소드
	int ageCal(int year) {
		//int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return Calendar.getInstance().get(Calendar.YEAR) - year - 1;
		
	}

	
	public static void main(String[] args) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요.");
		int birthYear = s.nextInt();
		
		Member2 member2 = new Member2();
		
		member2.vaccinCheck(birthYear);
		member2.checkup(birthYear);
	}

}
